
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {26,31,40,41,58,59};//{31,41,59,26,40,58};
		
		int index = BinarySearch(arr,0,arr.length-1,58);
		if(index == -1)
			System.out.println("Element not found ");
		else
		System.out.println(arr[index]+" found at "+index);
	}

	private static int  BinarySearch(int[] arr, int low, int high,int searchEle) {
		// TODO Auto-generated method stub
		int mid = (low+high)/2;
		
		if (low > high) return -1;
		if(searchEle == arr[mid])
			return mid;
		
		if(searchEle<arr[mid])
			return BinarySearch(arr, low, mid-1, searchEle);
		else if(searchEle>arr[mid])
			return BinarySearch(arr,mid+1,high,searchEle);
		
		
		return -1;
	}

}
