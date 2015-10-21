import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {

    public enum Code {
        LOWER, HIGHER, WIN
    }
    
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        DataInputStream input = null;
        DataOutputStream output = null;
        
        int answer;       

        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Server started.");
         
            clientSocket = serverSocket.accept();
            System.out.println("Client connected to server.");            
            
            input = new DataInputStream(clientSocket.getInputStream());
            output = new DataOutputStream(clientSocket.getOutputStream());                        
            answer = getRandomNumber();
            
            if (input.readInt() == answer){
                output.writeInt(Code.WIN.ordinal());               
            }
            
            

          
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
        }

    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
