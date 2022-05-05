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
		add(new JLabel(" 이름"));
		add(new JTextField(""));
		add(new JLabel(" 학번"));
		add(new JTextField(""));
		add(new JLabel(" 학과"));
		add(new JTextField(""));
		add(new JLabel(" 과목"));
		add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GirdLayout_name();
	}

}
