package hust.soict.dsai.aims.media;
import java.util.Comparator;
// Lưu Việt Hoàn - 20215054
	public class MediaComparatorByCostTitle implements Comparator<Media> {
		
		@Override
		public int compare(Media med1, Media med2) {
			int CostCom = Float.compare(med1.getCost(), med2.getCost()); // So sánh Cost
			
			return (CostCom != 0 ) ? CostCom : med1.getTitle().compareTo(med2.getTitle()); // Nếu Cost bằng nhau sắp xếp theo title
	}

}
