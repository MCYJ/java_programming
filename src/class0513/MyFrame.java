package class0513;

import java.awt.*;

import javax.swing.*;

// JFrame 상속한 클래스
public class MyFrame extends JFrame {
	public MyFrame() {
	//	super("title");
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		// frame 종료 button 클릭시 응용프로그램 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		// FlowLayout constructor에 좌/우 정렬에 대한 정보를 전달가능
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton b = new JButton("Click1");
		c.add(b);
		JButton b2 = new JButton("Click2");
		c.add(b2);
	}
}
