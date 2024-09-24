import java.awt.*;
import java.awt.event.*;

class MyButton extends Frame implements ActionListener
{
	Button b1,b2,b3;
	MyButton()
	{
		this.setLayout(null);
		
		b1=new Button("YELLOW");
		b2=new Button("GREEN");
		b3=new Button("BLUE");
		
		b1.setBounds(100,100,70,40);
		b2.setBounds(100,160,70,40);
		b3.setBounds(100,220,70,40);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		String str= ae.getActionCommand();
		if(str.equals("YELLOW")) this.setBackground(Color.yellow);
		if(str.equals("GREEN")) this.setBackground(Color.green);
		if(str.equals("BLUE")) this.setBackground(Color.blue);	
	}

	public static void main(String args[])
	{
		MyButton mb= new MyButton();
		mb.setSize(400,400);
		mb.setTitle("my buttons");
		mb.setVisible(true);
	}
	
}