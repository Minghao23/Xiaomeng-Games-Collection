

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jiao extends JFrame {
	JPanel p1 = new JPanel();
	ImageIcon pic1 = new ImageIcon("pic/story1.JPG");
	ImageIcon pic2 = new ImageIcon("pic/story2.JPG");
	ImageIcon pic3 = new ImageIcon("pic/jiao1.png");
	ImageIcon pic4 = new ImageIcon("pic/story7.JPG");
	JLabel bg1 = new JLabel(pic1);
	JLabel bg2 = new JLabel(pic2);
	JLabel l1 = new JLabel("(�������)");
	JLabel l2 = new JLabel("(�������)");
	JLabel l3 = new JLabel("(������¿�ʼ)");
	JLabel q11 = new JLabel(">>   ����");
	JLabel q12 = new JLabel(">>   �ܾ�");
	JLabel q = new JLabel("�������鲻��~��ѽ�ǲ���Ӧ���Ҹ������Ѱ�~");

	public void setFrame() {
		setSize(715, 545);
		setMinimumSize(new Dimension(715, 545));
		setLocation(400, 100);
		setTitle("С����������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		bg2.setPreferredSize(new Dimension(700, 120));
		bg2.setLayout(null);
		bg2.add(q);
		q.setBounds(50, 20, 700, 20);
		bg2.add(l1);
		l1.setBounds(50, 40, 100, 20);
		l1.addMouseListener(new L1());
		bg1.setLayout(new BorderLayout());
		bg1.add(bg2, BorderLayout.PAGE_END);
		p1.add(bg1);
		add(p1);
	}

	public void reUI() {
		bg2.repaint();
		bg2.validate();
		bg1.repaint();
		bg1.validate();
	}

	class L1 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg2.removeAll();
			q.setText("��~û��������ֻ�ܻ�����˯���ˡ���");
			bg2.add(q);
			bg2.add(l2);
			l2.setBounds(50, 40, 100, 20);
			l2.addMouseListener(new L2());
			reUI();
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.getColor(""));
		}

	}

	class L2 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic3);
			bg2.removeAll();
			q.setText("��~�и�QQ��Ϣ����һ��~");
			bg2.add(q);
			bg2.add(q11);
			q11.setBounds(50, 40, 100, 20);
			 q11.addMouseListener(new Q11());
			bg2.add(q12);
			q12.setBounds(50, 60, 100, 20);
			 q12.addMouseListener(new Q12());
			reUI();
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.getColor(""));
		}

	}

	class Q11 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic4);
			bg2.removeAll();
			q.setText("����һ��������˾ܾ�����������ѽ������ˣ������˰�~��������ʶ������");
			bg2.add(q);
			bg2.add(l3);
			l3.setBounds(50, 40, 100, 20);
			l3.addMouseListener(new Replay());
			reUI();
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.getColor(""));
		}

	}

	class Q12 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic4);
			bg2.removeAll();
			q.setText("(ʧȥ�������ǽӴ���Ψһ����)��������");
			bg2.add(q);
			bg2.add(l3);
			l3.setBounds(50, 40, 100, 20);
			l3.addMouseListener(new Replay());
			reUI();
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.getColor(""));
		}

	}

	class Replay implements MouseListener {
		public void mouseClicked(MouseEvent e) {

			Start start = new Start();
			start.setFrame();
			start.init();
			start.setVisible(true);
			Jiao.this.setVisible(false);
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.red);

		}

		public void mouseExited(MouseEvent e) {
			((Component) e.getSource()).setForeground(Color.getColor(""));
		}
	}

	public static void main(String[] args) {

	}
}
