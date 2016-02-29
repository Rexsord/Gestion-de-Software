package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JList;

public class Principal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Gestion de Software");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane menuPrin = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(menuPrin);
		
		JPanel tabBuscar = new JPanel();
		menuPrin.addTab("Buscar", null, tabBuscar, null);
		
		JPanel tabRegistro = new JPanel();
		menuPrin.addTab("Registro", null, tabRegistro, null);
		tabRegistro.setLayout(null);
		
		String[] cBOptions = {"Clientes", "Empleados", "Contratos"};
		JComboBox comboBox = new JComboBox(cBOptions);
		comboBox.setToolTipText("Seleccione");
		comboBox.setBounds(6, 6, 124, 39);
		tabRegistro.add(comboBox);
	}
}
