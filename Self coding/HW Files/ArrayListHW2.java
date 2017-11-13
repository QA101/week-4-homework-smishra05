import java.util.ArrayList;

public class ArrayListHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,6,22,78,95};	
		System.out.println( "The count of all even numbers is "+ evenCount(a));
	}
	
	public static int evenCount(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return evenCountB(numsList);
	}

	public static int evenCountB(ArrayList<Integer> numsList) 
	{     
		int count = 0;
		for (int i=0; i<numsList.size(); i++)
	    {
			if(numsList.get(i)%2==0)
			{
				count++;
							
			}
	    }
		return count;     

	}

	// Test Scenarios:

}
