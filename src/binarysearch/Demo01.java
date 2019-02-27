package binarysearch;

import java.util.Arrays;

public class Demo01{
	public static void main(String[] args) {
		int [] arr={12,45,13,2,89,13,45,65,73,14};
		Arrays.sort(arr);
		int result=binarysearch(arr,89);
		//int result=Arrays.binarySearch(arr, 13);
		System.out.println(result);
	}
	public static int binarysearch(int[] arr,int num){
		int start=0;
		int end=arr.length-1;
		int middle ;
		while(start<=end){
			middle=(start+end)/2;
			if(num==arr[middle]){
				return middle;
			}
			if(num<arr[middle]){
				end=middle-1;
			}
			if(num>arr[middle]){
				start=middle+1;
			}
		}
		return -1;
	}

//	public static int binarysearch(int[] arr, int search) {
//
//		int low = 0;
//		int high = arr.length - 1;
//		int mid;
//		while (low <= high) {
//			mid = (low + high)/2;
//			if (search < arr[mid]) {
//				high = mid - 1;
//			} else if (search > arr[mid]){
//				low = mid + 1;
//			} else if (search == arr[mid]){
//				return mid;
//			}
//		}
//		return -1;
//	}
	
}
