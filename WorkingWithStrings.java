package day3;

public class WorkingWithStrings {
	
	public static void main(String []args)
	{
		String str="Hello World";
		int begin=1;
		int end=str.length();
		"mesquite in your cellar".replace('e', 'o');
		"cares".concat("s") ;
		"unhappy".substring(2);
		"hamburger".substring(4, 8);
		str.subSequence(begin, end);
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println(sb.substring(1));
	}
}
