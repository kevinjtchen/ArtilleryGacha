import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
	private static Container c;
	private Panel panel;
	
	public Main() {
		setTitle("ArtilleryGacha");
		setUndecorated(true);
		
		c = getContentPane();
		
		panel = new Panel();
		c.add(panel);
	}
	
	public static void main(String[]args) {
		Main main = new Main();
		main.setSize(800, 600);
		main.setVisible(true);
		main.setResizable(false);
		main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}