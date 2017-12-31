package com.chapter4.inheritancetree;

public class Main {

	public static void main(String[] args) {
		Object o = new Ligurio();
		Class<?> c = o.getClass();
		System.out.println("class name" + c.getName());

		Class<?> sup = c.getSuperclass();
		System.out.println("supername " + sup.getName());

        Class<?> sup2 = sup.getSuperclass();
        System.out.println("supername2 " + sup2.getName());

        Package p = c.getPackage();
        System.out.println("package " + p.getName());
	}

}
