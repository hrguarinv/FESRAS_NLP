package br.rio.puc.inf.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.rio.puc.inf.BuilderExample;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DropMode;

/**
 * Class that defines the GUI of the software framework
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 24.10.2017
 */

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;

	/**
	 * Main method used to launch the software framework
	 * @param args defect argument
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Method used to create the frame.
	 */
	public JFrame() {
		setAutoRequestFocus(false);
		setTitle("FESCARS: A Framework for Eliciting Security Controls from Agile Requirements Specification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnOpenFile = new JButton("Open and process the file");
		JTextArea textAreaFile = new JTextArea();
		textAreaFile.setEditable(false);
		contentPane.add(textAreaFile, BorderLayout.NORTH);

		JTextArea textAreaSecurityControls = new JTextArea();
		textAreaSecurityControls.setBackground(Color.WHITE);
		contentPane.add(textAreaSecurityControls, BorderLayout.CENTER);

		btnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileOpener fileOpener = new FileOpener();
				try {
					fileOpener.chooseFile();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				textAreaFile.setText("USER STORY: " + fileOpener.sb.toString());
				List<String> txtfilename = new ArrayList<String>();
				txtfilename.add(fileOpener.sb.toString());

				BuilderExample be = new BuilderExample();
				String securityElicitation = be.initialize(txtfilename);
				textAreaSecurityControls.setText(securityElicitation);
			}
		});
		contentPane.add(btnOpenFile, BorderLayout.SOUTH);
	}

}
