import java.util.Arrays;

/**
 * @author Jameel Khan
 *
 */
public class FindMissingNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] numList = {1, 2, 4, 6, 8, 7, 5, 9};
		int missingNum = FindNum(numList);
		
		System.out.println(missingNum);

	}
	
	public static int FindNum(int[] numberList)
	{
		int[] tempArray = numberList;
		int theNumber = 0;
		
		// sort array of numbers into sequential order
		Arrays.sort(tempArray);
		int arrayLength = tempArray.length;
		
		// test for missing number
		for (int i = 0; i < arrayLength; i++)
		{
			int sum = tempArray[i] + 1;
			if (sum == tempArray[i+1])
			{
				continue;
			}
			else
			{
				theNumber = sum;
				break;
			}
		}
		
		return theNumber;
	}
}
