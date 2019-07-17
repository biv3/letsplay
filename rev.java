package Lab;

public class rev {
	public static void main(String args[])
	{
		String a="Akansha";
	int b=a.length();
	String c="";
	for(int i=0;i<b;i++)
	{ 
		c=a.charAt(i)+c;
		System.out.println(a.substring(i));
	}
System.out.println(c);
System.out.println(a.replace('A', 'S'));
System.out.println(a.concat(" Katiyar"));
System.out.println("     addgh     ".trim());
System.out.println(a.equals("AkaNsha"));
System.out.println(a.equalsIgnoreCase("aKaNsHa"));
System.out.println(a.indexOf("a",4));
}
}