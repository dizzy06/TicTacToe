package module;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageHelper {
	/**
	 * Hier wird ein Bild aus einer JAR Datei geladen und verarbeitet.
	 * 
	 * @param fileName
	 *            {@link String} mit dem Dateinamen
	 * @return {@link Image}
	 */
	public static Image loadImage(String fileName) {
		return new ImageIcon(ImageHelper.class.getResource(fileName))
				.getImage();
	}
 
	/**
	 * Hier wird ein Bild aus einer JAR Datei geladen und verarbeitet.
	 * 
	 * @param fileName
	 *            {@link String} mit dem Dateinamen
	 * @return {@link ImageIcon}
	 */
	public static ImageIcon loadIcon(String fileName) {
		return new ImageIcon(ImageHelper.class.getResource(fileName));
	}

}
