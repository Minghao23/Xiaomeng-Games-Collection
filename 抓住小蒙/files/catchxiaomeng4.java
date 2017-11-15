import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.io.*;

import javax.swing.*;
public class catchxiaomeng4 extends JFrame implements ActionListener,Serializable,WindowListener{
	JButton x[];
	int count;
	int ran;
	int ran2,ran3,ran4;
	int dir;
	int socer=0;
	int last;
	Long beginTime,endTime;
	Float resultTime;
	float bt1=0;
	float bt2=999999999;
	JLabel s1=new JLabel("Click");
	JLabel s3=new JLabel("Best time");
	JButton rechoose=new JButton("重新选择难度");
	JLabel l1=new JLabel(Integer.toString(socer));
	JLabel l3=new JLabel("0");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();

	
	ImageIcon[] ico=new ImageIcon[4]; 
	ImageIcon icon = new ImageIcon("pic/right.jpg");
	ImageIcon icon2 = new ImageIcon("pic/b.gif");
	ImageIcon icon3=new ImageIcon("pic/left.jpg");
	ImageIcon icon4=new ImageIcon("pic/c.jpg");
	ImageIcon icon5=new ImageIcon("pic/d.jpg");
	JLabel l4=new JLabel(icon);
	JLabel l5=new JLabel("      Fllow this:");
	
	public catchxiaomeng4(){	
		 ico[0]=new ImageIcon("pic/0.jpg");
		 ico[1]=new ImageIcon("pic/1.jpg");
		 ico[2]=new ImageIcon("pic/2.jpg");
		 ico[3]=new ImageIcon("pic/3.jpg");
			this.setTitle("手速练习器");
    p1.setPreferredSize(new Dimension(400, 400));
    p2.setPreferredSize(new Dimension(400, 30));
    p3.setPreferredSize(new Dimension(400, 460));


	p2.add(s1);
    p2.add(l1);
	p2.add(s3);
	p2.add(l3);
	p2.add(rechoose);
	FlowLayout flowLayout1=new FlowLayout(0);
	flowLayout1.setHgap(0);
	flowLayout1.setVgap(0);
	this.setLayout(flowLayout1);
	p3.setLayout(flowLayout1);
	p3.add(p2);
	p3.add(p1);
	this.add(p3);
	this.add(l5);
	l5.setVisible(true);
	this.add(l4);
	p1.setLayout(new GridLayout(3,3));
	count=9;
	x=new JButton[count];
	for(int i=0;i<count;i++){
		x[i]=new JButton();
		p1.add(x[i]);
		x[i].addActionListener(this);
	}
	
	this.setSize(600,460);
	this.addWindowListener(this); 
	this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
	this.setVisible(true);
	}
    public void first(){
    	JOptionPane.showMessageDialog(null,"按照提示方向点击十次正确的小蒙，系统会统计你所用的时间并保存你的最佳成绩\n计时从第一次点击开始\n点击向错误的小蒙会使游戏结束\n此程序用于练习DotA/LOL手速","点击开始练习",JOptionPane.WARNING_MESSAGE,icon2);
		
    }
	public void reset(){
		dir=(int)(Math.random()*3);
		x[ran].setIcon(null);
		x[ran2].setIcon(null);
		x[ran3].setIcon(null);
		x[ran4].setIcon(null);
		l1.setText(Integer.toString(socer));
		do{ran=(int)(Math.random()*count);}
		while(ran==last);
		do{ran2=(int)(Math.random()*count);}
        while(ran2==ran);
		do{ran3=(int)(Math.random()*count);}
        while(ran3==ran2||ran3==ran);
		do{ran4=(int)(Math.random()*count);}
        while(ran4==ran3||ran4==ran2||ran4==ran);
		x[ran].setIcon(icon); 
		x[ran2].setIcon(icon3);
		x[ran3].setIcon(icon4);
		x[ran4].setIcon(icon5);
		l4.setIcon(ico[dir]);
		last=ran;
			repaint();
			validate();
		
	}
	public boolean blank(Object o){
		if(o==x[ran]||o==x[ran2]||o==x[ran3]||o==x[ran4]){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean right(Object o){
		if(dir==0&&o==x[ran]){
			return true;
		}
		else if(dir==1&&o==x[ran2]){
			return true;
		}
		else if(dir==2&&o==x[ran3]){
			return true;
		}
		else if(dir==3&&o==x[ran4]){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void fail(){
		socer=0;
		l1.setText(Integer.toString(socer));
		JOptionPane.showMessageDialog(null,"Wrong!\nPress OK Button to fuck me again!","Game Over",JOptionPane.WARNING_MESSAGE,icon2);
		repaint();
		validate();
	}
	public void check(float a){
		bt1=a;
		if(bt1<bt2){
			JOptionPane.showMessageDialog(null,"New best time! "+resultTime+"\nAre you going to fuck me again?","Fuck me again",JOptionPane.WARNING_MESSAGE,icon2);
			
			bt2=bt1;}
		else{
			JOptionPane.showMessageDialog(null,"Your time: "+resultTime+"\nAre you going to fuck me again?","Fuck me again!",JOptionPane.WARNING_MESSAGE,icon2);
			
		}
	}
	public void actionPerformed(ActionEvent e){
		 if(socer==0){
		    	beginTime=System.nanoTime();
		    }
		    if(socer==9&&right(e.getSource())){
		    	endTime=System.nanoTime();
		    	resultTime=(float)(endTime-beginTime)/1000000000;
		    	
		    	check(resultTime);
		    	l3.setText(String.valueOf(bt2));
		    	repaint();
		    	
				validate();
                socer=-1;

		    }
		if(right(e.getSource())){
	    	socer++;
	    
	    	reset();}
		else if(right(e.getSource())==false&&blank(e.getSource())==false){
			fail();
		}
    else {
	
    }
	}
	public static void main(String[] args){
		catchxiaomeng4 d4=new catchxiaomeng4();
	    d4.first();
		d4.reset();
	}
	public void windowOpened(WindowEvent e) {
		  // TODO: Add your code here
		 }

		 public void windowClosing(WindowEvent e) {
			 try{
					FileOutputStream fs=new FileOutputStream("save4.ser");
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
