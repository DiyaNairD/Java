import java.awt.*;
import javax.swing.*;
class Borderlayout extends JFrame
{
	Borderlayout()
	{
		Container c= getContentPane();
		BorderLayout obj= new BorderLayout(10,10);
		c.setLayout(obj);
		
		JButton b1,b2,b3,b4;
		b1= new JButton("BUTTON1");
		b2= new JButton("BUTTON2");
		b3= new JButton("BUTTON3");
		b4= new JButton("BUTTON4");
		
		c.add(b1,BorderLayout.NORTH);
		c.add(b2,BorderLayout.EAST);
		c.add(b3,BorderLayout.SOUTH);
		c.add(b4,BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
		Borderlayout demo= new Borderlayout();
		demo.setSize(400,400);
		demo.setTitle("FLOW LAYOUT");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}