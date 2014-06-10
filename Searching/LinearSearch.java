
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {31,41,59,26,41,58};
		System.out.println(search(arr,599));
		//display(arr);
	}

	private static boolean search(int[] arr, int ele) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++){
			if(arr[i] == ele)
				return true;
		}
		return false;
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i:arr)
			System.out.println(i);
	}

}
