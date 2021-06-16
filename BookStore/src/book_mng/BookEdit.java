package book_mng;

import java.util.Iterator;
import java.util.Set;

public class BookEdit {

	public BookEdit() {
	}
	public static void bookEdit() {
	try {	
		// 도서명을 입력받고 수정한다
		// 수정할 도서 검색
		String bName = InputInfo.input("수정할 도서 검색 ");
		
		BookVO bvo = BookData.bookList.get(bName);
		Set<String> keyList = BookData.bookList.keySet();
	    Iterator<String> itr = keyList.iterator();
	    
	    if(itr.hasNext())
	    	System.out.printf("%d\t %-20s\t %-20s\t %-10s\t %-10s\t %-10s\t %-5s \n ",bvo.getBookNo(),bvo.getBookName(),
	    			bvo.getAuthor(),bvo.getPublisher(),bvo.getPublishingDate(),bvo.getGenre(),bvo.getSale());
		
		// 해당 도서의 정보가 없을 때 null로 표시한다.
		if(bvo == null) {
			System.out.println("존재하지 않는 도서명입니다.");
		}else { // 해당 도서의 정보가 있을 때, null이 아니다. 즉, 정보가 존재한다.
			//정보가 있으면 연락처, 부서명, 직급을 수정한다.
			String bCategory = InputInfo.input("\n수정할 정보를 선택하세요. [1. 도서명, 2.작가 3. 출판사 4. 출판년일 5. 장르 ");
			
			if(bCategory.equals("1")) {
				String bookName  = InputInfo.input("수정할 도서명");
				bvo.setBookName(bookName);
			}else if(bCategory.equals("2")) {
				String author  = InputInfo.input("수정할 작가명");
				bvo.setAuthor(author);
			}else if(bCategory.equals("3")) {
				String publisher  = InputInfo.input("수정할 출판사명");
				bvo.setPublisher(publisher);
			}else if(bCategory.equals("4")) {
				String publishingDate  = InputInfo.input("수정할 출판년일");
				bvo.setPublishingDate(publishingDate);
			}else if(bCategory.equals("5")) {
				String genre = InputInfo.input("수정할 장르");
			    bvo.setGenre(genre);
			}
			
		}
		
	}catch(NullPointerException npe) {
		System.out.println("정확한 번호를 다시 입력해주세요"+npe.getMessage());
	}catch(Exception e){
		System.out.println("정확한 번호를 다시 입력해주세요"+e.getMessage());
		throw e;
	}
		
	}

}
