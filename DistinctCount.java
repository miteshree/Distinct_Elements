/*You are required to complete below method */

import java.util.*;

public class DistinctCount
{
    public static void main(String args[])
    {
        int[] A = new int[]{1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        int n = A.length;
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        res = countDistinct(A, k, n);
        
        System.out.println(res);
        
    }
    public static ArrayList<Integer> countDistinct(int A[], int k, int n)
    {
     ArrayList<Integer> distinctcount = new ArrayList<Integer>();
     System.out.println("n" + n);
	 if(A.length == 0)
	 {
	     System.out.println("Array is empty");
	 }
	 if(k > n)
	 {
	     System.out.println("Wrong value of k");
	 }
	 ArrayList<Integer> B = new ArrayList<Integer>();
	 for(int i =0; i< n; i++)
	 {
	     for(int j = i; j< i+ k && j< n ; j++)
	     {
	         B.add(A[j]);
	     }
	     if(B.size() == 4)
	     {
	     int distinct = CountDist(B);
	     distinctcount.add(distinct);
	     }
	     B.clear();
	 }
	 
   return distinctcount;
	 
    }
    
    public static int CountDist(ArrayList<Integer> B)
    {
      
        HashSet<Integer> C = new HashSet<Integer>();
        int count = 0;
        for (int k: B)
        {
            if(!C.contains(k))
            {
                C.add(k);
                count++;
            }
        }
        
        return count;
    }
}
