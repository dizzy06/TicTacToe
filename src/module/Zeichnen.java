package module;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Zeichnen extends JLabel{  // Übernimmt die Eigenschaften von JLabel
	private static final long serialVersionUID = 1L;
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//ab hier Befehle zum Zeichnen//
		//g.setColor(new Color(255,230,204));//(Orange) Hintergrundfarbe für das Fenster
		g.setColor(new Color(255,102,102));  //(Turkis)
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.BLACK); // Farbe für das Spielkreuz
		
		//vertikale Linien//
		
		g.drawLine(325, 50, 325, 500);
		g.drawLine(475, 50, 475, 500);
		
		//horizontale Linien//
		
		g.drawLine(175, 200, 625, 200);
		g.drawLine(175, 350, 625, 350);
		
		//Spieler angeben//
		
		g.setColor(Color.BLACK);
		if(Fenster.player == 0) {				// Gibt an wer gerade am Zug ist
			g.drawString("Spieler X:", 25, 50);
		}else if(Fenster.player == 1) {
			g.drawString("Spieler O:", 25, 50);
		}
		
		//Gewinner angeben//
		
		if(Fenster.gewinner == 1) {				
			g.drawString("Gewinner: X", 25, 100);
		}else if(Fenster.gewinner == 2) {
			g.drawString("Gewinner: O", 25, 100);
		}
		
		//Reihe 1//
		
		if(Fenster.state[0] == 1) {
			g.drawImage(Bilder.bildX, 175, 50, 150, 150, null);
		}else if(Fenster.state[0] == 2) {
			g.drawImage(Bilder.bildO, 175, 50, 150, 150, null);
		}
		
		if(Fenster.state[1] == 1) {
			g.drawImage(Bilder.bildX, 325, 50, 150, 150, null);
		}else if(Fenster.state[1] == 2) {
			g.drawImage(Bilder.bildO, 325, 50, 150, 150, null);
		}
		
		if(Fenster.state[2] == 1) {
			g.drawImage(Bilder.bildX, 475, 50, 150, 150, null);
		}else if(Fenster.state[2] == 2) {
			g.drawImage(Bilder.bildO, 475, 50, 150, 150, null);
		}
		
		//Reihe 2//
		
		if(Fenster.state[3] == 1) {
			g.drawImage(Bilder.bildX, 175, 200, 150, 150, null);
		}else if(Fenster.state[3] == 2) {
			g.drawImage(Bilder.bildO, 175, 200, 150, 150, null);
		}
		
		if(Fenster.state[4] == 1) {
			g.drawImage(Bilder.bildX, 325, 200, 150, 150, null);
		}else if(Fenster.state[4] == 2) {
			g.drawImage(Bilder.bildO, 325, 200, 150, 150, null);
		}
		
		if(Fenster.state[5] == 1) {
			g.drawImage(Bilder.bildX, 475, 200, 150, 150, null);
		}else if(Fenster.state[5] == 2) {
			g.drawImage(Bilder.bildO, 475, 200, 150, 150, null);
		}
		
		//Reihe 3//
		
		if(Fenster.state[6] == 1) {
			g.drawImage(Bilder.bildX, 175, 350, 150, 150, null);
		}else if(Fenster.state[6] == 2) {
			g.drawImage(Bilder.bildO, 175, 350, 150, 150, null);
		}
		
		if(Fenster.state[7] == 1) {
			g.drawImage(Bilder.bildX, 325, 350, 150, 150, null);
		}else if(Fenster.state[7] == 2) {
			g.drawImage(Bilder.bildO, 325, 350, 150, 150, null);
		}
		
		if(Fenster.state[8] == 1) {
			g.drawImage(Bilder.bildX, 475, 350, 150, 150, null);
		}else if(Fenster.state[8] == 2) {
			g.drawImage(Bilder.bildO, 475, 350, 150, 150, null);
		}
		
		repaint(); // sorgt für ein Aktualisierung damit man die Zeichnung sehen kann und Veränderungen sichtbar werden
	}

}
