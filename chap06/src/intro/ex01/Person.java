//라이브러리(API용): 다른 클래스에서 이용할 목적

package intro.ex01;

import java.net.NoRouteToHostException;

public class Person { //참조클래스

	//class 구성요소
	//1. 필드: person 클래스의 속성
	public String name;//public: 모든 클래스 사용 가능 
	private String phoneNumber = "000-0000-0000";// private: 모든 외부 클래스x
	int age = 1;// 접근제한자가 없으면 default: 자기자신 클래스에서만 사용
	public String email;
	
	//name ="정윤서"; 필드는 메소드 내에서만 값을 할당할 수 있습니다.
	
	//2. 생성자(반드시 가져야한다) : 다른 클래스에서 new연산자 객체를 생성 할 수 있게함
	
	public Person() {
		System.out.println("기본생성자(NoArgsConstrucotr)를 사용함");
	}
	
	//private Person(String name, String phoneNumber, int age, String email) private 오류
	public Person(String name, String phoneNumber, int age, String email) {
		this.name =name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.email = email;
		System.out.println("모든 필드를 매개변수로 갖는 생성자(AllArgsConstructor)가 사용됨");		
	}
//	Person(String name){
//		this.name = name;
//	}// 실행용 코드 25-27줄의 생성자
	
	//3. 메소드
	//반환값(리턴타입)이 있는 메소드: return 실행문이 포함됨
	//반환값(리턴타입)이 없는 메소드: return 실행문이 포함될 수도 있고 안될 수도 있음
	
	public int returnAge() {//선언부
		System.out.println("객체에 설정된 나이: "+this.age);
		return this.age;
	}
	
	public void returnName() { 
		System.out.println("객체에 설정된 이름: "+this.name);
	}
	public void returnName2(){
		System.out.println("객체에 설정된 이름: "+this.name);
		return;
	}
	public String getPhoneNuber() {
		if(this.phoneNumber == null ) {
			this.phoneNumber = "3333-3333";
		}
		
		return this.phoneNumber;
	}
}
