package question1;

public class Main {

    public static void main(String[] args) {
        
        Plate plate = new Plate();
        
        Thread dog = new Thread(new Eat(plate));
        Thread master = new Thread(new Put(plate));
        
        dog.start();
        master.start();
    }

}
