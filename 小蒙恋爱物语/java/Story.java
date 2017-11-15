

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
JLabel q=new JLabel("今天去见小娇好激动\\(≧▽≦)/  穿什么衣服去好呢?");
JLabel q11=new JLabel(">>   运动服");
JLabel q12=new JLabel(">>   休闲衫");
JLabel q13=new JLabel(">>   裸体");
JLabel q21=new JLabel(">>   哈哈哈~最近忙些什么呢？");
JLabel q22=new JLabel(">>   走啊~打球去？虐爆你！");
JLabel q23=new JLabel(">>   约不？");
JLabel q31=new JLabel(">>   还是让着她点吧，毕竟女生");
JLabel q32=new JLabel(">>   是时候展现真正的技术了！发挥全力让小娇看到我男人的一面吧！");
JLabel q41=new JLabel(">>   搭讪！");
JLabel q42=new JLabel(">>   没看见！");
JLabel l1=new JLabel("(点击继续)");
JLabel l2=new JLabel("(点击重新开始)");
JLabel l3=new JLabel("(点击继续)");
JLabel l4=new JLabel("(点击继续)");
JLabel l5=new JLabel("(点击继续)");
JLabel l6=new JLabel("(点击继续)");
JLabel l7=new JLabel("(点击继续)");
JLabel l8=new JLabel("(点击继续)");
JLabel l9=new JLabel("(点击继续)");
JLabel l10=new JLabel("(点击继续)");
public void setFrame(){
	setSize(715,545);
	setMinimumSize(new Dimension(715,545));
	setLocation(400,100);
	setTitle("小蒙恋爱物语");
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
			q.setText("这是我唯一一件运动服……卧槽我为什么这么帅。。。算了不纠结这个问题了，还是赶快去见小娇吧！");
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
			q.setText("哥就是有范，想约的私信我。。。算了以后再说，还是赶快去见小娇吧！");
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
			q.setText("有点冷啊。。。算了不纠结这个问题了，还是赶快去见小娇吧！");
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
			q.setText("哇！(⊙o⊙ )！！美女！！！卧槽好紧张，聊点什么好呢。。。");
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
			fail("卧槽警察叔叔你要干嘛！别这样！别这样大哥！别……（以有嫖娼嫌疑为由被警察带走）");
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
			q.setText("小娇:  唉、明天就是Java mini project 的 deadline了，可是我还没做呢，怎么办啊~T.T~小蒙你有办法么？");
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
			q.setText("小娇:  你怎么知道我喜欢篮球！哈哈哈~等会我换一件衣服~我们去sala吧！");
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
			q.setText("小蒙:  (机！会！来！了！) 必须有啊！我的室友张悦是大神！跟他一说分分钟搞定~哈哈哈我是不是很帅！");
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
			fail("小娇和张悦在一起了！");
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
			q.setText("小蒙:  （卧槽你还真会？）好啊、那我们去篮球场吧！");
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
			q.setText("（流鼻血。。。）这尼玛让我怎么玩！");
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
			q.setText("小娇:  谁输了谁请吃饭哦~");
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
			q.setText("（小蒙拼尽了全力！！！！然后他被虐了。。。）");
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
			q.setText("小蒙：  (故意放水输掉比赛)我输了！哈哈走吧~我请你去吃火爆羊杂加蛋加肥肠加血豆腐吧！");
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
			q.setText("(偶遇到了蔡晨威！)");
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
			q.setText("小蒙和蔡晨威在一起了！");
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
			q.setText("卧槽作者实在编不下去了谁来给我一点灵感！！！！！");
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
