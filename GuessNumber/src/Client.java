import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        DataInputStream input = null;
        DataOutputStream output = null;
        
        try {
            socket = new Socket("localhost", 8080);
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
            
            System.out.println("--- Game Start ---");
            System.out.println("Guess a number in 1 ~ 100:"); 
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }

}
