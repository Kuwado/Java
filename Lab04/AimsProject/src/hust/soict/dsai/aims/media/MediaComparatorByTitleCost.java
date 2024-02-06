package hust.soict.dsai.aims.media;
import java.util.Comparator;
// Lưu Việt Hoàn - 20215054
	public class MediaComparatorByTitleCost implements Comparator<Media> {
   
		@Override
    	public int compare(Media med1, Media med2) {
			int TitleCom = med1.getTitle().compareTo(med2.getTitle());// so sánh title

			return (TitleCom != 0) ? TitleCom : Float.compare(med2.getCost(), med1.getCost()); // nếu title giống nhau sắp xếp theo Cost giảm dần
		}
	}
