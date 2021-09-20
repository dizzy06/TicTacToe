package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aktionen implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(Fenster.gewinner == 0) {
			
			//Reihe 1
			
			if(e.getSource() == Fenster.btn[0]) {				
				if(Fenster.state[0] == 0 && Fenster.player == 0) {
					Fenster.state[0] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[0] == 0 && Fenster.player == 1) {
					Fenster.state[0] = 2;
					Fenster.player = 0;
				}
				
			}else if(e.getSource() == Fenster.btn[1]) {
				if(Fenster.state[1] == 0 && Fenster.player == 0) {
					Fenster.state[1] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[1] == 0 && Fenster.player == 1) {
					Fenster.state[1] = 2;
					Fenster.player = 0;
				}
				
			}else if(e.getSource() == Fenster.btn[2]) {
				if(Fenster.state[2] == 0 && Fenster.player == 0) {
					Fenster.state[2] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[2] == 0 && Fenster.player == 1) {
					Fenster.state[2] = 2;
					Fenster.player = 0;
				}
				
			//Reihe 2
				
			}else if(e.getSource() == Fenster.btn[3]) {
				if(Fenster.state[3] == 0 && Fenster.player == 0) {
					Fenster.state[3] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[3] == 0 && Fenster.player == 1) {
					Fenster.state[3] = 2;
					Fenster.player = 0;
				}
				
			}else if(e.getSource() == Fenster.btn[4]) {
				if(Fenster.state[4] == 0 && Fenster.player == 0) {
					Fenster.state[4] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[4] == 0 && Fenster.player == 1) {
					Fenster.state[4] = 2;
					Fenster.player = 0;
				}
				
			}else if(e.getSource() == Fenster.btn[5]) {
				if(Fenster.state[5] == 0 && Fenster.player == 0) {
					Fenster.state[5] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[5] == 0 && Fenster.player == 1) {
					Fenster.state[5] = 2;
					Fenster.player = 0;
				}
				
			//Reihe 3
				
			}else if(e.getSource() == Fenster.btn[6]) {
				if(Fenster.state[6] == 0 && Fenster.player == 0) {
					Fenster.state[6] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[6] == 0 && Fenster.player == 1) {
					Fenster.state[6] = 2;
					Fenster.player = 0;
				}
				
			}else if(e.getSource() == Fenster.btn[7]) {
				if(Fenster.state[7] == 0 && Fenster.player == 0) {
					Fenster.state[7] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[7] == 0 && Fenster.player == 1) {
					Fenster.state[7] = 2;
					Fenster.player = 0;
				}
				
			}else if(e.getSource() == Fenster.btn[8]) {
				if(Fenster.state[8] == 0 && Fenster.player == 0) {
					Fenster.state[8] = 1;
					Fenster.player = 1;
				}else if(Fenster.state[8] == 0 && Fenster.player == 1) {
					Fenster.state[8] = 2;
					Fenster.player = 0;
				}
			}
		}
	}
}
