import java.util.ArrayList;

/*
 * 4. An array list contains a list of animals. If the animal is a cat (i.e. the animal's descrition contains the word "cat" or "Cat"), then add it to a new array list. Return the new array list of cats.

			Important Note: Copy the following two methods into the window and 
			don't change catty.  Enter your code into method cattyB:
 */
public class ArrayListHW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals[] = {"bobcat", "siamese cat", "catbird","frog","mouse","buffalo"};
		catty(animals);
		

	}
public static String[] catty(String[] animals) 
{ 
 ArrayList<String> animalsList = new ArrayList<String>();
   for (int i=0; i<animals.length; i++)
	    {
       animalsList.add(animals[i]);
    }
        ArrayList<String> catsList = cattyB(animalsList);
	    String cats[] = new String[catsList.size()];
			    for (int i=0; i<catsList.size(); i++)
			    {
			       cats[i]=catsList.get(i);
			       System.out.println(cats[i]);
					
			    }

			    return cats;
			}

			public static ArrayList<String> cattyB(ArrayList<String> animalsList) 
			
			{
				ArrayList<String> catsresultList = new ArrayList<String>();
				for(int i = 0;i<animalsList.size();i++)
				{
					if(animalsList.get(i).contains("cat") || animalsList.get(i).contains("Cat") )
					{
						catsresultList.add(animalsList.get(i));
					}
				}
				
					
				
				return catsresultList;    
				
			}


}
