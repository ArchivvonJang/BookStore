import book_mng.BookData;
import book_mng.BookDel;
import book_mng.BookEdit;
import book_mng.BookListOutput;
import book_mng.BookLogin;
import book_mng.BookRegistration;
import book_mng.BookSearch;
import book_mng.InputInfo;
import book_mng.SaleAvailable;
import customer_mng.CustomersData;
import customer_mng.CustomersEdit;
import customer_mng.CustomersEnrollment;
import customer_mng.CustomersListOutput;
import customer_mng.CustomersRemove;

public class BookMain {
	String category;
	
	public BookMain() {
	}
	public void start() throws Exception {
		System.out.println("--------------------------------------[  작은 서점 도서관리프로그램  ]-----------------------------------------\n");
	 //관리자 사용자 로그인
	// UserLogin.userId = InputInfo.input("회원 아이디");
	 try {
	 BookLogin.id = InputInfo.input("관리자 아이디");
	 BookLogin.pwd = InputInfo.input("관리자 비밀번호");
	 // 메소드 내에 선언된 로컬클래스
	   
	 //로그인 성공하면 BookLogin 메소드에서 true가 넘어온다.
		 if(BookLogin.loginCheck()) {
			 BookData.setBookList();
			 CustomersData.setCustomersList();
			 // 프로그램이 종료할 때까지 반복해서 호출
			 do {
				 // 하위 메뉴가 끝나면 다시 상위 메뉴의 category 로 리턴한다.
				 category = InputInfo.input("\n메뉴 [1. 도서관리 2. 회원관리 3.종료 ]");
				 //System.out.println("-------------------------------------------------------------------------------");
				 if(category.equals("3")) break;
				 else if (category.equals("1")) { //1. 도서관리 메뉴
					 bookCategory();
				 }else if (category.equals("2")) { //2. 회원관리 메뉴
					 cusCategory();
				 }
				 
			 }while(true);
			 
			
		 }else {
			 System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			 start();
		 } //if else end
	
	
	}catch(NullPointerException npe) {
		System.out.println("정확한 번호를 다시 입력해주세요."+npe.getMessage());
	}catch(Exception e) { 
		throw e;
	}
	}
	
	 //2. 도서관리 선택시
	 public  String bookCategory() throws IllegalAccessException{
		try {
		do { String bookMng = InputInfo.input("\n도서관리 메뉴 [1. 도서 목록 2. 도서검색 3. 도서 판매 및 입고 4. 도서 등록 5. 도서정보 수정 6. 도서 삭제  7. 처음으로 ]");
				 //System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
				if(bookMng.equals("7")) { // 7.종료
					//처음으로 돌아가면 상위메뉴선택으로
					return category;
				 }else if(bookMng.equals("2")) { //2. 도서 검색
					 BookSearch.bookSearch(); 
					 return bookCategory();
				 }else if(bookMng.equals("3")) {  // 3.판매 및 입고 확인 
					 SaleAvailable.saleAvailable();
				 }else if(bookMng.equals("4")) { //4. 도서 등록
					 BookRegistration.bookRegi();
				 }else if(bookMng.equals("5")) { //5. 수정
					 BookEdit.bookEdit();
				 }else if(bookMng.equals("6")) { //6. 삭제
					 BookDel.bookDel(); 
				 }
				BookListOutput.bookListOutput(); //1.  회원 목록 + 변경 후 목록 보여주기
				
		}while(true);
		}catch(NullPointerException npe ){
			System.out.println("정확한 번호를 다시 입력해주세요."+npe.getMessage());
		}catch(Exception e) {
			System.out.println("정확한 번호를 다시 입력해주세요."+e.getMessage());
			throw e;
		}
		return category;
	 }
	 // 3. 회원관리 선택시
	 public  String cusCategory() {
	try {
		do { String cusMng = InputInfo.input("\n회원관리 메뉴 [1. 회원 목록 2. 회원 등록 3. 회원정보 수정 4. 회원 삭제 5. 처음으로 ]");
				 if(cusMng.equals("5")) {
						//처음으로 돌아가면 상위메뉴선택으로 돌아가기
					 return category;
				 
				 }else if(cusMng.equals("2")) { // 회원 등록
					 CustomersEnrollment.cusEnrollment();
				 }else if(cusMng.equals("3")) { //3. 회원정보 수정
					 CustomersEdit.cusEdit();
				 }else if(cusMng.equals("4")) { //4. 회원 삭제
					 CustomersRemove.cusRemove();					 
				 }
				 CustomersListOutput.cusListOutPut(); // 1. 회원 목록 + 변경 후 회원 목록 보여주기
		}while(true);	
	}catch(NullPointerException npe) {
		System.out.println("정확한 번호를 다시 입력해주세요."+npe.getMessage());
	}catch(Exception e) {
		System.out.println("정확한 번호를 다시 입력해주세요."+e.getMessage());
		throw e;
	}
	return category;
	 }
	
	public static void main(String[] args) throws Exception {
        new BookMain().start();
        System.out.println("프로그램이 종료되었습니다.");
        System.exit(0);
	}

}
