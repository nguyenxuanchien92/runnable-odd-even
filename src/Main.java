import models.EvenRunnable;
import models.OddRunnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddRunnable oddRunnable = new OddRunnable("oddRunnable");
        EvenRunnable evenRunnable = new EvenRunnable("evenRunnable");

        Thread threadOdd = new Thread(oddRunnable);
        Thread threadEven = new Thread(evenRunnable);

        threadEven.start();
        threadEven.join();
        threadOdd.start();
    }
}
