import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JOptionPane;

public class GraphicsMain {
	
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Increment/Decrement");
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicsPanel panel1 = new GraphicsPanel();

		myFrame.setContentPane(panel1);		
		myFrame.pack();
		myFrame.setVisible(true);
		
		panel1.drawLine(Color.RED, 100, 100, 200, 100);
		panel1.drawLine(Color.RED, 100, 100, 100, 200);
		panel1.drawLine(Color.RED, 100, 200, 200, 200);
		panel1.drawLine(Color.RED, 200, 200, 200, 100);


		
		
		myFrame.setSize(800,400);

		
		
		
	}

}
