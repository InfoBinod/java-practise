import java.awt.*;
public class TextareaDemo{
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setVisible(true);
	    f.setBackground(Color.black);
	    f.setSize(200,300);
	    f.setLayout(new GridLayout(6,2));
	    TextArea area=new TextArea("hllo this is lale");
	    f.add(area);
	    

	}


}