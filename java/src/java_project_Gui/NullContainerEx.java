package java_project_Gui;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
	NullContainerEx()
	{
		setTitle("Null Container Sample");
		setLayout(null);

		JLabel la = new JLabel("hello, press Buttons");
		la.setLocation(130,50);
		la.setSize(200,20);
		add(la);
		for(int i = 1; i <= 9; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i *15);
			b.setSize(50,20);
			add(b);
		}
		setSize(300,200);
		setVisible(true);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}
