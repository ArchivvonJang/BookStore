package book_mng;

public class BookLogin {
    //도서관리시스템 로그인
	public static String id;
	public static String pwd;
	
	public BookLogin() {	
	}
	// 로그인 확인하는 메소드
	public static boolean loginCheck() {
		if(id == " " || pwd == "") {
			System.out.println("[ 작은 서점 도서관리프로그램 관리자 로그인 ]");
			return false;
		}else {
			if(id.equals("bose")&& pwd.equals("0000")) {
				return true;
			}else {
				return false;
			}
		}
	}

}
