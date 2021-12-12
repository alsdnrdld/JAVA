package ch01;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author; 
		// 얘는 메서드가 아니라 생성자 return이 없는데 void가 없으므로...
	}

	/*
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return title+","+author; }
	 */
	
	
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("리블링","김누룩");
		
		System.out.println(book);		
		String str = new String("test");  //이미 toString()이 오버라이드 되어 있기 때문에 주소값이 아닌 문자열이 출력 되게 된다.
		System.out.println(str);

	}

}
