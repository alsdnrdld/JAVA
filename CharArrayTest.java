package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch ='A';
		
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
			
		}
		// 배열 alphabets의 모든 원소들을 char타입의 변수로 하나하나 다 뽑아낼거다
		for(char alpha : alphabets) {
			System.out.println(alpha+" , "+ (int)alpha);
		}
	}

}
