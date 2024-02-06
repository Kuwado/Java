package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
// Luu Viet Hoan
// 20215054
public class EX6_1_ChoosingOption {
	   public static void main(String[] args) {
	       int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");// in ra hop thoai
	       JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "YES" : "NO"));// lua chon yes hoac no
	       System.exit(0);
	   }
}



