package Method;

public class Calculator {
	//메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {//return이 없으면 void로 한다.
		System.out.println("전원을 끕니다");
	}
}
