package edu.kh.inheritance.model.service;

import java.util.Scanner;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	
	// 상속 확인 예제
	public void ex1() {
		// Person을 상속받은 Student가 Person 필드, 메소드를
		// 사용할 수 있는가?
		
		Person p = new Person();
		
		//p.name = "홍길동"; // private 때문에 직접접근불가(에러발생)
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName()); // 홍길동
		System.out.println(p.getAge()); // 25
		System.out.println(p.getNationality()); // 대한민국
		
		
		System.out.println("-------------------------------------------");
		
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student만의 고유한 필드
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 필드, 메서드
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade()); // 3
		System.out.println(std.getClassRoom()); // 5
		
		// Student가 Person의 메소드 뿐 아니라 필드도 상속 받았는지 확인
		System.out.println(std.getName()); // 고길동
		System.out.println(std.getAge()); // 19
		System.out.println(std.getNationality()); // 대한민국
		
		System.out.println("-------------------------------------------");
		
		Employee emp = new Employee();
		
		// Employee만의 고유 메서드
		emp.setCompany("KH정보교육원");
		
		// Person 클래스로부터 상속받은 메서드
		emp.setName("조미현");
		emp.setAge(7);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany()); // KH정보교육원
		
		System.out.println(emp.getName()); // 조미현
		System.out.println(emp.getAge()); // 7
		System.out.println(emp.getNationality()); // 대한민국
		
		// 추가된 breath() 메서드 상속 확인하기
		p.breath(); // 사람은 코나 입으로 숨을 쉰다
		std.breath(); // 사람은 코나 입으로 숨을 쉰다
		emp.breath(); // 사람은 코나 입으로 숨을 쉰다
		// 상속의 특징 : 코드 추가 및 수정에 용이함
		// -> 부모에게 정의하면 상속받은 자식들은 모두 부모의 것을 그대로
		// 받아서 쓸 수 있음!

	}
	
	// super() 생성자 사용방법
	public void ex2() {
		
		// Student 매개변수 5개짜리 생성자
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName()); // 김철수
		System.out.println(std.getAge()); // 17
		System.out.println(std.getNationality()); // 한국
		
		System.out.println(std.getGrade()); // 1
		System.out.println(std.getClassRoom()); // 3
	}
	
	// 오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩 X -> Person의 메소드 수행
		
		emp.move(); // 오버라이딩 O -> Employee 메소드 수행
		
		
	}
	
	public void ex4() {
		// 모든 클래스는 Object 클래스의 후손
		// == 모든 클래스의 최상위 부모는 Object
		
		Person p = new Person();
		// Object를 상속받은 Person객체 생성
		
		Student std = new Student();
		// Person을 상속받은 Student객체 생성
		
		// Object - Person - Student
		
		
		System.out.println(p.hashCode());
		System.out.println(std.hashCode());
		// Person이 Object에서 물려받은 hashCode()를
		// Student가 또 물려받아 사용
		
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(str.hashCode());
		// String - Object
		System.out.println(sc.hashCode());
		// Scanner - Object
		
	}
	
	public void ex5() {
		
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println( p.toString() ); // 김철수 / 17 / 한국
		System.out.println( p ); // 김철수 / 17 / 한국
		// print 구문 수행 시 참조 변수명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다!
		
		System.out.println("-----------------------------------");
		
		Student std = new Student("이백점", 18, "미국", 2, 6);
		
		System.out.println(std.toString()); // 이백점 / 18 / 미국 / 2 / 6

	}

}
