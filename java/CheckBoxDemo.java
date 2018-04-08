import java.awt.*;
public class CheckBoxDemo {

	 public static void main(String[] args) {
     		
    Frame f=new Frame("CheckBox");
    f.setVisible(true);
    f.setBackground(Color.blue);
    f.setSize(200,300);
    f.setLayout(new GridLayout(6,2));
    Checkbox c1=new Checkbox("hllo");
    Checkbox c2=new Checkbox("click here");
    f.add(c1);
    f.add(c2);




	}
}