package programming;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import calculator.Calculator;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;


public class Programming extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResult;
	private String operators, answer, BinResult, OctResult, HexResult ;
	private boolean dot = true;
	private double firstNum, secondNum, result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programming frame = new Programming();
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
    
	public Programming() {
		ImageIcon img = new ImageIcon("D:\\д еналгмо\\Java\\CalculatorPP\\calc.png");
		
		setIconImage(img.getImage());
		setResizable(false);
		setTitle("Programming Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 525);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProgramming = new JMenu("Programming");
		menuBar.add(mnProgramming);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Calculator prog = new Calculator();
				prog.setVisible(true);
			}
		});
		mnProgramming.add(mntmStandard);
		
		// Converts
		
		JMenuItem mntmTba = new JMenuItem("TBA");
		mnProgramming.add(mntmTba);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBounds(10, 11, 284, 44);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal");
		lblHexadecimal.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblHexadecimal.setBounds(20, 66, 139, 24);
		contentPane.add(lblHexadecimal);
		
		JLabel lblHex = new JLabel("");
		lblHex.setHorizontalAlignment(SwingConstants.LEFT);
		lblHex.setOpaque(true);
		lblHex.setBackground(new Color(230, 230, 230));
		lblHex.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblHex.setBounds(169, 66, 125, 24);
		contentPane.add(lblHex);
		
		JLabel lblOctal = new JLabel("Octal");
		lblOctal.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblOctal.setBounds(20, 109, 139, 24);
		contentPane.add(lblOctal);
		
		JLabel lblOct = new JLabel("");
		lblOct.setOpaque(true);
		lblOct.setHorizontalAlignment(SwingConstants.LEFT);
		lblOct.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblOct.setBackground(new Color(230, 230, 230));
		lblOct.setBounds(169, 109, 125, 24);
		contentPane.add(lblOct);
		
		JLabel lblBinary = new JLabel("Binary");
		lblBinary.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblBinary.setBounds(20, 165, 139, 24);
		contentPane.add(lblBinary);
		
		JLabel lblBin = new JLabel("");
		lblBin.setOpaque(true);
		lblBin.setHorizontalAlignment(SwingConstants.LEFT);
		lblBin.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblBin.setBackground(new Color(230, 230, 230));
		lblBin.setBounds(169, 165, 125, 24);
		contentPane.add(lblBin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 212, 284, 2);
		contentPane.add(separator);
		
		
		// operators 
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "+";
			}
		});
		btnPlus.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnPlus.setBackground(SystemColor.menu);
		btnPlus.setBounds(239, 225, 55, 35);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "-";
			}
		});
		btnMinus.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnMinus.setBackground(SystemColor.menu);
		btnMinus.setBounds(239, 271, 55, 35);
		contentPane.add(btnMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "*";
			}
		});
		btnMul.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnMul.setBackground(SystemColor.menu);
		btnMul.setBounds(239, 317, 55, 35);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot = true;
				firstNum = Double.parseDouble(txtResult.getText());
				txtResult.setText(null);
				operators = "/";
			}
		});
		btnDiv.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnDiv.setBackground(SystemColor.menu);
		btnDiv.setBounds(239, 363, 55, 35);
		contentPane.add(btnDiv);
		
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
		btnDot.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnDot.setBackground(SystemColor.menu);
		btnDot.setBounds(140, 363, 55, 35);
		contentPane.add(btnDot);
		
		// Clear 
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dot = true;
				txtResult.setText(null);
				lblBin.setText(null);
				lblOct.setText(null);
				lblHex.setText(null);
			}
		});
		btnC.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnC.setBackground(SystemColor.menu);
		btnC.setBounds(10, 409, 80, 35);
		contentPane.add(btnC);
		
		// Equals
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operators != null) {
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
					}
				BinResult = Integer.toBinaryString((int) result);
				OctResult = Integer.toOctalString((int) result);
				HexResult = Integer.toHexString((int) result);
				lblBin.setText(BinResult);
				lblHex.setText(HexResult);
				lblOct.setText(OctResult);
				}else {
					firstNum = Double.parseDouble(txtResult.getText());
					result = firstNum;
					BinResult = Integer.toBinaryString((int) result);
					OctResult = Integer.toOctalString((int) result);
					HexResult = Integer.toHexString((int) result);
					lblBin.setText(BinResult);
					lblHex.setText(HexResult);
					lblOct.setText(OctResult);
				}
			}

		});
		btnEquals.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnEquals.setBackground(SystemColor.menu);
		btnEquals.setBounds(214, 409, 80, 35);
		contentPane.add(btnEquals);
		
		
		// Backspace 
		JButton btnBackspace = new JButton("\u2190");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(" " + txtResult.getText().substring(0, txtResult.getText().length() - 1));
			}
		});
		btnBackspace.setFont(new Font("Garamond", Font.BOLD, 18));
		btnBackspace.setBackground(SystemColor.menu);
		btnBackspace.setBounds(111, 409, 80, 35);
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
		btnNum0.setBackground(Color.WHITE);
		btnNum0.setBounds(10, 363, 120, 35);
		contentPane.add(btnNum0);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum1.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum1.setBackground(Color.WHITE);
		btnNum1.setBounds(10, 317, 55, 35);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum2.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum2.setBackground(Color.WHITE);
		btnNum2.setBounds(75, 317, 55, 35);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum3.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum3.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum3.setBackground(Color.WHITE);
		btnNum3.setBounds(140, 317, 55, 35);
		contentPane.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum4.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum4.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum4.setBackground(Color.WHITE);
		btnNum4.setBounds(10, 271, 55, 35);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum5.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum5.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum5.setBackground(Color.WHITE);
		btnNum5.setBounds(75, 271, 55, 35);
		contentPane.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum6.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum6.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum6.setBackground(Color.WHITE);
		btnNum6.setBounds(140, 271, 55, 35);
		contentPane.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum7.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum7.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum7.setBackground(Color.WHITE);
		btnNum7.setBounds(10, 225, 55, 35);
		contentPane.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum8.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum8.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum8.setBackground(Color.WHITE);
		btnNum8.setBounds(75, 225, 55, 35);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtResult.getText()+ btnNum9.getText();
				txtResult.setText(EnterNumber);
			}
		});
		btnNum9.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
		btnNum9.setBackground(Color.WHITE);
		btnNum9.setBounds(140, 225, 55, 35);
		contentPane.add(btnNum9);
		
	}
}
