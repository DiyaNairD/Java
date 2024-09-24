import java.awt.*;
import java.awt.event.*;

class MyTest extends Frame implements ActionListener
{
	Button b1,b2;
	TextField t1,t2,t3;
	MyTest()
	{
		this.setLayout(null);
		
		b1=new Button("ADD");
		b2=new Button("SUBTRACT");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		
		b1.setBounds(100,100,70,40);
		b2.setBounds(100,160,70,40);
		t1.setBounds(100,220,70,40);
		t2.setBounds(100,280,70,40);
		t3.setBounds(100,340,70,40);
		
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		this.add(t3);

		b1.addActionListener(this);
		b2.addActionListener(this);

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
		int a= Integer.parseInt(t1.getText());
		int b= Integer.parseInt(t2.getText());
		int c;
		if(str.equals("ADD"))
		{
			c=a+b;
			t3.setText(String.valueOf(c));
		}
		if(str.equals("SUBTRACT")) 
		{
			c=a-b;
			t3.setText(String.valueOf(c));
		}
	}

	public static void main(String args[])
	{
		MyTest mt= new MyTest();
		mt.setSize(400,400);
		mt.setTitle("my calculator");
		mt.setVisible(true);
	}
	
}