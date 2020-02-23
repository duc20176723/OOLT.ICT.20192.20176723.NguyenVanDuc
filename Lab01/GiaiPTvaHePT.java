import javax.swing.JOptionPane;
public class GiaiPTvaHePT{
    public static void main(String[] args){
        String Chon;
        int chon;
        do{
        Chon = JOptionPane.showInputDialog(null,"1.Giai PT bac nhat mot an.\n" +
            "2.Giai he PT bac nhat 2 an.\n" +
            "3.Giai PT bac 2 mot an.\n" +
            "4.Thoat.\n" +
            "----------------------------\n" +
            "Lua chon cua ban: ","MENU",JOptionPane.INFORMATION_MESSAGE);
        chon = Integer.parseInt(Chon);
        switch (chon){
            case 1:{
                String a, b;
                double x;
                String strPT = "Giai phuong trinh bac nhat co dang: aX + b = 0";
                JOptionPane.showMessageDialog(null,
                    strPT,"Yeu cau",JOptionPane.INFORMATION_MESSAGE);
                a = JOptionPane.showInputDialog(null,
                    "nhap a: ","hay nhap so a(a khac 0)",
                    JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(a);
                if(num1 != 0){
                b = JOptionPane.showInputDialog(null,
                    "nhap b: ","hay nhap so b",
                    JOptionPane.INFORMATION_MESSAGE);
                double num2 = Double.parseDouble(b);
                x = (-num2)/num1;
                JOptionPane.showMessageDialog(null,
                    "X = " + x,"Ket qua cua X: ",
                    JOptionPane.INFORMATION_MESSAGE);
                }else JOptionPane.showMessageDialog(null,
                    "a phai khac 0.","Ban nhap khong hop le!",
                    JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case 2:{
                String a11, a12, b1, a21, a22, b2;
                double x1, x2;
                String strHePT = "Giai he phuong trinh bac nhat 2 an co dang:\n" + 
                    "a11X1 + a12X2 = b1 va a21X1 + a22X2 = b2";
                JOptionPane.showMessageDialog(null,
                    strHePT,"Yeu cau",JOptionPane.INFORMATION_MESSAGE);
                a11 = JOptionPane.showInputDialog(null,
                    "Nhap a11: ","Ban hay nhap vao a11 cua he: ",
                    JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(a11);
                a12 = JOptionPane.showInputDialog(null,
                    "Nhap a12: ","Ban hay nhap vao a12 cua he: ",
                    JOptionPane.INFORMATION_MESSAGE);
                double num2 = Double.parseDouble(a12);
                b1 = JOptionPane.showInputDialog(null,
                    "Nhap b1: ","Ban hay nhap vao b1 cua he: ",
                    JOptionPane.INFORMATION_MESSAGE);
                double num3 = Double.parseDouble(b1);
                a21 = JOptionPane.showInputDialog(null,
                    "Nhap a21: ","Ban hay nhap vao a21 cua he: ",
                    JOptionPane.INFORMATION_MESSAGE);
                double num4 = Double.parseDouble(a21);
                a22 = JOptionPane.showInputDialog(null,
                    "Nhap a22: ","Ban hay nhap vao a22 cua he: ",
                    JOptionPane.INFORMATION_MESSAGE);
                double num5 = Double.parseDouble(a22);
                b2 = JOptionPane.showInputDialog(null,
                    "Nhap b2: ","Ban hay nhap vao b2 cua he: ",
                    JOptionPane.INFORMATION_MESSAGE);
                double num6 = Double.parseDouble(b2);
                double D = num1*num5 - num4*num2;
                double D1 = num3*num5 - num6*num2;
                double D2 = num1*num6 - num4*num3;
                if(D != 0){
                    x1 = D1/D;
                    x2 = D2/D;
                    JOptionPane.showMessageDialog(null,
                        "X1 = " + x1 +"\nX2 = " + x2,"Ket qua: ",
                        JOptionPane.INFORMATION_MESSAGE);
                }else JOptionPane.showMessageDialog(null,
                    "He thong khong co loi giai!");

                break;
            }
            case 3:{
                String a, b, c;
                String strPTBac2 = "Giai phuong trinh bac co dang: \naX^2 + bX +c = 0";
                JOptionPane.showMessageDialog(null,
                    strPTBac2,"Yeu cau",JOptionPane.INFORMATION_MESSAGE);
                a = JOptionPane.showInputDialog(null,
                    "Nhap a: ","Ban hay nhap vao gia tri a cua PT: ",
                    JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(a);
                if(num1 != 0){
                    b = JOptionPane.showInputDialog(null,
                        "Nhap b: ","Ban hay nhap gia tri b cua PT: ",
                        JOptionPane.INFORMATION_MESSAGE);
                    double num2 = Double.parseDouble(b);
                    c = JOptionPane.showInputDialog(null,
                        "Nhap c: ","Ban hay nhap gia tri c cua PT: ",
                        JOptionPane.INFORMATION_MESSAGE);
                    double num3 = Double.parseDouble(c);
                    double delta = num2*num2 - 4*num1*num3;
                    if(delta > 0){
                        double x1 = (-num2 + Math.sqrt(delta))/(2*num1);
                        double x2 = (-num2 - Math.sqrt(delta))/(2*num1);
                        JOptionPane.showMessageDialog(null,
                            "X1 = " + x1 + " va X2 = " + x2,"Ket qua",
                            JOptionPane.INFORMATION_MESSAGE);
                    }else if(delta == 0){
                        double x = (-num2)/(2*num1);
                        JOptionPane.showMessageDialog(null,
                            "X1=X2= " + x,"Ket qua",JOptionPane.INFORMATION_MESSAGE);
                    }else JOptionPane.showMessageDialog(null,
                    "He thong khong co loi giai.");

                }else JOptionPane.showMessageDialog(null,
                    "Gia tri a cua phuong trinh tren phai khac 0!","Ban nhap khong hop le!",
                    JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case 4: break;
            default: JOptionPane.showMessageDialog(null,
                "Hay nhap so trong MENU.","Ban nhap khong hop le!",
                JOptionPane.INFORMATION_MESSAGE);

        }
        }while(chon != 4);
        System.exit(0);
    }
}