package CoCaNgua_Nhom7;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;


import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class frmGame {

	private JFrame frame;
	private JPanel[][] OCo;
	private JButton[] Co;
	private int iSoNguoi, iSoMay;
	private int iLuot;
	private BanCo CoCaNgua;
	private Integer iXucSac;
	private JLabel lblAvatar;
	private final JButton btnXoay;
	private final JLabel lblAvatarBG, lblXucSac;
	private JCheckBox checkboxMay, checkboxNguoi; 
	private JLabel txtSoQuanXuatTran, txtHang, txtDiemSo;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frmGame window = new frmGame();
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
	public frmGame() {
		lblXucSac = new JLabel("");
		lblAvatarBG = new JLabel("");
		this.btnXoay = new JButton("Xoay");
		initialize();
	}
	
	public frmGame(int SoNguoi,int SoMay,boolean Music) {
		lblAvatarBG = new JLabel("");
		this.lblXucSac = new JLabel("");
		this.btnXoay = new JButton("Xoay");
		this.iSoNguoi = SoNguoi+SoMay+2;
		this.iSoMay = iSoNguoi - (SoMay);
		this.iLuot = 0;
		System.out.println(iSoNguoi+" "+iSoMay);
		RunGame();
		initialize();
		frame.setVisible(true);
		
	}
	
	public void RunGame() {
		CoCaNgua = new BanCo(iSoNguoi, iSoMay);
		this.iLuot = 0;
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1069, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.OCo = new JPanel[6][56];
		
		JPanel PanelGame = new JPanel();
		PanelGame.setBounds(320, 11, 721, 721);
		frame.getContentPane().add(PanelGame);
		PanelGame.setLayout(null);
		
		JPanel PanelInfo = new JPanel();
		PanelInfo.setToolTipText("2");
		PanelInfo.setBounds(10, 11, 300, 420);
		frame.getContentPane().add(PanelInfo);
		PanelInfo.setLayout(null);
		
		lblAvatar = new JLabel("");
		lblAvatar.setBounds(29, 35, 150, 200);
		PanelInfo.add(lblAvatar);
		
		JLabel lblTitle = new JLabel("PHE XANH");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblTitle.setBounds(85, 240, 129, 37);
		PanelInfo.add(lblTitle);
		
		JLabel lblSoQuanXuatTran = new JLabel("Sô quân xuất trận :");
		lblSoQuanXuatTran.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoQuanXuatTran.setBounds(41, 288, 122, 24);
		PanelInfo.add(lblSoQuanXuatTran);
		
		JLabel lblDiemSo = new JLabel("                Điểm số :");
		lblDiemSo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDiemSo.setBounds(41, 328, 122, 24);
		PanelInfo.add(lblDiemSo);
		
		txtSoQuanXuatTran = new JLabel("0");
		txtSoQuanXuatTran.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSoQuanXuatTran.setBounds(179, 288, 52, 24);
		PanelInfo.add(txtSoQuanXuatTran);
		
		txtDiemSo = new JLabel("0");
		txtDiemSo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDiemSo.setBounds(179, 328, 52, 24);
		PanelInfo.add(txtDiemSo);
		
		txtHang = new JLabel("0");
		txtHang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHang.setBounds(179, 368, 52, 24);
		PanelInfo.add(txtHang);
		
		JLabel lblHang = new JLabel("                    Hạng :");
		lblHang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHang.setBounds(41, 368, 122, 24);
		PanelInfo.add(lblHang);
		
		checkboxNguoi = new JCheckBox("Người");
		checkboxNguoi.setEnabled(false);
		checkboxNguoi.setBounds(200, 112, 61, 23);
		PanelInfo.add(checkboxNguoi);
		
		checkboxMay = new JCheckBox("Máy");
		checkboxMay.setEnabled(false);
		checkboxMay.setBounds(200, 153, 61, 23);
		PanelInfo.add(checkboxMay);
		
		lblAvatarBG.setIcon(new ImageIcon("AvatarBG0.png"));
		lblAvatarBG.setBounds(0, 0, 300, 420);
		PanelInfo.add(lblAvatarBG);
		//this.DoiLuot();
		
		JPanel o1_00 = new JPanel();
		o1_00.setBounds(650, 300, 40, 40);
		o1_00.setBackground(new Color(0,0,0,0));
		OCo[1][0] = o1_00;
		
		PanelGame.add(OCo[1][0]);
		
		JPanel o1_01 = new JPanel();
		o1_01.setBackground(new Color(0, 0, 0, 0));
		o1_01.setBounds(610, 300, 40, 40);
		OCo[1][1] = o1_01;
		PanelGame.add(OCo[1][1]);
		
		JPanel o1_02 = new JPanel();
		o1_02.setBackground(new Color(0, 0, 0, 0));
		o1_02.setBounds(570, 300, 40, 40);
		OCo[1][2] = o1_02;
		PanelGame.add(OCo[1][2]);
		
		JPanel o1_03 = new JPanel();
		o1_03.setBounds(530, 300, 40, 40);
		o1_03.setBackground(new Color(0, 0, 0, 0));
		OCo[1][3] = o1_03;
		PanelGame.add(OCo[1][3]);
		
		
		JPanel PanelXucSac = new JPanel();
		PanelXucSac.setBounds(10, 445, 300, 285);
		frame.getContentPane().add(PanelXucSac);
		PanelXucSac.setLayout(null);
		
		lblXucSac.setIcon(new ImageIcon("XucSac1.png"));
		lblXucSac.setBounds(97, 40, 100, 100);
		PanelXucSac.add(lblXucSac);
		
		btnXoay.setBounds(97, 194, 100, 23);
		PanelXucSac.add(btnXoay);

		JPanel o2_03 = new JPanel();
		o2_03.setBackground(new Color(0, 0, 0, 0));
		o2_03.setBounds(530, 340, 40, 40);
		OCo[2][3] = o2_03;
		PanelGame.add(OCo[2][3]);
		
		JPanel o2_02 = new JPanel();
		o2_02.setBackground(new Color(0, 0, 0, 0));
		o2_02.setBounds(570, 340, 40, 40);
		OCo[2][2] = o2_02;
		PanelGame.add(OCo[2][2]);
		
		JPanel o2_01 = new JPanel();
		o2_01.setBackground(new Color(0, 0, 0, 0));
		o2_01.setBounds(610, 340, 40, 40);
		OCo[2][1] = o2_01;
		PanelGame.add(OCo[2][1]);
		
		JPanel o1_55 = new JPanel();
		o1_55.setBackground(new Color(0, 0, 0, 0));
		o1_55.setBounds(650, 340, 40, 40);
		OCo[1][55] = o1_55;
		PanelGame.add(OCo[1][55]);
		
		JPanel o1_51 = new JPanel();
		o1_51.setBackground(new Color(0, 0, 0, 0));
		o1_51.setBounds(530, 380, 40, 40);
		OCo[1][51] = o1_51;
		PanelGame.add(OCo[1][51]);
		
		JPanel o1_52 = new JPanel();
		o1_52.setBackground(new Color(0, 0, 0, 0));
		o1_52.setBounds(570, 380, 40, 40);
		OCo[1][52] = o1_52;
		PanelGame.add(OCo[1][52]);
		
		JPanel o1_53 = new JPanel();
		o1_53.setBackground(new Color(0, 0, 0, 0));
		o1_53.setBounds(610, 380, 40, 40);
		OCo[1][53] = o1_53;
		PanelGame.add(OCo[1][53]);
		
		JPanel o1_54 = new JPanel();
		o1_54.setBackground(new Color(0, 0, 0, 0));
		o1_54.setBounds(650, 380, 40, 40);
		OCo[1][54] = o1_54;
		PanelGame.add(OCo[1][54]);
		
		JPanel o1_49 = new JPanel();
		o1_49.setBackground(new Color(0, 0, 0, 0));
		o1_49.setBounds(450, 380, 40, 40);
		OCo[1][49] = o1_49;
		PanelGame.add(OCo[1][49]);
		
		JPanel o2_05 = new JPanel();
		o2_05.setBackground(new Color(0, 0, 0, 0));
		o2_05.setBounds(450, 340, 40, 40);
		OCo[2][5] = o2_05;
		PanelGame.add(OCo[2][5]);
		
		JPanel o1_05 = new JPanel();
		o1_05.setBackground(new Color(0, 0, 0, 0));
		o1_05.setBounds(450, 300, 40, 40);
		OCo[1][5] = o1_05;
		PanelGame.add(OCo[1][5]);
		
		JPanel o1_04 = new JPanel();
		o1_04.setBackground(new Color(0, 0, 0, 0));
		o1_04.setBounds(490, 300, 40, 40);
		OCo[1][4] = o1_04;
		PanelGame.add(OCo[1][4]);
		
		JPanel o2_04 = new JPanel();
		o2_04.setBackground(new Color(0, 0, 0, 0));
		o2_04.setBounds(490, 340, 40, 40);
		OCo[2][4] = o2_04;
		PanelGame.add(OCo[2][4]);
		
		JPanel o1_50 = new JPanel();
		o1_50.setBackground(new Color(0, 0, 0, 0));
		o1_50.setBounds(490, 380, 40, 40);
		OCo[1][50] = o1_50;
		PanelGame.add(OCo[1][50]);
		
		JPanel o1_26 = new JPanel();
		o1_26.setBackground(new Color(0, 0, 0, 0));
		o1_26.setBounds(30, 300, 40, 40);
		OCo[1][26] = o1_26;
		PanelGame.add(OCo[1][26]);
		
		JPanel o1_25 = new JPanel();
		o1_25.setBackground(new Color(0, 0, 0, 0));
		o1_25.setBounds(70, 300, 40, 40);
		OCo[1][25] = o1_25;
		PanelGame.add(OCo[1][25]);
		
		JPanel o1_24 = new JPanel();
		o1_24.setBackground(new Color(0, 0, 0, 0));
		o1_24.setBounds(110, 300, 40, 40);
		OCo[1][24] = o1_24;
		PanelGame.add(OCo[1][24]);
		
		JPanel o1_23 = new JPanel();
		o1_23.setBackground(new Color(0, 0, 0, 0));
		o1_23.setBounds(150, 300, 40, 40);
		OCo[1][23] = o1_23;
		PanelGame.add(OCo[1][23]);
		
		JPanel o1_22 = new JPanel();
		o1_22.setBackground(new Color(0, 0, 0, 0));
		o1_22.setBounds(190, 300, 40, 40);
		OCo[1][22] = o1_22;
		PanelGame.add(OCo[1][22]);
		
		JPanel o1_21 = new JPanel();
		o1_21.setBackground(new Color(0, 0, 0, 0));
		o1_21.setBounds(230, 300, 40, 40);
		OCo[1][21] = o1_21;
		PanelGame.add(OCo[1][21]);
		
		JPanel o4_05 = new JPanel();
		o4_05.setBackground(new Color(0, 0, 0, 0));
		o4_05.setBounds(230, 340, 40, 40);
		OCo[4][5] = o4_05;
		PanelGame.add(OCo[4][5]);
		
		JPanel o4_04 = new JPanel();
		o4_04.setBackground(new Color(0, 0, 0, 0));
		o4_04.setBounds(190, 340, 40, 40);
		OCo[4][4] = o4_04;
		PanelGame.add(OCo[4][4]);
		
		JPanel o4_03 = new JPanel();
		o4_03.setBackground(new Color(0, 0, 0, 0));
		o4_03.setBounds(150, 340, 40, 40);
		OCo[4][3] = o4_03;
		PanelGame.add(OCo[4][3]);
		
		JPanel o4_02 = new JPanel();
		o4_02.setBackground(new Color(0, 0, 0, 0));
		o4_02.setBounds(110, 340, 40, 40);
		OCo[4][2] = o4_02;
		PanelGame.add(OCo[4][02]);
		
		JPanel o1_27 = new JPanel();
		o1_27.setBackground(new Color(0, 0, 0, 0));
		o1_27.setBounds(30, 340, 40, 40);
		OCo[1][27] = o1_27;
		PanelGame.add(OCo[1][27]);
		
		JPanel o4_01 = new JPanel();
		o4_01.setBackground(new Color(0, 0, 0, 0));
		o4_01.setBounds(70, 340, 40, 40);
		OCo[4][1] = o4_01;
		PanelGame.add(OCo[4][1]);
		
		JPanel o1_29 = new JPanel();
		o1_29.setBackground(new Color(0, 0, 0, 0));
		o1_29.setBounds(70, 380, 40, 40);
		OCo[1][29] = o1_29;
		PanelGame.add(OCo[1][29]);
		
		JPanel o1_28 = new JPanel();
		o1_28.setBackground(new Color(0, 0, 0, 0));
		o1_28.setBounds(30, 380, 40, 40);
		OCo[1][28] = o1_28;
		PanelGame.add(OCo[1][28]);
		
		JPanel o1_30 = new JPanel();
		o1_30.setBackground(new Color(0, 0, 0, 0));
		o1_30.setBounds(110, 380, 40, 40);
		OCo[1][30] = o1_30;
		PanelGame.add(OCo[1][30]);
		
		JPanel o1_31 = new JPanel();
		o1_31.setBackground(new Color(0, 0, 0, 0));
		o1_31.setBounds(150, 380, 40, 40);
		OCo[1][31] = o1_31;
		PanelGame.add(OCo[1][31]);
		
		JPanel o1_32 = new JPanel();
		o1_32.setBackground(new Color(0, 0, 0, 0));
		o1_32.setBounds(190, 380, 40, 40);
		OCo[1][32] = o1_32;
		PanelGame.add(OCo[1][32]);
		
		JPanel o1_33 = new JPanel();
		o1_33.setBackground(new Color(0, 0, 0, 0));
		o1_33.setBounds(230, 380, 40, 40);
		OCo[1][33] = o1_33;
		PanelGame.add(OCo[1][33]);
		
		JPanel o1_17 = new JPanel();
		o1_17.setBackground(new Color(0, 0, 0, 0));
		o1_17.setBounds(300, 150, 40, 40);
		OCo[1][17] = o1_17;
		PanelGame.add(OCo[1][17]);
		
		JPanel o5_03 = new JPanel();
		o5_03.setBackground(new Color(0, 0, 0, 0));
		o5_03.setBounds(340, 150, 40, 40);
		OCo[5][3] = o5_03;
		PanelGame.add(OCo[5][3]);
		
		JPanel o1_09 = new JPanel();
		o1_09.setBackground(new Color(0, 0, 0, 0));
		o1_09.setBounds(380, 150, 40, 40);
		OCo[1][9] = o1_09;
		PanelGame.add(OCo[1][9]);
		
		JPanel o1_08 = new JPanel();
		o1_08.setBackground(new Color(0, 0, 0, 0));
		o1_08.setBounds(380, 190, 40, 40);
		OCo[1][8] = o1_08;
		PanelGame.add(OCo[1][8]);
		
		JPanel o5_04 = new JPanel();
		o5_04.setBackground(new Color(0, 0, 0, 0));
		o5_04.setBounds(340, 190, 40, 40);
		OCo[5][4] = o5_04;
		PanelGame.add(OCo[5][4]);
		
		JPanel o1_18 = new JPanel();
		o1_18.setBackground(new Color(0, 0, 0, 0));
		o1_18.setBounds(300, 190, 40, 40);
		OCo[1][18] = o1_18;
		PanelGame.add(OCo[1][18]);
		
		JPanel o1_19 = new JPanel();
		o1_19.setBackground(new Color(0, 0, 0, 0));
		o1_19.setBounds(300, 230, 40, 40);
		OCo[1][19] = o1_19;
		PanelGame.add(OCo[1][19]);
		
		JPanel o5_05 = new JPanel();
		o5_05.setBackground(new Color(0, 0, 0, 0));
		o5_05.setBounds(340, 230, 40, 40);
		OCo[5][5] = o5_05;
		PanelGame.add(OCo[5][5]);
		
		JPanel o1_07 = new JPanel();
		o1_07.setBackground(new Color(0, 0, 0, 0));
		o1_07.setBounds(380, 230, 40, 40);
		OCo[1][7] = o1_07;
		PanelGame.add(OCo[1][7]);
		
		JPanel o1_14 = new JPanel();
		o1_14.setBackground(new Color(0, 0, 0, 0));
		o1_14.setBounds(300, 30, 40, 40);
		OCo[1][14] = o1_14;
		PanelGame.add(OCo[1][14]);
		
		JPanel o1_13 = new JPanel();
		o1_13.setBackground(new Color(0, 0, 0, 0));
		o1_13.setBounds(340, 30, 40, 40);
		OCo[1][13] = o1_13;
		PanelGame.add(OCo[1][13]);
		
		JPanel o1_12 = new JPanel();
		o1_12.setBackground(new Color(0, 0, 0, 0));
		o1_12.setBounds(380, 30, 40, 40);
		OCo[1][12] = o1_12;
		PanelGame.add(OCo[1][12]);
		
		JPanel o1_11 = new JPanel();
		o1_11.setBackground(new Color(0, 0, 0, 0));
		o1_11.setBounds(380, 70, 40, 40);
		OCo[1][11] = o1_11;
		PanelGame.add(OCo[1][11]);
		
		JPanel o5_01 = new JPanel();
		o5_01.setBackground(new Color(0, 0, 0, 0));
		o5_01.setBounds(340, 70, 40, 40);
		OCo[5][1] = o5_01;
		PanelGame.add(OCo[5][1]);
		
		JPanel o1_15 = new JPanel();
		o1_15.setBackground(new Color(0, 0, 0, 0));
		o1_15.setBounds(300, 70, 40, 40);
		OCo[1][15] = o1_15;
		PanelGame.add(OCo[1][15]);
		
		JPanel o1_16 = new JPanel();
		o1_16.setBackground(new Color(0, 0, 0, 0));
		o1_16.setBounds(300, 110, 40, 40);
		OCo[1][16] = o1_16;
		PanelGame.add(OCo[1][16]);
		
		JPanel o5_02 = new JPanel();
		o5_02.setBackground(new Color(0, 0, 0, 0));
		o5_02.setBounds(340, 110, 40, 40);
		OCo[5][2] = o5_02;
		PanelGame.add(OCo[5][2]);
		
		JPanel o1_10 = new JPanel();
		o1_10.setBackground(new Color(0, 0, 0, 0));
		o1_10.setBounds(380, 110, 40, 40);
		OCo[1][10] = o1_10;
		PanelGame.add(OCo[1][10]);
		
		JPanel o1_35 = new JPanel();
		o1_35.setBackground(new Color(0, 0, 0, 0));
		o1_35.setBounds(300, 450, 40, 40);
		OCo[1][35] = o1_35;
		PanelGame.add(OCo[1][35]);
		
		JPanel o3_05 = new JPanel();
		o3_05.setBackground(new Color(0, 0, 0, 0));
		o3_05.setBounds(340, 450, 40, 40);
		OCo[3][5] = o3_05;
		PanelGame.add(OCo[3][5]);
		
		JPanel o1_47 = new JPanel();
		o1_47.setBackground(new Color(0, 0, 0, 0));
		o1_47.setBounds(380, 450, 40, 40);
		OCo[1][47] = o1_47;
		PanelGame.add(OCo[1][47]);
		
		JPanel o1_46 = new JPanel();
		o1_46.setBackground(new Color(0, 0, 0, 0));
		o1_46.setBounds(380, 490, 40, 40);
		OCo[1][46] = o1_46;
		PanelGame.add(OCo[1][46]);
		
		JPanel o3_04 = new JPanel();
		o3_04.setBackground(new Color(0, 0, 0, 0));
		o3_04.setBounds(340, 490, 40, 40);
		OCo[3][4] = o3_04;
		PanelGame.add(OCo[3][4]);
		
		JPanel o1_36 = new JPanel();
		o1_36.setBackground(new Color(0, 0, 0, 0));
		o1_36.setBounds(300, 490, 40, 40);
		OCo[1][36] = o1_36;
		PanelGame.add(OCo[1][36]);
		
		JPanel o1_37 = new JPanel();
		o1_37.setBackground(new Color(0, 0, 0, 0));
		o1_37.setBounds(300, 530, 40, 40);
		OCo[1][37] = o1_37;
		PanelGame.add(OCo[1][37]);
		
		JPanel o3_03 = new JPanel();
		o3_03.setBackground(new Color(0, 0, 0, 0));
		o3_03.setBounds(340, 530, 40, 40);
		OCo[3][3] = o3_03;
		PanelGame.add(OCo[3][3]);
		
		JPanel o1_45 = new JPanel();
		o1_45.setBackground(new Color(0, 0, 0, 0));
		o1_45.setBounds(380, 530, 40, 40);
		OCo[1][45] = o1_45;
		PanelGame.add(OCo[1][45]);
		
		JPanel o1_44 = new JPanel();
		o1_44.setBackground(new Color(0, 0, 0, 0));
		o1_44.setBounds(380, 570, 40, 40);
		OCo[1][44] = o1_44;
		PanelGame.add(OCo[1][44]);
	
		JPanel o3_02 = new JPanel();
		o3_02.setBackground(new Color(0, 0, 0, 0));
		o3_02.setBounds(340, 570, 40, 40);
		OCo[3][2] = o3_02;
		PanelGame.add(OCo[3][2]);
		
		JPanel o1_38 = new JPanel();
		o1_38.setBackground(new Color(0, 0, 0, 0));
		o1_38.setBounds(300, 570, 40, 40);
		OCo[1][38] = o1_38;
		PanelGame.add(OCo[1][38]);
		
		JPanel o1_39 = new JPanel();
		o1_39.setBackground(new Color(0, 0, 0, 0));
		o1_39.setBounds(300, 610, 40, 40);
		OCo[1][39] = o1_39;
		PanelGame.add(OCo[1][39]);
		
		JPanel o3_01 = new JPanel();
		o3_01.setBackground(new Color(0, 0, 0, 0));
		o3_01.setBounds(340, 610, 40, 40);
		OCo[3][1] = o3_01;
		PanelGame.add(OCo[3][1]);
		
		JPanel o1_43 = new JPanel();
		o1_43.setBackground(new Color(0, 0, 0, 0));
		o1_43.setBounds(380, 610, 40, 40);
		OCo[1][43] = o1_43;
		PanelGame.add(OCo[1][43]);
		
		JPanel o1_42 = new JPanel();
		o1_42.setBackground(new Color(0, 0, 0, 0));
		o1_42.setBounds(380, 650, 40, 40);
		OCo[1][42] = o1_42;
		PanelGame.add(OCo[1][42]);
		
		JPanel o1_41 = new JPanel();
		o1_41.setBackground(new Color(0, 0, 0, 0));
		o1_41.setBounds(340, 650, 40, 40);
		OCo[1][41] = o1_41;
		PanelGame.add(OCo[1][41]);
		
		JPanel o1_40 = new JPanel();
		o1_40.setBackground(new Color(0, 0, 0, 0));
		o1_40.setBounds(300, 650, 40, 40);
		OCo[1][40] = o1_40;
		PanelGame.add(OCo[1][40]);
		
		JPanel o1_06 = new JPanel();
		o1_06.setBackground(new Color(0, 0, 0, 0));
		o1_06.setBounds(420, 260, 40, 40);
		OCo[1][6] = o1_06;
		PanelGame.add(OCo[1][6]);
		
		JPanel o1_20 = new JPanel();
		o1_20.setBackground(new Color(0, 0, 0, 0));
		o1_20.setBounds(260, 260, 40, 40);
		OCo[1][20] = o1_20;
		PanelGame.add(OCo[1][20]);
		
		JPanel o1_34 = new JPanel();
		o1_34.setBackground(new Color(0, 0, 0, 0));
		o1_34.setBounds(260, 420, 40, 40);
		OCo[1][34] = o1_34;
		PanelGame.add(OCo[1][34]);
		
		JPanel o1_48 = new JPanel();
		o1_48.setBackground(new Color(0, 0, 0, 0));
		o1_48.setBounds(420, 420, 40, 40);
		OCo[1][48] = o1_48;
		PanelGame.add(OCo[1][48]);
		
		JPanel o2_06 = new JPanel();
		o2_06.setBackground(new Color(0, 0, 0, 0));
		o2_06.setBounds(400, 340, 40, 40);
		OCo[2][6] = o2_06;
		PanelGame.add(OCo[2][06]);
		
		JPanel o3_06 = new JPanel();
		o3_06.setBackground(new Color(0, 0, 0, 0));
		o3_06.setBounds(340, 380, 40, 40);
		OCo[3][6] = o3_06;
		PanelGame.add(OCo[3][6]);
		
		JPanel o4_06 = new JPanel();
		o4_06.setBackground(new Color(0, 0, 0, 0));
		o4_06.setBounds(289, 340, 40, 40);
		OCo[4][6] = o4_06;
		PanelGame.add(OCo[4][6]);
		
		JPanel o5_06 = new JPanel();
		o5_06.setBackground(new Color(0, 0, 0, 0));
		o5_06.setBounds(340, 281, 40, 40);
		OCo[5][6] = o5_06;
		PanelGame.add(OCo[5][6]);
		
		JPanel o0_00 = new JPanel();
		o0_00.setBackground(new Color(0, 0, 0, 0));
		o0_00.setBounds(490, 43, 40, 40);
		OCo[0][0] = o0_00;
		PanelGame.add(OCo[0][0]);
		
		JPanel o0_01 = new JPanel();
		o0_01.setBackground(new Color(0, 0, 0, 0));
		o0_01.setBounds(620, 43, 40, 40);
		OCo[0][1] = o0_01;
		PanelGame.add(OCo[0][1]);
		
		JPanel o0_02 = new JPanel();
		o0_02.setBackground(new Color(0, 0, 0, 0));
		o0_02.setBounds(490, 190, 40, 40);
		OCo[0][2] = o0_02;
		PanelGame.add(OCo[0][2]);
		
		JPanel o0_03 = new JPanel();
		
		o0_03.setBackground(new Color(0, 0, 0, 0));
		o0_03.setBounds(620, 190, 40, 40);
		OCo[0][3] = o0_03;
		PanelGame.add(OCo[0][3]);
		
		JPanel o0_04 = new JPanel();
		o0_04.setBackground(new Color(0, 0, 0, 0));
		o0_04.setBounds(490, 490, 40, 40);
		OCo[0][4] = o0_04;
		PanelGame.add(OCo[0][4]);
		
		JPanel o0_05 = new JPanel();
		o0_05.setBackground(new Color(0, 0, 0, 0));
		o0_05.setBounds(620, 490, 40, 40);
		OCo[0][5] = o0_05;
		PanelGame.add(OCo[0][5]);
		
		JPanel o0_06 = new JPanel();
		o0_06.setBackground(new Color(0, 0, 0, 0));
		o0_06.setBounds(620, 637, 40, 40);
		OCo[0][6] = o0_06;
		PanelGame.add(OCo[0][6]);
		
		JPanel o0_07 = new JPanel();
		o0_07.setBackground(new Color(0, 0, 0, 0));
		o0_07.setBounds(490, 637, 40, 40);
		OCo[0][7] = o0_07;
		PanelGame.add(OCo[0][7]);
		
		JPanel o0_08 = new JPanel();
		o0_08.setBackground(new Color(0, 0, 0, 0));
		o0_08.setBounds(48, 490, 40, 40);
		OCo[0][8] = o0_08;
		PanelGame.add(OCo[0][8]);
		
		JPanel o0_09 = new JPanel();
		o0_09.setBackground(new Color(0, 0, 0, 0));
		o0_09.setBounds(178, 490, 40, 40);
		OCo[0][9] = o0_09;
		PanelGame.add(OCo[0][9]);
		
		JPanel o0_10 = new JPanel();
		o0_10.setBackground(new Color(0, 0, 0, 0));
		o0_10.setBounds(178, 637, 40, 40);
		OCo[0][10] = o0_10;
		PanelGame.add(OCo[0][10]);
		
		JPanel o0_11 = new JPanel();
		o0_11.setBackground(new Color(0, 0, 0, 0));
		o0_11.setBounds(48, 637, 40, 40);
		OCo[0][11] = o0_11;
		PanelGame.add(OCo[0][11]);
		
		JPanel o0_12 = new JPanel();
		o0_12.setBackground(new Color(0, 0, 0, 0));
		o0_12.setBounds(60, 43, 40, 40);
		OCo[0][12] = o0_12;
		PanelGame.add(OCo[0][12]);
		
		JPanel o0_13 = new JPanel();
		o0_13.setBackground(new Color(0, 0, 0, 0));
		o0_13.setBounds(190, 43, 40, 40);
		OCo[0][13] = o0_13;
		PanelGame.add(OCo[0][13]);
		
		JPanel o0_14 = new JPanel();
		o0_14.setBackground(new Color(0, 0, 0, 0));
		o0_14.setBounds(190, 190, 40, 40);
		OCo[0][14] = o0_14;
		PanelGame.add(OCo[0][14]);
		
		JPanel o0_15 = new JPanel();
		o0_15.setBackground(new Color(0, 0, 0, 0));
		o0_15.setBounds(60, 190, 40, 40);
		OCo[0][15] = o0_15;
		PanelGame.add(OCo[0][15]);	
		
		for (int i=0;i<6;i++)
			for (int j=0;j<56;j++)
				if (OCo[i][j] !=null)
					OCo[i][j].setSize(0, 0);
		
		this.Co =  new JButton[this.iSoNguoi*4];
		
		for (Integer i=0;i<this.iSoNguoi*4;i++) {
			JButton tam = new JButton();
			tam.setLocation(OCo[0][i].getLocation());
			tam.setSize(40, 40);
			//System.out.println(ToaDo[0][i].height);
			Integer ichess = i/4;
			switch (ichess) {
			case 0:
				tam.setBorder(new LineBorder(Color.GREEN,3));
				break;
			case 1:
				tam.setBorder(new LineBorder(Color.RED,3));
				break;
			case 2:
				tam.setBorder(new LineBorder(Color.BLUE,3));
				break;
			case 3:
				tam.setBorder(new LineBorder(Color.YELLOW,3));
				break;
			default:
				break;
			}
			tam.setIcon(new ImageIcon("chess"+ichess.toString()+".png"));
			tam.setBackground(new Color(0, 0, 0, 0));
			tam.setToolTipText(i.toString());
			tam.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int iQuanCo = Integer.parseInt(((JButton)e.getSource()).getToolTipText());
					int biXoa = CoCaNgua.Xoa(iQuanCo, iXucSac);
					if (biXoa != -1) {
						//OCo[0][biXoa].add(Co[biXoa]);
						Co[biXoa].setLocation(OCo[0][biXoa].getLocation());
					}
					//OCo[CoCaNgua.QuanCo[iQuanCo][0]][CoCaNgua.QuanCo[iQuanCo][1]].removeAll();
					int vt = CoCaNgua.DiCo(iQuanCo, iXucSac);
					Co[iQuanCo].setLocation(OCo[vt/100][vt%100].getLocation());
					//OCo[vt/100][vt%100].add(Co[iQuanCo]);
					if (iXucSac == 6 || iXucSac == 1)
					{}
					else {
						iLuot++;
						iLuot%=iSoNguoi;
					}
					for (int i=0;i<iSoNguoi*4;i++)
						Co[i].setEnabled(false);
					CoCaNgua.Check();
					DoiLuot();
					btnXoay.setEnabled(true);
				}
			
			});
			tam.setEnabled(false);
			Co[i] = tam;
			//OCo[0][i].add(Co[i]);
			PanelGame.add(Co[i]);
		
		}
		
		btnXoay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				iXucSac = random.nextInt(6) + 1;
				lblXucSac.setIcon(new ImageIcon("XucSac"+iXucSac.toString()+".png"));
				CoCaNgua.XucSac(iLuot+1,iXucSac);
				Boolean kt = true;
				for (int i=0;i<4;i++)
					if (CoCaNgua.QuanCoDiDuoc[i] != -1) {					
						Co[CoCaNgua.QuanCoDiDuoc[i]].setEnabled(true);
						kt = false;
					}
				if (kt==true) {
					if (iXucSac == 6 || iXucSac == 1)
					{}
					else {
						iLuot++;
						iLuot%=iSoNguoi;
					}
					CoCaNgua.Check();
					JOptionPane.showInternalMessageDialog(null, "Xoay được "+iXucSac+" không thể đi tiếp.");
					DoiLuot();
				}
				else {
					btnXoay.setEnabled(false);
				}
						
			}
		});
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("bgGame.png"));
		lblBg.setBounds(0, 0, 721, 721);
		PanelGame.add(lblBg);
		
		DoiLuot();
	}
	
	private void DoiLuot() {
		if (iLuot!=5) {
			if (CoCaNgua.ChessWin() !=-1){
				//JOptionPane.showInternalMessageDialog(null, "Cờ "+Doi(CoCaNgua.ChessWin()/4)+" đã thắng");
				new Wingame(CoCaNgua.ChessWin()/4);
				iLuot = 5;
				frame.setVisible(false);
				frame.dispose();
			}
			else {
				lblAvatar.setIcon(new ImageIcon("Avatar"+iLuot+".png"));
				lblAvatarBG.setIcon(new ImageIcon("AvatarBG"+iLuot+".png"));
				txtSoQuanXuatTran.setText(CoCaNgua.SoQuanXuatTran(iLuot).toString());
				txtHang.setText(CoCaNgua.Hang(iLuot).toString());
				txtDiemSo.setText(CoCaNgua.DiemSo(iLuot).toString());
				if (iLuot+1 >= this.iSoMay) {
					checkboxMay.setSelected(true);
					checkboxNguoi.setSelected(false);
					Random random = new Random();
					iXucSac = random.nextInt(6) + 1;
					lblXucSac.setIcon(new ImageIcon("XucSac"+iXucSac.toString()+".png"));
					CoCaNgua.XucSac(iLuot+1,iXucSac);
					Boolean kt = true;
					for (int i=0;i<4;i++)
						if (CoCaNgua.QuanCoDiDuoc[i] != -1) {					
							int iQuanCo = CoCaNgua.QuanCoDiDuoc[i];
							JOptionPane.showInternalMessageDialog(null,"Cờ "+Doi(iLuot)+" xoay được "+iXucSac+" đi tiếp.");
							int biXoa = CoCaNgua.Xoa(iQuanCo, iXucSac);
							if (biXoa != -1) {
								Co[biXoa].setLocation(OCo[0][biXoa].getLocation());
							}
							int vt = CoCaNgua.DiCo(iQuanCo, iXucSac);
							Co[iQuanCo].setLocation(OCo[vt/100][vt%100].getLocation());
							if (iXucSac == 6 || iXucSac == 1)
							{}
							else {
								iLuot++;
								iLuot%=iSoNguoi;
							}
							CoCaNgua.Check();
							kt = false;
							break;
						}
						
					if (kt==true) {
						JOptionPane.showInternalMessageDialog(null, "Cờ "+Doi(iLuot)+" xoay được "+iXucSac+" không thể đi tiếp.");
						if (iXucSac == 6 || iXucSac == 1)
						{}
						else {
							iLuot++;
							iLuot%=iSoNguoi;
						}
						CoCaNgua.Check();
					}
					DoiLuot();
				}
				else {
					checkboxMay.setSelected(false);
					checkboxNguoi.setSelected(true);
				}
			}
		}
	}
	
	private String Doi(int i) {
		switch (i) {
		case 0:
			return "xanh";
		case 1:
			return "đỏ";
		case 2:
			return "lục";
		case 3:
			return "vàng";
		}
		return "";
	}
}
