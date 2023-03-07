package exceptiontopic;

import java.io.IOException;

public class TestApp3 
{
	public static void isValidAgeForVote(int age)// throws InvalidAgeException
	{
		if (age < 18) 
		{
			throw new InvalidAgeException("Invalid Age Exception");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		
		try 
		{
			isValidAgeForVote(10);
		} catch (InvalidAgeException e) 
		{
			System.out.println("Exception Handled by catch block of Main method");
			e.printStackTrace();
		}
		
	}
}
