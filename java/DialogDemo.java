import java.awt.*;
public class DialogDemo{
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setVisible(true);
	    f.setBackground(Color.black);
	    f.setSize(200,300);
	    f.setLayout(new GridLayout(6,2));
	    Dialog d1 =new Dialog(f,"lale", true);
	    d1.show();
	    

	}


}