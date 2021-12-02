package ch24;

import java.util.ArrayList;

public class Student {
	
	
	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList = new ArrayList<>();
	//ArrayList의 형태를 Subject 클래스의 정보에 맞게 준비하라는 의미로 봐도 되나?
	
	
	//생성자
	Student(int studentId, String studentName){
				
		this.studentId = studentId;
		this.studentName = studentName;
				
		
	}
	
	public void addSubject(String name, int scorePoint) {
		
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(scorePoint);
		
		subjectList.add(subject);
	}
	
	
	
	public void showScoreInfo(){
		int total = 0;
		
		//subjectList의 모든 원소들을 Subject타입으로 뽑아낼거다.
		for(Subject subject: subjectList) { // 클래스 타입이라는게 무슨 뜻?
			total += subject.getScorePoint();
			System.out.println(studentName+" 학생의 "+ subject.getName()+" 과목의 성적은 "+subject.getScorePoint()+"입니다.");
		}
		System.out.println(studentName+"학생의 총점은 "+total+"점 입니다.");
	}
	
}
