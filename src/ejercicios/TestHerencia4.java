package ejercicios;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

public class TestHerencia4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestHerencia4 window = new TestHerencia4();
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
	public TestHerencia4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Elige una opción");
		frame.getContentPane().add(etiqueta);
		
		JButton titular = new JButton("Titulares");
		frame.getContentPane().add(titular, BorderLayout.SOUTH);
		JButton interino = new JButton("Interinos");
		frame.getContentPane().add(interino, BorderLayout.SOUTH);
		
	}

}
