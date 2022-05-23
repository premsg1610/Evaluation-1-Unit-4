
// why string is immutable in java?

// when we define and initialize a string it gives reference to the memory location where it is stored.
// when a value is stored then it gets stored and when we re assign it, the original value doesn't changes,
// now it will give reference to the value new value but the old value will remain in memory.

// difference between string and string builder?
// strings are immutable but to change string value we use string builder and treat it as mutable.
// if we want to concatinate repeatedly  or change the string then we use string builder.

package com.eval1_Q1;

public class Demo {

	public static void main(String[] args) {
		
		String i = "0123456789";
		
		String a = "prem";
		String b = "prem";
		
		System.out.println(a.equals(b));
		System.out.println(a.charAt(2));
		System.out.println(a.concat(" sagar"));
		System.out.println(i.indexOf("2"));
		System.out.println(a.lastIndexOf("e"));
		System.out.println(i.length());
		
	}
}
