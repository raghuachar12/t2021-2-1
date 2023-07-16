package Problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		int size = in.nextInt();
        int[] arr = new int[size];
        int num = 1;

        for (int i = 0; i < size; i++) {
        	
            arr[i] = num;
            num = num + 2;
        }

        System.out.println("Odd Number Series: " + Arrays.toString(arr));
        
   

	}

}
