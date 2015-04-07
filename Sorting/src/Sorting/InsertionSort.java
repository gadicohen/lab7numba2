package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
	for (int i = 1; i < list.length; i++) {
            int next = list[i];
            int j = i;
            while (j > 0 && list[j - 1] > next) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = next;
        }
        return list;
	}
}
