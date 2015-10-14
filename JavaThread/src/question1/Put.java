package question1;

public class Put implements Runnable {

    private Plate plate;
    private int cookieCounter = 1;

    public Put(Plate plate) {
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
          plate.putCookie(cookieCounter);
          cookieCounter++;
        }
    }

}
