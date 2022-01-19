import java.util.Arrays;

public class QuickSortMain {
 
	private static int array[];
	
	public static void main(String a[]){
		
		int[] input = {33,21,45,64,55,34,11,8,3,5,1};
		
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(input));
		
		array = input;
		quickSort(0, array.length-1);
		
		System.out.println("==================");
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(array));
 
	}
	
	private static void quickSort(int left, int right) {
 
		int i = left;
		int j = right;
		// find pivot number, we will take it as mid
		int pivot = array[left+(right-left)/2];
 
		while (i <= j) {
			/* In each iteration,
			 * we will increment left until we find element greater than pivot
			 * We will decrement right until we find element less than pivot
			 */
			while (array[i] < pivot) { i++; } 
			while (array[j] > pivot) { j--; }
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				//move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (left < j) quickSort(left, j);
		if (i < right) quickSort(i, right);
	}
 
}