

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class CaiShu extends JFrame implements ActionListener {
	int ran = 1;
	int s = 10;

	JPanel panel = new JPanel();
	JPanel text = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JLabel l = new JLabel("cm");
	JLabel l0 = new JLabel("�²�С�ɵĳ���(1cm~100cm)��ÿ��һ���㶼��õ�ϵͳ����ʾ��ֻ��ʮ�λ���Ŷ��");
	JLabel l1 = new JLabel("");
	JLabel l2 = new JLabel("�㻹��" + s + "�λ���");
	JLabel pic =new JLabel();
	ImageIcon pic1 = new ImageIcon("Pic/mmm.JPG");
	ImageIcon pic2 = new ImageIcon("Pic/mmm1.JPG");
	JTextField t1 = new JTextField(3);
	JButton b = new JButton("Fuck!");
	JButton b1= new JButton("Replay");

	public void setFrame() {
		setSize(600, 450);
		setMinimumSize(new Dimension(600, 450));
		setLocation(400, 200);
		setTitle("�²��Ҷ೤");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		b.addActionListener(this);
		b1.addActionListener(new Replay());
		
		p2.add(l0);
		p3.add(l1);
		p4.add(l2);

		p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));

		p1.add(p2);
		p1.add(p3);
		p1.add(p4);

		pic.setIcon(pic1);
		p5.add(pic);
		text.setLayout(new FlowLayout(1));
		text.add(t1);
		text.add(l);
		text.add(b);
		text.add(b1);

		panel.setLayout(new BorderLayout());
		panel.add(p1, BorderLayout.PAGE_START);
		panel.add(text, BorderLayout.PAGE_END);
		panel.add(p5, BorderLayout.CENTER);

		this.add(panel);
	}

	public void setValue() {
		ran = (int) (Math.random() * 100 + 1);
		System.out.println(ran);
	}

	public void actionPerformed(ActionEvent e) {
		if (t1.getText().equals("") || !t1.getText().matches("^-?\\d+$")) {
			l1.setText("������С�ɵĳ�����Fuck����");
		} else {
			int a = Integer.parseInt(t1.getText());
			if (a < 1 || a > 100) {
				if (a > 100) {
					l1.setText("С�ɵ���󳤶���100cm�������ٳ��ˣ�");
				} else {
					l1.setText("�Բ��㵱С����������");
				}
			} else {
				s = s - 1;
				l2.setText("�㻹��" + s + "�λ���");
				if (s <= 0) {
					l1.setText("���Ѿ�û�л����ˣ�������һ��Ҳ���˽�С�ɣ�");
					l2.setText("С�ɵ���ʵ������ʵ��" + ran + "cm��");
				} else {
					if (a < ran) {
						l1.setText("̫���ˣ�С�ɻ���Ҫ���������г��ģ�");
					}
					if (a > ran) {
						l1.setText("̫���ˣ�С����ز�¶�������������������");
					}
					if (a == ran) {
						l1.setText("������츳���������ʵ���ţ������в�֤��");
						l2.setText("Congratulation��");
						pic.setIcon(pic2);
					}

				}
			}
		}
	}
class Replay implements ActionListener{
	public void actionPerformed(ActionEvent e){
		setValue();
		l1.setText("");
		s=10;
		l2.setText("�㻹��" + s + "�λ���");
		pic.setIcon(pic1);
	}
}
	public static void main(String[] args) {
		CaiShu caishu = new CaiShu();
		caishu.setFrame();
		caishu.init();
		caishu.setValue();
		caishu.setVisible(true);
	}
}
