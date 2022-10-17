package com.inetbanking;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {

String str1 =  "qwerty";
String str2 = "wqrety";

char array1[] = str1.toCharArray();
char array2[] = str2.toCharArray();

Arrays.sort(array1);
Arrays.sort(array2);

boolean result = Arrays.equals(array1, array2);
		
		System.out.println(result);

	}

}
