
public class Basic {
	
	public static void main(String[] args) {
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(10, 30));
		System.out.println(Math.abs(-30));
		
		//문자열을 숫자형태로 바꾸는법 Interger.parseInt(변수값)
		//숫자를 문자열로 바꾸는법 String.valueOf(변수값)
		String str = "100";
		int i = Integer.parseInt(str);
		long l =Long.parseLong(str);
		
		String str2 =String.valueOf(i);
		
		System.out.println(l);
		System.out.println(i);
		System.out.println(str2);
		
	}

}
