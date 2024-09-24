import javax.swing.*;
import java.awt.event.*;
public class CheckSwing extends JFrame implements ActionListener
{
	JLabel l;
	JCheckBox cb1,cb2,cb3;
	JButton b;
	CheckSwing()
	{
		l= new JLabel("FOOD ORDER");
		l.setBounds(50,50,300,20);
		cb1= new JCheckBox("PIZZA @ 100");
		cb1.setBounds(100,100,150,20);
		cb2= new JCheckBox("BURGER @ 80");
		cb2.setBounds(100,150,150,20);
		cb3= new JCheckBox("COFFEE @ 30");
		cb3.setBounds(100,200,150,20);
		b= new JButton("ORDER");
		b.setBounds(100,250,80,30);
		b.addActionListener(this);
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		float amount=0;
		String msg="  ";
		if(cb1.isSelected())
		{
			amount+=100;
			msg+="PIZZA :100";
		}
		if(cb2.isSelected())
		{
			amount+=80;
			msg+="BURGER :80";
		}
		if(cb3.isSelected())
		{
			amount+=30;
			msg+="COFFEE :30";
		}
		msg+="---------\n";
		JOptionPane.showMessageDialog(this,msg+"TOTAL : "+amount);

	}
	public static void main(String args[])
	{
		new CheckSwing();
	}
}