// Luu Viet Hoan
// 20215054
package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20; // so luong dia toi da trong mot gio hang
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int qtyOrdered; // thu tu cua dia

	// ham them dia vao gio hang
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED ) { // neu so luong dia trong gio hang chua toi da
			itemsOrdered[qtyOrdered] = disc; // them dia
			qtyOrdered ++; // tang so luong 
			System.out.println("Dia da duoc them vao gio hang");
		}
		else // neu gio hang da day thi thong bao
			System.out.println("Gio hang da day, khong the them dia vao");
	}

	// ham xoa dia tu gio hang
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) { // duyet lan luot 
			if ( itemsOrdered[i].getTitle().equals(disc.getTitle())) { // khi tim thay dia can xoa
				System.arraycopy(itemsOrdered, i + 1, itemsOrdered, i, qtyOrdered - i -1); // copy phan tu (i+1 --> het) thay vao (i --> het -1)
				itemsOrdered[qtyOrdered] = null; // dua phan tu cuoi cung thanh rong
				qtyOrdered --; // giam so luong dia trong gio hang
				System.out.println("Dia da duoc xoa");
				return;
			}	
		}
		// neu khong thay dia can xoa --> thong bao
		System.out .println("Khong tim thay dia trong gio hang");
	}

	// ham tinh tong tien
	public float totalCost() {
		float total = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

	// them danh sach dia vao ro hang
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int i = 1; // bien i dem so luong dia trong danh sach 
		// neu so luong dia trong ro hang < so luong toi da thi them vao
		while(qtyOrdered < MAX_NUMBERS_ORDERED && i <= dvdList.length ) {
			itemsOrdered[qtyOrdered] = dvdList[i-1];
			System.out.println("Dia thu " + i + " da duoc them vao gio hang" );
			qtyOrdered ++;
			i ++;
		}
		if(qtyOrdered >= MAX_NUMBERS_ORDERED)
			System.out.println("Gio hang da day, khong the them");
	}

	// them dia tuy y
	public void addDigitalVideoDiscTY(DigitalVideoDisc... dvds) {
		for (DigitalVideoDisc dvd : dvds) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) { // kiểm tra nếu số lượng trong giỏ hàng chưa đath tối đa
				itemsOrdered[qtyOrdered] = dvd; // thêm đĩa vào giỏ hàng
				qtyOrdered++; // tăng số lượng
				System.out.println("Đĩa đã được thêm vào giỏ hàng");
			} else {
				System.out.println("Giỏ hàng đã đầy, không thể thêm vào nữa");
				break; // thoát khỏi vòng lặp nếu giỏ hàng đầy
			}
		}
		
	}
	
	// them 2 dia vao danh sach
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if ( qtyOrdered < MAX_NUMBERS_ORDERED ) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered ++;
			System.out.println("Dia thu 1 da duoc them vao");
		}
		else 
			System.out.println("Gio hang da day dia thu 1 chua duoc them vao");

		if ( qtyOrdered < MAX_NUMBERS_ORDERED ) {
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered ++;
			System.out.println("Dia thu 2 da duoc them vao");
		}
		else 
			System.out.println("Gio hang da day dia thu 2 chua duoc them vao");
	}

	// ham in danh sach LVH - 20215054
	public void print() {
		float totalCost = 0.0f;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc dvd = itemsOrdered[i];
			totalCost += dvd.getCost(); // cong lan luot gia tien cu tung dvd
			System.out.println((i+1) + ". " + dvd.tostring() );
		}
		System.out.println("Total cost: " + totalCost + "$");
		System.out.println("***************************************************");
	}

	// Ham tim kiem theo ID - LVHoan - 20215054
	public void searchbyID(int idsearch) {
	    boolean found = false; // bien kiem tra xem co tim thay hay khong
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (idsearch == itemsOrdered[i].getId()) {
	            System.out.println(itemsOrdered[i].tostring());
	            found = true; // da tim thay
	            break; // dung vong lap ngay khi thay
	        }
	    }

	    // In ra thong bao neu khong thay
	    if (!found) {
	        System.out.println("DVD với ID " + idsearch + " khong ton tai trong gio hang.");
	    }
	}

	// Ham tim kiem theo tieu de - Viet Hoan - 20215054
	public void searchbyTitle(String titlesearch) {
		boolean found = false; // bien kiem tra xem co tim thay hay khong
		for (int i = 0; i < qtyOrdered; i++) {
			if( itemsOrdered[i].isMatch(titlesearch) ) {
				System.out.println(itemsOrdered[i].tostring());
				found = true; // da tim thay'
				break; // dung vong lap
			}
		}
			if(!found) // neu khong tim thay
				System.out.println("DVD voi tieu de " + titlesearch + " khong ton tai trong gio hang.");
	}
}