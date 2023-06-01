package telran.arrays;

import java.util.Arrays;

public class MyArrays {
	
	
public static int[] insertNumber(int[] array, int index, int number) {
	int[] res = new int[array.length + 1];
	System.arraycopy(array, 0, res, 0, index);
	res[index] = number;
	System.arraycopy(array, index, res, index + 1, array.length - index);
	return res;
	}

public static int[] removeNumber(int[] array, int index) {
	int[] res = new int[array.length - 1];
	System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index + 1, res, index, array.length - index - 1);
	return res;
	}

public static int[] insertNumberSorted(int[] arraySorted, int number) {
	int index = Arrays.binarySearch(arraySorted, number);
	if (index < 0) {
		index = arraySorted.length - index - 1;
	}
	return insertNumber(arraySorted, index, number);
}
}
