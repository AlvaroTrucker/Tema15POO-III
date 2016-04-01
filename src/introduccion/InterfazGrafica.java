package introduccion;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazGrafica {

	private JFrame frame;
	private List<Motocicleta> listaMotocicleta = new ArrayList<Motocicleta>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica window = new InterfazGrafica();
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
	public InterfazGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 2));
		JLabel etiquetaPropietario = new JLabel("Propietario");
		frame.getContentPane().add(etiquetaPropietario);
		JTextField campoPropietario = new JTextField(10);
		frame.getContentPane().add(campoPropietario);
		JLabel etiquetaPasajeros = new JLabel("Nº de pasajeros");
		frame.getContentPane().add(etiquetaPasajeros);
		JTextField campoPasajeros = new JTextField(10);
		frame.getContentPane().add(campoPasajeros);
		JLabel etiquetaCilindradas = new JLabel("Cilindrada");
		frame.getContentPane().add(etiquetaCilindradas);
		JTextField campoCilindradas = new JTextField(10);
		frame.getContentPane().add(campoCilindradas);
		JButton botonCrear = new JButton("Crear motocicleta");
		botonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String propietario = campoPropietario.getText();
				int numeroPasajeros = Integer.parseInt(campoPasajeros.getText());
				int cilindrada = Integer.parseInt(campoCilindradas.getText());
				Motocicleta moto = new Motocicleta(propietario, numeroPasajeros, cilindrada);
				//System.out.println(moto);
				listaMotocicleta.add(moto);
				campoPropietario.setText("");
				campoCilindradas.setText("");
				campoPasajeros.setText("");
			}
		});
		frame.getContentPane().add(botonCrear);
		JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(listaMotocicleta);
				Auxiliar.guardarDatos(listaMotocicleta);
				System.exit(0);
			}
		});
		frame.getContentPane().add(botonSalir);
		frame.pack();
	}

}
