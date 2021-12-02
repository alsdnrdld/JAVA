package ch21;

public class ObjectCopyTest1 {

	public static void main(String[] args) {
		Book[] library = new Book[5]; 
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		//.arraycopy는 얕은 복사만을 한다.
		
		library[0].setAuthor("박원서");
		library[0].setTitle("나목"); 
		
		System.out.println("== library==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copy Library==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		/*
		 * 위와 같은 복사를 얕은 복사라고 부른다 주소 값만을 복사하여 
		 * 원본과 복사본이 독립되지 못하고 연동되어 있는 복사를 말한다.
		 * 즉 복사본 혹은 원본 둘 중 1개를 손대면 다같이 바뀌어버린다...
		 *
		 **/
		
	
		
		

	}

}
