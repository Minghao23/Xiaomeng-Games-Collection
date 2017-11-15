import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import java.util.Random;

@SuppressWarnings("serial")
// create class SmileyCount1
public class XiaomengCount extends JFrame {

	// set constructor
	public XiaomengCount(String title) {
		this.title = title;
		init();
	}

	// set leftNums and rightNums
	private int leftNums;
	private int rightNums;

	public void setLeftNums(int leftNums) {
		this.leftNums = leftNums;
	}

	public void setRightNums(int rightNums) {
		this.rightNums = rightNums;
	}

	// create objects
	JButton button = new JButton("Fuck him!");

	String title;
	JLabel smiley;
	JLabel sentence = new JLabel(
			"Enter the number of xiaomeng, result and click on 'Fuck him!'你每答对一道题就会得到一个小蒙！一旦答错你就会失去所有小蒙！");
	JLabel mm =new JLabel("你收集到的小蒙！");
	JLabel plusSign = new JLabel("+");
	JLabel equalSign = new JLabel("=");
	JLabel plusIcon = new JLabel(new ImageIcon("Pic/plus.png"));
	JLabel q1Icon = new JLabel(new ImageIcon("Pic/q1.gif"));
	JLabel q2Icon = new JLabel(new ImageIcon("Pic/q2.gif"));
	JLabel m1 = new JLabel(new ImageIcon("Pic/111.JPG"));
	JLabel m2 = new JLabel(new ImageIcon("Pic/222.JPG"));
	JLabel m3 = new JLabel(new ImageIcon("Pic/333.JPG"));
	JLabel m4 = new JLabel(new ImageIcon("Pic/444.JPG"));
	JLabel m5 = new JLabel(new ImageIcon("Pic/555.JPG"));
	JLabel m6 = new JLabel(new ImageIcon("Pic/666.JPG"));
	
	JLabel[] Pic={m1,m2,m3,m4,m5,m6};

	JTextField textFieldOne = new JTextField(2);
	JTextField textFieldTwo = new JTextField(2);
	JTextField textFieldThree = new JTextField(2);

	JPanel sentenceArea = new JPanel();
	JPanel countArea = new JPanel();
	JPanel centerArea = new JPanel();
	JPanel smileyAreaLeft = new JPanel();
	JPanel smileyAreaRight = new JPanel();
	JPanel xiaomengArea = new JPanel();
	JPanel mmArea = new JPanel();
	JPanel picArea = new JPanel();
	

	// set the layout of the frame
	public void init() {
		setPreferredSize(new Dimension(1200, 720));
		setMinimumSize(new Dimension(1200, 720));
		setLocation(100, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(sentenceArea, BorderLayout.PAGE_START);
		add(xiaomengArea, BorderLayout.PAGE_END);
		add(centerArea, BorderLayout.CENTER);
		add(smileyAreaLeft, BorderLayout.LINE_START);
		add(smileyAreaRight, BorderLayout.LINE_END);

		// invoke ContentPane()
		createContentpane();

		pack();

		// set the title and make it be placed in the middle
		setFont(new Font("System", Font.PLAIN, 14));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x = fm.stringWidth(title);
		int y = fm.stringWidth(" ");
		int z = getWidth() / 2 - (x / 2);
		int w = z / y;
		String pad = "";
		pad = String.format("%" + w + "s", pad);
		setTitle(pad + title);
	}
	
	public void picFill(){
		int k= new Random().nextInt(6);
		picArea.add(Pic[k], BorderLayout.CENTER);
		}
		
	
	// add components to content pane
	private void createContentpane() {
		xiaomengArea.setLayout(new BorderLayout());
		mmArea.setLayout(new FlowLayout(1));
		xiaomengArea.add(countArea, BorderLayout.PAGE_END);
		xiaomengArea.add(mmArea, BorderLayout.PAGE_START);
		mmArea.add(mm);
		xiaomengArea.add(picArea, BorderLayout.CENTER);
		
		sentenceArea.add(sentence, BorderLayout.CENTER);

		centerArea.add(q1Icon, BorderLayout.PAGE_START);
		centerArea.add(plusIcon, BorderLayout.CENTER);
		centerArea.add(q2Icon, BorderLayout.PAGE_END);

		countArea.add(textFieldOne);
		countArea.add(plusSign);
		countArea.add(textFieldTwo);
		countArea.add(equalSign);
		countArea.add(textFieldThree);
		countArea.add(button);

		setLeftNums(smileyFill(smileyAreaLeft));
		setRightNums(smileyFill2(smileyAreaRight));
		
		// add actionlistener to check button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// check the filled value and divide to two cases
				if (checkValues(textFieldOne.getText(), textFieldTwo.getText(),
						textFieldThree.getText())) {
					// the case of getting right answer
					sentence.setText("Correct! Have another fuck?你每答对一道题就会得到一个小蒙！一旦答错你就会失去所有小蒙！");
					textFieldOne.setText("");
					textFieldTwo.setText("");
					textFieldThree.setText("");
					
                    picFill();
					
					//remove all the component of panel then repaint
					smileyAreaLeft.removeAll();
					smileyAreaRight.removeAll();

					setLeftNums(smileyFill(smileyAreaLeft));
					setRightNums(smileyFill2(smileyAreaRight));

					smileyAreaLeft.updateUI();
					smileyAreaRight.updateUI();
					sentence.updateUI();

				} else {
					// the case of getting wrong answer
					sentence.setText("Wrong! fuck him again!你每答对一道题就会得到一个小蒙！一旦答错你就会失去所有小蒙！");
					sentence.updateUI();
					picArea.removeAll();
				}

				
			}
			// set the method of checking the values
			private boolean checkValues(String text, String text2, String text3) {
				int one = Integer.parseInt(text);
				int two = Integer.parseInt(text2);
				int three = Integer.parseInt(text3);
				if (one == leftNums && two == rightNums && (one + two) == three) {
					return true;
				} else {
					return false;
				}
			}
		});
	}


	// fill a random numbers of smiley icon to the panel
	public int smileyFill(JPanel panel) {
		panel.setLayout(new FlowLayout(0));
		panel.setPreferredSize(new Dimension(470, 500));
		int num = new Random().nextInt(10) + 1;
		for (int i = 1; i <= num; i++) {
			smiley = new JLabel(new ImageIcon("D:/xiaomeng.jpg"));
			panel.add(smiley);
		}
		return num;
	}

	public int smileyFill2(JPanel panel) {
		panel.setLayout(new FlowLayout(0));
		panel.setPreferredSize(new Dimension(470, 500));
		int num = new Random().nextInt(10) + 1;
		for (int i = 1; i <= num; i++) {
			smiley = new JLabel(new ImageIcon("D:/xiaomeng2.jpg"));
			panel.add(smiley);
		}
		return num;
	}

	public static void main(String[] args) {
		XiaomengCount run = new XiaomengCount("小蒙收集器");
		// set frame visible
		run.setVisible(true);
	}
}