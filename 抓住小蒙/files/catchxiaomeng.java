import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

import java.io.*;
public class catchxiaomeng extends JFrame implements ActionListener,Serializable,WindowListener{
	JButton x[];
	int count;
	int ran;
	int socer=0;
	int last;
	Long beginTime,endTime;
	Float resultTime;
	float bt1=0;
	float bt2=999999999;
	JLabel s1=new JLabel("Click");
	JLabel s3=new JLabel("Best time");
	JButton rechoose=new JButton("����ѡ���Ѷ�");
	JLabel l1=new JLabel(Integer.toString(socer));
	JLabel l3=new JLabel("0");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	
	ImageIcon icon = new ImageIcon("pic/a.gif");
	ImageIcon icon2 = new ImageIcon("pic/b.gif");
	public catchxiaomeng(){
	this.setTitle("������ϰ���򵥰�");
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
	}
    public void first(){
    	JOptionPane.showMessageDialog(null,"���ʮ��С�ɣ�ϵͳ��ͳ�������õ�ʱ�䲢���������ѳɼ�\n��ʱ�ӵ�һ�ε����ʼ\n�˳���������ϰDotA/LOL����","�����ʼ��ϰ",JOptionPane.WARNING_MESSAGE,icon2);
		
    }
	public void reset(){
		x[ran].setIcon(null);
		l1.setText(Integer.toString(socer));
		do{ran=(int)(Math.random()*count);}
		while(ran==last);
		x[ran].setIcon(icon); 
		last=ran;
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
		    if(socer==9&&e.getSource()==x[ran]){
		    	endTime=System.nanoTime();
		    	resultTime=(float)(endTime-beginTime)/1000000000;
		    	
		    	check(resultTime);
		    	l3.setText(String.valueOf(bt2));
		    	repaint();
				validate();
                socer=-1;

		    }
		if(e.getSource()==x[ran]){
	    	socer++;
	    
		reset();}
    else {
	
    }
	}
	public static void main(String[] args){
		catchxiaomeng d=new catchxiaomeng();
	    d.first();
		d.reset();
	}
	public void windowOpened(WindowEvent e) {
		  // TODO: Add your code here
		 }

		 public void windowClosing(WindowEvent e) {
			 try{
					FileOutputStream fs=new FileOutputStream("save1.ser");
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
