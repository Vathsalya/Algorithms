
//public class MergeSort {


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MergeSort
{
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {31,41,59,26,40,58};
		MERGE_SORT(arr,0,arr.length-1);
		display(arr);
	}

	private static void MERGE_SORT(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high){
			int mid = ((low+high)/2);
			MERGE_SORT(arr,low,mid);
			MERGE_SORT(arr,mid+1,high);
			MERGE(arr,low,mid,high);
		}
	}

	private static void MERGE(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int L_size = (mid-low)+1; //5
		int R_size = high - mid;//9-4=5
		
		int[] L_arr = new int[L_size+1];
		int[] R_arr = new int[R_size+1];
		
		for(int i=0;i<L_size;i++){
			L_arr[i] = arr[low+i];	
		}
		for(int j =0;j<R_size;j++){
			R_arr[j] = arr[mid+j+1];
			
		}
		L_arr[L_size] = Integer.MAX_VALUE;
		R_arr[R_size] = Integer.MAX_VALUE;
		int L_index=0,R_index=0;
		
		for(int k =low;k<=(high);k++){
			 
			if(L_arr[L_index]<R_arr[R_index]){
				arr[k] = L_arr[L_index];
				L_index++;
			}else{
				arr[k] = R_arr[R_index];
				R_index++;
			}
		}	
	
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i:arr)
			System.out.println(i);
	}


}