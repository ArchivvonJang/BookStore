package customer_mng;

public class CustomersVO {
   // 멤버변수 회원정보
	private int cusNo;
	private String cusName;
	private String cusTel;
	private String cusBirth;
	private String cusLevel;
	int purchase;
	
	public CustomersVO(int cusNo, String cusName, String cusTel, String cusBirth, int purchase, String cusLevel) {
		this.cusNo = cusNo;
		this.cusName =cusName;
		this.cusTel=cusTel;
		this.cusLevel=cusLevel;
		this.cusBirth=cusBirth;
		this.purchase=purchase;
	}
	public int getCusNo() {
		return cusNo;
	}
	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusTel() {
		return cusTel;
	}
	public void setCusTel(String cusTel) {
		this.cusTel = cusTel;		
	}
	public String getCusBrith() {
		return cusBirth;
	}
	public void setCusBrith(String cusBrith) {
		this.cusBirth = cusBrith;
	}
	public String getCusLevel() {
		return cusLevel;
	}
	public void setCusLevel(String cusLevel) {
		this.cusLevel = cusLevel;
	}

	public int getPurchase() {
		return purchase;
	}
	public  void setPurchase(int purchase) {
		this.purchase = purchase;
		// 구매수량 + 기존 수량 = 합계
		
	}
	

}
