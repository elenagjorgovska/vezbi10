package zadaca3;

    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.List;

    public class Glavna {
        public static void main(String[] args) throws IOException {
            List<String> lista = new ArrayList<String>();
            Controller controller = new Controller(lista, 10000);
            controller.start();
            while (true) {
                int c;
                String s = "";
                while ((c = System.in.read()) != 13)
                    s += (char) c;
                lista.add(s);
            }
        }
    }
