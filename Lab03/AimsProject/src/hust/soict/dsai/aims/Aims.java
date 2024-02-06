package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
// Luu Viet Hoan
// 20215054
	public static void main(String[] args) {
		// tao gio hang moi
		Cart anOrder = new Cart();

		// tao dia moi va them vao gio hang
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc();
		DigitalVideoDisc[] dvdlist = {dvd1, dvd2, dvd1, dvd2, dvd3, dvd4, dvd4, dvd3, dvd2, dvd1, dvd1, dvd3, dvd1, dvd1, dvd1, dvd2, dvd2,dvd3, dvd4};
		anOrder.addDigitalVideoDisc(dvdlist);

		anOrder.addDigitalVideoDisc(dvd1, dvd4);
		anOrder.print();		


	}

}
