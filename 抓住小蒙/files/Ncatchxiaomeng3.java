import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;

import javax.swing.*;

import java.io.*;

public class Ncatchxiaomeng3 extends JFrame implements ActionListener,Serializable,WindowListener{
	transient java.util.Timer timer2 ;  
	class task2 extends TimerTask implements Serializable {   
		public void run() {   
			timer2.cancel();
			check(socer);
			l3.setText(String.valueOf(bt2));
			socer=0;
			l1.setText(String.valueOf(socer));
			repaint();
			validate();
		}};
		transient java.util.Timer timer = new java.util.Timer(true);   
	class task extends TimerTask implements Serializable {   
		public void run() {   
			if((ran3!=ran2)&&(ran3!=ran)){x[ran3].setIcon(null);}
			  do{ran3=(int)(Math.random()*count);
				}while(ran3==ran2||ran3==ran);
			  x[ran3].setIcon(icon4);
			  repaint();
			  validate();
			if((count2%2)==1){
			  x[ran3].setIcon(null);
			  repaint();
			  validate();
		  }
		  if((count2%2)==0){
			  x[ran3].setIcon(icon4);
			  repaint();
			  validate();
		  }
		  count2++;
		}   
		};   

	JButton x[];
	int count;
	int count2=0;
	int ran;
	int ran2;
	int ran3;
	int socer=0;
	int last;
	
	
	float bt1=0;
	float bt2=0;
	JLabel s1=new JLabel("Click");
	JLabel s3=new JLabel("Best socer");
	JButton rechoose=new JButton("重新选择难度");
	JLabel l1=new JLabel(Integer.toString(socer));
	JLabel l3=new JLabel("0");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	
	ImageIcon icon = new ImageIcon("pic/right.jpg");
	ImageIcon icon2 = new ImageIcon("pic/b.gif");
	ImageIcon icon3=new ImageIcon("pic/left.jpg");
	ImageIcon icon4=new ImageIcon("pic/e.jpg");
	public Ncatchxiaomeng3(){
	this.setTitle("手速练习器");
    p1.setPreferredSize(new Dimension(400, 400));
    p2.setPreferredSize(new Dimension(400, 30));
	p2.add(s1);
    p2.add(l1);
	p2.add(s3);
	p2.add(l3);
	p2.add(rechoose);
	FlowLayout flowLayout1=new FlowLayout(0);
	flowLayout1.setHgap(0);
	flowLayout1.setVgap(0);
	this.setLayout(flowLayout1);
	this.add(p2);
	this.add(p1);
	p1.setLayout(new GridLayout(3,3));
	count=9;
	x=new JButton[count];
	for(int i=0;i<count;i++){
		x[i]=new JButton();
		p1.add(x[i]);
		x[i].addActionListener(this);
	}
	this.addWindowListener(this); 
	this.setSize(400,460);
	this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
	this.setVisible(true);
	timer.schedule(new task(), 0, 500);
	}
    public void first(){
    	JOptionPane.showMessageDialog(null,"点击向右看的小蒙，系统会统计你十秒内的点击次数并保存你的最佳成绩\n计时从第一次点击开始\n点击向左看的小蒙会使游戏结束\n点击随即出现的向下看的小蒙也会使游戏结束\n此程序用于练习DotA/LOL手速","点击开始练习",JOptionPane.WARNING_MESSAGE,icon2);
		
    }
	public void reset(){
		x[ran].setIcon(null);
		x[ran2].setIcon(null);
		
		l1.setText(Integer.toString(socer));
		do{ran=(int)(Math.random()*count);}
		while(ran==last||ran==ran3);
		do{ran2=(int)(Math.random()*count);}
        while(ran2==ran||ran==ran3);
		
		x[ran].setIcon(icon); 
		x[ran2].setIcon(icon3);
		
		last=ran;
			repaint();
			validate();
		
	}
	public void fail(){
		if(socer!=0){timer2.cancel();}
		
		socer=0;
		l1.setText(Integer.toString(socer));
		JOptionPane.showMessageDialog(null,"Wrong!\nPress OK Button to fuck me again!","Game Over",JOptionPane.WARNING_MESSAGE,icon2);
		repaint();
		validate();
	}
	public void check(int a){
		bt1=a;
		if(bt1>bt2){
			JOptionPane.showMessageDialog(null,"New best socer! "+bt1+"\nAre you going to fuck me again?","Fuck me again",JOptionPane.WARNING_MESSAGE,icon2);
			
			bt2=bt1;}
		else{
			JOptionPane.showMessageDialog(null,"Your socer: "+bt1+"\nAre you going to fuck me again?","Fuck me again!",JOptionPane.WARNING_MESSAGE,icon2);
			
		}
	}
	public void actionPerformed(ActionEvent e){
		 if(socer==0&&e.getSource()==x[ran]){
			 timer2 = new java.util.Timer(true);
			 timer2.schedule(new task2(), 10000);
		    }
		 
			 
		 
		   
		if(e.getSource()==x[ran]){
	    	socer++;
	    
	    	reset();}
		else if((e.getSource()==x[ran2]||(e.getSource()==x[ran3]&&(count2%2)==1))){
			fail();
		}
	
    else {
	
    }
	}
	public static void main(String[] args){
		Ncatchxiaomeng3 d3=new Ncatchxiaomeng3();
	    d3.first();
		d3.reset();
	}
public void windowOpened(WindowEvent e) {
	  // TODO: Add your code here
	 }

	 public void windowClosing(WindowEvent e) {
		 try{
				FileOutputStream fs=new FileOutputStream("save7.ser");
				ObjectOutputStream os=new ObjectOutputStream(fs);
				os.writeObject(this);
				os.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		 System.exit(1); 
	 }
	 public void windowClosed(WindowEvent e) {
	  // TODO: Add your code here
	 }
	 public void windowIconified(WindowEvent e) {
	  // TODO: Add your code here
	 }
	 public void windowDeiconified(WindowEvent e) {
	  // TODO: Add your code here
	 }
	 public void windowActivated(WindowEvent e) {
	  // TODO: Add your code here
	 }
	 public void windowDeactivated(WindowEvent e) {
	  // TODO: Add your code here
	 }
}
