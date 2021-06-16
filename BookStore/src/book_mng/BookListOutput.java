package book_mng;


import java.util.Iterator;
import java.util.Set;

public class BookListOutput {
    
	public BookListOutput() {
	}
	
	public static void bookListOutput() {
		Set<String> keyList = BookData.bookList.keySet();
	    Iterator<String> itr = keyList.iterator();
	   
	
	    //책 갯수만큼 도서목록이 출력된다.
	    while(itr.hasNext()) {
	    	BookVO bvo =BookData.bookList.get(itr.next());
	    	// 출력문
	    	// key: 책 제목 value: BookVO(책 등록번호, 책 제목, 작가, 출판사, 출판년일, 장르)
	    	//"%d\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n",
	    	System.out.printf("%d\t %-20s\t %-20s\t %-10s\t %-10s\t %-10s\t %-5s\n",bvo.getBookNo(),bvo.getBookName(),
	    			bvo.getAuthor(),bvo.getPublisher(),bvo.getPublishingDate(),bvo.getGenre(),bvo.getSale());
	    }
	 // 보유 도서량 출력
	    // if(BookVO.sale.equals("품절")) {}
	
	     System.out.println("취급 도서 " + BookData.bookList.size() +" 권");
	    
	}

}
