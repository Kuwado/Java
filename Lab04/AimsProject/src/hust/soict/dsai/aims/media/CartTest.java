package hust.soict.dsai.aims.media;
// Luu Viet Hoan - 20215054

public class CartTest {
	public static void main(String[] args) {
		// tạo cd
		CompactDisc cd = new CompactDisc("Test Track", "Category", "Hoan", 120.5f);
		
		// tạo các track
		Track tr1 = new Track("track1", 12);
		Track tr2 = new Track("track2", 3);
		Track tr3 = new Track("track3", 5);
		Track tr4 = new Track("track4", 2);

		// in thông tin cd trước khi add track
		System.out.println(cd.toString());
		System.out.println("Length of cd is: " + cd.getLength());
		cd.printTrack();

		System.out.println("--------------------------------------------------");
		
		// thêm track vào cd
		cd.addTrack(tr1);
		cd.addTrack(tr2);
		cd.addTrack(tr3);
		cd.addTrack(tr4);
		
		// in thông tin cd sau khi add track
		System.out.println(cd.toString());
		System.out.println("Length of cd after add track is: " + cd.getLength());
		cd.printTrack();
		
		// remove track
		System.out.println("--------------------------------------------------");
		cd.removeTrack(tr3);

		// in thông tin cd sau khi remove
		System.out.println(cd.toString());
		System.out.println("Length of cd after remove track is: " + cd.getLength());
		cd.printTrack();

		


		
		

		


	}

}