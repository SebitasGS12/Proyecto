package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.css.RGBColor;

import java.awt.Toolkit;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class GestorInventario extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JTable tbDatos;
	private JPanel panelMenu;
	private JLabel lblCargarDatos;
	private JLabel lblEliminarProducto;
	private JLabel lblMenuPrincipal;
	private JButton btnAgregarProducto;
	private JButton btnEditarProducto;
	private JButton btnGuardarDatos;
	private JButton btnExportarDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestorInventario dialog = new GestorInventario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestorInventario() {
		setModal(true);
		setForeground(SystemColor.inactiveCaption);
		setBackground(SystemColor.desktop);
		setTitle("Gestor de Inventario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestorInventario.class.getResource("/img/ico.png")));
		setBounds(100, 100, 1200,700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(104, 115, 87));
		panel.setBounds(0, 0, 177, 661);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblCargarDatos = new JLabel("");
		lblCargarDatos.setToolTipText("Cargar Datos");
		lblCargarDatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCargarDatos.setIcon(new ImageIcon(GestorInventario.class.getResource("/img/imgCargarDatos.png")));
		lblCargarDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCargarDatos.setBounds(20, 372, 131, 121);
		panel.add(lblCargarDatos);
		
		lblEliminarProducto = new JLabel("");
		lblEliminarProducto.setToolTipText("Eliminar Datos");
		lblEliminarProducto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEliminarProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarProducto.setIcon(new ImageIcon(GestorInventario.class.getResource("/img/imgEliminarProducto.png")));
		lblEliminarProducto.setBounds(32, 217, 119, 111);
		panel.add(lblEliminarProducto);
		
		lblMenuPrincipal = new JLabel("");
		lblMenuPrincipal.setToolTipText("Menu Principal");
		lblMenuPrincipal.addMouseListener(this);
		lblMenuPrincipal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setIcon(new ImageIcon(GestorInventario.class.getResource("/img/imgMenuPrincipal.png")));
		lblMenuPrincipal.setBounds(20, 24, 147, 111);
		panel.add(lblMenuPrincipal);
		
		tbDatos = new JTable();
		tbDatos.setBounds(187, 117, 987, 533);
		contentPanel.add(tbDatos);
		
		panelMenu = new JPanel();
		panelMenu.setBounds(187, 0, 987, 106);
		contentPanel.add(panelMenu);
		panelMenu.setLayout(null);
		
		btnAgregarProducto = new JButton("<html>Agregar<br>Producto</html>");
		btnAgregarProducto.addMouseListener(this);
		btnAgregarProducto.setHorizontalAlignment(SwingConstants.LEFT);
		btnAgregarProducto.setFocusable(false);
		btnAgregarProducto.setIcon(new ImageIcon(GestorInventario.class.getResource("/img/imgNuevoProducto.png")));
		btnAgregarProducto.setBounds(10, 11, 169, 83);
		panelMenu.add(btnAgregarProducto);
		
		btnEditarProducto = new JButton("<html>Editar<br>Producto</html>");
		btnEditarProducto.setIcon(new ImageIcon(GestorInventario.class.getResource("/img/imgEditarProducto.png")));
		btnEditarProducto.setHorizontalAlignment(SwingConstants.LEFT);
		btnEditarProducto.setFocusable(false);
		btnEditarProducto.setBounds(249, 11, 169, 83);
		panelMenu.add(btnEditarProducto);
		
		btnGuardarDatos = new JButton("<html>Guardar<br>Datos</html>");
		btnGuardarDatos.setIcon(new ImageIcon(GestorInventario.class.getResource("/img/imgGuardarDatos.png")));
		btnGuardarDatos.setHorizontalAlignment(SwingConstants.LEFT);
		btnGuardarDatos.setFocusable(false);
		btnGuardarDatos.setBounds(490, 11, 169, 83);
		panelMenu.add(btnGuardarDatos);
		
		btnExportarDatos = new JButton("<html>Exportar<br>Datos</html>");
		btnExportarDatos.setIcon(new ImageIcon(GestorInventario.class.getResource("/img/imgExportarDatos.png")));
		btnExportarDatos.setHorizontalAlignment(SwingConstants.LEFT);
		btnExportarDatos.setFocusable(false);
		btnExportarDatos.setBounds(808, 11, 169, 83);
		panelMenu.add(btnExportarDatos);
	}
	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblMenuPrincipal) {
			mouseClickedLblMenuPrincipal(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == btnAgregarProducto) {
			mouseReleasedBtnNewButton(e);
		}
	}
	protected void mouseClickedLblMenuPrincipal(MouseEvent e) {
		
		//Primero verifcar si desea guardar los datos 
		//Evitar que queden Dialogos abiertos
		//Cerrar el menu
		
		
		dispose();
	}
	protected void mouseReleasedBtnNewButton(MouseEvent e) {
		
		
	}
}
