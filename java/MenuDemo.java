import java.awt.*;
public class MenuDemo{
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setVisible(true);
	    f.setBackground(Color.blue);
	    f.setSize(200,300);
	    f.setLayout(new GridLayout(6,2));
	    MenuBar mbar=new Menubar();
	    Menu mnu=new Menu();
	    MenuItem m1=new MenuItem();
	    MenuItem m2=new MenuItem();
	    m1.setEnable(true);
	    m1.setLabel("hllo");
	    m2.setEnable(true);
	    m2.setLabel("papi");
	    
	    mnu.add(m1);
	    mnu.add(m2);
	    mbar.add(mnu);
	    f.setMenuBar(mbar);
	}

}