package book_mng;

import java.util.Iterator;
import java.util.Set;

public class BookSearch {
 // static String search;
	public BookSearch() {
	
	}
	public static void bookSearch() {
		try {
		// 도서 검색
				String bName = InputInfo.input("검색할 도서명을 입력하세요.");
				
				BookVO bvo = BookData.bookList.get(bName);
				Set<String> keyList = BookData.bookList.keySet();
			    Iterator<String> itr = keyList.iterator();
			    
			    if(itr.hasNext())
			    	System.out.printf("%d\t %-20s\t %-20s\t %-10s\t %-10s\t %-10s\t %-5s \n ",bvo.getBookNo(),bvo.getBookName(),
			    			bvo.getAuthor(),bvo.getPublisher(),bvo.getPublishingDate(),bvo.getGenre(),bvo.getSale());
				
		}catch(NullPointerException npe ) {
			 System.out.println("정확한 수량을 입력해주세요."+npe.getMessage());
		}catch(Exception e) {
			 System.out.println("정확한 수량을 입력해주세요."+e.getMessage());
			 throw e;
		}
	}
}
