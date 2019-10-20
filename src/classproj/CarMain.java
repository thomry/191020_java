package classproj;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		// myCar.speed += 100; - 실행됨. 문제코드발발
		// field불러서 설정하는 것이 좋지 않음
		
		myCar.setModel("e-class");
		myCar.setOil(10);
		
		myCar.startCar();
		myCar.accelerator();
		myCar.panel();
		
		myCar.breakc();
		myCar.panel();
		
		myCar.stopCar();

	}

}
