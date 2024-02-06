package lab01;
import java.util.Scanner;
// Luu Viet Hoan
// 20215054
public class EX6_2_InputFromKeyboard {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();// nhap ten
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt(); // nhap tuoi
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble(); // nhap chieu cao
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");
		// in ra cac thong so vua nhap
	}
}
