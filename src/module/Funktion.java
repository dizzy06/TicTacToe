package module;

public class Funktion {
	
	public static void reset() {
		
		for(int i=0; i<Fenster.state.length; i++) {
			
			Fenster.state[i] = 0;
			
		}
		
		Fenster.player = 0;
		Fenster.gewinner = 0;
		
	}

}
