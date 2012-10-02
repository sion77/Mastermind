package reseau;

import java.io.IOException;
import java.net.*;

public class Serveur {
	
	public static void main(String[] zero){
		
		ServerSocket socket;
		try {
		socket = new ServerSocket(2009);
		Thread t = new Thread(new AccepterConnexion(socket));
		t.start();
		System.out.println("Server : On");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
