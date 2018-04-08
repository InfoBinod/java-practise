import java.awt.*;
public class ScroolbarDemo{
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setVisible(true);
	    f.setBackground(Color.white);
	    f.setSize(200,300);
	    f.setLayout(new GridLayout(6,2));
	    f.add(new Label("this is a practise",Label.CENTER));
	    Scrollbar s=new Scrollbar(Scrollbar.HORIZONTAL,10,40,0,100);
	    Scrollbar st=new Scrollbar(Scrollbar.VERTICAL,10,60,0,100);
	    f.add(s);
	    f.add(st);
	    
	}

}