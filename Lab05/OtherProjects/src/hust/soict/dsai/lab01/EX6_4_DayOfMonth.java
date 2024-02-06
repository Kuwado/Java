package hust.soict.dsai.lab01;
import java.util.Scanner;
// Luu Viet Hoan - 20215054
public class EX6_4_DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month=0, year, day=0;
        boolean checkyear = true, checkmonth = true;
        
        do {
        	System.out.print("Nhap nam: ");
        	year = scanner.nextInt(); // nhap nam
        	if (0 < year && year <= 2023) {
        		checkyear = true; // neu nam thoa man thi se tiep tuc
        	}
        	else {
        		checkyear = false; // neu nam khong thoa man se lap de nhap lai
        		System.out.print("Nam khong hop le, nhap lai.\n");
        	}
        }while(!checkyear);
        
        do {
        	System.out.print("Nhap thang: ");
        	String inmonth = scanner.next(); // nhap thang
        	switch(inmonth) {
        		case "1":
        		case "January":
        		case "Jan":
        		case "Jan.":
        			month = 1;
        			checkmonth = true;
        			break;
        		case "2":
        		case "February":
        		case "Feb.":
        		case "Feb":
        			month = 2;
        			checkmonth = true;
        			break;
        		case "3":
        		case "March":
        		case "Mar.":
        		case "Mar":
        			month = 3;
        			checkmonth = true;
        			break;
        		case "4":
        		case "April":
        		case "Apr.":
        		case "Apr":
        			month = 4;
        			checkmonth = true;
        			break;
        		case "5":
        		case "May":
        			month = 5;
        			checkmonth = true;
        			break;
        		case "6":
        		case "June":
        		case "Jun":
        			month = 6;
        			checkmonth = true;
        			break;
        		case "7":
        		case "July":
        		case "Jul":
        			month = 7;
        			checkmonth = true;
        			break;
        		case "8":
        		case "August":
        		case "Aug.":
        		case "Aug":
        			month = 8;
        			checkmonth = true;
        			break;
        		case "9":
        		case "September":
        		case "Sept.":
        		case "Sep":
        			month = 9;
        			checkmonth = true;
        			break;
        		case "10":
        		case "October":
        		case "Oct.":
        		case "Oct":
        			month = 10;
        			checkmonth = true;
        			break;
        		case "11":
        		case "November":
        		case "Nov.":
        		case "Nov":
        			month = 11;
        			checkmonth = true;
        			break;
        		case "12":
        		case "December":
        		case "Dec.":
        		case "Dec":
        			month = 12;
        			checkmonth = true;
        			break;
        		default:
        			checkmonth = false; // neu thang khong thoa man se nhap lai
        			System.out.print("Thang khong thoa man, nhap lai\n");
     
        	}
        }while(!checkmonth);
        
        switch(month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	day = 31;
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	day = 30;
        	break;
        case 2:
        	if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ) {
        		day = 29; // cac nam chia het cho 4 dong thoi khong chia het 100 va nam chia het 400 la nam nhuan
        	}
        	else 
        		day = 28;
        	break;
        }
        
        System.out.print("Thang " + month + " co " + day + " ngay.\n"); // in ra thong bao so ngay trong thang
    }
}