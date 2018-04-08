
import java.io.*;
import java.net.*;

public class TCPServer{

	public static void main(String[] args) throws Exception{
		String clientData;
		String processedData;
		@SuppressWarnings("resource")
		ServerSocket welcomeSocket=new ServerSocket(2222);
		System.out.println("waiting for client");
		while(true) {
			Socket connectionSocket=welcomeSocket.accept();
			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient  = new DataOutputStream(connectionSocket.getOutputStream());
			clientData =inFromClient.readLine();
			System.out.println("From Client : "+clientData);
			processedData="Ack for "+clientData + "\n";
			outToClient.writeBytes(processedData);
		}
		
		


}
}
