import java.awt.*;
import java.awt.event.*;
class even extends Frame 
{
    TextField tf1,tf2;
    Button b1;
    TextArea t1;
    CheckboxGroup cbg;
    Checkbox r1,r2;
    even()
    {
        this.setLayout(null);
        cbg=new CheckboxGroup();
        r1=new Checkbox("Odd",cbg,true);
        r2=new Checkbox("Even",cbg,false);
        tf1=new TextField();
        tf2=new TextField();
        b1=new Button("ok");
        t1=new TextArea();
     
        tf1.setBounds(100,100,100,50);
        tf2.setBounds(100,150,100,50);
        r1.setBounds(100,200,100,50);
        r2.setBounds(100,250,100,50);
        b1.setBounds(100,300,300,50);
        t1.setBounds(20, 500, 500, 500);   
        
        this.add(tf1);
        this.add(tf2);
        this.add(r1);
        this.add(r2);
        this.add(t1);
        this.add(b1);
	
	 r2.addItemListener(new ItemListener() 
	{  
   	        public void itemStateChanged(ItemEvent e) 
	       {               
                  	b1.addActionListener(new ActionListener() 
		{    
    		  	public void actionPerformed (ActionEvent e)
		 	{    
				t1.setText(" ");
            				int a=Integer.parseInt(tf1.getText()); 
				int b=Integer.parseInt(tf2.getText()); 

				for(int i=a;i<=b;i++)
				{
					if(i%2==0)
					{
						t1.append(i+" ");
					}
				}
        	        		}    
        		 } ) ;  
       	     }  
            });  
           r1.addItemListener(new ItemListener() 
          {  
            public void itemStateChanged(ItemEvent e) 
	    {    
		          
                 b1.addActionListener(new ActionListener() 
		{    
                   	public void actionPerformed (ActionEvent e) 
			{    
				t1.setText(" "); 
				int a=Integer.parseInt(tf1.getText()); 
				int b=Integer.parseInt(tf2.getText()); 
            			for(int i=a;i<=b;i++)
			{
				if(i%2!=0)
				{
					t1.append(i+" ");
				}
			}  
       		 }    
    	  });  
        }  
    });  

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
        String str=ae.getActionCommand();
	t1.setText("Welcome");    
    }
   
    public static void main(String args[])
    {
        even obj=new even();
        obj.setTitle("odd even");
        obj.setSize(500,500);
        obj.setVisible(true);
    }
}