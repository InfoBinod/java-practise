import java.io.*;
import java.util.Scanner;
class Expthrow{
	public static void main(String []args)
		throws IOException 
		{
		Scanner reader= new Scanner(System.in);
		
			try{
				int b;
				System.out.println("enter the value of a : ");

				int n = reader.nextInt();
				b=10/n;

				if(n==0){
						throw new ArithmeticException("hello this is ridiculous");
					}
				System.out.println("the value of b is"+b);
				}
			catch (ArithmeticException e)
				{
					System.out.println(e.getMessage());
				}
			catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println("array out of range");
				}
			

			
			}
		}
	
