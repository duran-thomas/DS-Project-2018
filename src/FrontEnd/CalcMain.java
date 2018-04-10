//Name: Duran Thomas
//ID: 1401134

package FrontEnd;
import Backend.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.util.*;
import javax.swing.JLabel;

public class CalcMain {

	private JFrame frame;
	private JTextField screen;

	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	String val = null;
	ExpressionTree tree = new ExpressionTree();
	Node node;
	Stack<String> stk = new Stack<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcMain window = new CalcMain();
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
	public CalcMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame("HP-35");
		frame.setBounds(100, 100, 235, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		screen = new JTextField();
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.setBounds(10, 11, 200, 50);
		frame.getContentPane().add(screen);
		screen.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				val = screen.getText() + btn7.getText();
				screen.setText(val);
			}
		});
		btn7.setBounds(10, 145, 45, 25);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn8.getText();
				screen.setText(val);
			}
		});
		btn8.setBounds(60, 145, 45, 25);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn9.getText();
				screen.setText(val);
			}
		});
		btn9.setBounds(110, 145, 45, 25);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn4.getText();
				screen.setText(val);
			}
		});
		btn4.setBounds(10, 181, 45, 25);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn5.getText();
				screen.setText(val);
			}
		});
		btn5.setBounds(60, 181, 45, 25);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn6.getText();
				screen.setText(val);
			}
		});
		btn6.setBounds(110, 181, 45, 25);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn3.getText();
				screen.setText(val);
			}
		});
		btn3.setBounds(110, 217, 45, 25);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn2.getText();
				screen.setText(val);
			}
		});
		btn2.setBounds(60, 217, 45, 25);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn1.getText();
				screen.setText(val);
			}
		});
		btn1.setBounds(10, 217, 45, 25);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn0.getText();
				screen.setText(val);
			}
		});
		btn0.setBounds(10, 253, 45, 25);
		frame.getContentPane().add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnPoint.getText();
				screen.setText(val);
			}
		});
		btnPoint.setBounds(60, 253, 45, 25);
		frame.getContentPane().add(btnPoint);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnPlus.getText();
				screen.setText(val);
			}
		});
		btnPlus.setBounds(165, 216, 45, 25);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnSub.getText();
				screen.setText(val);
			}
		});
		btnSub.setBounds(165, 180, 45, 25);
		frame.getContentPane().add(btnSub);
		
		JButton btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnTimes.getText();
				screen.setText(val);
			}
		});
		btnTimes.setBounds(165, 108, 45, 25);
		frame.getContentPane().add(btnTimes);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnDivide.getText();
				screen.setText(val);
			}
		});
		btnDivide.setBounds(165, 144, 45, 25);
		frame.getContentPane().add(btnDivide);
		
		JButton space = new JButton("\u2423");
		space.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				val = screen.getText() + " ";
				screen.setText(val);
			}
		});
		space.setBounds(110, 253, 45, 25);
		frame.getContentPane().add(space);
		
		JButton button = new JButton("M");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(stk.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Memory Is Empty", "Error",
	                        JOptionPane.ERROR_MESSAGE);
					screen.setText(null);
				}else {
					String data = stk.lastElement().toString();
					screen.setText(data);
				}
			}
		});
		button.setBounds(10, 109, 45, 25);
		frame.getContentPane().add(button);
		
		button_15 = new JButton("C");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(stk.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Memory Is Empty", "Error",
	                        JOptionPane.ERROR_MESSAGE);
					screen.setText(null);
				}else {
					tree.clearMemory(stk);
				}
			}
		});
		button_15.setBounds(110, 109, 45, 25);
		frame.getContentPane().add(button_15);
		
		button_16 = new JButton("B");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(stk.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Memory Is Empty", "Error",
	                        JOptionPane.ERROR_MESSAGE);
					screen.setText(null);
				}else {
					stk.pop();
					JOptionPane.showMessageDialog(null, "Success", "Success",
	                        JOptionPane.PLAIN_MESSAGE);
					screen.setText(null);
				}
			}
		});
		button_16.setBounds(60, 110, 45, 25);
		frame.getContentPane().add(button_16);
		
		button_17 = new JButton("\uF0E7");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(screen.getText().length() > 0) {
					StringBuilder str = new StringBuilder(screen.getText());
					str.deleteCharAt(screen.getText().length() -1);
					backSpace = str.toString();
					screen.setText(backSpace);
				}
			}
		});
		button_17.setBounds(104, 72, 51, 25);
		frame.getContentPane().add(button_17);
		
		button_18 = new JButton("F");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eqn = screen.getText();
				if(eqn.equals("") || eqn.equals("")) {
					JOptionPane.showMessageDialog(null, "Nothing To Save", "Error",
	                        JOptionPane.ERROR_MESSAGE);
				}else {
					tree.writeToFile(eqn + "\n");
					JOptionPane.showMessageDialog(null, "Saved To File", "Success",
	                        JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		button_18.setBounds(165, 72, 45, 25);
		frame.getContentPane().add(button_18);
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Postfix", "Infix"}));
		comboBox.setBounds(10, 72, 87, 25);
		frame.getContentPane().add(comboBox);
		
		
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Postfix")) {
					String eqn = screen.getText();
					if(eqn.equals("") || eqn.equals("")) {
						JOptionPane.showMessageDialog(null, "Please Enter A Postfix Expression", "Error",
		                        JOptionPane.ERROR_MESSAGE);
					}else {
						node = tree.buildPostfixTree(eqn);
						stk = tree.addToMemory(eqn);
						
						StringBuilder str = new StringBuilder();
						String result = String.format("%.2f", tree.evaluate(node));
						str.append(result);
						String result2 = str.toString();
						
						screen.setText(result2);
					}
					
				}else {
					String eqn = screen.getText();
					String postfix = tree.infixToPostfix(eqn);
					node = tree.buildPostfixTree(postfix);
					stk = tree.addToMemory(postfix);
					
					StringBuilder str = new StringBuilder();
					String result = String.format(postfix);
					str.append(result);
					screen.setText("%.2f" + tree.evaluate(node));
				}
			}
		});
		btnEqual.setBounds(165, 253, 45, 25);
		frame.getContentPane().add(btnEqual);
		
		JLabel lblPostfix = new JLabel("HP-35");
		lblPostfix.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostfix.setBounds(10, 72, 95, 26);
		frame.getContentPane().add(lblPostfix);
		
	}
}
