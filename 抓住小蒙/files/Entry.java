import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

import java.io.*;

public class Entry extends JFrame implements ActionListener,Serializable{
	JLabel b0=new JLabel("计时版");
	JLabel b10=new JLabel("计次版");
	JLabel b11=new JLabel("建议按照由简单至变态顺序练习");
	JButton b1=new JButton();
	JButton b2=new JButton();
	JButton b3=new JButton();
	JButton b4=new JButton();
	JButton b5=new JButton();
	JButton b6=new JButton();
	JButton b7=new JButton();
	JButton b8=new JButton();
	JButton b9=new JButton();

	catchxiaomeng d;
	catchxiaomeng2 d2;
	catchxiaomeng3 d3;
	catchxiaomeng4 d4;
	Ncatchxiaomeng d5;
	Ncatchxiaomeng2 d6;
	Ncatchxiaomeng3 d7;
	Ncatchxiaomeng4 d8;
	public Entry(){
		b1.setText("简单版");
		b2.setText("中级版");
		b3.setText("专家版");
		b4.setText("变态版");
		b5.setText("简单版");
		b6.setText("中级版");
		b7.setText("专家版");
		b8.setText("变态版");
		FlowLayout flowLayout1=new FlowLayout(0);
		this.setLayout(flowLayout1);
		this.add(b0);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b10);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b11);
		
		
		
		this.setTitle("手速练习器");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		this.setSize(400,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
		d=new catchxiaomeng();
		d.reset();
		d.setVisible(false);
	    d2=new catchxiaomeng2();
		d2.reset();
		d2.setVisible(false);
		d3=new catchxiaomeng3();
		d3.reset();
		d3.setVisible(false);
		d4=new catchxiaomeng4();
		d4.reset();
		d4.setVisible(false);
		d5=new Ncatchxiaomeng();
		d5.reset();
		d5.setVisible(false);
		d6=new Ncatchxiaomeng2();
		d6.setVisible(false);
		d6.reset();
		d7=new Ncatchxiaomeng3();
		d7.setVisible(false);
		d7.reset();
		d8=new Ncatchxiaomeng4();
		d8.setVisible(false);
		d8.reset();
		try{
			ObjectInputStream is1=new ObjectInputStream(new FileInputStream("save1.ser"));
			d.bt2=((catchxiaomeng)is1.readObject()).bt2;
			d.l3.setText(String.valueOf(d.bt2));
		
		}catch(Exception ex){
		}
		try{
			ObjectInputStream is2=new ObjectInputStream(new FileInputStream("save2.ser"));
			d2.bt2=((catchxiaomeng2)is2.readObject()).bt2;
			d2.l3.setText(String.valueOf(d2.bt2));
		
		}catch(Exception ex){

		}
		try{
			ObjectInputStream is3=new ObjectInputStream(new FileInputStream("save3.ser"));
			d3.bt2=((catchxiaomeng3)is3.readObject()).bt2;
			d3.l3.setText(String.valueOf(d3.bt2));
		
		}catch(Exception ex){

		}
		try{
			ObjectInputStream is4=new ObjectInputStream(new FileInputStream("save4.ser"));
			d4.bt2=((catchxiaomeng4)is4.readObject()).bt2;
			d4.l3.setText(String.valueOf(d4.bt2));
		
		}catch(Exception ex){

		}
		try{
			ObjectInputStream is5=new ObjectInputStream(new FileInputStream("save5.ser"));
			d5.bt2=((Ncatchxiaomeng)is5.readObject()).bt2;
			d5.l3.setText(String.valueOf(d5.bt2));
		
		}catch(Exception ex){

		}
		try{
			ObjectInputStream is6=new ObjectInputStream(new FileInputStream("save6.ser"));
			d6.bt2=((Ncatchxiaomeng2)is6.readObject()).bt2;
			d6.l3.setText(String.valueOf(d6.bt2));
		
		}catch(Exception ex){

		}
		try{
			ObjectInputStream is7=new ObjectInputStream(new FileInputStream("save7.ser"));
			d7.bt2=((Ncatchxiaomeng3)is7.readObject()).bt2;
			d7.l3.setText(String.valueOf(d7.bt2));
		
		}catch(Exception ex){

		}
		try{
			ObjectInputStream is8=new ObjectInputStream(new FileInputStream("save8.ser"));
			d8.bt2=((Ncatchxiaomeng4)is8.readObject()).bt2;
			d8.l3.setText(String.valueOf(d8.bt2));
		
		}catch(Exception ex){

		}
		
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
		d.setVisible(true);	
		this.setVisible(false);
		d.first();
		d.rechoose.addActionListener(new mylistener());}
		if(e.getSource()==b2){d2.setVisible(true);	
		this.setVisible(false);
		d2.first();
		d2.rechoose.addActionListener(new mylistener());}
		if(e.getSource()==b3){d3.setVisible(true);	
		this.setVisible(false);
		d3.first();
		d3.rechoose.addActionListener(new mylistener());}
		if(e.getSource()==b4){
			d4.setVisible(true);	
			this.setVisible(false);
			d4.first();
			d4.rechoose.addActionListener(new mylistener());			
		}
		if(e.getSource()==b5){d5.setVisible(true);	
		this.setVisible(false);
		d5.first();
		d5.rechoose.addActionListener(new mylistener());}
		if(e.getSource()==b6){d6.setVisible(true);	
		this.setVisible(false);
		d6.first();
		d6.rechoose.addActionListener(new mylistener());
			
		}
		if(e.getSource()==b7){
			d7.setVisible(true);	
			this.setVisible(false);
			d7.first();
			d7.rechoose.addActionListener(new mylistener());
			
		}
		if(e.getSource()==b8){
			d8.setVisible(true);	
			this.setVisible(false);
			d8.first();
			d8.rechoose.addActionListener(new mylistener());			
		}
		
	}
	
	public static void main(String[] args){
	Entry e1=new Entry(); 
	
}
	class mylistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==d.rechoose){
				 try{
						FileOutputStream fs1=new FileOutputStream("save1.ser");
						ObjectOutputStream os1=new ObjectOutputStream(fs1);
						os1.writeObject(d);
						os1.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d2.rechoose){
				 try{
						FileOutputStream fs2=new FileOutputStream("save2.ser");
						ObjectOutputStream os2=new ObjectOutputStream(fs2);
						os2.writeObject(d2);
						os2.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d3.rechoose){
				 try{
						FileOutputStream fs3=new FileOutputStream("save3.ser");
						ObjectOutputStream os3=new ObjectOutputStream(fs3);
						os3.writeObject(d3);
						os3.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d4.rechoose){
				 try{
						FileOutputStream fs4=new FileOutputStream("save4.ser");
						ObjectOutputStream os4=new ObjectOutputStream(fs4);
						os4.writeObject(d4);
						os4.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d5.rechoose){
				 try{
						FileOutputStream fs5=new FileOutputStream("save5.ser");
						ObjectOutputStream os5=new ObjectOutputStream(fs5);
						os5.writeObject(d5);
						os5.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d6.rechoose){
				 try{
						FileOutputStream fs6=new FileOutputStream("save6.ser");
						ObjectOutputStream os6=new ObjectOutputStream(fs6);
						os6.writeObject(d6);
						os6.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d7.rechoose){
				 try{
						FileOutputStream fs7=new FileOutputStream("save7.ser");
						ObjectOutputStream os7=new ObjectOutputStream(fs7);
						os7.writeObject(d7);
						os7.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d8.rechoose){
				 try{
						FileOutputStream fs8=new FileOutputStream("save8.ser");
						ObjectOutputStream os8=new ObjectOutputStream(fs8);
						os8.writeObject(d8);
						os8.close();
						
					}catch(Exception ex){
					}
			}
			if(e.getSource()==d5.rechoose&&d5.socer!=0){d5.timer.cancel();}
			if(e.getSource()==d6.rechoose&&d6.socer!=0){d6.timer.cancel();}
			if(e.getSource()==d7.rechoose&&d7.socer!=0){d7.timer2.cancel();}
			if(e.getSource()==d8.rechoose&&d8.socer!=0){d8.timer.cancel();}
			d.socer=0;
			d2.socer=0;
			d3.socer=0;
			d4.socer=0;
			d5.socer=0;
			d6.socer=0;
			d7.socer=0;
			d8.socer=0;
			d.l1.setText(Integer.toString(d.socer));
			d2.l1.setText(Integer.toString(d2.socer));
			d3.l1.setText(Integer.toString(d3.socer));
			d4.l1.setText(Integer.toString(d4.socer));
			d5.l1.setText(Integer.toString(d5.socer));
			d6.l1.setText(Integer.toString(d6.socer));
			d7.l1.setText(Integer.toString(d7.socer));
			d8.l1.setText(Integer.toString(d8.socer));
			
			d.setVisible(false);
			d2.setVisible(false);
			d3.setVisible(false);
			d4.setVisible(false);
			d5.setVisible(false);
			d6.setVisible(false);
			d7.setVisible(false);
			d8.setVisible(false);
			Entry.this.setVisible(true);
			
			
		}
	}

	
}
