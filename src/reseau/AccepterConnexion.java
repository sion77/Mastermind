package reseau;

import java.io.*;
import java.net.*;

public class AccepterConnexion implements Runnable{

	private ServerSocket socketserver = null;
	private Socket socket = null;
	public Thread thread1;
	
	public void run() {
		try{
				while(true){
					socket = socketserver.accept();
					System.out.println("Un nouveau joueur tente de se connecter  ");
					
					thread1 = new Thread(new Authentification(socket));
					thread1.start();
				}
		}catch (IOException e) {
			System.err.println("Probleme server");
		}
			
	}

}
