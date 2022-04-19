package firststarttofinish;

public class FirstStrFin {

	public static void main(String[] args) {

		// 1. even or odd
		for (int i = 0; i < 20; i = i + 2)
			System.out.println(i);
		// 2. Swap num
		int a = 25;
		int b = 15;
		int t = a;
		a = b;
		b = t;
		System.out.println("After swap the num:" + a + " " + b);
		// 3. Reverse a num and Palindome

		String str = "madam";
		String org_str = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		System.out.println("Reverse num:" + rev);

		if (org_str.equals(rev)) {
			System.out.println(org_str + ": This is a palindome");
		} else {
			System.out.println(org_str + " :This is not a palindome");
		}
		// 4. Duplicate String
		String sstr = "automation";
		int count = 0;
		char[] ch = sstr.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Dup string is:" + ch[j]);
					count++;
				}
				System.out.println("Total dup:" + count);

			}
		}

	}
}
