package bjGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainApp {

	private JFrame frame;
	private JPanel pnlIntroScreen;
	private JButton btnStartGame;
	private JButton btnExitIntro;
	private JPanel pnlGameScreen;
	private JButton btnNewGame;
	private JButton btnDeal;
	private JButton btnTwist;
	private JButton btnStick;
	private JButton btnExit;

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
		
		btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlGameScreen.setVisible(true);
				pnlIntroScreen.setVisible(false);
			}
		});
		btnStartGame.setBounds(90, 507, 89, 23);
		pnlIntroScreen.add(btnStartGame);
		
		btnExitIntro = new JButton("Exit");
		btnExitIntro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExitIntro.setBounds(409, 507, 89, 23);
		pnlIntroScreen.add(btnExitIntro);
		
		pnlGameScreen = new JPanel();
		frame.getContentPane().add(pnlGameScreen, "name_241125091166600");
		pnlGameScreen.setLayout(null);
		
		btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(34, 523, 89, 23);
		pnlGameScreen.add(btnNewGame);
		
		btnDeal = new JButton("Deal");
		btnDeal.setBounds(147, 523, 89, 23);
		pnlGameScreen.add(btnDeal);
		
		btnTwist = new JButton("Twist");
		btnTwist.setBounds(261, 523, 89, 23);
		pnlGameScreen.add(btnTwist);
		
		btnStick = new JButton("Stick");
		btnStick.setBounds(379, 523, 89, 23);
		pnlGameScreen.add(btnStick);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlIntroScreen.setVisible(true);
				pnlGameScreen.setVisible(false);
			}
		});
		btnExit.setBounds(497, 523, 89, 23);
		pnlGameScreen.add(btnExit);
	}
}
