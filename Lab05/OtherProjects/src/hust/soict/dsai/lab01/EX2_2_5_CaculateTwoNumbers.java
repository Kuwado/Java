package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
// Luu Viet Hoan
// 20215054
public class EX2_2_5_CaculateTwoNumbers {
		public static void main (String[] args){
			String strNum1, strNum2;
			double num1, num2;
			do{
				strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
				num1 = Double.parseDouble(strNum1); // nhap so thu nhat

				strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
				num2 = Double.parseDouble(strNum2); // nhap so thu 2

				// tinh toan 
				if (num2 == 0){
					JOptionPane.showMessageDialog(null, "Division by zero is not allowed", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					double sum = num1 + num2; // tong
					double difference = num1 - num2; // hieu
					double product = num1 * num2; // tich
					double quotient = num1 / num2; // thuong 
					String result = "Sum: " + sum + "\n" + "Difference: " + difference + "\n" + "Product: " + product + "\n" + "Quotient: " + quotient + "\n";
					JOptionPane.showMessageDialog(null,result, "Result", JOptionPane.INFORMATION_MESSAGE);
				}
			}while(num2==0); // neu so thu 2 la 0 se bao loi va nhap lai
			System.exit(0);
	}
}
