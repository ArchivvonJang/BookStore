package customer_mng;

import java.util.Iterator;
import java.util.Set;

public class CustomersListOutput {

	public CustomersListOutput() {
	}
	
    public static void cusListOutPut() {
    	Set<Integer> keyList = CustomersData.cusList.keySet();
    	Iterator<Integer> itr = keyList.iterator();
    	
        System.out.println("\n[ 회원 목록 ]");
    	while(itr.hasNext()) {
    		CustomersVO cvo= CustomersData.cusList.get(itr.next());
    		//// key: 회원번호 value: CustomersVO(회원번호, 이름, 연락처, 등급)
    		System.out.printf("%d\t %-10s\t %-15s\t %-11s\t %d 권\t %s\n",cvo.getCusNo(),cvo.getCusName(),cvo.getCusTel(),cvo.getCusBrith(),cvo.getPurchase(),cvo.getCusLevel());
    	}
    	System.out.println("\n전체 회원수 :  "+ CustomersData.cusList.size() + " 명\n");
    }
 
}
