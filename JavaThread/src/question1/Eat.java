package question1;

public class Eat implements Runnable {

    private Plate plate;

    public Eat(Plate plate) {
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            plate.eatCookie();
        }
    }
}
