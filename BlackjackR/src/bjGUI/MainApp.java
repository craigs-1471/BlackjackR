package bjGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class MainApp {

	private JFrame frame;
	private JPanel pnlIntroScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 639, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		pnlIntroScreen = new JPanel();
		frame.getContentPane().add(pnlIntroScreen, "name_241053635896100");
		pnlIntroScreen.setLayout(null);
		
		JPanel pnlGameScreen = new JPanel();
		frame.getContentPane().add(pnlGameScreen, "name_241125091166600");
		pnlGameScreen.setLayout(null);
	}

}
