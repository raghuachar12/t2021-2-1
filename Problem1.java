package Problem1;

import java.util.*;

public class Problem1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Problem12 c = new Problem12();

		System.out.print("Enter the first number: ");
		double a = in.nextDouble();

		System.out.print("Enter the second number: ");
		double b = in.nextDouble();

		System.out.print("Enter the choice \n add for addition \n sub for subtraction \n mul for multiplication \n divi for division \n  ");
		String operator = in.next();

		double result = 0.0;

		switch (operator) {
		case "add":
			result = c.add(a, b);
			break;
		case "sub":
			result = c.subtract(a, b);
			result =  Math.abs(result);
			break;
		case "mul":
			result = c.multiply(a, b);
			break;
		case "divi":
			result = c.divide(a, b);
			break;
		default:
			System.out.println("Invalid operator!");

		}

		System.out.println("Result of "+a+ " and "+b +" is = "+ result);


	}

}
class Problem12 {
	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

}
