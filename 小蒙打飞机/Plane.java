

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.border.Border;

public class Plane extends JFrame implements ActionListener {
	JButton b = new JButton("Oh~");
	JButton replay = new JButton("Replay");
	ImageIcon pic1 = new ImageIcon("Pic/Plane11.jpg");
	ImageIcon pic2 = new ImageIcon("Pic/Plane22.jpg");
	ImageIcon pic3 = new ImageIcon("Pic/Plane6.jpg");
	ImageIcon pic4 = new ImageIcon("Pic/Plane5.jpg");
	JLabel pic = new JLabel(new ImageIcon("Pic/Plane33.jpg"));
	JLabel picTwo = new JLabel(pic4);
	JLabel red = new JLabel(new ImageIcon("Pic/Plane4.png"));
	JLabel l1 = new JLabel("帮助小蒙撸管，他的室友们马上下课！你只有三秒钟！(右边的能量条代表小蒙的兴奋程度)");

	JPanel panel = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p21=new JPanel();
	Border border = BorderFactory.createEtchedBorder(Color.BLACK, Color.BLUE);

	int s = 0;
	int sum = 40;
	Long beginTime, endTime;
	transient java.util.Timer timer;

	public void setFrame() {
		setSize(720, 510);
		setMinimumSize(new Dimension(720, 510));
		setLocation(200, 100);
		setTitle("小蒙打飞机");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setRed() {
		for (int i = 0; i < sum; i++) {
			JLabel red = new JLabel(new ImageIcon("D:/Plane4.png"));
			p3.add(red);
		}
	}

	public void init() {
		b.addActionListener(this);
		b.setPreferredSize(new Dimension(60,30));
		p21.add(b);
		replay.addActionListener(new Replay());
		p1.add(pic);
		p1.add(picTwo);
		picTwo.setVisible(false);
		p2.setLayout(new BorderLayout());
		p2.add(p21,BorderLayout.CENTER);
		p2.add(replay,BorderLayout.LINE_END);
		
		

		replay.setVisible(false);
		p3.setPreferredSize(new Dimension(20, 400));
		p3.setBorder(border);
		p3.setBackground(Color.RED);
		p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
		setRed();
		p4.add(l1);
		panel.setLayout(new BorderLayout());
		panel.add(p1, BorderLayout.CENTER);
		panel.add(p2, BorderLayout.PAGE_END);
		panel.add(p3, BorderLayout.LINE_END);
		panel.add(p4, BorderLayout.PAGE_START);

		add(panel);
	}

	class task extends TimerTask implements Serializable {
		public void run() {
			b.setVisible(false);
			replay.setVisible(true);
			l1.setText("小蒙的室友们回来了！");
			timer.cancel();
			pic.setVisible(false);
			picTwo.setVisible(true);
		}
	};

	class Replay implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			l1.setText("帮助小蒙撸管，他的室友们马上下课！你只有三秒钟(右边的能量条代表小蒙的兴奋程度)！");
			sum = 40;
			setRed();
			p3.repaint();
			p3.validate();
			pic.setIcon(new ImageIcon("D:/Plane33.jpg"));
			b.setVisible(true);
			replay.setVisible(false);
			picTwo.setVisible(false);
			pic.setVisible(true);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (sum == 40) {
			timer = new java.util.Timer(true);
			timer.schedule(new task(), 3000);
		}

		if (sum <= 0) {
			l1.setText("小蒙射了！！！");
			timer.cancel();
			replay.setVisible(true);
			b.setVisible(false);
			pic.setIcon(pic3);

		} else {
			p3.removeAll();
			sum = sum - 1;
			setRed();
			p3.repaint();
			p3.validate();
			if (s == 0) {
				pic.setIcon(pic1);
				s = 1;
			} else {
				pic.setIcon(pic2);
				s = 0;
			}
		}

	}

	public static void main(String[] args) {
		Plane p = new Plane();
		p.setFrame();
		p.init();
		p.setVisible(true);
	}
}
