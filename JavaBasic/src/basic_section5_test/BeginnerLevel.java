package basic_section5_test;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("못하는 기능입니다.");

	}

	@Override
	public void turn() {
		System.out.println("못하는 기능입니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 초급자 레벨입니다. ******");
	}
}
