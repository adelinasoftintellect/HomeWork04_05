import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(a));

		int num = 7;
		int low = 0;
		int high = a.length - 1;
		while (high >= low) {
			int middle = (low + high) / 2;
			if (a[middle] == num) {
				System.out.print(middle);
				break;
			}
			if (a[middle] < num) {
				low = middle + 1;
			} else if (a[middle] > num) {
				high = middle - 1;
			} else if (low >= high) {
				System.out.print("Number NOT found");
				break;
			}
		}
	}
}
