// Luu Viet Hoan
// 20215054
package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;

	// thuc hien phuong thuc get
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
        return id;
    }

	// phuong thuc set
	public void setTitle(String title) {
		this.title = title;
	}


	// khoi tao constructor 
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

	// Luu Viet Hoan - 20215054
	public String tostring() {
		return "DVD - " + getTitle() + " - " + getCategory() + " - " +
				getDirector() + " - " + getLength() + " minutes: " +
	               getCost() + " $";
	}

}
