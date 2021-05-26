package Final;

public class PersonExample {
	public static void maitn(String[] args) {
		Person p1 = new Person("123-123", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
//		p1.nation = "usa"; //final로 인한 오류
//		p1.ssn = "123-345"; //final로 인한 오류
		p1.name = "을지문덕";
	}
}
