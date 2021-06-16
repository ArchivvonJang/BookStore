package customer_mng;

import book_mng.InputInfo;

public class CustomersEnrollment {
// 고객 등록 
	public CustomersEnrollment() {
	}
    public static void cusEnrollment() {
    	try {
    	// key: 회원번호 value: CustomersVO(회원번호, 이름, 연락처, 등급)
    	//먼저 기존의 회원목록 보여주기
    	//System.out.println("[ 현재 회원 정보 ]");
    	//CustomersListOutput.cusListOutPut();
    	
    	// System.out.println("-------------------------------------------------------------------------------");
    	
    	System.out.println("\n[ 신규 회원 등록 ]\n");
    	int cusNo = Integer.parseInt(InputInfo.input("회원 번호"));
    	// 중복 불가 넣기
    	String cusName = InputInfo.input("회원 이름");
    	String cusTel = InputInfo.input("회원 연락처");
    	String cusBirth = InputInfo.input("회원 생년월일");
    	
    	// 초기 회원등급은 항상 WHITE
    	// 회원등급 : WHITE - SILVER - GOLD - DIAMOND 
    	String cusLevel = "WHITE";
        int purchase = 0;
    	CustomersData.cusList.put(cusNo, new CustomersVO(cusNo, cusName, cusTel, cusBirth, purchase, cusLevel));
    	}catch(NullPointerException npe) {
    		System.out.println("다시 입력해주세요"+npe.getMessage());
    	}catch(Exception e) {
    		System.out.println("다시 입력해주세요"+e.getMessage());
    	}
    }
}
