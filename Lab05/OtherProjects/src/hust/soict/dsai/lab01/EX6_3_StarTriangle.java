package hust.soict.dsai.lab01;
import java.util.Scanner;
// Luu Viet Hoan
// 20215054
public class EX6_3_StarTriangle {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chieu cao: ");
		int h = input.nextInt(); // nhap chieu cao tam giac
		System.out.print("Tam giac hinh sao co do cao " + h + " la: \n");
		for(int i=0; i<h; i++) {
			int a = h - i -1; // a la so khoang trang den ngoi sao dau tien cua moi dong
			int b = 2*i + 1; // b la so ngoi sao cua moi dong
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			} // ve khoang trang
			for(int j=0; j<b; j++) {
				System.out.print("*");
			} // ve ky tu *
			System.out.print("\n"); // xuong dong
		}
	}
}
