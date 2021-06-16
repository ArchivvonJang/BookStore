package book_mng;


import java.util.TreeMap;


public class BookData {
	// 도서 정보를 입력
	public static TreeMap<String, BookVO>bookList = new TreeMap<String,BookVO>();

	public BookData() {
		}
	public static void setBookList() {
		// key: 책 제목 value: BookVO(책 제목, 작가, 출판사, 출판년일, 장르)
		bookList.put("알사탕",new BookVO(1, "알사탕","백희나","책읽는곰","2017.03","유아", "판매 가능" ));
		bookList.put("달 샤베트",new BookVO(2, "달 샤베트","백희나","책읽는곰","2014.05","유아", "판매 가능" ));
		bookList.put("명랑한 은둔자",new BookVO(3, "명랑한 은둔자","캐롤라인 냅","바다출판사","2020.09","에세이", "판매 가능"));
		bookList.put("당근 유치원",new BookVO(4, "당근 유치원","안녕달","창비","2020.05","유아", "판매 가능"));
		bookList.put("사랑해 사랑해 사랑해",new BookVO(5, "사랑해 사랑해 사랑해","버나뎃 로제티 슈스탁","보물창고","2006.12","유아", "판매 가능"));
		bookList.put("바삭바삭 갈매기",new BookVO(6, "바삭바삭 갈매기","전민걸","한림출판사","2014.11","유아", "판매 가능"));
		bookList.put("두드려 보아요",new BookVO(7, "두드려 보아요","안나 클라라 티돌름","사계절","2007.04","유아", "판매 가능"));
		bookList.put("도토리랑 콩콩",new BookVO(8, "도토리랑 콩콩","윤지회","미래엔아이세움","2020.12","유아", "판매 가능"));
		bookList.put("행복한 청소부",new BookVO(9, "행복한 청소부","윤지회","미래엔아이세움","2020.12","유아", "판매 가능"));
		bookList.put("이상한 나라의 엘리스",new BookVO(10, "이상한 나라의 엘리스","루이스 캐롤","넥서스주니어","2020.09","유아","판매 가능" ));

	}
		
	
	}
