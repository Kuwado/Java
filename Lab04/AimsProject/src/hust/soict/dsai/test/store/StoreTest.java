package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.Book;
// Lưu Việt Hoàn - 20215054
public class StoreTest {

	public static void main(String[] args) {
		// tạo một book
		Book book = new Book("Book Test", "Category", 20f);
		
		// in danh sách tác giả trước khi thêm
		System.out.println("Before add: ");
		book.showAuthor();
		
		// thêm tác giả
		book.addAuthor("Hoan");
		book.addAuthor("Nam");
		book.addAuthor("Quan");
		
		// in danh sách tác giả sau khi thêm
		System.out.println("--------------------------------------------------");
		System.out.println("After add: ");
		book.showAuthor();
		
		// xóa tác giả 
		book.removeAuthor("Nam");
		
		// in danh sách tác giả sau khi xóa Nam
		System.out.println("--------------------------------------------------");
		System.out.println("After remove: ");
		book.showAuthor();
		

		
		
		
	}

}