package quicksort;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo01 {
	public static void main(String[] args) {
		int [] arr={45,87,7,56,45,13,65,76,7};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	/*public static int getMiddle(int [] arr,int low,int high){
		int temp=arr[low];
		while(low<high){
			while(low<high&&temp<=arr[high]){
				high--;
			}
			arr[low]=arr[high];
			while(low<high&&temp>arr[low]){
				low++;
			}
			arr[high]=arr[low];
		}
		arr[low]=temp;
		return low;
	}
	public static void quickSort(int[] arr,int low,int high){
		if(low<high){
			int middle=getMiddle(arr,low,high);
			quickSort(arr,low,middle-1);
			quickSort(arr,middle+1,high);
		}
	}*/
	public static int getMiddle(int arr[],int low,int high){
		int temp=arr[low];
		while(low<high){
			while(low<high&&temp<=arr[high]){
				high--;
			}
			arr[low]=arr[high];
			while(low<high&&temp>arr[low]){
				low++;
			}
			arr[high]=arr[low];
		}
		arr[low]=temp;
		return low;
	}
	public static void quickSort(int arr[],int low,int high){
		if(low<high){
			int middle=getMiddle(arr, low,high);
			quickSort(arr, low, middle-1);
			quickSort(arr, middle+1, high);
		}
	}
}
