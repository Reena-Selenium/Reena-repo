package Day1;

public class Library {

		public String addBook(String bookTitle) {
			System.out.println("Book added successfully");
			return bookTitle;
		}
		public void issuebook() {
			System.out.println("Book issued successfully");
		}
		public static void main(String[]args) {
			Library lib=new Library();
			lib.addBook("bookTitle");
			lib.issuebook();
	}

}
