class BinarySearch
{
	public static void main(String args[])
	{
		int arr[] = { 10, 19, 25, 48, 61, 83, 92, 98 };
		int key = 15;
		int result = binarySearch(arr, 0, arr.length - 1, key);
		if (result == -1)
			System.out.println("Element not found.");
		else
			System.out.println("Element found at index : " + result);
	}

	static int binarySearch(int[] sortedArray, int left, int right, int key)
	{
		if (right >= left)
		{
			int mid = left + (right - left) / 2;

			if (sortedArray[mid] == key)
				return mid;

			if (sortedArray[mid] > key)
				return binarySearch(sortedArray, left, mid - 1, key);

			return binarySearch(sortedArray, mid + 1, right, key);
		}
		return -1;
	}
}
