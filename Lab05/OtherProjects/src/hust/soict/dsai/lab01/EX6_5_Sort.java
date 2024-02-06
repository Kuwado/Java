package hust.soict.dsai.lab01;
import java.util.Scanner;
// Luu Viet Hoan
// 20215054
public class EX6_5_Sort {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.print("Nhap so phan tu: ");
		int n = scanner.nextInt();
		int[] arr = new int[n]; // khai bao mang n phan tu
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i+1) + ": "); // vong lap nhap lan luot tung phan tu
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) { // sap xep
				if (arr[i] > arr[j]) { // neu phan tu trai > phan tu phai --> doi cho
					int m = arr[i];
					arr[i] = arr[j];
					arr[j] = m;
				}
			}
		}
		
		System.out.print("Day so sau khi sap xep: ");
		for (int i = 0; i < n; i++) {
			sum += arr[i]; // tinh tong cac phan tu
			System.out.print(arr[i] + " "); // in lan luot cac phan tu khi da sap xep xong
		}
		double tb = (double) sum/n; // trung binh cong cua say so
		System.out.print("Trung binh cong: " + tb );
	}
}

