package testProject;

import java.util.Arrays;

public class aa {
	public static void main(String[] args) {
		String my_str = "12345678";
		int n = 4;
		
		int arrayLength = my_str.length() / n;
				
		if (my_str.length() % n != 0) {
			arrayLength++;
		}
		
		String[] answer = new String[arrayLength];
		
		int dot = 0;
		int k = 0;
		
		for (int i = 0; i < arrayLength; i++) {
			k += n;
			if (k >= my_str.length()) {
				k = my_str.length();
			}
			answer[i] = my_str.substring(dot, k);
			System.out.println("1. " + my_str.substring(dot, k));
			dot += n;
		}
	}
}
