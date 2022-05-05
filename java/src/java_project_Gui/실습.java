package java_project_Gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 실습 extends JFrame {	
	JPanel top = new JPanel();
	JPanel center = new JPanel();
	JButton button[] = new JButton[3];
	JLabel label[] = new JLabel[3];
	String text[] = {"open","read","close"};
	String body[] = {"hello","love","java"};
	int count = 0;
	
	JLabel label1 = new JLabel("hello");
	JLabel label2 = new JLabel("love");
	JLabel label3 = new JLabel("java");
	
	실습(String title, int width, int height)
	{
		setTitle(title);
		center.setLayout(null); //패널 관리자 제거
		top.setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		for(int i = 0; i < text.length; i++)
		{
			button[i] = new JButton(text[i]);
			top.add(button[i]);
		}
		
		for(int i =0; i < body.length; i++)
		{
			 label[i] = new JLabel(body[i]);
		}
		
		for(int i = 0; i < body.length; i++)
		{
			center.add(label[i]);
		}
		
		 label[0].setLocation(250,30);
	      label[1].setLocation(10,250);
	      label[2].setLocation(400,300);
	      label[0].setSize(60,30);
	      label[1].setSize(60,30);
	      label[2].setSize(60,30);
		add(top, BorderLayout.NORTH);
	      add(center, BorderLayout.CENTER);
		setVisible(true);
	      setSize(width, height);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 실습("실습",500,500);
	}

}
