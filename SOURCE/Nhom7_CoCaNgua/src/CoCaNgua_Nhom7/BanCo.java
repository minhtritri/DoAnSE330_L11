package CoCaNgua_Nhom7;

public class BanCo {
    public int[][] QuanCo;
    public int[] QuanCoDiDuoc;
    public int soquanco;
    public int iSophe;
    //QuanCo[0][0]: toạ dô x quân lục số 1
    //QuanCo[0][1]: toạ độ y của quân lục số 1
    //QuanCo[0][2]: số bước của quân lục số 1

    public BanCo(int SoPhe, int SoMay){
        QuanCoDiDuoc = new int[4];
        soquanco = SoPhe * 4;
        iSophe = SoPhe;
        QuanCo = new int[soquanco][3];
        for(int i = 0; i< soquanco; i++){
            QuanCo[i][0] = 0;
            QuanCo[i][1] = i;
            QuanCo[i][2] = 0;
        }
        for (int i=0;i<4;i++) {
        	QuanCoDiDuoc[i] = -1;
        }
        
    }
    //trả về quân cờ đi được VD QuanCoDiDuong = {0,1,-1,-1}
    public void XucSac(int luot, int Xucxac){
    	System.out.println(luot+" "+Xucxac + "*");
        switch (luot){
            case 1://phe luc
                for(int i = 0; i <=3; i++){

                    if(KiemTraBuoc(i, Xucxac) == true){
                        QuanCoDiDuoc[i] = i;
                    }else{
                        QuanCoDiDuoc[i] = -1;
                    }
                    System.out.println(QuanCo[i][0] + " " + QuanCo[i][1]);
                }
                break;
            case 2: // phe do
                for(int i = 0; i <= 3; i++){
                    if(KiemTraBuoc(4+i, Xucxac) == true){
                        QuanCoDiDuoc[i] = 4+i;
                    }else{
                        QuanCoDiDuoc[i] = -1;
                    }
                }
                break;
            case 3: // phe lam
                for(int i = 0; i<=3; i++){
                    if(KiemTraBuoc(8+i, Xucxac) == true){
                        QuanCoDiDuoc[i] = 8+i;
                    }
                    else{
                        QuanCoDiDuoc[i] = -1;
                    }
                }
                break;
            case 4:// phe vang
                for (int i = 0; i <= 3 ; i++) {
                    if(KiemTraBuoc(12+i,Xucxac) == true){
                        QuanCoDiDuoc[i] = 12+i;
                    }else{
                        QuanCoDiDuoc[i] = -1;
                    }
                }
                break;
        }
    }
    public void XuatQuan(int quanco){
        if(quanco >=0 && quanco <=3){
            QuanCo[quanco][0] = 1;
            QuanCo[quanco][1] = 0;
            QuanCo[quanco][2] = 0;
        }else if(quanco >= 4 && quanco <= 7){
            QuanCo[quanco][0] = 1;
            QuanCo[quanco][1] = 42;
            QuanCo[quanco][2] = 0;
        }else if(quanco >= 8 && quanco <= 11){
            QuanCo[quanco][0] =  1 ;
            QuanCo[quanco][1] = 28;
            QuanCo[quanco][2] = 0;
        }else{
            QuanCo[quanco][0] = 1;
            QuanCo[quanco][1] = 14;
            QuanCo[quanco][2] = 0;
        }




    }

    public void Dimotbuoc(int quanco){
        if(QuanCo[quanco][2]==55){
            if(quanco<=3){//lục
                QuanCo[quanco][0] = 2;
                QuanCo[quanco][1] = 0;
            }else if(quanco >3 && quanco <=7){// do
                QuanCo[quanco][0] = 3;
                QuanCo[quanco][1] = 0;
            }else if(quanco >7 && quanco <=11){// lam
                QuanCo[quanco][0] = 4;
                QuanCo[quanco][1] = 0;
            }else{//vang
                QuanCo[quanco][0] = 5;
                QuanCo[quanco][1] = 0;
            }
        }
        QuanCo[quanco][1]++;
        QuanCo[quanco][2]++;
        QuanCo[quanco][1]%=56;
        //if(QuanCo[quanco][1] == 55 && QuanCo[quanco][2] != 55){
        //    QuanCo[quanco][1] = 0;
        //}

    }
    
