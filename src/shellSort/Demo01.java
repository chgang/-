package shellSort;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
		shellSort(data);
	}
	public static void shellSort(int[] arr){
		int i,j,insertSort;
		for(int m=arr.length/2;m>=1;m/=2){
			for(i=m;i<arr.length;i++){
				insertSort=arr[i];
				j=i-m;
				while(j>=0&&insertSort<arr[j]){
					arr[j+m]=arr[j];
					j-=m;
				}
				arr[j+m]=insertSort;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
