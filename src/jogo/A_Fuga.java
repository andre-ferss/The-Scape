package jogo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A_Fuga extends JFrame{
	
	private JButton taltris, jacali, arma, faca, bomba, amolar;
	private JPanel pane;
	private Container container;
	private JTextArea textArea;
	private JProgressBar afiacaoDaFaca;
	private JRadioButton ironia, estupidez, amigavel;

	public A_Fuga() {
		
		inicializarComponentes();
		definirEventos();
		
	}

	private void inicializarComponentes() {
		
		container = getContentPane();
	
		pane = new JPanel(null);
		
		taltris = new JButton("Taltris");
		taltris.setBounds(200, 400, 100, 30);
		taltris.setFocusable(false);
		pane.add(taltris);
		
		jacali = new JButton("Jacali");
		jacali.setBounds(600, 400, 100, 30);
		jacali.setFocusable(false);
		pane.add(jacali);
		
		container.add(pane);
		
	}
	
	private void definirEventos() {
		
		taltris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		jacali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

	}
	
	public void planetaTaltris() {
		
	}
	
	public void planetaJacali() {
		
		
	}
	
	public static void main(String args[]) {
		new Splash();
		A_Fuga frame = new A_Fuga();
		frame.setTitle("The-Scape");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
}
