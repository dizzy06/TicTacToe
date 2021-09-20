package module;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Fenster {

	JFrame frame;
	Zeichnen zeichnen;
	JButton btnReset;
	JMenuBar menuBar;
	JMenu file;
	
	static JButton btn[] = new JButton[9]; // Button Array von 9 Feldern für Tic Tac Toe
	static int state[] = new int[9];
	static int player = 0;
	static int gewinner = 0;
	ImageLoader lader;
	Image icon;
	ImageIcon zwergIcon;
	
	public Fenster() {
		
		lader = new ImageLoader();                             //Aufbereitung für das FensterIcon
		zwergIcon = lader.createImageIcon("res/icon.png","");  //				|
		icon = zwergIcon.getImage();						   //				V
		
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // scließt das Programm beim Klicken auf das rote X
		frame.setLocationRelativeTo(null); // Fenster wird zentriert
		frame.setResizable(false); // Größe lässt sich nicht ändern
		frame.setTitle("TicTacToe"); // Titel für das Fenster
		frame.setIconImage(icon); //setzt das FensterIcon
		
		
		
		for(int i = 0; i<btn.length; i++) { // Schleife zum Erstellen der Buttons
			btn[i] = new JButton();
			btn[i].setVisible(true);
			btn[i].addActionListener(new Aktionen());
			btn[i].setFocusPainted(false);             //
			btn[i].setContentAreaFilled(false);        // Sorgt dafür dass die Buttons keinen Inhalt anzeigen
			btn[i].setBorder(null);                    //
			frame.add(btn[i]);
		}
		
		ButtonSetzen.setzen();
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(675, 500, 100, 40);
		btnReset.setVisible(true);
		btnReset.setBackground(new Color(102,255,255)); // Benutzerdefinierte Farbe für das Button
		btnReset.setForeground(Color.BLACK);            //setzt Schriftfarbe von Button
		btnReset.setFocusPainted(false);
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Funktion.reset();
				
			}
			
		});
		
		frame.add(btnReset); // Fügt Button Reset zum Fenster
		
		zeichnen = new Zeichnen();
		zeichnen.setBounds(0, 0, 800, 600);
		frame.add(zeichnen);
		zeichnen.setVisible(true);
		
		frame.setVisible(true); // Fesnter wird sichtbar
	}

}
