import java.util.Arrays;

/**
 * @ProjectName: ArithmeticProgram
 * @Package: PACKAGE_NAME
 * @ClassName: BubbleSort
 * @Description: java类作用域描述
 * @Author: 111111
 * @CreateDate: 2019/2/12 14:30
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,6,1,8,12,3,5,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(String.format("排序后的 arr: [%s]", Arrays.toString(arr)));
    }
}