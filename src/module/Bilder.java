package module;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Bilder {
    
	static Image bildX, bildO; //usual Image
	ImageIcon X, O;
	ImageLoader lader;
	
	public Bilder() {
		
		try {
			bildX = ImageIO.read(new File("res/x.png")); // Bilder sollten idealerweise die Maaße 150x150px haben!!!
			bildO = ImageIO.read(new File("res/o.png"));
			
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		lader = new ImageLoader();                        //!!!NOTWENDIG WENN MAN JAR AUSFÜHREN MÖCHTE!!!!
		X = lader.createImageIcon("res/HQ/x.png", "");		  //BILDER MÜSSEN IM SELBEN PACKAGE ABGESPEICHERT WERDEN
		O = lader.createImageIcon("res/HQ/o.png", "");
		
		bildX = X.getImage();
		bildO = O.getImage();
		
		
	}
	
	
	

}

// VERSUCH MIT ImageHelper KLASSE UM BILDER AUS JAR ZU LADEN ////
//LINK: ++++ https://st-page.de/2015/01/23/jar-bilder-einbinden/ ++++//
//TO DO -> erstelle zunächst eine Image Helper Klasse (DIZMAN, YASIR 03.04.2020)