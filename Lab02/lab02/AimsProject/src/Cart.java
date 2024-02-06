// Luu Viet Hoan
// 20215054
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
			if ( itemsOrdered[i] == disc ) { // khi tim thay dia can xoa
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
	
	// ham in danh sach
	public void printlist() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println( (i+1) + ". " + itemsOrdered[i].getTitle() + " " + itemsOrdered[i].getCategory() + " " + itemsOrdered[i].getCategory()
					+ " " + itemsOrdered[i].getLength() + " " + itemsOrdered[i].getCost());
		}
	}
}
