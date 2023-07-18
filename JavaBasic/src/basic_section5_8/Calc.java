package basic_section5_8;

public interface Calc {
	
	double PI = 3.14;
	int Error = -99999999;

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int nunm1, int num2);
	
	default void description() {
		System.out.println("정수를 계산합니다. ");
	}
	
	private void myMethod() { // 이 interface 안에서만 사용가능.
		System.out.println("private method");
	}
	
	static int total(int[] arr) {
		int sum = 0;
		
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
}
