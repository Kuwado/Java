package hust.soict.dsai.aims.media;
// Lưu Việt Hoàn - 20215054
public class Disc extends Media{
	public String director;
	public int length;
	
	// getter
	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	//Constructor
	public Disc() {
		super();
	}

	public Disc(String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}

	public Disc(int length) {
		super();
		this.length = length;
	}
}
