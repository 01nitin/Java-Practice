package sort;

import java.util.Arrays;

public class MergerSort {
    public static void main(String [] a){
        int arr[] = {8,3,24,1,2};
        int n = arr.length;
        mergerSrt(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }

    // everytime creating the copy of the array..
//    static int [] mergerSrt(int arr[]){
//        // base condition
//
//        int n = arr.length;
//        if (n==1){
//            return arr;
//        }
//
//        int mid = n/2;
//        int leftAns[]=  mergerSrt(Arrays.copyOfRange(arr, 0, mid)); // it will dividing into 2 part of l arr
//        int rightAns[]=  mergerSrt(Arrays.copyOfRange(arr, mid, n)); // it will diving into 2 part of right arr
//        return merge(leftAns , rightAns);
//    }

//    static  int[] merge(int[] l , int[] r){
//
//        int n  = l.length + r.length;
//        int mixBothArr[] = new int[n];
//
//        int i = 0 ; // this will point to arr[left]
//        int j= 0 ; // this will point to arr[right]
//        int k = 0; // it will point to mixBothArr of my array
//
//        while (i< l.length && j < r.length){
//            if (l[i] < r[j]){
//                mixBothArr[k] = l[i];
//                i++;
//            }
//            else {
//                mixBothArr[k] =  r[j];
//                j++;
//            }
//            k++;
//        }
//        // it may be the possibility that one of the arr having the remaining vale so put normally in sorted order
//
//        while (i < l.length){
//            mixBothArr[k] = l[i];
//            i++;
//            k++;
//        }
//        while (j < r.length){
//            mixBothArr[k] = r[j];
//            j++;
//            k++;
//        }
//
//        return mixBothArr;
//    }

    static void mergerSrt(int[] arr, int str, int end){
        int n = arr.length;
        if(end-str == 1){
            return;
        }

        int mid = (str + end)/2;
        mergerSrt(arr, str, mid);
        mergerSrt(arr, mid , end);

        merge(arr, str, mid ,end);
    }

    static  void merge(int[] arr ,int str, int mid ,  int end){
        int mixBothArr[] = new int[end-str];

        int i = str ; // this will point to arr[left]
        int j= mid; // this will point to arr[right]
        int k = 0; // it will point to mixBothArr of my array

        while (i< mid && j < end){
            if (arr[i] < arr[j]){
                mixBothArr[k] = arr[i];
                i++;
            }
            else {
                mixBothArr[k] =  arr[j];
                j++;
            }
            k++;
        }
        // it may be the possibility that one of the arr having the remaining vale so put normally in sorted order

        while (i < mid){
            mixBothArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mixBothArr[k] = arr[j];
            j++;
            k++;
        }

        for (int l= 0; l< mixBothArr.length; l++){
            arr[str +l ] = mixBothArr[l];
        }
    }
}
