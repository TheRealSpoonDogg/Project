package calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import programming.Programming;

public class Calculator extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResult;
	private String operators, answer, lbl;
	private boolean dot = true;
	private double firstNum, secondNum, result;
	// private static final NumberFormat percentageFormat = NumberFormat.getPercentInstance();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		ImageIcon img = new ImageIcon("D:\\д еналгмо\\Java\\CalculatorPP\\calc.png");
		
		setIconImage(img.getImage());
		setResizable(false);
		setTitle("Standard Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 525);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnStandard = new JMenu("Standard");
		menuBar.add(mnStandard);
		
		JMenuItem mnItmProgramming = new JMenuItem("Programming");
		mnItmProgramming.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Programming prog = new Programming();
				prog.setVisible(true);
			}
		});
		mnStandard.add(mnItmProgramming);
		
		JMenuItem mnItmTBA = new JMenuItem("TBA");
		mnStandard.add(mnItmTBA);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 255, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setBounds(10, 40, 284, 72);
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
		txtResult.setBackground(SystemColor.menu);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		// Operators
		JButton btnDiv = new JButton("\u00F7");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "/";
			}
		});
		btnDiv.setFont(new Font("Georgia", Font.BOLD, 18));
		btnDiv.setBackground(SystemColor.menu);
		btnDiv.setBounds(230, 194, 64, 44);
		contentPane.add(btnDiv);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "*";
			}
		});
		btnMul.setFont(new Font("Georgia", Font.BOLD, 16));
		btnMul.setBackground(SystemColor.menu);
		btnMul.setBounds(230, 249, 64, 44);
		contentPane.add(btnMul);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "-";
			}
		});
		btnMinus.setFont(new Font("Georgia", Font.BOLD, 18));
		btnMinus.setBackground(SystemColor.menu);
		btnMinus.setBounds(230, 304, 64, 44);
		contentPane.add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "+";
			}
		});
		btnPlus.setFont(new Font("Georgia", Font.BOLD, 18));
		btnPlus.setBackground(SystemColor.menu);
		btnPlus.setBounds(230, 359, 64, 44);
		contentPane.add(btnPlus);
		
		
		// Extra stuff
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operators != null) {
	                secondNum = Double.valueOf(txtResult.getText());
	                secondNum = (firstNum * secondNum) / 100;
	                dot = true;
					if (operators == "+") {
						result = firstNum + secondNum;
						answer = String.format("%.2f", result);
						txtResult.setText(answer);
					}else if (operators == "-") {
						result = firstNum - secondNum;
						answer = String.format("%.2f", result);
						txtResult.setText(answer);
					}else if (operators == "*") {
						result = firstNum * secondNum;
						answer = String.format("%.2f", result);
						txtResult.setText(answer);
					}else if (operators == "/") {
						result = firstNum / secondNum;
						answer = String.format("%.2f", result);
						txtResult.setText(answer);
					}
	                txtResult.setText(answer);
	                operators = null;
				}else {
					firstNum = Double.parseDouble(txtResult.getText());
					result = firstNum / 100 ;
					answer = String.format("%.2f", result);
					txtResult.setText(answer);	
				}
			}
		});
		btnPercent.setBackground(SystemColor.menu);
		btnPercent.setBounds(10, 139, 64, 44);
		btnPercent.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(btnPercent);
		
		JButton btnRoot = new JButton("\u221a");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (operators != null) {
	                secondNum = Double.valueOf(txtResult.getText());
	                secondNum = Math.sqrt(secondNum);
	                dot = true;
					if (operators == "+") {
						result = firstNum + secondNum;
						answer = String.format("%.5f", result);
						txtResult.setText(answer);
					}else if (operators == "-") {
						result = firstNum - secondNum;
						answer = String.format("%.5f", result);
						txtResult.setText(answer);
					}else if (operators == "*") {
						result = firstNum * secondNum;
						answer = String.format("%.5f", result);
						txtResult.setText(answer);
					}else if (operators == "/") {
						result = firstNum / secondNum;
						answer = String.format("%.5f", result);
						txtResult.setText(answer);
					}
	                txtResult.setText(answer);
	                operators = null;
				}else {
					firstNum = Double.parseDouble(txtResult.getText());
					result = Math.sqrt(firstNum);
					answer = String.format("%.5f", result);
					txtResult.setText(answer);	
				}
				
			}
		});
		btnRoot.setBackground(SystemColor.menu);
		btnRoot.setBounds(84, 139, 64, 44);
		btnRoot.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(btnRoot);
		
		JButton btnPow = new JButton("x\u00b2");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "P";
			}
		});
		btnPow.setBackground(SystemColor.menu);
		btnPow.setBounds(158, 139, 64, 44);
		btnPow.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(btnPow);
		
		JButton btn1X = new JButton("\u00B9/x");
		btn1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtResult.getText());
				result = Math.pow(firstNum, (-1));
				answer = String.format("%.3f", result);
				txtResult.setText(answer);
				
			}
		});
		btn1X.setBackground(SystemColor.menu);
		btn1X.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btn1X.setBounds(230, 139, 64, 44);
		contentPane.add(btn1X);
		
		JButton btnNegate = new JButton("\u00b1");
		btnNegate.setFont(new Font("Georgia", Font.BOLD, 18));
		btnNegate.setBackground(SystemColor.menu);
		btnNegate.setBounds(10, 414, 64, 44);
		contentPane.add(btnNegate);
		
		// Clear
		JButton btnCE = new JButton("CE");
		btnCE.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnCE.setBackground(SystemColor.menu);
		btnCE.setBounds(10, 194, 64, 44);
		contentPane.add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dot = true;
				txtResult.setText(null);				
			}
		});
		btnC.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnC.setBackground(SystemColor.menu);
		btnC.setBounds(84, 194, 64, 44);
		contentPane.add(btnC);
		
		// Dot
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dot == true) {
					String enterNumber = txtResult.getText() + btnDot.getText();
					txtResult.setText(enterNumber);
					dot = false;
				}
			}
		});
		btnDot.setFont(new Font("Georgia", Font.BOLD, 18));
		btnDot.setBackground(SystemColor.menu);
		btnDot.setBounds(158, 414, 64, 44);
		contentPane.add(btnDot);
	
		// Equals 
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				secondNum = Double.parseDouble(txtResult.getText());
				if (operators == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtResult.setText(answer);
				}else if (operators == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtResult.setText(answer);
				}else if (operators == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtResult.setText(answer);
				}else if (operators == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtResult.setText(answer);
				}else if (operators == "P") {
		            result = Math.pow(firstNum, secondNum);
					answer = String.format("%.2f", result);
					txtResult.setText(answer);	
				}
			}
		});
		btnEqual.setFont(new Font("Georgia", Font.BOLD, 18));
		btnEqual.setBackground(SystemColor.menu);
		btnEqual.setBounds(230, 414, 64, 44);
		contentPane.add(btnEqual);

		
		// BackSpace
		JButton btnBackspace = new JButton("\u2190");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(" " + txtResult.getText().substring(0, txtResult.getText().length() - 1));
			}
		});
		btnBackspace.setFont(new Font("Garamond", Font.BOLD, 18));
		btnBackspace.setBackground(SystemColor.menu);
		btnBackspace.setBounds(158, 194, 64, 44);
		contentPane.add(btnBackspace);
		
		// Numbers
		JButton btnNum0 = new JButton("0");
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum0.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum0.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum0.setBackground(SystemColor.text);
		btnNum0.setBounds(84, 414, 64, 44);
		contentPane.add(btnNum0);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum1.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum1.setBackground(SystemColor.text);
		btnNum1.setBounds(10, 359, 64, 44);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum2.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum2.setBackground(SystemColor.text);
		btnNum2.setBounds(84, 359, 64, 44);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum3.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum3.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum3.setBackground(SystemColor.text);
		btnNum3.setBounds(158, 359, 64, 44);
		contentPane.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum4.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum4.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum4.setBackground(SystemColor.text);
		btnNum4.setBounds(10, 304, 64, 44);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum5.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum5.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum5.setBackground(SystemColor.text);
		btnNum5.setBounds(84, 304, 64, 44);
		contentPane.add(btnNum5);
				
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum6.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum6.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum6.setBackground(SystemColor.text);
		btnNum6.setBounds(158, 304, 64, 44);
		contentPane.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum7.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum7.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum7.setBackground(SystemColor.text);
		btnNum7.setBounds(10, 249, 64, 44);
		contentPane.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum8.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum8.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum8.setBackground(SystemColor.text);
		btnNum8.setBounds(84, 249, 64, 44);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum9.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum9.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum9.setBackground(SystemColor.text);
		btnNum9.setBounds(158, 249, 64, 44);
		contentPane.add(btnNum9);
		
		JLabel lblFirstNum = new JLabel("");
		lblFirstNum.setHorizontalAlignment(SwingConstants.RIGHT);
		if (operators != null) {
			lbl = String.format("%.2f", firstNum);
			lblFirstNum.setText(lbl); 
		}
		lblFirstNum.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblFirstNum.setBounds(169, 114, 125, 14);
		contentPane.add(lblFirstNum);
	}
}
