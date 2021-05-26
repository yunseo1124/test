package Method;

public class Car {
	//필드
	int gas;
	
	//생성자
	//없어도 자동생성
	
	//메소드
	void setGas(int gas) { //리턴이 없으면 void
		this.gas = gas; 
	}
	
	boolean isLeftGas() { //리턴값이 boolean 메소드
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;//gas가 0이면 false
		}
		System.out.println("gas가 있습니다.");
		return true; //gas가 있으면 true
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다(gas 잔량:" +gas+ ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다(gas 잔량:" +gas+ ")");
				return; //메소드 실행 종료
			}
		}
	}
}
