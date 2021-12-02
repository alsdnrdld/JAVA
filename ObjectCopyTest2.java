package ch21;

/* 그럼 깊은복사란? 같은 값을 다른 주소에 저장하는 것을 깊은 복사라고 한다
 * 이 경우 얕은복사와 달리 전혀 다른 주소에 있기 때문에 완전히 독립적인 상태가 된다.
 * 복사본이나 원본의 값을 수정한다 해도 서로에게 영향을 미치지 않는다.
 * 
 * 각각 다른 주소값을 줘야하므로 배열 인스턴스를 각각 해준 다음 복사를 하면 된다.
 * */

public class ObjectCopyTest2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
	///// 얕은 복사와 다른 부분//////////////////////////////////////////////////////	
	
 //System.arraycopy(library, 0, copyLibrary, 0, 5); 이 메소드는 깊은 복사에서는 필요 없다. 
		
		copyLibaray[0] = new Book();
		copyLibaray[1] = new Book();
		copyLibaray[2] = new Book();
		copyLibaray[3] = new Book();
		copyLibaray[4] = new Book();
		
		
		
		for(int i = 0; i< library.length; i++) {
			copyLibaray[i].setTitle(library[i].getTitle());
			copyLibaray[i].setAuthor(library[i].getAuthor());
		}
///////////////////////////////////////////////////////////////////////////////////////
  
 
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
	
		System.out.println("======library=========");
		for( Book book : library) {
			book.showInfo();
		}
		
		System.out.println("======copy library=========");
		for( Book book : copyLibaray) {
			book.showInfo();
		}


	}

}
