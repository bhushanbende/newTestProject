package javaPrograms;

import java.util.Scanner;

public class Compare_Two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1, s2;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the String 1 :");
		s1 = in.nextLine();

		System.out.println("Enter the string 2 :");
		s2 = in.nextLine();

		boolean b = (s1.contentEquals(s2));
		if (b == true) {
			System.out.println("Both the strings are equal");

		} else {
			System.out.println("Both the string are not equal");
		}

	}

} # nothing changes unless the comments in here
#adding 2nd comment to check git branching
