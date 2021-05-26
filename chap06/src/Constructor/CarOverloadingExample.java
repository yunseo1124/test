package Constructor;

public class CarOverloadingExample {
	public static void main(String[] args) {
		CarOverloading car1 = new CarOverloading();
		System.out.println("car1 company: " + car1.company);
		System.out.println();
		
		
		CarOverloading car2 = new CarOverloading("자가용");
		System.out.println("car2 company: " + car2.company);
		System.out.println("car2 model: " + car2.model);
		System.out.println();
		
		CarOverloading car3 = new CarOverloading("자가용", "빨강");
		System.out.println("car3 company: " + car3.company);
		System.out.println("car3 model: "+ car3.model);
		System.out.println("car3 color: "+ car3.color);
		System.out.println();
		
		CarOverloading car4 = new CarOverloading("자가용", "빨강", 200);
		System.out.println("car4 company: " + car4.company);
		System.out.println("car4 model: " + car4.model);
		System.out.println("car4 color: " + car4.color);
		System.out.println("car4 maxSpeed: " + car4.maxSpeed);
	}
}
