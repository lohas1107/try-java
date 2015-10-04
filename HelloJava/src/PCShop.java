import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PCShop {

    Order order;

    public String init() throws IOException {
        return askInformation("請輸入電腦配備選項： \n1. 標準配備\n2. 自選配備\n");
    }

    private String askInformation(String information) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(information);
        String text = reader.readLine();
        return text;
    }

    public void order(String choice) throws IOException {
        order = new Order();
        order.setComputer(new Computer(choice));

        String payment = askInformation("請輸入付款資訊\n");
        order.setPayment(payment);

        String delivery = askInformation("請輸入送貨資訊\n");
        order.setDelivery(delivery);

        order.setReceipt(new Receipt());
    }

    public void deliver() {
        System.out.println("收到 " + order.getComputer().getOutfit() + "的電腦和" + order.getReceipt());
    }
}
