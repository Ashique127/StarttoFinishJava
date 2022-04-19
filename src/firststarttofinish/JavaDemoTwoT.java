package firststarttofinish;

public class JavaDemoTwoT {

	public static void main(String[] args) {
		// Duplicate String
		String strr = "institute";
		int count = 0;
		char[] ch = strr.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate value is:" + ch[j]);
					count++;
				}
			}
		}
		System.out.println("Total duplicate value:" + count);
	}

}
