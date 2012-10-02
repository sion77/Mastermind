package reseau;

import java.io.IOException;
import java.net.*;

public class Client {

	public static void main(String[] args){
		
		Socket socket;
		try {
		socket = new Socket("localhost",2000);
		socket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}