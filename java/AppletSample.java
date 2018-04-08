import java.awt.*;
import java.applet.*;
public class AppletSample extends Applet
	{
 		String msg;
		public void init()
		{
			setBackground(Color.cyan);
			msg="inside init().....";
		}
		public void start()
		{
		msg+="inside start().....";
		}
		public void paint(Graphics g)
		{
			msg+="inside paint()...";
			g.drawString(msg,10,20);
		}
}
