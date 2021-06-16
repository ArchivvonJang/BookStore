package customer_mng;

import book_mng.InputInfo;

public class CustomersRemove {

	public static void cusRemove() {
		// 회원정보를 삭제한다.
		
		//InputInfo input = new InputInfo();
		String cNo = InputInfo.input("삭제할 회원번호");
		CustomersData.cusList.remove(Integer.parseInt(cNo));
	}

	

}
