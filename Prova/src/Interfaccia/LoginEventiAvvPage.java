package Interfaccia;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUI.GUI;
import Server.ServerMainInterface;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LoginEventiAvvPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public LoginEventiAvvPage(JPanel cardStack, ServerMainInterface stub) {
		contentPane = cardStack;

		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton back = new JButton("Indietro");
		back.setBackground(new Color(255, 255, 204));
		back.setFont(new Font("Calibri", Font.PLAIN, 11));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		back.setPreferredSize(new Dimension(90,25));
		c.gridx= 0;
		c.gridy= 0;	
		add(back, c);
		
		JLabel labelInserisciDati = new JLabel("Inserisci i dati richiesti");
		labelInserisciDati.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth=2;
		c.weighty=0.2;
		add(labelInserisciDati,c);
		c.gridwidth=1;
		
		JLabel LabelUser = new JLabel("Username:");
		LabelUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx= 1;
		c.gridy= 2;
		c.weightx = 0.2;
		add(LabelUser,c);
		
		JLabel LabelPass = new JLabel("Password:");
		LabelPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx= 1;
		c.gridy= 3;
		add(LabelPass, c);

		JTextField tfUser = new JTextField();
		tfUser.setColumns(10);
		c.gridx= 2;
		c.gridy= 2;
		add(tfUser, c);
		
		JTextField tfPass = new JTextField();
		tfPass.setColumns(10);
		c.gridx=2;
		c.gridy=3;
		add(tfPass,c);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//inserisci funzione login
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"eventiAvv");
			}
		});
		c.gridx= 2;
		c.gridy= 4;			
		add(btnLogin,c);
	}
}
