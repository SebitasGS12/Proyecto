package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class GestorVendedores extends JDialog {
	private JButton btnEditar;
	private JButton btnVisualizar;
	private JButton btnEliminar;
	private JButton btnAgregar;
	private JLabel i1;
	private JLabel i3;
	private JLabel i2;
	private JLabel lblGestorDeVendedores;
	private JScrollPane scrollPane;
	private JTable tabla;
	private JLabel lblSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorVendedores dialog = new GestorVendedores();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public GestorVendedores() {
		getContentPane().setBackground(new Color(65,105,225));
		setTitle("Gestor de Vendedores");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestorVendedores.class.getResource("/img/cajero.png")));
		setModal(true);
		setBounds(100, 100,920, 600);
		
		getContentPane().setLayout(null);
		
		lblSalir = new JLabel("");
		lblSalir.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/regresar_Menu.png")));
		lblSalir.setBounds(10, 11, 64, 64);
		lblSalir.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				MenuPrincipal mp = new MenuPrincipal();
				mp.setLocationRelativeTo(null);
				mp.setVisible(true);
			}
		});
		getContentPane().add(lblSalir);
		
		btnEditar = new JButton("EDITAR");
		btnEditar.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/computadora.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnEditar.setBounds(187, 471, 167, 79);
		getContentPane().add(btnEditar);
		
		btnVisualizar = new JButton("VISUALIZAR");
		btnVisualizar.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/visionario.png")));
		btnVisualizar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnVisualizar.setBounds(364, 471, 182, 79);
		getContentPane().add(btnVisualizar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/basura.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnEliminar.setBounds(550, 471, 167, 79);
		getContentPane().add(btnEliminar);
		
		btnAgregar = new JButton("AGREGAR");
		btnAgregar.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/agente.png")));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnAgregar.setBounds(10, 471, 167, 79);
		getContentPane().add(btnAgregar);
		
		i1 = new JLabel("");
		i1.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/comercio.png")));
		i1.setBounds(753, 22, 147, 169);
		getContentPane().add(i1);
		
		i3 = new JLabel("");
		i3.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/bienes.png")));
		i3.setBounds(753, 359, 147, 163);
		getContentPane().add(i3);
		
		i2 = new JLabel("");
		i2.setIcon(new ImageIcon(GestorVendedores.class.getResource("/img/punto-de-venta.png")));
		i2.setBounds(751, 204, 147, 163);
		getContentPane().add(i2);
		
		lblGestorDeVendedores = new JLabel("GESTOR DE VENDEDORES");
		lblGestorDeVendedores.setForeground(Color.WHITE);
		lblGestorDeVendedores.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.ITALIC, 23));
		lblGestorDeVendedores.setBounds(243, 22, 290, 41);
		getContentPane().add(lblGestorDeVendedores);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 707, 370);
		getContentPane().add(scrollPane);
		
		tabla = new JTable();
		tabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tabla);

		
		
		
	}
}
