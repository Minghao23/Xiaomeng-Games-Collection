


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Start extends JFrame {


	JPanel p1 = new JPanel();
	ImageIcon pic2 = new ImageIcon("pic/start2.png");
	ImageIcon pic3 = new ImageIcon("pic/start3.png");
	ImageIcon pic4 = new ImageIcon("pic/start4.png");
	ImageIcon pic5 = new ImageIcon("pic/start5.png");
	JLabel l1 = new JLabel(new ImageIcon("pic/start1.jpg"));
	JLabel l2 = new JLabel(pic2);
	JLabel l3 = new JLabel(pic3);

	public void setFrame() {
		setSize(715, 545);
		setMinimumSize(new Dimension(715, 545));
		setLocation(400, 100);
		setTitle("–°√…¡µ∞ÆŒÔ”Ô");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		l1.setLayout(null);
		l1.add(l2);
		l2.setBounds(20, 280, 170, 220);
		l2.addMouseListener(new L2());
		l1.add(l3);
		l3.setBounds(500, 280, 170, 220);
		l3.addMouseListener(new L3());
		p1.add(l1);
		add(p1);
	}

	class L2 implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			Story story = new Story();
			story.setFrame();
			story.init();
			story.setVisible(true);
			Start.this.setVisible(false);
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {
			l2.setIcon(pic4);
			Start.this.repaint();
			Start.this.validate();
		}

		public void mouseExited(MouseEvent e) {
			l2.setIcon(pic2);
			Start.this.repaint();
			Start.this.validate();
		}

	}

	class L3 implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			Jiao jiao = new Jiao();
			jiao.setFrame();
			jiao.init();
			jiao.setVisible(true);
			Start.this.setVisible(false);
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {
			l3.setIcon(pic5);
			Start.this.repaint();
			Start.this.validate();
		}

		public void mouseExited(MouseEvent e) {
			l3.setIcon(pic3);
			Start.this.repaint();
			Start.this.validate();
		}

	}

	public static void main(String[] args) {
		Start start = new Start();
		
		start.setFrame();
		start.init();
		start.setVisible(true);
	}
}
