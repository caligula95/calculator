import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 406, 261);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 371, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton buton_8 = new JButton("8");
		buton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		buton_8.setBounds(81, 130, 52, 33);
		panel.add(buton_8);
		
		JButton buton_9 = new JButton("9");
		buton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		buton_9.setBounds(143, 130, 52, 33);
		panel.add(buton_9);
		
		JButton buttton_0 = new JButton("0");
		buttton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		buttton_0.setBounds(20, 174, 52, 33);
		panel.add(buttton_0);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		button_2.setBounds(81, 42, 52, 33);
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_3.setBounds(143, 42, 52, 33);
		panel.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_4.setBounds(20, 86, 52, 33);
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_5.setBounds(81, 86, 52, 33);
		panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_6.setBounds(143, 86, 52, 33);
		panel.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		button_7.setBounds(20, 130, 52, 33);
		panel.add(button_7);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
				
			}
		});
		button_1.setBounds(20, 42, 52, 33);
		panel.add(button_1);
		
		JButton buttonPoint = new JButton(".");
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		buttonPoint.setBounds(81, 174, 52, 33);
		panel.add(buttonPoint);
		
		JButton buttonResult = new JButton("=");
		buttonResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 InToPostnew intoPost;
				 ParsePostnew parsePost;
					// TODO Auto-generated method stub
					String input = textField.getText();
					String output;
					double out;
					intoPost = new InToPostnew(input);
					output = intoPost.doTrans(); // Преобразование
					System.out.println("Postfix is " + output + '\n');
					parsePost = new ParsePostnew(output);
					out = parsePost.doParse();
					textField.setText(textField.getText()+" = " + out);
			}
		});
		buttonResult.setBounds(143, 174, 52, 33);
		panel.add(buttonResult);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+" + ");
			}
		});
		buttonPlus.setBounds(205, 42, 52, 33);
		panel.add(buttonPlus);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+" - ");
			}
		});
		buttonMinus.setBounds(205, 86, 52, 33);
		panel.add(buttonMinus);
		
		JButton buttonUmno = new JButton("*");
		buttonUmno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+" * ");
			}
		});
		buttonUmno.setBounds(205, 130, 52, 33);
		panel.add(buttonUmno);
		
		JButton buttonDel = new JButton("/");
		buttonDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+" / ");
			}
		});
		buttonDel.setBounds(205, 174, 52, 33);
		panel.add(buttonDel);
		
		JButton buttonBracketOpen = new JButton("(");
		buttonBracketOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"( ");
			}
		});
		buttonBracketOpen.setBounds(267, 42, 52, 33);
		panel.add(buttonBracketOpen);
		
		JButton buttonBracketClose = new JButton(")");
		buttonBracketClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+" )");
			}
		});
		buttonBracketClose.setBounds(267, 86, 52, 33);
		panel.add(buttonBracketClose);
		
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		buttonClear.setBounds(267, 130, 52, 33);
		panel.add(buttonClear);
		
		JButton buttonCanc = new JButton("<--");
		buttonCanc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = textField.getText(), st1;
				for (int i = 0; i < st.length(); i++) {
					st1= st.substring(0,st.length()-1);
					textField.setText(st1);
				}
			}
		});
		buttonCanc.setBounds(267, 174, 52, 33);
		panel.add(buttonCanc);
		
		JButton buttonPower = new JButton("^");
		buttonPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+" ^ ");
			}
		});
		buttonPower.setBounds(329, 42, 52, 33);
		panel.add(buttonPower);
		
		JButton buttonPow = new JButton("\u221A");
		buttonPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = textField.getText();
				String[] s1 = s.split(" ");
				for (int i = 0; i < s1.length; i++) {
					if (s1[s1.length-1].equals("+") || s1[s1.length-1].equals("-") || s1[s1.length-1].equals("*")
							|| s1[s1.length-1].equals("/") || s1[s1.length-1].equals("^") || s1[s1.length-1].equals("(")
							|| s1[s1.length-1].equals(")") || s1[s1.length-1].equals("#")|| s1[s1.length-1].equals("")){
						textField.setText(textField.getText()+"2 # ");
						break;
					}
					else textField.setText(textField.getText()+" # ");
					break;
				}
				
			}
		});
		buttonPow.setBounds(329, 86, 52, 33);
		panel.add(buttonPow);
		
		JButton btnMinusX = new JButton("-X");
		btnMinusX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		btnMinusX.setBounds(329, 130, 52, 33);
		panel.add(btnMinusX);
	}
}
