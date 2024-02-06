package lab01;
import javax.swing.JOptionPane;
// Luu Viet Hoan
// 20215054
public class EX2_2_4_ShowTwoNumbers {
		public static void main (String[] args){
			String strNum1, strNum2;
			String strNotification = "You 've just entered: ";
			strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
			strNotification += strNum1 + " and "; // hien thi hop thoai nhap so thu nhat

			strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
			strNotification += strNum2; // hien thi hop thoai nhap so thu 2

			JOptionPane.showMessageDialog(null,strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE); // hien thi 2 so da nhap
			System.exit(0);
	}

}
