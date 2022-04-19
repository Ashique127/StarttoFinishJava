package firststarttofinish;

public class SecondStrFin {

	public static void main(String[] args) {
		String sstr = new String("automation");
		int count = 0;
		char[] ch = sstr.toCharArray();
		for (int i = 0; i < ch.length; i++)
			for (int j = i + 1; j < ch.length; j++)
				if (ch[i] == ch[j]) {
					System.out.println("Dup string is:" + ch[j]);
					count++;

				}

		System.out.println("Total dup:" + count);
	}

}
