import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		PCShop shop = new PCShop();
		String choice = "";
		Boolean isRepeat = true;
		
		while(isRepeat){
			choice = shop.init();
			if(choice.equals("1") || choice.equals("2")){
				isRepeat = false;
			}
		}
		
		shop.order(choice);
		shop.deliver();
	}

}
