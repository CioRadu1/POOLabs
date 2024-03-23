import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
public class MainCLass {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,120);
		JPanel usernamePanel = new JPanel();
		JPanel passwordPanel = new JPanel();
		JPanel loginPanel = new JPanel();
		JPanel bigPanel = new JPanel();
		bigPanel.setLayout(new BoxLayout(bigPanel, BoxLayout.Y_AXIS));
		//usernamePanel.setLayout(new BoxLayout(usernamePanel, BoxLayout.Y_AXIS));
		
		JLabel usernameLabel = new JLabel("username");
		JLabel passwordLabel = new JLabel("password");
		JButton loginButton = new JButton("LogIn");
		JCheckBox checkBox = new JCheckBox("Terms & Conditions");
		JTextField usenameTextField = new JTextField();
		JTextField passwordTextField = new JTextField();
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
		usenameTextField.setPreferredSize(new Dimension(100, 20));
		passwordTextField.setPreferredSize(new Dimension(100, 20));
		loginButton.setPreferredSize(new Dimension(100, 40));
		
		usernamePanel.add(usernameLabel);
		usernamePanel.add(usenameTextField);
		
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordTextField);
		
		loginPanel.add(checkBox);
		loginPanel.add(loginButton);
		
		
		bigPanel.add(usernamePanel);
		bigPanel.add(passwordPanel);
		bigPanel.add(loginPanel);
		
		JLabel loginText = new JLabel ("Not Logged In ");
		loginPanel.add(loginText);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()) {
				loginText.setText("Te-ai loggat");
				}
			}
		}
		);;
			
		
		frame.setContentPane(bigPanel);
		frame.setVisible(true);
		frame.pack();
		
		

	}

}
