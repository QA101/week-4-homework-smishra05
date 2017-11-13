import java.util.ArrayList;

public class ArrayListHW1 {

	public static void main(String[] args) {
		
		int a[]= {5,0,-10};
		int sum = 0;
		sum = sumEvenIndexes(a);
		System.out.println("sum of even idices is "+ sum);
		// TODO Auto-generated method stub

	}
	public static int sumEvenIndexes(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return sumEvenIndexesB(numsList);
	}

	public static int sumEvenIndexesB(ArrayList<Integer> numsList) 
	{
		int sum = 0;
		for (int i=0; i<numsList.size(); i++)
	    {
			if(i%2==0)
			{
				sum = sum+numsList.get(i);
							
			}
	    }
		return sum;     

	}

}
