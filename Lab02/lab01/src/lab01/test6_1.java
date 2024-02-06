package lab01;
import javax.swing.JOptionPane;
// Luu Viet Hoan
// 20215054
public class test6_1 {
	public static void main(String[] args) {
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(
                null,
                "Do you want to change to the first class ticket?", // thong diep hop thoai
                "Confirmation", // tieu de hop thoai
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, // xac dinh 
                null,
                options, // lua chon yes hoac no
                options[0]); // lua chon yes

        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "YES" : "NO"));
        // neu chon yes thi se in ra bạn da chon yes, nguoc lai in ra da chon no
        System.exit(0);
    }
}

