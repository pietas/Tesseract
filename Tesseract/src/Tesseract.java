import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
/**
 * Main class for Tesseract animation.
 * @author pietas
 *
 */
public class Tesseract {
	
	public static void main(String args[])
	{
		GLProfile glProfile = GLProfile.getDefault();
		GLCapabilities caps = new GLCapabilities(glProfile);
		GLCanvas canvas = new GLCanvas(caps);
		
		Frame frame = new Frame();
		frame.add(canvas);
		frame.setSize(500, 500);
		
		frame.setBackground(Color.BLUE);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}
