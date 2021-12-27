package zadaca2;

public class Glavna {
    public static void main(String[] args) {
        Timer timer1 = new Timer(5000, 10, "Timer1");
        timer1.start();
        Timer timer2 = new Timer(1000, 10, "Timer2");
        timer2.start();
    }
}
