//실행용
package intro.ex01;

public class PersonExample {

	public static void main(String[] args) {
		
		//로컬변수인데 사용자 클래스타입의 로컬변수
		Person myPerson1 = new Person();//객체생성
		//name, email :null
		//age:1
		//phoneNumber: 000-0000-0000
		
		//myPerson1.phoneNumber = "222-2222-2222" private 접근제어로 컴파일 오류
		myPerson1.age = 17;
		System.out.println("이름: "+ myPerson1.name);//null
		System.out.println("나이: "+ myPerson1.age);// 생성자가 없을떄 jdk 컴파일러가 자동으로 추가
		
		Person myPerson2 = new Person("정윤서", "555-55555-5555", 25, "구트@구트닷컴");
			System.out.println("myPerson2 이름: "+ myPerson2.name);
			//System.out.println("myPerson2 번호: "+ myPerson2.phoneNumber);->private오류?
			System.out.println("myPerson2 나이: "+myPerson2.age);
			System.out.println("myPerson2 이메일: "+myPerson2.email);
		
		//String myPhoneNumber = myPerson2.phoneNumber;//The field PErson.phoneNumver is not visible 오류
		String myPhoneNumber = myPerson2.getPhoneNuber();
		System.out.println("myPerson2.phoneNumver: "+myPhoneNumber);

//		Person myPerson3 = new Person("정윤서");{
//			System.out.println("myPerson3 이름: "+ myPerson3.name);
//		} // 수업에서는 참조클래스에 생성자가 없어서 컴파일 오류 -> 추가로 참조클래스 추가 함
		
		
	}

}
