import java.awt.*;
import java.applet.*;
public class ParamDemo extends Applet{
	Stint fontName;
	String fontDemo;
	int fontSize;
	float leading;
	boolean active;
	//initialize the string to be displayed.
	public void start()
	{
		String param;
		fontName =getParameter("fontName");
		if (fontNmae==null)
		{
 		fontName="not found";
		}
	param=getParameter("fontSize");
	try(
		if (param !=null)
		{
			fontSize=Integer.parseInt(param);
		}
	else
		{
		fontSize=0;
		}

}
	catch(NumberFormatException e){
	fontSize=-1;
	}
	param=getParameter("leading");
	{
	try{
		if(para!=null){
		leading=Float.valueOf(param).floatValue();
		}
	else{
	leading=0;
	}
	
}
catch(NumberFormatException e)
{
leading=-1;
}
param=getParameter("accountEnable");
if(param!=null)
{
active=Boolean.valueOf(param).booleanValue();
}
}

//display parameter
public void paint (Graphics g)
{
 g.drawString("fontName"+fontName,0.10);
 g.drawString("fontsize "+fontSize,0.26);
 g.drawString("leading"+fontName"+leading,0.42);
 g.drawString("account active"+active,0.50);
	
	

}
















}

