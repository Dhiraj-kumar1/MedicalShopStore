import javax.swing.*;
import java.awt.*;
class About extends JFrame
{
	JFrame jf;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;
	About()
	{
		jf=new JFrame();
		jf.setLayout(null);
		l1 = new JLabel("MEDICAL SHOP STORE MANAGEMENT SYSTEM");
		l1.setFont(new Font("Times New Roman",Font.BOLD,25));
		l1.setBounds(200,30,650,40);l1.setForeground(Color.blue);
		jf.add(l1);
		l2 = new JLabel("This Software is developed by,");
		l2.setBounds(100,150,600,40);
		jf.add(l2);
		l3 = new JLabel("Dhiraj kumar.");
		l3.setFont(new Font("Times New Roman",Font.BOLD,18));
		l3.setBounds(300,200,400,40);l3.setForeground(Color.red);
		jf.add(l3);
		l4 = new JLabel("Under the guidance of Mr. Amlan Das.");
		l4.setFont(new Font("Times New Roman",Font.BOLD,18));l4.setForeground(Color.red);
		l4.setBounds(100,250,800,40);
		jf.add(l4);

		l5 = new JLabel("In this Software we can add details of Medicines,Suppliers.");
		//l5.setFont(new Font("Times New Roman",Font.BOLD,20));
		l5.setBounds(100,300,800,40);
		jf.add(l5);

		l6 = new JLabel("We can also upadte,delete & search the existing details.");
		//l6.setFont(new Font("Times New Roman",Font.BOLD,20));
		l6.setBounds(100,350,800,40);
		jf.add(l6);

		l7 = new JLabel("It is helpfull for stock of Medicine & where we placed the medicine in store.");
		//l7.setFont(new Font("Times New Roman",Font.BOLD,20));
		l7.setBounds(100,400,800,40);
		jf.add(l7);

        jf.setTitle("About Software");
		jf.setSize(1000,700);
		jf.setLocation(20,20);
		jf.setResizable(false);
		jf.getContentPane().setBackground(Color.pink);
		jf.setVisible(true);

	}

	public static void main(String args[])
	{
          new About();

	}
}