package models;

public class OddRunnable implements Runnable {

    private String name;

    public OddRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(this.name + " " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
