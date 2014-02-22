import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Frame extends JFrame {
	
	public static void main(String[] args){
		
		//Frame will not house the GUI
		TimeHandler timer = new TimeHandler();
		
		TimeKeeper timeKeeper = new TimeKeeper();
		
		
		JFrame mainframe = new JFrame("Calendar");
		mainframe.setSize(500,400);
		mainframe.setLocation(500, 10);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
		
		
		
		
		
		
		//Buttons
		JButton test = new JButton("Surprise");
		
		
		
		
		mainframe.add(test);

		mainframe.add(timeKeeper);
		timer.showTime();
		
		
	}

}
