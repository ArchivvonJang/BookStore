package book_mng;

public class BookVO {
     // 멤버변수를 선언하여 데이터를 캡슐화한다.
	private int bookNo;
	private String bookName;
	private String author;
	private String publisher;
	private String publishingDate;
	private String genre;
	private String sale;

	
	public BookVO() {}
	
	// BookVO 생성자를 추가한다.
	public BookVO(int bookNo, String bookName, String author, String publisher, 
			String publishingDate, String genre, String sale) {
		// 멤버변수로 넘긴다.
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.publishingDate = publishingDate;
		this.genre = genre;
		this.sale = sale;
	}
	// Getter 와 Setter 설정한다.

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(String publishingDate) {
		this.publishingDate = publishingDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSale() {
		return sale;
	}

	public void setSale(String sale) {
		this.sale = sale;
	}


	}
    
	
	
	


