package Pro02;
import Pro01.A;

//D는 A클래스의 자식 클래스여서 오류x
public class D extends A {
	public D() {
		super();
		this.field ="value";
		this.method();
	}
}
