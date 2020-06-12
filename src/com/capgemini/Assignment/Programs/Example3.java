package com.capgemini.Assignment.Programs;

public class Example3 {
	public static void main(String[] args) {
		String sentence = "How are you doing";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word+" "+word.length());
		}
	}

}
