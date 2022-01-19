public class SelectionSortMain {
	
 public static void main(String args[])
 {
    int  arr[]={100,20,15,30,5,75,40};
	//int  arr[]={5,15,20,30,40,75,100}; 
  selectionSort(arr);
 
 }
 
 public static int[] selectionSort(int arr[]) {
	 for (int i = 0; i < arr.length - 1; i++) {
		 int index = i;
		 for (int j = i + 1; j < arr.length; j++) {
			 if (arr[j] < arr[index]) 
				 index = j;
		 }
		 int temp = arr[index]; 
		 arr[index] = arr[i];
		 arr[i] = temp;
		 System.out.print("Iteration "+(i)+": ");
		 printArray(arr);
	 }	
  return arr;
 }
  
 public static void printArray(int arr[]) {
  for (int i = 0; i <arr.length; i++) {
   System.out.print(arr[i]+" ");
  }
  System.out.println();
 }
}
 