package basic_section5_test;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("엄청 빠르게 점프합니다.");

	}

	@Override
	public void turn() {
		System.out.println("엄청 빠르게 턴 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 상급자 레벨입니다. ******");
	}
}
