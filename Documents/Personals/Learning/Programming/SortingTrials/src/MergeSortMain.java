public class MergeSortMain {
	
 public static void main(String args[])
 {
    //int  arr[]={100,20,15,30,5,75,40};
	int  arr[]={5,15,20,30,40,75,100}; 
  arr = mergeSort(arr);
 printArray(arr);
 }
 
 public static int[] mergeSort(int[] arr) {	 
	 //breaking the received input array into two
	 int mid = arr.length / 2;
	 int[] leftArray = new int[mid];
	 int[] rightArray = new int[(arr.length-mid)];
	 
	if (arr.length <2) {
		return arr;
	}
	else {//populating the first sub array with first half of input array
	
		for (int i=0; i<mid; i++) {
			leftArray[i] = arr[i];
		}//populating the second sub array with second half of input array
		for (int i=0; i < (arr.length-mid); i++) {
			rightArray[i] = arr[i+mid];
		}
	}		
	leftArray  = mergeSort(leftArray);
	rightArray = mergeSort(rightArray);
	arr = merge(leftArray,rightArray);
    return arr;
 }
  
public static int[] merge(int[] arr1, int[] arr2) {
	
	int[] mergedArray = new int[arr1.length +arr2.length];
	int tempIndex=0, i=0, j=0;
	//populate the tempArray based on the comparison on both array elements.
	while(i<arr1.length && j<arr2.length) {
		if (arr1[i]<arr2[j]) {
			mergedArray[tempIndex]=arr1[i];
			tempIndex++; i++;
		} 
		else {
			mergedArray[tempIndex]=arr2[j];
			tempIndex++; j++;		
		}
	}
	//adding leftover in arr1
	while(i<arr1.length) {
		mergedArray[tempIndex]=arr1[i];
		tempIndex++; i++;
	}
	//adding leftover in arr2
		while(j<arr2.length) {
			mergedArray[tempIndex]=arr2[j];
			tempIndex++; j++;
		}
	return mergedArray;
}

 public static void printArray(int arr[]) {
  for (int i = 0; i <arr.length; i++) {
   System.out.print(arr[i]+" ");
  }
  System.out.println();
 }
}
 