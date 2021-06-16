package customer_mng;

import java.util.TreeMap;

public class CustomersData {
	public static TreeMap<Integer, CustomersVO> cusList = new TreeMap<Integer, CustomersVO>();	
	public CustomersData() {
	    
	}
	public static void setCustomersList() {
		// key: 회원번호 value: CustomersVO(회원번호, 이름, 연락처, 등급)
		// 회원 등급  WHITE - SILVER -GOLD -DIAMOND
		//    5권 이내 구매, 6~10권구매, 11~15, 16권 이상
		cusList.put(1, new CustomersVO(1,"김봄","010-1234-5678", "1993.12.10", 1, "WHITE"));
		cusList.put(2, new CustomersVO(2,"이여름","010-1444-3338","2000.04.10",6,"SILVER"));
		cusList.put(3, new CustomersVO(3,"박가을","010-1342-5228","1999.07.01",12,"GOLD"));
		cusList.put(4, new CustomersVO(4,"장겨울","010-9090-7799","1997.03.29",20,"DIAMOND"));
		cusList.put(5, new CustomersVO(5,"강우리","010-2344-5002","2001.01.17",2,"WHITE"));
		cusList.put(6, new CustomersVO(6,"한나라","010-1124-0987","1985.05.14",10,"SILVER"));
		cusList.put(7, new CustomersVO(7,"최만세","010-3324-0547","1978.09.18",14,"GOLD"));
	}
}
