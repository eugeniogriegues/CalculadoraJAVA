package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class CalculadoraDosDigitos extends JFrame {

	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraDosDigitos frame = new CalculadoraDosDigitos();
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
	public CalculadoraDosDigitos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 391);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		a = new JTextField();
		a.setFont(new Font("Tahoma", Font.PLAIN, 18));
		a.setColumns(10);
		
		b = new JTextField();
		b.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b.setColumns(10);
		
		c = new JTextField();
		c.setFont(new Font("Tahoma", Font.PLAIN, 20));
		c.setColumns(10);
		
		JButton btnSumar = new JButton("SUMAR");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, rtdo;
				
				try {
					
					num1 = Integer.parseInt(a.getText());
					num2 = Integer.parseInt(b.getText());
					rtdo = num1 + num2;
					
					c.setText(Integer.toString(rtdo));
				}
				
				catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "INGRESE OPCION VALIDA");
					
				}
				
			}
		});
		btnSumar.setBackground(new Color(139, 0, 139));
		
		JButton btnRestar = new JButton("RESTAR");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, rtdo;
				
				try {
					
					num1 = Integer.parseInt(a.getText());
					num2 = Integer.parseInt(b.getText());
					rtdo = num1 - num2;
					
					c.setText(Integer.toString(rtdo));
				}
				
				catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "INGRESE OPCION VALIDA");
					
				}
			}
		});
		btnRestar.setBackground(new Color(255, 140, 0));
		
		JButton btnDividir = new JButton("DIVIDIR");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, rtdo;
				
				try {
					
					num1 = Integer.parseInt(a.getText());
					num2 = Integer.parseInt(b.getText());
					rtdo = num1 / num2;
					
					c.setText(Integer.toString(rtdo));
				}
				
				catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "INGRESE OPCION VALIDA");
					
				}
			}
		});
		btnDividir.setBackground(new Color(255, 255, 0));
		
		JButton btnMultiplicar = new JButton("MULTIPLICAR");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, rtdo;
				
				try {
					
					num1 = Integer.parseInt(a.getText());
					num2 = Integer.parseInt(b.getText());
					rtdo = num1 * num2;
					
					c.setText(Integer.toString(rtdo));
				}
				
				catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "INGRESE OPCION VALIDA");
					
				}
			}
		});
		btnMultiplicar.setBackground(new Color(127, 255, 0));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				a.setText(Integer.toString(0));
				b.setText(Integer.toString(0));
				c.setText(Integer.toString(0));
			
			}
		});
		btnReset.setBackground(Color.RED);
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setFont(new Font("Vijaya", Font.BOLD, 11));
		
		JTextArea txtrResultado = new JTextArea();
		txtrResultado.setBackground(Color.BLACK);
		txtrResultado.setForeground(Color.MAGENTA);
		txtrResultado.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrResultado.setText("RESULTADO");
		
		JTextArea txtrCalculadoraEugenioFiori = new JTextArea();
		txtrCalculadoraEugenioFiori.setText("CALCULADORA EUGENIO FIORI");
		txtrCalculadoraEugenioFiori.setForeground(Color.GREEN);
		txtrCalculadoraEugenioFiori.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 14));
		txtrCalculadoraEugenioFiori.setBackground(Color.BLACK);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(a, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnSumar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnRestar, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
								.addGap(45)
								.addComponent(btnMultiplicar)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnDividir, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(txtrResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(103)
								.addComponent(btnReset)
								.addContainerGap())
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(c, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
								.addContainerGap()))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(txtrCalculadoraEugenioFiori, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(122))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(b, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(txtrCalculadoraEugenioFiori, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(a, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(b, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnSumar, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
							.addComponent(btnRestar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnDividir, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
							.addComponent(btnMultiplicar, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrResultado, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(c, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(202))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
