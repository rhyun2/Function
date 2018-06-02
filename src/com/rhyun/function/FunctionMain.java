package com.rhyun.function;

public class FunctionMain {

	public static void main(String[] args) {
		One one = new One();
		
		one.call();
		
		String value = one.getValue();
		System.out.println(value);
		
		Two two = new Two();
		two.print("안녕");
		String str = "Hello";
		two.print(str);
		
		two.printMuti("오랜만에",100, "too goo");

	}

}
