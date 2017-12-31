package com.chapter4.classclass;

public class Main {

	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, 0x00FF00);
		Class<?> c = o.getClass();
		System.out.println(c);
		
	}

}
