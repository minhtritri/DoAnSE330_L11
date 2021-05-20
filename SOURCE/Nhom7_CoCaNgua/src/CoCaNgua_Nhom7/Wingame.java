package CoCaNgua_Nhom7;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Wingame {
	private int iPheco;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Wingame window = new Wingame();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Wingame() {
		initialize();
	}
	public Wingame(int Pheco) {
		this.iPheco= Pheco;
		initialize();
		frame.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,675,369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("WinGame");
		
		JButton btnNewButton = new JButton("Chơi lại");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Chet();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(374, 225, 183, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(374, 259, 183, 23);
		frame.getContentPane().add(btnNewButton_1);
		ImageIcon icon = new ImageIcon("wingame.png");
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(0, 0, 659, 330);
		
		
		JLabel lblNewLabel_1 = new JLabel("  Team Red Win ");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(297, 95, 320, 95);
		lblNewLabel_1.setBackground(Color.white);
		lblNewLabel_1.setOpaque(true);
		if (iPheco==0) {
			lblNewLabel_1.setText(" Team Green Win ");
			lblNewLabel_1.setForeground(Color.GREEN);
			} else if (iPheco==1) {
				lblNewLabel_1.setText(" Team Red Win ");
				lblNewLabel_1.setForeground(Color.RED);
			} else if (iPheco==2) {
				lblNewLabel_1.setText(" Team Blue Win ");
				lblNewLabel_1.setForeground(Color.BLUE);
			} else if (iPheco==3) {
				lblNewLabel_1.setText(" Team Yellow Win ");
				lblNewLabel_1.setForeground(Color.YELLOW);
			}
		
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel);
	}
}
