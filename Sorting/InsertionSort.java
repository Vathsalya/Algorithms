
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {31,41,59,26,41,58};
		insertionSort(arr);
		display(arr);
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i:arr)
			System.out.println(i);
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int i=0,key=0;
		for(int j=1;j<arr.length;j++){
			key = arr[j];
			i = j-1;
			while(i>=0 && arr[i]>=key){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	}

}
