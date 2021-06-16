package book_mng;


public class BookRegistration {
// 도서 정보를 추가 등록한다.
//	도서번호,도서명,작가명,출판사명,출판년일,장르 
	public BookRegistration() {
	}
    public static void bookRegi(){
    	
    	
    	int bNo = Integer.parseInt(InputInfo.input("도서번호"));
    	String bName = InputInfo.input("도서명");
    	String author = InputInfo.input("작가명");
    	String publisher = InputInfo.input("출판사명");
    	String publishingDate = InputInfo.input("출판년일");
    	String genre = InputInfo.input("장르");
    	String sale = "판매 가능";
    	//Boolean rentTrue = Boolean.parseBoolean(sale);
    			
    	
    	//새로 입력한 정보를 put을 사용하여 bookList에 넣는다.		
    	BookData.bookList.put(bName, new BookVO(bNo, bName, author, publisher, 
    			publishingDate, genre, sale));
    	
    
    }
}
