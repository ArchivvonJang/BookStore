package book_mng;

public class BookDel {

	public BookDel() {}
	
	public static void bookDel() {
		
		//InputInfo input = new InputInfo();
		String bookName = InputInfo.input("삭제할 도서명");
		BookData.bookList.remove(bookName);
		}

	}


