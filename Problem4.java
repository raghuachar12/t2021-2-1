package Problem2;
import java.util.*;
public class Problem4 {
	
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	        int[] numbers = new int[10];
	        for(int i=0;i<10;i++) {
	        	numbers[i]=in.nextInt();
	        }
	        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        int[] countArray = new int[multiples.length];

	        for (int number : numbers) {
	            for (int i = 0; i < multiples.length; i++) {
	                if (number % multiples[i] == 0) {
	                    countArray[i]++;
	                }
	            }
	        }

	        System.out.print("Output: ");
	        for (int i = 0; i < multiples.length; i++) {
	            System.out.print(multiples[i] + ": " + countArray[i] + ", ");
	        }
	    }
	}



