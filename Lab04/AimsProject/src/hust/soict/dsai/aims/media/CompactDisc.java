package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
// Luu Viet Hoan - 20215054
public class CompactDisc extends Media implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	// getter
	public String getArtist() {
		return artist;
	}

	//Constructor
	public CompactDisc(String title, String artist, List<Track> tracks, float cost) {
		super();
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;

	}

	public CompactDisc(String title, String category, String artist, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.artist = artist;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;

	}
	
	public CompactDisc() {
		super();
		this.id = nbDigitalVideoDiscs++;

	}
	
	// Hàm thêm track
	public void addTrack(Track tr) {
		boolean check = true;
		for ( int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).getTitle().equals(tr.getTitle())) { // Kiểm tra xem track đã có hay chưa
				System.out.println("Track nay da ton tai");
				check = false;
				break;
			}
		}
		
		if (check) {
			tracks.add(tr);
			System.out.println("Track da duoc them vao");
		}
	}
	
	// Hàm xóa track
	public void removeTrack(Track tr) {
		boolean check = false;
		for ( int i = 0; i < tracks.size(); i++) {
			if ( tracks.get(i).getTitle().equals(tr.getTitle()) ) { // Kiểm tra track
				tracks.remove(i);
				System.out.println("Track da duoc xoa");
				check = true;
				break;
			}
		}
		if( !check ) {
			System.out.println("Track khong ton tai");
		}
	}
	
	// hàm tính thời lượng
	public int getLength() {
		int sum = 0;
		for ( int i = 0; i < tracks.size(); i++) {
			sum += tracks.get(i).getLength(); // cộng tổng các thời gian của từng track
		}
		return sum;
	}

	// hàm phát
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		for ( int i = 0; i < tracks.size(); i++) {
			tracks.get(i).play();
		}
	}

	// override lại toString
	@Override
	public String toString() {
		return "CD - " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + getLength() + " minutes: " +
	               getCost() + " $";
	}
	
	// Hàm in danh sách track
	public void printTrack() {
		System.out.println("List track of this cd: ");
		for (int i = 0; i < tracks.size(); i++) {
			System.out.println("Track: " + tracks.get(i).getTitle() + ", length: " + tracks.get(i).getLength());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
