package basic_section3_test1;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory factory = Factory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}