package classproj;

/*
 * 1. accelerator() : oil 1 사용, speed 5 증가, 최고시속 20
 * 2. breakc()       : speed 5 감소, 최저시속 0
 */


public class Car {
	
	// Field - 초기화
	String model;  // null
	int speed;     // 0
	int oil;       // 0
	boolean power; // false
	final int MAX_SPEED = 20; // final : 상수
	String color;
	
	// Constructor
	Car(){
		System.out.println("Car가 생성되었습니다.");
	}
	
	
	// Method
	void setModel(String m){
		model = m;
	}
	void setColor(String c) {
		color = c;
	}
	void setOil(int o) {
		oil = o;
	}
	void startCar() {
		if (oil == 0) {
			return; // return type이 void인 method를 종료시킴
		}
		power = true;
	}
	void  accelerator() { // 엑셀
		if (!power || oil == 0) { // power == false
			return;
		}
		
		oil--;
		speed += 5;
		
		if (speed > MAX_SPEED) {
			speed = MAX_SPEED;
		}
		
	}
	void breakc() { // 브레이크
		if (!power || speed == 0) {
			return;
		}
		speed -= 5;
		if (speed < 0) {
			speed = 0;
		}
		
	}
	void panel() { // 패널확인
		System.out.println("속도="+speed);
		System.out.println("기름="+oil);
	}
	void stopCar() {
		speed = 0;
		power = false;
	}

}
