//Name: Duran Thomas
//ID: 1401134

package FrontEnd;
import Backend.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class CalcMain {

	private JFrame frame;
	private JTextField screen;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton btnNewButton;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	String val = null;
	ExpressionTree tree = new ExpressionTree();
	Node node;

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
		frame.setBounds(100, 100, 300, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		screen = new JTextField();
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.setBounds(10, 22, 200, 50);
		frame.getContentPane().add(screen);
		screen.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				val = screen.getText() + btn7.getText();
				screen.setText(val);
			}
		});
		btn7.setBounds(10, 156, 45, 25);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn8.getText();
				screen.setText(val);
			}
		});
		btn8.setBounds(60, 156, 45, 25);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn9.getText();
				screen.setText(val);
			}
		});
		btn9.setBounds(110, 156, 45, 25);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn4.getText();
				screen.setText(val);
			}
		});
		btn4.setBounds(10, 192, 45, 25);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn5.getText();
				screen.setText(val);
			}
		});
		btn5.setBounds(60, 192, 45, 25);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn6.getText();
				screen.setText(val);
			}
		});
		btn6.setBounds(110, 192, 45, 25);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn3.getText();
				screen.setText(val);
			}
		});
		btn3.setBounds(110, 228, 45, 25);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn2.getText();
				screen.setText(val);
			}
		});
		btn2.setBounds(60, 228, 45, 25);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn1.getText();
				screen.setText(val);
			}
		});
		btn1.setBounds(10, 228, 45, 25);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btn0.getText();
				screen.setText(val);
			}
		});
		btn0.setBounds(10, 264, 95, 25);
		frame.getContentPane().add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnPoint.getText();
				screen.setText(val);
			}
		});
		btnPoint.setBounds(110, 264, 45, 25);
		frame.getContentPane().add(btnPoint);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnPlus.getText();
				screen.setText(val);
			}
		});
		btnPlus.setBounds(165, 229, 45, 25);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnSub.getText();
				screen.setText(val);
			}
		});
		btnSub.setBounds(165, 193, 45, 25);
		frame.getContentPane().add(btnSub);
		
		JButton btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnTimes.getText();
				screen.setText(val);
			}
		});
		btnTimes.setBounds(165, 157, 45, 25);
		frame.getContentPane().add(btnTimes);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = screen.getText() + btnDivide.getText();
				screen.setText(val);
			}
		});
		btnDivide.setBounds(165, 121, 45, 25);
		frame.getContentPane().add(btnDivide);
		
		JButton space = new JButton("\u2423");
		space.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Start From Here
				//val = screen.getText() + space.key
				screen.setText(val);
			}
		});
		space.setBounds(220, 157, 54, 25);
		frame.getContentPane().add(space);
		
		button_15 = new JButton("C");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_15.setBounds(110, 120, 45, 25);
		frame.getContentPane().add(button_15);
		
		button_16 = new JButton("B");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setBounds(60, 121, 45, 25);
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
		button_17.setBounds(220, 121, 54, 25);
		frame.getContentPane().add(button_17);
		
		button_18 = new JButton("F");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_18.setBounds(110, 83, 100, 25);
		frame.getContentPane().add(button_18);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Postfix", "Infix"}));
		comboBox.setBounds(10, 83, 95, 25);
		frame.getContentPane().add(comboBox);
		
		
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Postfix")) {
					String eqn = screen.getText();
					node = tree.buildPostfixTree(eqn);
					
					StringBuilder str = new StringBuilder();
					String result = String.format("%.2f", tree.evaluate(node));
					str.append(result);
					String result2 = str.toString();
					
					screen.setText(result2);
				}else {
					System.out.println("Incorrect Format");
				}
			}
		});
		btnEqual.setBounds(165, 265, 45, 25);
		frame.getContentPane().add(btnEqual);
		
		JButton button = new JButton("M");
		button.setBounds(10, 120, 45, 25);
		frame.getContentPane().add(button);
		
	}
}
