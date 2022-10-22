package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ayuda extends JDialog implements ActionListener {
	private JLabel lblCabecera;
	private JPanel panel;
	private JButton btnInfo;
	private JButton btnManual;
	private JButton btnAcerca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda dialog = new Ayuda();
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
	public Ayuda() {
		setTitle("Ayuda");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/img/ico.png")));
		setModal(true);
		setBounds(100, 100, 509, 600);
		getContentPane().setLayout(null);
		
		lblCabecera = new JLabel("");
		lblCabecera.setIcon(new ImageIcon(Ayuda.class.getResource("/img/Cabecera.png")));
		lblCabecera.setToolTipText("");
		lblCabecera.setHorizontalAlignment(SwingConstants.CENTER);
		lblCabecera.setForeground(Color.BLACK);
		lblCabecera.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCabecera.setBackground(new Color(102, 153, 51));
		lblCabecera.setBounds(0, 0, 493, 83);
		getContentPane().add(lblCabecera);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(217, 217, 217));
		panel.setBounds(0, 82, 162, 479);
		getContentPane().add(panel);
		
		btnInfo = new JButton("<html><p>Informacion General <br>del Programa</p></html>");
		btnInfo.addActionListener(this);
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

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInfo) {
			actionPerformedBtnInfo(e);
		}
	}
	protected void actionPerformedBtnInfo(ActionEvent e) {
	}
}
