package com.capgemini.Assignment.Programs;

public class Example4 {
	public static void main(String[] args) {
		String str[] = "How are you doing".split(" ");
		int len = str.length;
		String ans = "";
		String revWords = "";
		for (int i = 0; i < len; i++) {
			String words = str[i];
			if (i % 2 == 0) {
				for (int j = words.length() - 1; j >= 0; j--) {
					revWords = revWords + words.charAt(j);
				}
				// Alternatively accumulate the same in the answer variable to preserve the
				// order.
				ans = ans + revWords + " ";
				// Reset the revWords variable to reverse the next alternate word.
				revWords = "";
			}
			// Accumulate the words to answer variable which are next to the reversed Words.
			else
				ans = ans + str[i] + " ";
		}
		System.out.println(ans);
	}

}
