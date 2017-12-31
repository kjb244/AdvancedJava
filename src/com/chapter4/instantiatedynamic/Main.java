package com.chapter4.instantiatedynamic;


import java.lang.reflect.Constructor;

public class Main {

	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, OliveColor.BLACK);
		
		Class<?> c = o.getClass();
		
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());

		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("Number of constructors: " + constructors.length);
		Constructor<?> con = constructors[0];

		Object obj= null;
		try{
			obj = con.newInstance(OliveName.PICHOLINE,OliveColor.GOLDEN);
			System.out.println(obj);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}


		
	}

}
