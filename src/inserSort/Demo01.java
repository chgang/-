package inserSort;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		int [] arr = {45,12,98,34,15,93,67,21,13,12};
		insertSort(arr);
	}
	public static void insertSort(int [] arr){
		int i,j,insertNote;
		for(i=1;i<arr.length;i++){
			insertNote=arr[i];
			j=i-1;
			while(j>=0&&insertNote<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=insertNote;
		}
		System.out.println(Arrays.toString(arr));
	}
}
