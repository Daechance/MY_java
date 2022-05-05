package java_project_Gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NorthPanel extends JFrame{
	   JPanel top = new JPanel();
	   JPanel center = new JPanel();
	   JButton []btn = new JButton[3];
	   JLabel []label = new JLabel[3];
	   String []text = {"Open", "Read", "Close"};
	   String []text1 = {"Hello", "Love", "Close"};
	   int count = 0;
	   JLabel label1 = new JLabel("HELLO");
	   JLabel label2 = new JLabel("Love");
	   JLabel label3 = new JLabel("Java");
	   
	   NorthPanel(String title, int width, int height){
	      setTitle(title);
	      center.setLayout(null);
	      top.setBackground(Color.LIGHT_GRAY);
	      setLayout(new BorderLayout());
	      for (int i = 0 ; i <text.length ; i++) {
	         btn[i] = new JButton(text[i]);
	         top.add(btn[i]);
	      }
	      btn[0].addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            count++;
	            System.out.println(count);
	            
	         }
	      });
	      btn[1].addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            count--;
	            System.out.println(count);
	            
	         }
	      });
	      for (int i = 0 ; i <text1.length ; i++) {
	         label[i] = new JLabel(text1[i]);
	      }
	      label[0].setLocation(250,30);
	      label[1].setLocation(10,250);
	      label[2].setLocation(400,300);
	      label[0].setSize(60,30);
	      label[1].setSize(60,30);
	      label[2].setSize(60,30);
	      
	      for (int i = 0 ; i <text1.length ; i++) {
	         center.add(label[i]) ;
	      }
	      add(top, BorderLayout.NORTH);
	      add(center, BorderLayout.CENTER);
	      
	      setVisible(true);
	      setSize(width, height);
	      
	   }
	   

	public static void main(String[] args) {
		 new NorthPanel("Java ½Ç½À", 500, 500);

	}

}
