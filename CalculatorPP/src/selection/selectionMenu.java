package selection;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import calculator.Calculator;

public class selectionMenu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectionMenu window = new selectionMenu();
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
	public selectionMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon img = new ImageIcon("D:\\д еналгмо\\Java\\CalculatorPP\\calc.png");
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setIconImage(img.getImage());
		frame.setBounds(100, 100, 320, 500);
		frame.setTitle("Selection");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelectionMenu = new JLabel("Selection Menu");
		lblSelectionMenu.setForeground(new Color(0, 0, 0));
		lblSelectionMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectionMenu.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		lblSelectionMenu.setBounds(10, 22, 284, 49);
		frame.getContentPane().add(lblSelectionMenu);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.setForeground(new Color(255, 255, 255));
		btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Calculator calcFrame = new Calculator();
				calcFrame.setVisible(true);
			}
		});
		btnCalculator.setBackground(new Color(0, 0, 0));
		btnCalculator.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		btnCalculator.setBounds(50, 145, 199, 49);
		frame.getContentPane().add(btnCalculator);
		
		JLabel lblLeft = new JLabel("");
		lblLeft.setForeground(new Color(0, 153, 0));
		lblLeft.setOpaque(true);
		lblLeft.setBackground(new Color(0, 0, 0));
		lblLeft.setBounds(0, 0, 46, 487);
		frame.getContentPane().add(lblLeft);
		
		JLabel lblRight = new JLabel("");
		lblRight.setOpaque(true);
		lblRight.setBackground(new Color(0, 0, 0));
		lblRight.setBounds(259, 0, 55, 487);
		frame.getContentPane().add(lblRight);
		
	}
}
