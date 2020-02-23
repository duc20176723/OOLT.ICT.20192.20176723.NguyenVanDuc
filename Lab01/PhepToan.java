import javax.swing.JOptionPane;
public class PhepToan{
    public static void main(String args[]){
        String strNum1, strNum2;
        double Tong, Hieu, Nhan, Chia;
        strNum1 = JOptionPane.showInputDialog(null,
            "Please input the first number; ", "Input the first number",
            JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
            "Please input the second number: " ,"Input the second number",
            JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        
        Tong = num1 + num2;

        Hieu = num1 - num2;
        
        Nhan = num1 * num2;
        
        Chia = num1/num2;
        
        JOptionPane.showMessageDialog(null,
            "Tong cua 2 so " + num1 + " va " + num2 + " la: " + Tong
            + "\nHieu cua 2 so " + num1 + " va " +num2 + " la: " + Hieu
            + "\nTich cua 2 so " + num1 + " va " +num2 + " la: " + Nhan
            + "\nThuong cua 2 so " + num1 + " va " +num2 + " la: " + Chia,"Ket qua: ",
            JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}