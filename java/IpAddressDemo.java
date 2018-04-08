
import java.net.*;
import java.io.*;
import java.net.InetAddress;

public class IpAddressDemo {
	public static void main(String []args) throws IOException
	{
		String ip="172.217.160.238";//args[0];
		try {
			InetAddress ipaddress =InetAddress.getHost();
			System.out.println("the site is"+ipaddress.getHostName());
			
		}
		catch(UnknownHostException e){
			System.out.println("Ip address found for a given host");
		}
	}
}