    public boolean KiemTraBuoc(int quanco, int Xucxac){
        int xCu = QuanCo[quanco][0];
        int yCu = QuanCo[quanco][1];
        int buocCu = QuanCo[quanco][2];
        if((QuanCo[quanco][2] + Xucxac <= 55) || ((QuanCo[quanco][2] == 55) && ((QuanCo[quanco][2] + Xucxac) <= 61)) ||
                ((QuanCo[quanco][2] > 55) && (QuanCo[quanco][2] + Xucxac <=61))){

            if(QuanCo[quanco][0] == 0 && Xucxac == 6 || QuanCo[quanco][0] == 0 && Xucxac == 1 ){
                XuatQuan(quanco);
                for(int i = 0; i< soquanco; i++){
                    if(quanco == i){

                    }
                    else if(QuanCo[quanco][0] == QuanCo[i][0] && QuanCo[quanco][1] == QuanCo[i][1]){
                        QuanCo[quanco][0] = xCu;
                        QuanCo[quanco][1] = yCu;
                        QuanCo[quanco][2] = buocCu;
                        System.out.println("loi");
                        return false;
                    }
                }
                QuanCo[quanco][0] = xCu;
                QuanCo[quanco][1] = yCu;
                QuanCo[quanco][2] = buocCu;
                System.out.println("dung");
                return true;
            }else if(QuanCo[quanco][0] == 1 || QuanCo[quanco][0] == 2 || QuanCo[quanco][0] == 3 || QuanCo[quanco][0] == 4 || QuanCo[quanco][0] == 5){
                for(int m = 1; m <= Xucxac; m++){
                    Dimotbuoc(quanco);
                    if(m <= Xucxac - 1){
                        for(int i = 0; i<soquanco; i++){
                            if(quanco == i){

                            }else if(QuanCo[quanco][1] == QuanCo[i][1] && QuanCo[quanco][0]==QuanCo[i][0]){
                                QuanCo[quanco][0] = xCu;
                                QuanCo[quanco][1] = yCu;
                                QuanCo[quanco][2] = buocCu;
                                System.out.println("loi bi chan");
                                return false;
                            }
                        }
                    }else{
                        for(int i = 0; i<soquanco; i++){
                            if(quanco <= 3 && i <= 3 || quanco > 3 && quanco <8 && i> 3 && i < 8 ||
                            quanco >= 8 && quanco <12 && i >= 8 && i < 12 || quanco >=12 && i >=12){
                                if(quanco != i && QuanCo[quanco][1] == QuanCo[i][1] && QuanCo[quanco][0]==QuanCo[i][0]){
                                    QuanCo[quanco][0] = xCu;
                                    QuanCo[quanco][1] = yCu;
                                    QuanCo[quanco][2] = buocCu;
                                    System.out.println("loi bi chan boi quan cung mau");
                                    return false;
                                }else if(quanco == i) {

                                }
                            }else{
                                if( QuanCo[quanco][1] == QuanCo[i][1] && QuanCo[quanco][0]==QuanCo[i][0]){
                                    QuanCo[quanco][0] = xCu;
                                    QuanCo[quanco][1] = yCu;
                                    QuanCo[quanco][2] = buocCu;
                                    return true;
                                }
                            }
                        }

                    }

                }
                QuanCo[quanco][0] = xCu;
                QuanCo[quanco][1] = yCu;
                QuanCo[quanco][2] = buocCu;
                return true;
            }

        }
        QuanCo[quanco][0] = xCu;
        QuanCo[quanco][1] = yCu;
        QuanCo[quanco][2] = buocCu;
        System.out.println("loi cuoi");
        return false;
    }

    public int Xoa(int quanco, int Xucsac){
    	int q0,q1,q2;
    	q0= this.QuanCo[quanco][0];
    	q1= this.QuanCo[quanco][1];
    	q2= this.QuanCo[quanco][2];
        for(int m = 1; m <= Xucsac; m++){
            Dimotbuoc(quanco);
        }
        int coxoa = -1;
        for (int i = 0; i < soquanco; i++) {
            if(QuanCo[quanco][0] == QuanCo[i][0] && QuanCo[quanco][1] == QuanCo[i][1] && i!=quanco){
                coxoa = i;
            }
        }
        if (coxoa!=-1) {
	        QuanCo[coxoa][0] = 0;
	        QuanCo[coxoa][1] = coxoa;
	        QuanCo[coxoa][2] = 0;
        }
        
        this.QuanCo[quanco][0] = q0;
    	this.QuanCo[quanco][1] = q1;
    	this.QuanCo[quanco][2] = q2;
        if(coxoa != -1)
        	System.out.println("Có cờ bị đá");
        return coxoa;
    }

    public int DiCo(int quanco, int Xucsac){
        if(Xucsac == 1 && QuanCo[quanco][0] == 0 || Xucsac ==6 && QuanCo[quanco][0] == 0){
            XuatQuan(quanco);
        }
        else{
            for(int m = 1; m <= Xucsac; m++){
                Dimotbuoc(quanco);
            }
        }

        int toado = QuanCo[quanco][0] *100+ QuanCo[quanco][1];
        return toado;
    }

    public int ChessWin(){
        for(int i = 0; i< soquanco; i++){
            if(QuanCo[i][2] == 61){
                return i;
            }
        }
        return -1;
    }

    public void Check() {
    	for (int i=0;i<soquanco;i++){
    		System.out.println(i+" "+QuanCo[i][0]+" "+QuanCo[i][1]+" "+QuanCo[i][2]);
    	}
    }
    
    public Integer SoQuanXuatTran(int phe) {
    	int TongSoQuanXuatTran = 0;
    	for (int i=0;i<4;i++) 
    		if (QuanCo[i+phe*4][0]!=0)
    			TongSoQuanXuatTran++;
    	return TongSoQuanXuatTran;
    }
    
    public Integer DiemSo(int phe) {
    	int TongDiemSo = 0;
    	for (int i=0;i<4;i++)
    		TongDiemSo+= QuanCo[i+phe*4][2];
    	return TongDiemSo;
    }
    
    public Integer Hang(int phe) {
		int iHang =1;
		for (int i=0;i<iSophe;i++)
			if (i!=phe)
				if (DiemSo(i)>DiemSo(phe))
					iHang++;
		return iHang;
	}
}
