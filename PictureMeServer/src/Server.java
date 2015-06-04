import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7000);
		Socket socket = ss.accept();
		System.out.println("connected");
		DataInputStream din = new DataInputStream(socket.getInputStream());
		System.out.println(din.readInt());

	}

}
