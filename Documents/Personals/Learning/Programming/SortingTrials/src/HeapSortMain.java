import java.util.Arrays;
 
public class HeapSortMain {
 
   public static void main(String[] args) {
	   
	      int[] arr={1,10,16,19,3,5};
	      System.out.println("Before Heap Sort : ");
	      System.out.println(Arrays.toString(arr));
//***************************************************************	      
	      /* As last non leaf node will be at (arr.length-1)/2 
	       * so we will start from this location for heapifying the elements */
	      for(int i=(arr.length-1)/2; i>=0; i--){
	    	     heapify(arr,i,arr.length-1);
	      }	      
	      int sizeOfHeap=arr.length-1;
	      for(int i=sizeOfHeap; i>0; i--) {
	    	 int temp = arr[0]; arr[0]=arr[i]; arr[i] = temp; 	         
	         sizeOfHeap=sizeOfHeap-1;
	         heapify(arr, 0,sizeOfHeap);
	      } 	      
//***************************************************************		      
	      System.out.println("=====================");
	      System.out.println("After Heap Sort : ");
	      System.out.println(Arrays.toString(arr));
	   }
   
   public static void heapify(int[] arr, int i,int size) { 
      int left = 2*i+1;
      int right = 2*i+2;
      int max = i;
      if(left <= size && arr[left] > arr[i]){
       max=left;
      }  
      if(right <= size && arr[right] > arr[max]) {
       max=right;
      }
      // If max is not current node, exchange it with max of left and right child
      if(max!=i) {
         int temp = arr[i]; arr[i]=arr[max]; arr[max] = temp;   
         heapify(arr, max,size);
      }
   }
 
}
 