package CoCaNgua_Nhom7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Chet {
	
	private int SoNguoi=0, SoMay=-1;
	private Boolean kt = true;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chet window = new Chet();
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
	public Chet() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setTitle("SeaHouse Game");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 716, 561);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		final JLabel[] labels= new JLabel[5];
		final JLabel[] labels1= new JLabel[5];
		Icon icon= new ImageIcon("man.png");
		Icon icon1= new ImageIcon("robot.png");
		labels[0] = new JLabel(icon);
		labels[0].setForeground(Color.BLACK);
		labels[0].setBackground(Color.GREEN);
		labels[0].setBounds(218,330,30,46);
		labels[0].setOpaque(true);
		labels[0].setHorizontalTextPosition(SwingConstants.LEFT);
		labels[0].setVisible(true);
		
	    labels[1] = new JLabel(icon);
		labels[1].setForeground(Color.BLACK);
		labels[1].setBackground(Color.RED);
		labels[1].setBounds(258,330,30,46);
		labels[1].setOpaque(true);
		labels[1].setHorizontalTextPosition(SwingConstants.LEFT);
		labels[1].setVisible(false);
		
		labels[2] = new JLabel(icon);
		labels[2].setForeground(Color.BLACK);
		labels[2].setBackground(Color.BLUE);
		labels[2].setBounds(298,330,30,46);
		labels[2].setOpaque(true);
		labels[2].setHorizontalTextPosition(SwingConstants.LEFT);
		labels[2].setVisible(false);
		
		labels[3] = new JLabel(icon);
		labels[3].setForeground(Color.BLACK);
		labels[3].setBackground(Color.YELLOW);
		labels[3].setBounds(338,330,30,46);
		labels[3].setOpaque(true);
		labels[3].setHorizontalTextPosition(SwingConstants.LEFT);
		labels[3].setVisible(false);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(169, 330, 41, 23); 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (SoNguoi<3) 
						{
						if (SoMay!=-1) {
							for (int i=0;i<3;i++) labels1[i].setVisible(false);
							SoMay=-1;
						}
						SoNguoi++;
						labels[SoNguoi].setVisible(true);
						}
					else {
						JOptionPane.showInternalMessageDialog(null, "Tối đa 4 người chơi");
					}
					
				
			}
		});
		
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(labels[0]);
		frame.getContentPane().add(labels[1]);
		frame.getContentPane().add(labels[2]);
		frame.getContentPane().add(labels[3]);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SoNguoi>0) {
					if (SoMay!=-1) {
						for (int i=0;i<3;i++) labels1[i].setVisible(false);
						SoMay=-1;
					}
				labels[SoNguoi].setVisible(false);
				SoNguoi--;
				}
				else {
					JOptionPane.showInternalMessageDialog(null, "Tối thiểu  1 người chơi");
				}
			}
		});
		//-----------------------------------------------------
		
		
//		labels1[0] = new JLabel(icon1);
//		labels1[0].setForeground(Color.BLACK);
//		labels1[0].setBackground(Color.GREEN);
//		labels1[0].setBounds(218,391,30,46);
//		labels1[0].setOpaque(true);
//		labels1[0].setHorizontalTextPosition(SwingConstants.LEFT);
//		labels1[0].setVisible(false);
		
	    labels1[0] = new JLabel(icon1);
		labels1[0].setForeground(Color.BLACK);
		labels1[0].setBackground(Color.RED);
		labels1[0].setBounds(258,391,30,46);
		labels1[0].setOpaque(true);
		labels1[0].setHorizontalTextPosition(SwingConstants.LEFT);
		labels1[0].setVisible(false);
		
		labels1[1] = new JLabel(icon1);
		labels1[1].setForeground(Color.BLACK);
		labels1[1].setBackground(Color.BLUE);
		labels1[1].setBounds(298,391,30,46);
		labels1[1].setOpaque(true);
		labels1[1].setHorizontalTextPosition(SwingConstants.LEFT);
		labels1[1].setVisible(false);
		
		labels1[2] = new JLabel(icon1);
		labels1[2].setForeground(Color.BLACK);
		labels1[2].setBackground(Color.YELLOW);
		labels1[2].setBounds(338,391,30,46);
		labels1[2].setOpaque(true);
		labels1[2].setHorizontalTextPosition(SwingConstants.LEFT);
		labels1[2].setVisible(false);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SoMay+SoNguoi<2) {
					SoMay++;
					labels1[SoMay+SoNguoi].setVisible(true);
				}
				else {
					JOptionPane.showInternalMessageDialog(null, "Quá số lượng");
				}
			}
		});
		
		//frame.getContentPane().add(labels1[0]);
		frame.getContentPane().add(labels1[0]);
		frame.getContentPane().add(labels1[1]);
		frame.getContentPane().add(labels1[2]);
		
		btnNewButton_3.setBounds(169, 391, 41, 23);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_1.setBounds(169, 353, 41, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Start");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				//JOptionPane.showInternalMessageDialog(null, "Số Người: " + SoNguoi +"\n Số máy: "+ SoMay);
				new frmGame(SoNguoi,SoMay,kt);
				frame.dispose();
				//System.exit(0);
			}
		});
		
		JButton btnNewButton_3_1 = new JButton("-");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SoMay>-1) {
					labels1[SoMay+SoNguoi].setVisible(false);
					SoMay--;
				} 
				else {
					//JOptionPane.showInternalMessageDialog(null, "");
				}
			}
		});
		btnNewButton_3_1.setBounds(169, 414, 41, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		btnNewButton_2.setBounds(53, 488, 589, 23);
		frame.getContentPane().add(btnNewButton_2);
		//------------------------------------------------------
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 700, 522);
		ImageIcon Img = new ImageIcon("bk1.png");
		lblNewLabel.setIcon(Img);
		
		
		JLabel lblNewLabel_1 = new JLabel("  Số người chơi :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(0, 317, 169, 63);
		
		
		
		
		//--------------------------------sound-------------------\
		final Icon icon3= new ImageIcon("ON.png");
		final Icon icon4= new ImageIcon("OFF.png");
		final JButton btnNewButton_4 = new JButton(icon3);
		//PlayMusic pkMusic = new PlayMusic();
		//pkMusic.playmusic("happy.wav");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (kt==true) {
				btnNewButton_4.setIcon(icon4);
				kt=false;
				}
				else {
					btnNewButton_4.setIcon(icon3);
					kt=true;
				}
			}
		});
		btnNewButton_4.setBounds(597, 414, 60, 49);
		frame.getContentPane().add(btnNewButton_4);
		//--------------------------------------------------------
		JLabel lblNewLabel_2 = new JLabel("  Số máy chơi   :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(0, 374, 169, 63);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
	}
}