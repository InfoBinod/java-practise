
import java.io.*;
import java.net.*;

public class TCPClient {

	public static void main(String[] args) throws Exception{
		String clientData;
		String processedData;
		System.out.println("enter Data :");
		BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket =new Socket("127.0.0.1",2222);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		clientData=inFromUser.readLine();
		outToServer.writeBytes(clientData + '\n');
		processedData=inFromServer.readLine();
			
		System.out.println("server : "+processedData);
		clientSocket.close();
		
		
		
		
	}

}
