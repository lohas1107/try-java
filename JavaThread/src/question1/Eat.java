package question1;

public class Eat implements Runnable {

    private Plate plate;

    public Eat(Plate plate) {
        this.plate = plate;
    }

    public synchronized void eatCookie() {
        while (plate.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Cookie cookie = plate.getCookies();
        plate.eatCookie(cookie);
        System.out.println("小白狗吃了第" + cookie.getNumber() + "塊餅乾");
        notify();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            eatCookie();
        }
    }
}
