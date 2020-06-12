package com.capgemini.Assignment.Programs;

import java.util.Scanner;

public class InsertionSortExample {

	public static void Sort(int a[]) {
		int n = a.length; 
        for (int i = 1; i < n; ++i) { int key = a[i]; int j = i - 1; 
        while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        } 
	}

	public static void printarray(int a[]) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		int n,i;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array to sort:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements ");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Elements in array ");
		printarray(a);
		Sort(a);
		System.out.println("\nElements after sorting");
		printarray(a);

	}

}
