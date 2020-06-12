package com.capgemini.Assignment.Programs;

public class Example2 {
	public static void main(String[] args) {
		String s = "Hello my dear best friend";
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
			result += (split[i] + " ");
		}
		System.out.println(result.trim());
	}

}
