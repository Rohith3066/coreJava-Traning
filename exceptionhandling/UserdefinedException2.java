package com.evergent.corejava.exceptionhandling;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class UserdefinedException2 {
	public static void checkAge(int age) throws InvalidAgeException{
		if(age < 18)
			throw new InvalidAgeException("Age must be 18 or older");
		else
			System.out.println("Access granted you are old enough ");}
	public static void main(String[] args) {
		try {
			//UserdefinedException2 u = new UserdefinedException2();
			checkAge(16);		}
		catch(InvalidAgeException e) {
			System.out.println("caught the Exception:"+e.getMessage());
			System.out.println(e);}
		System.out.println("Program continues after handling the Exception");
	}
}
