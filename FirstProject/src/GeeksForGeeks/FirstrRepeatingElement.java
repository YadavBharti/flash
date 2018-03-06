package GeeksForGeeks;

import java.util.HashSet;

public class FirstrRepeatingElement {

	static public void printFirstRepeating(int arr[])
	{
		int min = -1;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = arr.length-1; i>0 ; i-- )
		{
			
			if (hs.contains(arr[i]))
				min = i;
			
			hs.add(arr[i]);
		}
		
		if (min==-1)
		{
			System.out.println("no element");
		}
		
		else
			System.out.println("element is:" + arr[min]);
		
		
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {10, 3, 4, 5,6,7,6,5, 5, 6};
		printFirstRepeating(arr);
	}
}
