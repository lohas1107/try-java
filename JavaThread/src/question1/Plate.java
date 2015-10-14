package question1;

import java.util.ArrayList;

public class Plate {

    private ArrayList<Cookie> cookies;

    public Plate() {
        cookies = new ArrayList<>();
    }

    public boolean isEmpty() {
        return cookies.isEmpty();
    }

    public Cookie getCookies() {
        return cookies.get(0);
    }

    public void eatCookie(Cookie cookie) {
        cookies.remove(cookie);
    }

    public void putCookie(int cookieNo) {
        cookies.add(new Cookie(cookieNo));
    }

}
