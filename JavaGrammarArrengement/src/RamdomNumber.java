import java.util.Random;

public class RamdomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int rand = random.nextInt(4)+5; //4~8까지 출력
		int randA = random.nextInt(9); //0~8까지 랜덤으로 출력
		System.out.println(rand);
		System.out.println(randA);
	}

}
