package customer_mng;


import java.util.Iterator;
import java.util.Set;

import book_mng.InputInfo;

public class CustomersEdit {

//회원정보 수정
	public CustomersEdit() {
		// TODO Auto-generated constructor stub
	}
	 public static void cusEdit() {
		 try {
		    
	    	// 회원번호를 입력받고 수정한다.
		 	int cusNo = Integer.parseInt(InputInfo.input("\n수정할 회원번호를 입력하세요"));
			//회원 연락처, 회원등급 수정하기
	    	CustomersVO cvo = CustomersData.cusList.get(cusNo);
	    	
	    	// 먼저 수정하기전 회원 정보를 출력하기
	    	Set<Integer> keyList = CustomersData.cusList.keySet();
	    	Iterator<Integer> itr = keyList.iterator();
	    	if(itr.hasNext())
	    		System.out.printf("%d\t %-5s\t %-15s\t %-11s\t %d 권\t %s\n",cvo.getCusNo(),cvo.getCusName(),cvo.getCusTel(),cvo.getCusBrith(), cvo.getPurchase(),cvo.getCusLevel());
	    	
	    	// null 이 아닐경우 원하는 회원정보 수정하기
	    	if(cvo == null){
	    		System.out.println("존재하지 않는 회원입니다.");
	    		}else { // 해당 회원의 정보가 있을 때, 수정한다.
	    			String cCategory = InputInfo.input("\n수정할 회원정보를 선택하세요. [ 1. 회원 연락처 2. 회원 생년월일 3. 구매 수량 4. 회원 등급 ]");
	    			// 입력값이 1과 같으면 회원 연락처 입력받은 새 값으로 set한다. 
	    			if(cCategory.equals("1")) {
	    				String cusTel= InputInfo.input("회원 연락처 수정");
	    				cvo.setCusTel(cusTel);
	    			// 입력값이 2와 같으면 회원 등급 입력받은 새 값으로 set한다. 	
	    			}else if(cCategory.equals("2")) {
	    				String cusBirth = InputInfo.input("회원 생년월일 수정");
	    				cvo.setCusBrith(cusBirth);
	    			}else if(cCategory.equals("3")) {
	    				//int purchase = Integer.parseInt(InputInfo.input("회원 도서 구매수량"));
	    				level(cusNo);
	    			
	    			}else if(cCategory.equals("4")) {
	    				String cusLevel = InputInfo.input("회원 등급 수정");
	    				cvo.setCusLevel(cusLevel);
	    				
	    			}
	    		}
	    	}catch(NullPointerException npe) {
	    		 System.out.println("정확한 수량을 입력해주세요."+npe.getMessage());
	    	}catch(Exception e) {
	    		 System.out.println("정확한 수량을 입력해주세요."+e.getMessage());
	    		 throw e;
	    	}
	 }
	//특정키의 구매수량을 가져오는 식을 만들어야함
	 //Cannot invoke "customer_mng.CustomersVO.setPurchase(int)" because "cvo" is null
	 public static void level(int cusNo) {
	 try {
		 int purchase = Integer.parseInt( InputInfo.input("\n회원 도서 구매수량")) ;
		 System.out.println("\n[회원 등급 기준] \n*WHITE : 5권 이상 구매 \n*SILVER : 6권 ~ 10권 구매 \n*GOLD : 11권 ~ 15권 구매 \n*DIAMOND : 16권 이상 구매\n");
		// String cusLevel; 
/*
		 Set<Integer> keyList = CustomersData.cusList.keySet();
	     Iterator<Integer> itr = keyList.iterator();
	 */
	     CustomersVO cvo= CustomersData.cusList.get(cusNo);
	     int pur = cvo.getPurchase();
	     int CusPur = pur + purchase;
	     cvo.setPurchase(CusPur );
	    
		 if(CusPur <= 5 ) { 
			 String level = "WHITE";
			 cvo.setCusLevel(level);
		 }else if(CusPur>= 6 && CusPur<10) {
			 String level = "SILVER";
			 cvo.setCusLevel(level);
		 }else if(CusPur>=11 && CusPur<= 15) {
			 String level = "GOLD";
			 cvo.setCusLevel(level);
		 }else if(CusPur>15) {
			 String level = "DIAMOND";
			 cvo.setCusLevel(level);
		 
	     }
	 }catch(NullPointerException npe) {
		 System.out.println("정확한 수량을 입력해주세요."+npe.getMessage());
	 }catch(Exception e) {
		 System.out.println("정확한 수량을 입력해주세요."+e.getMessage());
		 throw e;
	 }
	 }
	 
}