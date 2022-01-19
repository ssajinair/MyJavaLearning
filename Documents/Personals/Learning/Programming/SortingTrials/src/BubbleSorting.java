
public class BubbleSorting {
		//this is a simple algorithm for sorting	
		 public static void main(String args[])
		 {
		    //int  arr[]={950,20,115,30,56,5,410};
			int  arr[]={5,15,20,30,40,75,101}; 
		  //bubbleSorting(arr);
		  arr = bubbleSorting(arr);
		  for (int i=0; i<arr.length ;i++) {
			 System.out.print(arr[i]+ " ");
		 	}
		 }
		 
		 public static int[] bubbleSorting (int arr[]) {
			 
			 for (int i=0; i < (arr.length - 1);i++) {
				 boolean swapped = false;
					 for (int j=0; j<(arr.length -1); j++) {
						 if (arr[j]>arr[j+1]) {
							 int temp = arr[j+1]; arr[j+1] = arr[j];arr[j]=temp; //swap
							 swapped = true;
						 }				 
					 }
					if (!swapped) return arr;
				}	 
			 return arr;
		 }
		}