package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

// Luu Viet Hoan - 20215054
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	// Menu chính
	public static void showMenu() {
	    System.out.println("AIMS: ");
	    System.out.println("--------------------------------");
	    System.out.println("1. View store");
	    System.out.println("2. Update store");
	    System.out.println("3. See current cart");
	    System.out.println("0. Exit");
	    System.out.println("--------------------------------");
	    System.out.println("Please choose a number: 0-1-2-3");
	}
	
	// Menu của chức năng 1
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	// Menu của chức năng 1.1
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		}
	
	// See a media's details
	public static void mediaDetailsMenu( Store store, Cart cart, Media med, Scanner scanner ) {
	    int mediaChoice;
	        mediaDetailsMenu(); // hiện thị 
	        System.out.print("Your choice: ");
	        mediaChoice = scanner.nextInt();
	        scanner.nextLine(); 

	        switch (mediaChoice) {
	            case 1:
	                // Add to cart
	                System.out.println("Adding to cart...");
	                cart.addMedia(med); // thêm Media vào giỏ hàng
	                break;
	            case 2:
	                // Play
	            	playMedia(med); // phát Media
	                break;
	            case 0:
	            	//Back
	                System.out.println("Going back");
	                break;
	            default:
	                System.out.println("Invalid choice. Please choose a number from the menu.");
	                break;
	        }

	}
	
	// 1. View store
	public static void storeMenu(Store store, Cart cart, Scanner scanner) {
        int storeChoice;
        do {
            storeMenu();
            System.out.print("Your choice: ");
            storeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (storeChoice) {
                case 1:
                    // See a media’s details
                    System.out.println("Enter the title of the media: ");
                    String Stitle = scanner.nextLine(); // Nhập title của Media muốn xem
                    Media med = store.FindByTitleStore(Stitle); // tìm kiếm Media
                    if ( med != null ) { // Nếu Media tồn tại
                    	System.out.println(med.toString()); // in thông tin
                    	mediaDetailsMenu(store, cart, med, scanner); // thực hiện tiếp công việc
                    }
                    else // nếu không tồn tại --> thông báo
                    	System.out.println("Don't see that media");
                    break;
                case 2:
                	// Add a media to cart
                    System.out.println("List media in the store: "); 
                    store.printlist(); // in danh sách Media trong store
                    System.out.println("Enter the title of the media that you want to add: ");// nhap tieu de
                    String Stitle2 = scanner.nextLine(); // Nhập title Media muốn thêm
                    Media med2 = store.FindByTitleStore(Stitle2);
                    if ( med2 != null ) { // nếu tìm thấy --> thêm
                    	cart.addMedia(med2);
                    }
                    else // không thấy --> báo lỗi
                    	System.out.println("Don't exist that media");
                    break;
                case 3:
                    // Play a media
                    System.out.println("Enter the title of the media that you want to play:");
                    String Stitle3 = scanner.nextLine(); // Nhập title Media muốn chạy
                    Media med3 = store.FindByTitleStore(Stitle3);
                    if ( med3 != null ) {
                    	playMedia(med3); // Nếu tìm thấy --> chạy
                    }
                    else // nếu không thấy --> báo lỗi
                    	System.out.println("Don't exist that media");
                    break;
                case 4:
                    // See current cart
                    System.out.println("Current cart: ");
                    cart.printList(); // in danh sách giỏ hàng
                    break;
                case 0:
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from the menu.");
                    break;
            }

        } while (storeChoice != 0);
    }
	
	// Menu của chức Săng 2
	public static void updateMenu () {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a media");
		System.out.println("2. Remove a media");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");

	}
	
	// Menu chọn type của Media
	public static void addMediaType () {
		System.out.println("Type of Media: ");
		System.out.println("--------------------------------");
		System.out.println("1. Book");
		System.out.println("2. CD");
		System.out.println("3. DVD");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	// Hàm thêm Media vào store
	public static void addMedias(Store store, Scanner scanner) {
		int typeChoice;
        do {
            addMediaType();
            System.out.print("Your choice: ");
            typeChoice = scanner.nextInt();
            String category = null;
            float cost = 0;            
            
            switch (typeChoice) {
                case 1:
                    // Book
                	Book book;
                	String str = "Enter title, category, cost";
                    System.out.println(str);
                    scanner.nextLine(); 
                    String title = scanner.nextLine();
                    Media med = store.FindByTitleStore(title);// kiểm tra xem title đã hợp lệ chưa
                    if (med == null) { // nếu hợp lệ --> điền các thông tin
                    	category = scanner.nextLine();
                    	cost = Float.parseFloat(scanner.next());
                		book = new Book(title, category, cost);
                		store.addMedia(book);
                	}
                    else 
                    	System.out.println("Media with this title already exist");
                    break;
                case 2:
                    //CD
                	CompactDisc cd;
                	String str2 = "Enter title, category, cost, artist";
                    System.out.println(str2);
                    scanner.nextLine(); 
                    String title2 = scanner.nextLine();
                    Media med2 = store.FindByTitleStore(title2); // kiểm tra title
                    if (med2 == null) { // điền thông tin
                    	category = scanner.nextLine();
                    	cost = scanner.nextFloat();
                    	scanner.nextLine();
                		String artist = scanner.nextLine();
                		cd = new CompactDisc(title2, category, artist, cost);
                		store.addMedia(cd);
                	}
                    else 
                    	System.out.println("Media with this title already exist");
                    break;
                case 3:
                    //DVD
                	DigitalVideoDisc dvd;
                	String str3 = "Enter title, category, cost, director, length";
                    System.out.println(str3);
                    scanner.nextLine(); 
                    String title3 = scanner.nextLine();
                    Media med3 = store.FindByTitleStore(title3); // kiểm tra title
                    if (med3 == null) { // điền thông tin
                    	category = scanner.nextLine();
                    	cost = Float.parseFloat(scanner.next());
                    	scanner.nextLine();
                		String director = scanner.nextLine();
                		int length = scanner.nextInt();
                		dvd = new DigitalVideoDisc(title3, category, director, length, cost);
                		store.addMedia(dvd);
                	}
                    else 
                    	System.out.println("Media with this title already exist");
                    break;
                case 0:
                    System.out.println("Going back ");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from the menu.");
                    break;
            }

        } while (typeChoice != 0);
    }

	// 2. Update store
	public static void updateMenu(Store store,Scanner scanner) {
        int storeChoice;
        do {
            updateMenu();
            System.out.print("Your choice: ");
            storeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (storeChoice) {
                case 1:
                    // Add Media to store
                    addMedias(store, scanner); // thực hiện hàm thêm Media
                    break;
                case 2:
                	// Remove Media from store
                	System.out.println("Enter the title of the media that you want to remove: ");
                    String Stitle = scanner.nextLine();
                    Media med = store.FindByTitleStore(Stitle); // kiểm tra title
                    if ( med != null ) {
                    	store.removeMedia(med); // xóa Media với title hợp lệ
                    }
                    else 
                    	System.out.println("Media with this title isn't already exist");
                    
                    break;
                case 0:
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from the menu.");
                    break;
            }

        } while (storeChoice != 0);
    }
	
	// Menu của chức năng 4
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	// Menu của chức năng 4.1
	public static void filterCart() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by id");
		System.out.println("2. Filter by title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	// Filter medias in cart
	public static void filterCart(Cart cart, Scanner scanner) {
		int filterChoice;
        do {
            filterCart();
            System.out.print("Your choice: ");
            filterChoice = scanner.nextInt();
            scanner.nextLine();

            switch (filterChoice) {
                case 1:
                	// Tìm kiếm bằng ID
                	System.out.println("Enter id: ");
                	int id = scanner.nextInt(); // Nhập id cần tìm
                	cart.searchbyID(id); // tìm kiếm media theo id
                    break;
                case 2:
                	// Tìm kiếm bằng title
                	System.out.println("Enter title: ");
                	String title = scanner.nextLine(); // Nhập title cần tìm
                	cart.searchbyTitle(title); // tìm kiếm theo title
                    break;
                case 0:
                    System.out.println("Going back");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from the menu.");
                    break;
            }

        } while (filterChoice != 0);
    }
	
	// Menu của chức năng 4.2
	public static void sortCart() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by cost");
		System.out.println("2. Sort by title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	// Sort medias in cart
	public static void sortCart(Cart cart, Scanner scanner) {
		int sortChoice;
        do {
            sortCart();
            System.out.print("Your choice: ");
            sortChoice = scanner.nextInt();
            scanner.nextLine();

            switch (sortChoice) {
                case 1:
                	// Sắp xếp theo cost
                	System.out.println("Cart is sorted by cost: ");
                	Collections.sort(Cart.itemsOrdered, Media.COMPARE_BY_COST_TITLE); // thực hiện sắp xếp
            		for (Media m : Cart.itemsOrdered) {
            			System.out.println(m.toString()); // in danh sách
            			}
                    break;
                case 2:
                	// Sắp xếp theo title
                	System.out.println("Cart is sorted by title: ");
                	Collections.sort(Cart.itemsOrdered, Media.COMPARE_BY_TITLE_COST); // thực hiện sắp xếp
            		for (Media m : Cart.itemsOrdered) {
            			System.out.println(m.toString()); // in danh sách
            			}
                    break;
                case 0:
                    System.out.println("Going back");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from the menu.");
                    break;
            }

        } while (sortChoice != 0);
    }
	
	// 4. See current cart
	public static void cartMenu(Cart cart, Scanner scanner) {
		int typeChoice;
        do {
            cartMenu();
            System.out.print("Your choice: ");
            typeChoice = scanner.nextInt();
            scanner.nextLine();

            switch (typeChoice) {
                case 1:
                	// Filter medias in cart
                	filterCart(cart, scanner);// thực hiện filter
                    break;
                case 2:
                	// Sort medias in cart
                	sortCart(cart, scanner); // thực hiện sort
                    break;
                case 3:
                	// Remove media from cart
                	System.out.println("Current cart: ");
                	cart.printList();
                	System.out.println("Enter title of media that you want to remove: ");
                	String title3 = scanner.nextLine();
                	Media med3 = cart.FindByTitleCart(title3); // tìm media theo title
                	if ( med3 != null ) {
                    	cart.removeMedia(med3); // nếu media không rỗng --> tông tại --> xóa
                    }
                    else
                    	System.out.println("Don't see that media"); // nếu media không tồn tại --> báo lỗi
                    break;
                case 4:
                	// Play a media
                	System.out.println("Current cart: ");
                	cart.printList();
                	System.out.println("Enter title of media that you want to play: ");
                	String title4 = scanner.nextLine();
                	Media med4 = cart.FindByTitleCart(title4); // tìm media theo title
                	if ( med4 != null ) {
                    	playMedia(med4); // nếu media không rỗng --> tông tại --> xóa
                    }
                    else
                    	System.out.println("Don't see that media"); // nếu media không tồn tại --> báo l
                    break;
                case 5:
                	// Place order
                	System.out.println("This cart has been placed.");
                    Cart.itemsOrdered.clear(); // Làm mới cart
                    break;
                case 0:
                    System.out.println("Going back ");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from the menu.");
                    break;
            }

        } while (typeChoice != 0);
    }
	
	
	public static void main(String[] args) {
		
		// Khởi tạo một vài Media cho Store
		List<String> tacgia = new ArrayList<String>();
		tacgia.add("Hoan");
		tacgia.add("Nam");
	
		List<Track> tr = new ArrayList<Track>();
		
		// Khởi tạo dvd
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Luffy", "Animation", "Oda", 120, 100f);

		// Khởi tạo book
		Book book1 = new Book("Hahaha", "Hai", 20f, tacgia );
		Book book2 = new Book("Vaaa", "Hai", 20f, tacgia );

		// Khởi tạo cd
		CompactDisc cd1 = new CompactDisc("Nghe di", "Hoan", tr, 15f );
		CompactDisc cd2 = new CompactDisc("Nghe di2", "Hai", "Hoan", 16f );

		// thêm vài track vào cd
		Track tr1 = new Track("track1", 12);
		Track tr2 = new Track("track2", 3);
		Track tr3 = new Track("track3", 5);
		Track tr4 = new Track("track4", 2);
		cd1.addTrack(tr1);
		cd2.addTrack(tr2);
		cd1.addTrack(tr3);
		cd2.addTrack(tr4);
				
		// tạo store và cart
		Store store = new Store(); // tạo store
		Cart cart = new Cart(); // tạo cart
		
		// thêm vào store
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(cd2);
		store.addMedia(book1);
		store.addMedia(book2);
		store.addMedia(cd1);

		Scanner scanner = new Scanner(System.in);

		int choice;
		do {
			showMenu();
			System.out.print("Your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
            	case 1:
            		// View store
            		System.out.println("Viewing store...");
            		storeMenu(store, cart, scanner);
            		break;
            	case 2:
            		// Update store
            		System.out.println("Updating store...");
            		updateMenu(store, scanner);
            		break;
            	case 3:
            		// See current cart
            		System.out.println("Seeing current cart...");
            		cartMenu(cart, scanner);
            		break;
            	case 0:
            		System.out.println("Exiting...");
            		break;
            	default:
            		System.out.println("Invalid choice. Please choose a number from the menu.");
            		break;
			}

		} while (choice != 0);
		scanner.close();
	}

	// Hàm chạy Media là CD và DVD
	private static void playMedia(Media med) {
		if (med == null) {
			System.out.println("Media is null");
		}
		else { // Nếu Media khác null
			if ( med instanceof CompactDisc) { // Kiểm tra xem media có phải CD không
				( (CompactDisc) med ).play(); 
			}
			else if ( med instanceof DigitalVideoDisc) { // Kiểm tra xem media có phải DVD không
				( (DigitalVideoDisc) med ).play();
			}
			else 
				System.out.println("Only DVD and CD can be played.");
		}
	}
	
}
	