package zadaca1;

    public class Timer extends Thread {
        private int interval; //Intervalot e vo ms
        private int n;
        public Timer (int interval, int n) {
            this.interval = interval;
            this.n = n;
        }
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.println(i);
                try {
                    sleep(interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Kraj!");
        }
}
