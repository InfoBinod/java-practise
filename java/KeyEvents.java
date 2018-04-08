import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyEvents extends Applet implements KeyListener
	{
	String msg="";
	int X =10,Y= 20;
	public void init(){
	addKeyListener(this);
	}
	public void KeyPressed(KeyEvent ke){
	showStatus("Key Down");
	int  Key=ke.getKeyCode();
	switch(Key){
	case KeyEvent.VK_F1:
	msg +="<F1>";
	break;
	case KeyEvent.VK_F2:
	msg +="<F2>";
	break;
	case KeyEvent.VK_F3:
	msg +="<F3>";
	break;
	case KeyEvent.VK_PAGE_DOWN:
	msg +="<PgDn>";
	break;
	case KeyEvent.VK_PAGE_UP:
	msg +="<PgUp>";
	break;
	case KeyEvent.VK_LEFT:
	msg +="<LeftArrow>";
	break;
	case KeyEvent.VK_RIGHT:
	msg +="<RightArrow>";
	break;
	}
	repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
	showStatus("KeyUp");

	}
	public void keyTyped(KeyEvent ke)
	{
	msg+=ke.getKeyChar();
	repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,X,Y);

	}

	}































