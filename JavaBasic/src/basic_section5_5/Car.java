package basic_section5_5;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void chargeOrfeul(); //상속 받은 놈들이 무조건 작성해야하는 놈들
	public void washCar() {}; // overide 해도되고 안해도 되
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { // 템플릿 메서드 
		startCar();
		drive();
		stop();
		turnOff();
		chargeOrfeul();
		washCar();
		
	}
}
