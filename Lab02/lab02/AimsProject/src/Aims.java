
public class Aims {
// Luu Viet Hoan
// 20215054
	public static void main(String[] args) {
		// tao gio hang moi
		Cart anOrder = new Cart();
		
		// tao dia moi va them vao gio hang
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// in tong gia tien trong gio hang
		System.out.println("Tong tien la: ");
		System.out.println(anOrder.totalCost());
		System.out.println("Danh sach dia: ");
		// in danh sach 
		anOrder.printlist();
		
		// xoa dia trong gio hang
		anOrder.removeDigitalVideoDisc(dvd2); // xoa dvd2
		
		// in danh sach sau khi xoa
		System.out.println("Danh sach dia sau khi xoa : ");
		anOrder.printlist();


	}

}


