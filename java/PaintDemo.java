
import java.awt.Graphics;
import java.awt.Frame;

import java.awt.event.*;


public class PaintDemo extends Frame{
	private String as;
	public PaintDemo()
	{
		super("hello world program");
		as="hello world";
	}
	public void paint(Graphics g)
	{
		g.drawString(as, 10, 50);
		
	}
	public static void main(String []args)
	{
		PaintDemo pw=new PaintDemo();
		pw.setSize(200,300);
		pw.setVisible(true);
		pw.addWindowListener(new WindowAdapter()
		{
			public  void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
