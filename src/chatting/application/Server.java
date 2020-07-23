package chatting.application;
import java.awt.Image;

import javax.swing.*;
import java.awt.*;
public class Server extends JFrame{
	
	
	JLabel j1;
	
	Server()
	{
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3.png"));
		Image i2=i1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
		
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i1);
		l1.setBounds(5,5,30,30);
		add(l1);
		
		setLayout(null);
		
		
		setSize(450,700);
		setLocation(400,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new Server().setVisible(true);
	}
}
