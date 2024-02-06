package lab01;
import java.util.Scanner;
// Luu Viet Hoan
// 20215054
public class EX6_6_SumOf2Matrix {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("So hang cua ma tran: ");
		int n = scanner.nextInt();
		System.out.print("So cot cua ma tran: ");
		int m = scanner.nextInt();
		int[][] matrixA = new int[n][m]; 	// khoi tao ma tran A n hang m cot
		int[][] matrixB = new int[n][m];	// khoi tao ma tran B tuong tu A
		int[][] matrixSum = new int[n][m];	// khoi tao ma tran tong giong 2 ma tran A va B

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++ ) {
				System.out.print("Nhap phan tu mt A, hang " + (i+1) + " cot " + (j+1) + " : ");
				matrixA[i][j] = scanner.nextInt(); // nhap lan luot cac phan tu cua ma tran A
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++ ) {
				System.out.print("Nhap phan tu mt B, hang " + (i+1) + " cot " + (j+1) + " : ");
				matrixB[i][j] = scanner.nextInt(); // nhap lan luot cac phan tu cua ma tran B
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++ ) {
				matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];// cong tuong ung cac phan tu cua hai ma tran A va B
				System.out.print(matrixSum[i][j] + " "); // in ma tran tong
			}
			System.out.print("\n");
		}
	}
}
