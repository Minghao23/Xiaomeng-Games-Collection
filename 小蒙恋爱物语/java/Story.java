

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Story extends JFrame{
JPanel p1=new JPanel();
ImageIcon pic1=new ImageIcon("pic/story1.JPG");
ImageIcon pic2=new ImageIcon("pic/story2.JPG");
ImageIcon pic3=new ImageIcon("pic/story3.jpg");
ImageIcon pic4=new ImageIcon("pic/story4.jpg");
ImageIcon pic5=new ImageIcon("pic/story5.jpg");
ImageIcon pic6=new ImageIcon("pic/story6.jpg");
ImageIcon pic7=new ImageIcon("pic/story7.jpg");
ImageIcon pic8=new ImageIcon("pic/story8.jpg");
ImageIcon pic9=new ImageIcon("pic/story9.jpg");
ImageIcon pic10=new ImageIcon("pic/story10.jpg");
ImageIcon pic11=new ImageIcon("pic/story11.jpg");
ImageIcon pic12=new ImageIcon("pic/story12.jpg");
ImageIcon pic13=new ImageIcon("pic/story13.jpg");
ImageIcon pic14=new ImageIcon("pic/story14.jpg");
JLabel bg1=new JLabel(pic1);
JLabel bg2=new JLabel(pic2);
JLabel q=new JLabel("����ȥ��С���ü���\\(�R���Q)/  ��ʲô�·�ȥ����?");
JLabel q11=new JLabel(">>   �˶���");
JLabel q12=new JLabel(">>   ������");
JLabel q13=new JLabel(">>   ����");
JLabel q21=new JLabel(">>   ������~���æЩʲô�أ�");
JLabel q22=new JLabel(">>   �߰�~����ȥ��Ű���㣡");
JLabel q23=new JLabel(">>   Լ����");
JLabel q31=new JLabel(">>   ������������ɣ��Ͼ�Ů��");
JLabel q32=new JLabel(">>   ��ʱ��չ�������ļ����ˣ�����ȫ����С�����������˵�һ��ɣ�");
JLabel q41=new JLabel(">>   ��ڨ��");
JLabel q42=new JLabel(">>   û������");
JLabel l1=new JLabel("(�������)");
JLabel l2=new JLabel("(������¿�ʼ)");
JLabel l3=new JLabel("(�������)");
JLabel l4=new JLabel("(�������)");
JLabel l5=new JLabel("(�������)");
JLabel l6=new JLabel("(�������)");
JLabel l7=new JLabel("(�������)");
JLabel l8=new JLabel("(�������)");
JLabel l9=new JLabel("(�������)");
JLabel l10=new JLabel("(�������)");
public void setFrame(){
	setSize(715,545);
	setMinimumSize(new Dimension(715,545));
	setLocation(400,100);
	setTitle("С����������");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void init(){
	l2.addMouseListener(new Replay());
	bg2.setPreferredSize(new Dimension(700,120));
	bg2.setLayout(null);
	bg2.add(q);
	q.setBounds(50, 20,700,20);
	bg2.add(q11);
	q11.setBounds(50,40,100,20);
	q11.addMouseListener(new Q11());
	bg2.add(q12);
	q12.setBounds(50,60,100,20);
	q12.addMouseListener(new Q12());
	bg2.add(q13);
	q13.setBounds(50,80,100,20);
	q13.addMouseListener(new Q13());
	bg1.setLayout(new BorderLayout());

	bg1.add(bg2,BorderLayout.PAGE_END);
	p1.add(bg1);
	add(p1);
}
public void reUI(){
	bg2.repaint();
	bg2.validate();
	bg1.repaint();
	bg1.validate();
}
public void fail(String s){
	bg1.setIcon(pic7);
	bg2.removeAll();
	q.setText(s);
	bg2.add(q);
	bg2.add(l2);
	l2.setBounds(50,40,100,20);
}
class Replay implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		
		Start start = new Start();
		start.setFrame();
		start.init();
		start.setVisible(true);
		Story.this.setVisible(false);
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {
		l2.setForeground(Color.red);
	}

	public void mouseExited(MouseEvent e) {
		l2.setForeground(Color.getColor(""));
	}
}
class Q11 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic3);
			bg2.removeAll();
			q.setText("������Ψһһ���˶��������Բ���Ϊʲô��ô˧���������˲�������������ˣ����ǸϿ�ȥ��С���ɣ�");
			bg2.add(q);
			bg2.add(l1);
			l1.setBounds(50,40,100,20);
			l1.addMouseListener(new L1());
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			q11.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			q11.setForeground(Color.getColor(""));
	}
	}
	class Q12 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic4);
			bg2.removeAll();
			q.setText("������з�����Լ��˽���ҡ����������Ժ���˵�����ǸϿ�ȥ��С���ɣ�");
			bg2.add(q);
			bg2.add(l1);
			l1.setBounds(50,40,100,20);
			l1.addMouseListener(new L1());
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			q12.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			q12.setForeground(Color.getColor(""));
	}
	}
	class Q13 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic5);
			bg2.removeAll();
			q.setText("�е��䰡���������˲�������������ˣ����ǸϿ�ȥ��С���ɣ�");
			bg2.add(q);
			bg2.add(l3);
			l3.addMouseListener(new L3());
			l3.setBounds(50,40,100,20);
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			q13.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			q13.setForeground(Color.getColor(""));
	}
	
	
	}
	class L1 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic6);
			bg2.removeAll();
			q.setText("�ۣ�(��o�� )������Ů�������Բۺý��ţ��ĵ�ʲô���ء�����");
			bg2.add(q);
			bg2.add(q21);
			q21.setBounds(50,40,500,20);
			q21.addMouseListener(new Q21());
			bg2.add(q22);
			q22.setBounds(50,60,500,20);
			q22.addMouseListener(new Q22());
			bg2.add(q23);
			q23.setBounds(50,80,100,20);
			q23.addMouseListener(new Q23());
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			l1.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			l1.setForeground(Color.getColor(""));
	}
	}
	class L3 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			fail("�Բ۾���������Ҫ�������������������磡�𡭡��������������Ϊ�ɱ�������ߣ�");
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			l3.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			l3.setForeground(Color.getColor(""));
	}
	}

	class Q21 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg2.removeAll();
			q.setText("С��:  �����������Java mini project �� deadline�ˣ������һ�û���أ���ô�찡~T.T~С�����а취ô��");
			bg2.add(q);
			bg2.add(l4);
			l4.setBounds(50,40,500,20);
			l4.addMouseListener(new L4());
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			q21.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			q21.setForeground(Color.getColor(""));
		}
	}
	class Q22 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg2.removeAll();
			q.setText("С��:  ����ô֪����ϲ�����򣡹�����~�Ȼ��һ�һ���·�~����ȥsala�ɣ�");
			bg2.add(q);
			bg2.add(l6);
			l6.setBounds(50,40,500,20);
			l6.addMouseListener(new L6());
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			q22.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			q22.setForeground(Color.getColor(""));
		}
	}
	class Q23 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic8);
			bg2.removeAll();
			bg2.add(l2);
			l2.setBounds(50,40,100,20);
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			q23.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			q23.setForeground(Color.getColor(""));
		}
	}
	class L4 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg2.removeAll();
			q.setText("С��:  (�����ᣡ�����ˣ�) �����а����ҵ����������Ǵ��񣡸���һ˵�ַ��Ӹ㶨~���������ǲ��Ǻ�˧��");
			bg2.add(q);
			bg2.add(l5);
			l5.setBounds(50,40,500,20);
			l5.addMouseListener(new L5());
			reUI();
			
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			l4.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			l4.setForeground(Color.getColor(""));
		}
	}
	class L5 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			fail("С����������һ���ˣ�");
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			l5.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			l5.setForeground(Color.getColor(""));
	}
	}
	class L6 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg2.removeAll();
			q.setText("С��:  ���Բ��㻹��᣿���ð���������ȥ���򳡰ɣ�");
			bg2.add(q);
			bg2.add(l7);
			l7.setBounds(50,40,500,20);
			l7.addMouseListener(new L7());
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			l6.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			l6.setForeground(Color.getColor(""));
	}
	}
	class L7 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic9);
			bg2.removeAll();
			q.setText("������Ѫ��������������������ô�棡");
			bg2.add(q);
			bg2.add(q31);
			q31.setBounds(50,40,500,20);
			q31.addMouseListener(new Q31());
			bg2.add(q32);
			q32.setBounds(50,60,500,20);
			q32.addMouseListener(new Q32());
			reUI();
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			l7.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent e) {
			l7.setForeground(Color.getColor(""));
	}
	}
	class Q31 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg2.removeAll();
			q.setText("С��:  ˭����˭��Է�Ŷ~");
			bg2.add(q);
			bg2.add(l8);
			l8.setBounds(50,40,500,20);
			l8.addMouseListener(new L8());
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			q31.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			q31.setForeground(Color.getColor(""));
		}
	}
	class Q32 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic11);
			bg2.removeAll();
			q.setText("��С��ƴ����ȫ����������Ȼ������Ű�ˡ�������");
			bg2.add(q);
			bg2.add(l10);
			l10.setBounds(50,40,500,20);
			l10.addMouseListener(new L10());
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			q32.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			q32.setForeground(Color.getColor(""));
		}
	}
	class L8 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg2.removeAll();
			q.setText("С�ɣ�  (�����ˮ�������)�����ˣ������߰�~������ȥ�Ի����Ӽӵ��ӷʳ���Ѫ�����ɣ�");
			bg2.add(q);
			bg2.add(l9);
			l9.setBounds(50,40,500,20);
			l9.addMouseListener(new L9());
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			l8.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			l8.setForeground(Color.getColor(""));
		}
	}
	class L9 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic10);
			bg2.removeAll();
			bg2.add(l2);
			l2.setBounds(50,40,100,20);
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			l9.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			l9.setForeground(Color.getColor(""));
		}
	}
	class L10 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic12);
			bg2.removeAll();
			q.setText("(ż�����˲̳�����)");
			bg2.add(q);
			bg2.add(q41);
			q41.setBounds(50,40,100,20);
			q41.addMouseListener(new Q41());
			bg2.add(q42);
			q42.setBounds(50,60,100,20);
			q42.addMouseListener(new Q42());
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			l10.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			l10.setForeground(Color.getColor(""));
		}
	}
	class Q41 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic13);
			bg2.removeAll();
			q.setText("С�ɺͲ̳�����һ���ˣ�");
			bg2.add(q);
			bg2.add(l2);
			l2.setBounds(50,40,500,20);
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			q41.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			q41.setForeground(Color.getColor(""));
		}
	}
	class Q42 implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			bg1.setIcon(pic14);
			bg2.removeAll();
			q.setText("�Բ�����ʵ�ڱ಻��ȥ��˭������һ����У���������");
			bg2.add(q);
			bg2.add(l2);
			l2.setBounds(50,40,500,20);
			reUI();
		}

		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			q42.setForeground(Color.red);
		}

		public void mouseExited(MouseEvent e) {
			q42.setForeground(Color.getColor(""));
		}
	}
	public static void main(String[] args){

}
	}
