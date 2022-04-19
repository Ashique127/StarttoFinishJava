package firststarttofinish;

public class JaveDemo {

	public static void main(String[] args) {
		// 1. Swap
		int a = 20;
		int b = 10;
		int t = a;
		a = b;
		b = t;
		System.out.println("After swapping the value will be:" + a + "   " + b);
		// 2.Reverse a number & palindome
		String str = "bring";
		String org_str = str;
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		System.out.println("Reverse string:" + rev);
		if (org_str.equals(rev)) {
			System.out.println(org_str + " This is a palindome");
		} else {
			System.out.println(org_str + " This is not a palindome");
		}
	}

}
