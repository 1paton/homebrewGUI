package https.projectzevo.com;
//
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class MainStartup extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainStartup frame = new MainStartup();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("HomeBrew GUI Installer");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

	/**
	 * Create the frame.
	 */
	public MainStartup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 644, 348);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 201, 326);
		panel.setBackground(new Color(0, 51, 102));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnInstallHomebrew = new JButton("Install Homebrew");
		btnInstallHomebrew.setForeground(Color.BLACK);
		btnInstallHomebrew.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnInstallHomebrew.setBounds(22, 120, 154, 29);
		panel.add(btnInstallHomebrew);
		
		JButton btnQuitInstaller = new JButton("Uninstall");
		btnQuitInstaller.setForeground(Color.RED);
		btnQuitInstaller.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnQuitInstaller.setBounds(22, 163, 154, 29);
		panel.add(btnQuitInstaller);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainStartup.class.getResource("/images/new-logo.png")));
		lblNewLabel.setBounds(195, -42, 489, 457);
		contentPane.add(lblNewLabel);
		btnInstallHomebrew.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		       System.out.println("I'm installing Brew :)");
		       Runtime runtime = Runtime.getRuntime();
		       String[] args = { "osascript", "-e", "tell application \"homebrew-installer\" to activate" };

		       try
		       {
		         Process process = runtime.exec(args);
		       }
		       catch (IOException c)
		       {
		         c.printStackTrace();
		       }
		       
		    }
		});
		
		btnQuitInstaller.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		       System.out.println("I'm uninstalling Brew :(");
		       Runtime runtime = Runtime.getRuntime();
		       String[] args = { "osascript", "-e", "tell application \"homebrew-uninstaller\" to activate" };

		       try
		       {
		         Process process = runtime.exec(args);
		       }
		       catch (IOException c)
		       {
		         c.printStackTrace();
		       }
		       
		    }
		});
		
		        
		    
	}
}
