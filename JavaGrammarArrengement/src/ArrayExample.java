
public class ArrayExample {
	public static void main(String[] args) {
		int[] score=  new int[] {10,20,30,40,50};
		int count =score.length;
		System.out.println(count);
		
		String[] name = {"홍길동", "이순식"};
		System.out.println(name[0].length());
		
		System.out.println(score[score.length-1]);
	}

}
