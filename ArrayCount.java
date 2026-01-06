// A+ Computer Science
// www.apluscompsci.com

//array delete example


public class ArrayCount
{
	/*
	 * countIt should return a count that
	 * states how many times val exists
	 * in the array iRay
	 */
	public static int countIt( int[] iRay, int val )
	{
		int count=0;

		//for each int we will refer to as x in the array called iRay
		for(int x: iRay)
		{
			//if x is the same value as the val in the method, add one to count 
			if (x == val)
				count++;

		}

		return count;
	}

	public static void printIt( int[] iRay  )
	{

		for(int y: iRay)
			System.out.print(y + " ");

	}

	public static void main(String[] args)
	{
		int[] nums = {7,7,1,7,8,7,4,3,7,9,8};

		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));
		System.out.println("\ncount of 8s == " + countIt( nums, 8 ));
	}
}