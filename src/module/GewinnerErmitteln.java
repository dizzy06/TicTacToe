package module;

import java.util.Timer;
import java.util.TimerTask;

public class GewinnerErmitteln {
Timer time;
	public GewinnerErmitteln() {
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() { // Methode für stetige Überprüfung
			
			@Override
			public void run() {
				
				if(Fenster.gewinner == 0) {
					
					//für Reihe 1 X//
					if(Fenster.state[0] == 1 && Fenster.state[1] == 1 && Fenster.state[2] == 1) {
						Fenster.gewinner = 1;
					}
					//für Reihe 2 X//
					else if(Fenster.state[3] == 1 && Fenster.state[4] == 1 && Fenster.state[5] == 1) {
						Fenster.gewinner = 1;
					}
					//für Reihe 3 X//
					else if(Fenster.state[6] == 1 && Fenster.state[7] == 1 && Fenster.state[8] == 1) {
						Fenster.gewinner = 1;
					}
					//für Spalte 1 X//
					else if(Fenster.state[0] == 1 && Fenster.state[3] == 1 && Fenster.state[6] == 1) {
						Fenster.gewinner = 1;
					}
					//für Spalte 2 X//
					else if(Fenster.state[1] == 1 && Fenster.state[4] == 1 && Fenster.state[7] == 1) {
						Fenster.gewinner = 1;
					}
					//für Spalte 3 X//
					else if(Fenster.state[2] == 1 && Fenster.state[5] == 1 && Fenster.state[8] == 1) {
						Fenster.gewinner = 1;
					}
					//diagonal oben links X//
					else if(Fenster.state[0] == 1 && Fenster.state[4] == 1 && Fenster.state[8] == 1) {
						Fenster.gewinner = 1;
					}
					//diagonal oben rechts X//
					else if(Fenster.state[2] == 1 && Fenster.state[4] == 1 && Fenster.state[6] == 1) {
						Fenster.gewinner = 1;
					}
					
					/*************************************************************************************/
					
					//für Reihe 1 O//
					if(Fenster.state[0] == 2 && Fenster.state[1] == 2 && Fenster.state[2] == 2) {
						Fenster.gewinner = 2;
					}
					//für Reihe 2 O//
					else if(Fenster.state[3] == 2 && Fenster.state[4] == 2 && Fenster.state[5] == 2) {
						Fenster.gewinner = 2;
					}
					//für Reihe 3 O//
					else if(Fenster.state[6] == 2 && Fenster.state[7] == 2 && Fenster.state[8] == 2) {
						Fenster.gewinner = 2;
					}
					//für Spalte 1 O//
					else if(Fenster.state[0] == 2 && Fenster.state[3] == 2 && Fenster.state[6] == 2) {
						Fenster.gewinner = 2;
					}
					//für Spalte 2 O//
					else if(Fenster.state[1] == 2 && Fenster.state[4] == 2 && Fenster.state[7] == 2) {
						Fenster.gewinner = 2;
					}
					//für Spalte 3 O//
					else if(Fenster.state[2] == 2 && Fenster.state[5] == 2 && Fenster.state[8] == 2) {
						Fenster.gewinner = 2;
					}
					//diagonal oben links O//
					else if(Fenster.state[0] == 2 && Fenster.state[4] == 2 && Fenster.state[8] == 2) {
						Fenster.gewinner = 2;
					}
					//diagonal oben rechts O//
					else if(Fenster.state[2] == 2 && Fenster.state[4] == 2 && Fenster.state[6] == 2) {
						Fenster.gewinner = 2;
					}
				}
				
				
			}
		}, 0, 150); // Gewinn wird alle 150 ms überprüft
	}

}
