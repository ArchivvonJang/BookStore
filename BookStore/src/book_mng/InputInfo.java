package book_mng;

import java.util.Scanner;

public class InputInfo {
	static Scanner scan = new Scanner(System.in);
	public InputInfo() {
	}
	// 입력받는 메소드
	// 콘솔에서 문자를 입력받아 문자로 리턴한다.
	 public static String input(String msg) {
	    	System.out.print(msg + " : ");
	    	return scan.nextLine();
	  }
}
