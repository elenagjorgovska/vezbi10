package zadaca3;

import java.util.List;

public class Controller extends Thread {
        private List<String> lista;
        private int i=0;
        private int n;
        public Controller(List<String> lista, int n )
        {
            this.lista=lista;
            this.n=n;
            i=lista.size();
        }
        public void run()
        {
            while(true)
            {
                try {
                    sleep(n);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Vo ovie " + (n/1000) + " sekundi vneseni se " + (lista.size()-i)+" novi elementi");

                        i=lista.size();
            }
        }
    }
