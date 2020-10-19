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
		
		JButton fourButton = new JButton("4");		
		fourButton.setBounds(30, 240, 80, 80);
		fourButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fourButton);
		
		JButton fiveButton = new JButton("5");		
		fiveButton.setBounds(130, 240, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.setBounds(230, 240, 80, 80);
		sixButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(sixButton);
		
		JButton oneButton = new JButton("1");		
		oneButton.setBounds(30, 340, 80, 80);
		oneButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(oneButton);
		
		JButton twoButton = new JButton("2");		
		twoButton.setBounds(130, 340, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.setBounds(230, 340, 80, 80);
		threeButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(threeButton);
		
		JButton dotButton = new JButton(".");		
		dotButton.setBounds(30, 440, 80, 80);
		dotButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(dotButton);
		
		JButton zeroButton = new JButton("0");		
		zeroButton.setBounds(130, 440, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(zeroButton);
		
		JButton equalButton = new JButton("=");
		equalButton.setBounds(230, 440, 80, 80);
		equalButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(equalButton);
		
		JButton divissionButton = new JButton("/");
		divissionButton.setBounds(330, 140, 80, 80);
		divissionButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(divissionButton);
		
		JButton multiplicationButton = new JButton("*");
		multiplicationButton.setBounds(330, 240, 80, 80);
		multiplicationButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(multiplicationButton);
		
		JButton substractionButton = new JButton("-");
		substractionButton.setBounds(330, 340, 80, 80);
		substractionButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(substractionButton);
		
		JButton additionButton = new JButton("+");
		additionButton.setBounds(330, 440, 80, 80);
		additionButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(additionButton);
		
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
		}
		
	}

}