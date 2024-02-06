package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX = 999999; // so luong dvd toi da cua cua hang
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX];
	private int itemcount;

	// ham them dvd vao cua hang
	public void addDVD(DigitalVideoDisc dvd) {
		if(itemcount < MAX) {
			itemsInStore[itemcount] = dvd; // them dvd vao cua hang
			itemcount ++;
			System.out.println("DVD da duoc them vao cua hang.");
		}
	}

	// ham xoa dvd khoi cua hang
	 public void removeDVD(int i) {
		 if (i >= 0 && i < itemcount) {
			 System.arraycopy(itemsInStore, i + 1, itemsInStore, i, itemcount - i - 1);// day cac phan tu sau len
			 itemsInStore[itemcount - 1] = null; // xoa pt vi tri cuoi cung
			 itemcount--;// giam so luong
			 System.out.println("DVD da duoc xoa khoi cua hang.");	
		 } 
		 else
	            System.out.println("khong tim thay id.");
	    }

	 // in danh sach san pham
	 public void printlist() {
		 for (int i = 0; i < itemcount; i++) {
			 System.out.println((i+1) + ". " + itemsInStore[i].getTitle());
		 }
	 }
}

