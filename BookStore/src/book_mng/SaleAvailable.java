package book_mng;

import java.util.Iterator;
import java.util.Set;

public class SaleAvailable {

	public SaleAvailable() {
		
	}
	public static void saleAvailable() {
		try {
		String sale = InputInfo.input("도서명을 입력하세요");
		BookVO bvo = BookData.bookList.get(sale);
		String soldOut = "품절";
		 String warehousing="판매 가능";
		// 도서명 검색 후 구매가능여부를 확인한다.
		if(bvo ==null) {
			System.out.println("\n존재하지 않는 도서명입니다. 판매 불가능합니다.\n");
			
		}else {
			// 도서명 검색 결과 출력하기
				//BookSearch.bookSearch();
						// 
						Set<String> keyList = BookData.bookList.keySet();
					    Iterator<String> itr = keyList.iterator();
					    
					    if(itr.hasNext())
					    	System.out.printf("\n%d\t %-20s\t %-20s\t %-10s\t %-10s\t %-10s\t %-5s \n ",bvo.getBookNo(),bvo.getBookName(),
					    			bvo.getAuthor(),bvo.getPublisher(),bvo.getPublishingDate(),bvo.getGenre(),bvo.getSale());
						// 판매여부 확인하기
					    
					    String saleQue = InputInfo.input(">원하시는 업무를 선택하세요. [1. 도서 판매  2. 입고 ]");
					    
					    if(saleQue.equals("1")){
					  
					    	String bookSale = InputInfo.input("\n해당 도서를 판매하시겠습니까? [1. 예 2. 아니오]");
                  				if(bookSale.equals("1")) {
                  					System.out.println("\n < 판매 완료 > \n");
                  					bvo.setSale(soldOut);
                  					
                  				}else if(bookSale.equals("2")) {
                  					//String soldOut = "품절";
                  					
                  					System.out.println("\n< 도서관리 메뉴로 돌아갑니다 >\n");
                  				}
                  				
					    }else if (saleQue.equals("2")) {
					    	
					    	String bookReturn = InputInfo.input("\n해당 도서를 입고하시겠습니까? [1. 예 2. 아니오]");
                  		       if(bookReturn.equals("1")) 
                  		    	   
                  		    	  // String warehousing="구매 가능";
                  		    	   bvo.setSale(warehousing);
                  		       }
                  		       
					    }
					   		
		 // 구매가능 여부가 BookVO에 추가되어야할 것같음 저게 추가되면 전체 수정해야함
	   
	}catch(NullPointerException npe) {
		 System.out.println("정확한 수량을 입력해주세요."+npe.getMessage());
	}catch(Exception e) {
		 System.out.println("정확한 수량을 입력해주세요."+e.getMessage());
		 throw e;
	}
	}
}
