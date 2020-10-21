import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton ninthButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divissionButton;
	JButton multiplicationButton;
	JButton substractionButton;
	JButton additionButton;
	JButton clearButton;
	public Calculator() {
			
		jf = new JFrame("Renjith's Calculator");
		
		jf.setLayout(null);	
		jf.setSize(600,600);
		jf.setLocation(300, 150);
		
		displayLabel = new JLabel();		
		displayLabel.setBounds(30, 40, 540, 70);		
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
		displayLabel.setOpaque(true);		
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);		
		displayLabel.setForeground(Color.BLACK);		
		jf.add(displayLabel);
		
		sevenButton = new JButton("7");		
		sevenButton.setBounds(30, 140, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN, 40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");		
		eightButton.setBounds(130, 140, 80, 80);
		eightButton.setFont(new Font("Arial",Font.PLAIN, 40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		ninthButton = new JButton("9");
		ninthButton.setBounds(230, 140, 80, 80);
		ninthButton.setFont(new Font("Arial",Font.PLAIN, 40));
		ninthButton.addActionListener(this);
		jf.add(ninthButton);
		
		fourButton = new JButton("4");		
		fourButton.setBounds(30, 240, 80, 80);
		fourButton.setFont(new Font("Arial",Font.PLAIN, 40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");		
		fiveButton.setBounds(130, 240, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN, 40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230, 240, 80, 80);
		sixButton.setFont(new Font("Arial",Font.PLAIN, 40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton = new JButton("1");		
		oneButton.setBounds(30, 340, 80, 80);
		oneButton.setFont(new Font("Arial",Font.PLAIN, 40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");		
		twoButton.setBounds(130, 340, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN, 40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230, 340, 80, 80);
		threeButton.setFont(new Font("Arial",Font.PLAIN, 40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton = new JButton(".");		
		dotButton.setBounds(30, 440, 80, 80);
		dotButton.setFont(new Font("Arial",Font.PLAIN, 40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton = new JButton("0");		
		zeroButton.setBounds(130, 440, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(230, 440, 80, 80);
		equalButton.setFont(new Font("Arial",Font.PLAIN, 40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divissionButton = new JButton("/");
		divissionButton.setBounds(330, 140, 80, 80);
		divissionButton.setFont(new Font("Arial",Font.PLAIN, 40));
		divissionButton.addActionListener(this);
		jf.add(divissionButton);
		
		multiplicationButton = new JButton("*");
		multiplicationButton.setBounds(330, 240, 80, 80);
		multiplicationButton.setFont(new Font("Arial",Font.PLAIN, 40));
		multiplicationButton.addActionListener(this);
		jf.add(multiplicationButton);
		
		substractionButton = new JButton("-");
		substractionButton.setBounds(330, 340, 80, 80);
		substractionButton.setFont(new Font("Arial",Font.PLAIN, 40));
		substractionButton.addActionListener(this);
		jf.add(substractionButton);
		
		additionButton = new JButton("+");
		additionButton.setBounds(330, 440, 80, 80);
		additionButton.setFont(new Font("Arial",Font.PLAIN, 40));
		additionButton.addActionListener(this);
		jf.add(additionButton);
		
		clearButton = new JButton("C");
		clearButton.setBounds(430, 440, 100, 80);
		clearButton.setFont(new Font("Arial",Font.PLAIN, 40));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sevenButton) {
			displayLabel.setText(displayLabel.getText() +  "7");
		}else if(e.getSource() == eightButton) {
			displayLabel.setText(displayLabel.getText() + "8");
		}else if(e.getSource() == ninthButton) {
			displayLabel.setText(displayLabel.getText() + "9");
		}else if(e.getSource() == fourButton) {
			displayLabel.setText(displayLabel.getText() + "4");
		}else if(e.getSource() == fiveButton) {
			displayLabel.setText(displayLabel.getText() + "5");
		}else if(e.getSource() == sixButton) {
			displayLabel.setText(displayLabel.getText() + "6");
		}else if(e.getSource() == oneButton) {
			displayLabel.setText(displayLabel.getText() + "1");
		}else if(e.getSource() == twoButton) {
			displayLabel.setText(displayLabel.getText() + "2");
		}else if(e.getSource() == threeButton) {
			displayLabel.setText(displayLabel.getText() + "3");
		}else if(e.getSource() == dotButton) {
			displayLabel.setText(displayLabel.getText() + ".");
		}else if(e.getSource() == zeroButton) {
			displayLabel.setText(displayLabel.getText() + "0");
		}else if(e.getSource() == equalButton) {
			displayLabel.setText(displayLabel.getText() + "=");
		}else if(e.getSource() == divissionButton) {
			displayLabel.setText(displayLabel.getText() + "/");
		}else if(e.getSource() == multiplicationButton) {
			displayLabel.setText(displayLabel.getText() + "*");
		}else if(e.getSource() == substractionButton) {
			displayLabel.setText(displayLabel.getText() + "-");
		}else if(e.getSource() == additionButton) {
			displayLabel.setText(displayLabel.getText() + "+");
		}else if(e.getSource() == clearButton) {
			displayLabel.setText("");
		}
		
	}

}
