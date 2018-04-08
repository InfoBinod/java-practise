import java.awt.*;
public class RadioButtonDemo{
  	 public static void main(String[] args) {
    	
    Frame f=new Frame();
    f.setVisible(true);
    f.setBackground(Color.blue);
    f.setSize(200,300);
    CheckboxGroup cbg1=new CheckboxGroup(); 
    CheckboxGroup cbg2=new CheckboxGroup(); 
    cb1=new Checkbox ("C", cbg1, true); 
    cb2=new Checkbox ("Cpp", cbg1, true); 
    f.add (cb1);
    f.add (cb2);



 	}


}
