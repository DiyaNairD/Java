import java.awt.*;
import javax.swing.*;
class Flowlayout extends JFrame
{
	Flowlayout()
	{
		Container c= getContentPane();
		FlowLayout obj= new FlowLayout(FlowLayout.RIGHT,10,10);
		c.setLayout(obj);
		
		JButton b1,b2,b3,b4;
		b1= new JButton("BUTTON1");
		b2= new JButton("BUTTON2");
		b3= new JButton("BUTTON3");
		b4= new JButton("BUTTON4");
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
	}
	public static void main(String args[])
	{
		Flowlayout demo= new Flowlayout();
		demo.setSize(400,400);
		demo.setTitle("FLOW LAYOUT");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}