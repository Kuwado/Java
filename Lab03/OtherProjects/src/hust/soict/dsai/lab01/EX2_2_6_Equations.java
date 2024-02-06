package lab01;
import java.util.Scanner;
// Luu Viet Hoan
// 20215054
public class EX2_2_6_Equations {		
	public static void ptb1() {   // ham giai pt bac nhat
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = input.nextDouble();
		System.out.print("Nhap b: ");
		double b = input.nextDouble();
		System.out.print("Phuong trinh bac nhat: " + a + "*x + " + b + " = 0\n");
		if (a == 0) {
			System.out.print("pt vo nghiem\n"); // neu he so a = 0 thi pt vo nghiem
		}
		else {
			double x = -b/a;
			System.out.print("pt co nghiem duy nhat la: x = " + x + "\n"); // nguoc lai pt co nghiem là -b/a
		}
	}
		
	public static void hptb1(){
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap a11: ");
		double a = input.nextDouble();
		System.out.print("Nhap a12: ");
		double b = input.nextDouble();
		System.out.print("Nhap a21: ");
		double c = input.nextDouble();
		System.out.print("Nhap a22: ");
		double d = input.nextDouble();
		System.out.print("Nhap b11: "); // a + b = e
		double e = input.nextDouble();
		System.out.print("Nhap b22: "); // c + d = f
		double f = input.nextDouble();
		System.out.print("He pt: " + a + "*x + " + b + "*y = " + e + "; " + c + "*x + " + d + "*y = " + f  + "\n");
		double dt = a*d - c*b;  // dinh thuc D
		double dtx = e*d - f*b; // dinh thuc Dx
		double dty = a*f - c*e; // dinh thuc Dy
		if ( dt != 0) {
			double x = dtx/dt; // neu D khac 0 thi x = Dx/D
			double y = dty/dt; // va y = Dy/D
			System.out.print("He phuong trinh co nghiem duy nhat: (" + x + " ;" + y + " )\n");
		}
		else {// nguoc lai neu D = 0
			if (dtx != 0 || dty !=0) { 
				System.out.print("He phuong trinh vo nghiem\n");// neu Dx hoac Dy khac 0 thi hpt vo nghiem
			}
			else {
				System.out.print("He phuong trinh co vo so nghiem\n");// nguoc lai co vo so nghiem
			}}
	}
		
	public static void ptb2(){
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = input.nextDouble();
		System.out.print("Nhap b: ");
		double b = input.nextDouble();
		System.out.print("Nhap c: ");
		double c = input.nextDouble();
		double denta = b*b - 4*a*c;
		System.out.print("Pt bac 2: " + a + "*x^2 + " + b + "*x + " + c + " = 0\n");
		if (denta < 0) {
			System.out.print("Phuong trinh vo nghiem\n"); // neu denta < 0 pt vo nghiem
		}
		else
			if (denta == 0) {
				double x = -b/(2*a);// neu denta = 0 pt co nghiem kep
				System.out.print("Phuong trinh co nghiem kep: x = " + x + "\n");
			}
			else {
			double x1 = ((-b + Math.sqrt(denta))/(2*a));
			double x2 = ((-b - Math.sqrt(denta))/(2*a));
			System.out.print("Phuong trinh co 2 nghiem : x1 = " + x1 + " ,x2 = " + x2 + "\n"); // nguoc lai co 2 nghiem phan biet
			} 
	}
		
	public static void main(String[] args){
			int n;
			do { // vong lap thuc hien menu
			Scanner input = new Scanner(System.in);
			System.out.print("1. Phuong trinh bac nhat: ax + b = 0\n");
			System.out.print("2. He phuong trinh bac nhat a11x1 + a12x2 = b1; a21x1 + a22x2 = b2\n");
			System.out.print("3. Phuong trinh bac hai ax^2 + bx + c = 0\n");
			System.out.print("Khac: Thoat chuong trinh\n");
			System.out.print("Nhap lua chon: ");
			n = input.nextInt();
			switch ( n ) {
				case 1:
					ptb1(); // thuc hien ham ptb1
					break;
				case 2:
					hptb1(); // thuc hien ham hptb1
					break;
				case 3:
					ptb2(); // thuc hien ham ptb2
					break;
				default:
					break;
			}
		}while (1<= n && n <= 3); // chuong trinh ket thuc neu option khong phai 1, 2, 3
	}
}

