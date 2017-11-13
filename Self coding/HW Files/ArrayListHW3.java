import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a string ");
		str = input.next();
		backwardChars(str);
		input.close();
			
	}
	
	public static String[] backwardChars(String str) { 

	    ArrayList<String> charsList = backwardCharsB(str);
	    
	    String chars[] = new String[charsList.size()];
	    for (int i=0; i<charsList.size(); i++)
	    {
	       chars[i]=charsList.get(i);
	       System.out.println(chars[i]);
	    }

	    return chars;
	}

	public static ArrayList<String> backwardCharsB(String str) 
	{    
	    ArrayList<String> inputList = new ArrayList<String>();
	    ArrayList<String> resultList = new ArrayList<String>();
	      
	    int temp = 0;
	   	for (int i=0;i<str.length(); i++)
	    {
	       inputList.add(temp,str.substring(i, i+1));
	       temp++;
	    }
	    for (int i=0;i<inputList.size(); i++)
	    {
	       resultList.add(inputList.get(inputList.size() - i - 1));
	       temp++;
	    }
	    
		return resultList;
	}

}
