public class Kadane { 

     public static void main(String[] args) { 
    	int[] intArr={3, -1, -1, -1, -1, -1, 2, 0, 0, 0 }; 
     	//int[] intArr = {-1, 3, -5, 4, 6, -1, 2, -7, 13, -3}; 
    	//int[] intArr={-6,-2,-3,-4,-1,-5,-5}; 
        findMaxSubArray(intArr); 
     } 
 
     public static void findMaxSubArray(int[] a { 
 
 	 int max_end_here = a[0];
	 int max_so_far = a[0];
         for(int i=1;i<a.length;i++){
		max_end_here = Math.max(a[i], max_end_here + a[i]);
		max_so_far = Math.max(max_so_far, max_end_here);
         }
	  		       
         System.out.println("Max sum         : "+ max_so_far); 

     }      
 } 
