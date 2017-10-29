package mergeSort;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		int [] arr = new int[]{12,21,11,3,45,21,15,37,98,34};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] mergeSort(int [] arr,int low,int high){
		int middle=(low+high)/2;
		if(low<high){
			mergeSort(arr,low,middle);
			mergeSort(arr,middle+1,high);
			merge(arr,low,middle,high);
		}
		return arr;
	}
	public static void merge(int [] arr,int low,int middle,int high){
		int [] temp=new int[high-low+1];
		int i=low;
		int j=middle+1;
		int k=0;
		while(i<=middle&&j<=high){
			if(arr[i]<arr[j]){
				temp[k++]=arr[i++];
			}else{
				temp[k++]=arr[j++];
			}
		}
		while(i<=middle){
			temp[k++]=arr[i++];
		}
		while(j<=high){
			temp[k++]=arr[j++];
		}
		for(int m=0;m<temp.length;m++){
			arr[m+low]=temp[m];
		}
	}
}
