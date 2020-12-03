package models;

public class EvenRunnable implements Runnable{
    private String name;

    public EvenRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0)
                continue;
            System.out.println(this.name+" "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
