package java_project_Gui;

import javax.swing.*;
import java.awt.*;

public class GirdLayout_name extends JFrame {
	GirdLayout_name()
	{
		setTitle("GridLayout Sample");
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		setLayout(grid);
		add(new JLabel(" �̸�"));
		add(new JTextField(""));
		add(new JLabel(" �й�"));
		add(new JTextField(""));
		add(new JLabel(" �а�"));
		add(new JTextField(""));
		add(new JLabel(" ����"));
		add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GirdLayout_name();
	}

}
