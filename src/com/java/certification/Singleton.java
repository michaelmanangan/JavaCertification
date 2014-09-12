package com.java.certification;

public class Singleton {
	private static Singleton singleton; 
	private Singleton() {
		System.out.println("Hello from Singelton constructor! The hashcode is " + this.hashCode());
	}
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		}
		else
			return singleton;
	}
	public String toString() {
		return "Singleton Hashcode: " + this.hashCode();
	}
	
}
