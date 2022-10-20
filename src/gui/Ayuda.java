package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Ayuda extends JFrame {

	private JPanel contentPane;
	private JLabel lblCabecera;
	private JPanel panel;
	private JButton btnInfo;
	private JButton btnManual;
	private JButton btnAcerca;
	private JInternalFrame internalFrame;
	String titulo = "  ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda frame = new Ayuda();
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
	public Ayuda() {
		setTitle("Ayuda");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/img/ico.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCabecera = new JLabel("");
		lblCabecera.setIcon(new ImageIcon(Ayuda.class.getResource("/img/Cabecera.png")));
		lblCabecera.setForeground(Color.BLACK);
		lblCabecera.setBackground(new Color(102, 153, 51));
		lblCabecera.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCabecera.setHorizontalAlignment(SwingConstants.CENTER);
		lblCabecera.setToolTipText("");
		lblCabecera.setBounds(0, 0, 493, 83);
		contentPane.add(lblCabecera);
		
		panel = new JPanel();
		panel.setBackground(new Color(217, 217,217));
		panel.setBounds(0, 82, 162, 479);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnInfo = new JButton("<html><p>Informacion General <br>del Programa</p></html>");
		btnInfo.setForeground(Color.LIGHT_GRAY);
		btnInfo.setBackground(new Color(255, 102, 102));
		btnInfo.setBounds(10, 29, 142, 77);
		panel.add(btnInfo);
		
		btnManual = new JButton("<html><p>Manual de<br> Programa</p></html>");
		btnManual.setForeground(Color.LIGHT_GRAY);
		btnManual.setBackground(new Color(255, 102, 102));
		btnManual.setBounds(10, 134, 142, 70);
		panel.add(btnManual);
		
		btnAcerca = new JButton("Acerca De");
		btnAcerca.setForeground(Color.LIGHT_GRAY);
		btnAcerca.setBackground(new Color(255, 102, 102));
		btnAcerca.setBounds(10, 242, 142, 50);
		panel.add(btnAcerca);
		
		titulo = "Informacion General del Programa";
		
		internalFrame = new JInternalFrame(titulo);
		internalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		internalFrame.setEnabled(false);
		internalFrame.setBounds(163, 85, 330, 476);
		contentPane.add(internalFrame);
		internalFrame.setVisible(true);
	}
}
