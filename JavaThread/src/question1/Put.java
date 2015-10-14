package question1;

public class Put implements Runnable {

    private Plate plate;
    private int cookieCounter = 1;

    public Put(Plate plate) {
        this.plate = plate;
    }

    public synchronized void putCookie() {
        while (!plate.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        plate.putCookie(cookieCounter);
        System.out.println("主人放了第" + cookieCounter + "塊餅乾");
        cookieCounter++;
        notify();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            putCookie();
        }
    }

}
