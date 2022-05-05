package java_project_Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;


public class Myframe extends JFrame {
	 Myframe(){
		 setTitle("FlowLayout ¿¹Á¦");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container contentPane = getContentPane();

		 contentPane.setLayout (new FlowLayout(FlowLayout.LEFT,30,20));
		
		 contentPane.add(new JButton("Add"));
		 contentPane.add(new JButton("Add"));
		 contentPane.add(new JButton("Add"));
		 contentPane.add(new JButton("Add"));
		 
		 setSize(1000,200);
		 setVisible(true);

	 }
	 
	public static void main(String [] args) {
		new Myframe();
	}
}
