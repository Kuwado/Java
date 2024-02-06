// Luu Viet Hoan
// 20215054
package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

	// Khởi tạo Constructor 
	public DigitalVideoDisc() {
		super();
		this.id = nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs++;
	}
	
	// ham boolean kiem tra title
		public boolean isMatch(String title) {
			return getTitle().equals(title);
		}
	
	// override toString
	@Override
	public String toString() {
		return "DVD - " + getId() + " - " + getTitle() + " - " + getCategory() + " - " +
				getDirector() + " - " + getLength() + " minutes - " +
	               getCost() + " $";
	}
	
	// play
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
