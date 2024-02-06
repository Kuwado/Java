package lab01;
import javax.swing.JOptionPane;
// Luu Viet Hoan
// 20215054
public class EX2_2_3_HelloNameDialog {
		public static void main(String[] args) {
			String result;
			result = JOptionPane.showInputDialog("Please enter your name: "); // hien thi hop thoai
			JOptionPane.showMessageDialog(null, "Hi "+ result + "!"); // hien thi ket qua
			System.exit(0);
	}
}

