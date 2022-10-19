package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JPasswordField;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JButton btnIniciarSesion;
	private JButton btnOlvidarContraseña;
	private JButton btnCrearNuevaCuenta;
	private JLabel lblFondo;
	private JPasswordField txtPass;
	private JLabel lblDerecha;
	private JLabel lblDibujo_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblTitulo;
	private JButton btnAyuda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setTitle("Iniciar sesion");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/img/ico.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/img/uno.png")));
		lblNewLabel.setBounds(44, 202, 418, 383);
		contentPane.add(lblNewLabel);
		
		btnAyuda = new JButton("");
		btnAyuda.setIcon(new ImageIcon(Inicio.class.getResource("/img/ayuda2.png")));
		btnAyuda.setBounds(10, 518, 134, 143);
		contentPane.add(btnAyuda);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(857, 89, 203, 19);
		txtID.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(txtID);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(857, 156, 203, 21);
		txtPass.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(txtPass);
		
		btnIniciarSesion = new JButton("Iniciar sesión");
		btnIniciarSesion.setBounds(857, 202, 203, 31);
		btnIniciarSesion.setName("");
		btnIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarSesion.setAutoscrolls(true);
		btnIniciarSesion.setFont(new Font("Arial", Font.BOLD, 12));
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(SystemColor.textHighlight);
		btnIniciarSesion.setBorderPainted(rootPaneCheckingEnabled);
		contentPane.add(btnIniciarSesion);
		
		btnOlvidarContraseña = new JButton("¿Olvidaste tu contraseña?");
		btnOlvidarContraseña.setBounds(870, 597, 190, 21);
		contentPane.add(btnOlvidarContraseña);
		
		btnCrearNuevaCuenta = new JButton("Crear cuenta nueva");
		btnCrearNuevaCuenta.setBounds(879, 246, 161, 21);
		contentPane.add(btnCrearNuevaCuenta);
		
		lblDibujo_1 = new JLabel("");
		lblDibujo_1.setIcon(new ImageIcon(Inicio.class.getResource("/img/dibujo.jpg")));
		lblDibujo_1.setBounds(745, 277, 396, 309);
		contentPane.add(lblDibujo_1);
		
		lblNewLabel_1 = new JLabel("Documento Identificacion");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
		lblNewLabel_1.setBounds(857, 61, 183, 29);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 12));
		lblNewLabel_2.setBounds(857, 130, 91, 29);
		contentPane.add(lblNewLabel_2);
		
		lblDerecha = new JLabel("");
		lblDerecha.setBounds(725, 24, 433, 612);
		lblDerecha.setIcon(new ImageIcon(Inicio.class.getResource("/img/Blanco.jpg")));
		contentPane.add(lblDerecha);
		
		lblTitulo = new JLabel("Gestor de Datos");
		lblTitulo.setForeground(SystemColor.textHighlight);
		lblTitulo.setToolTipText("");
		lblTitulo.setFont(new Font("Modern No. 20", Font.BOLD, 62));
		lblTitulo.setBounds(34, 40, 449, 248);
		contentPane.add(lblTitulo);
		
		lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 1184, 661);
		lblFondo.setIcon(new ImageIcon(Inicio.class.getResource("/img/FondoBlanco.png")));
		contentPane.add(lblFondo);
	}
}
