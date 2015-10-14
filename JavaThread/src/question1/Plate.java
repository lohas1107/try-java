package question1;

import java.util.ArrayList;

public class Plate {

    private ArrayList<Cookie> cookies;

    public Plate() {
        cookies = new ArrayList<>();
    }

    public synchronized void eatCookie() {
        while (cookies.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        Cookie cookie = cookies.get(0);
        cookies.remove(cookie);
        System.out.println("小白狗吃了第" + cookie.getNumber() + "塊餅乾");
        notify();
    }

    public synchronized void putCookie(int cookieNo) {
        while (!cookies.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        cookies.add(new Cookie(cookieNo));
        System.out.println("主人放了第" + cookieNo + "塊餅乾");
        notify();
    }

}
