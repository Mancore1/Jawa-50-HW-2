package telran.arrays;

import java.util.Arrays;

public class MyArrays {
public static int[] removeNumber(int[] array, int index) {
	int[] res = new int[array.length - 1];
	System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index + 1, res, index, array.length - index - 1);
	return res;
	}
public static int[] insertNumberSorted(int[] arraySorted, int number) {
	int[] res = Arrays.copyOf(arraySorted, arraySorted.length + 1);
	res[arraySorted.length] = number;
	Arrays.sort(res);
	Arrays.binarySearch(res, number);
	return res;
}
}
