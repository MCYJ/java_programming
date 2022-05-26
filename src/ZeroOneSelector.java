

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class ZeroOneSelector extends JFrame {
	int sign = -1;
	public ZeroOneSelector() {
		
		
		setTitle("ZeroOneSelector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c1 = getContentPane();
		c1.setLayout(new GridLayout(2,3));
		/*
		Container c2 = getContentPane();
		c2.setLayout(new GridLayout());
		*/
		// buttons
		JButton btn1 = new JButton("0");
		JButton btn2 = new JButton("1");
		JButton btn3 = new JButton("C");
		
		JLabel lb = new JLabel(" ");
		JLabel lb1 = new JLabel(" ");
		JLabel lb2 = new JLabel(" ");
		c1.add(btn1);
		c1.add(btn2);
		c1.add(btn3);
		c1.add(lb1);
		c1.add(lb);
		c1.add(lb2);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				if(sign == -1) {
					sign = 0;
					lb.setText("0");
				}
				else if(sign == 0) {
					
				}
				else if(sign == 1) {
					// µ°∫Ÿ¿Ã±‚
					lb.setText(lb.getText()+'0');
				}
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				if(sign == -1) {
					sign = 1;
					lb.setText("1");
				}
				else if(sign == 0) {
					
				}
				else if(sign == 1) {
					// µ°∫Ÿ¿Ã±‚
					lb.setText(lb.getText()+'1');
				}
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				sign = -1;
				lb.setText("");
				
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ZeroOneSelector();
	}
}
