package sort;

import java.time.temporal.IsoFields;

public class MergeSortt {
    public static void main(String ... a){
        int arr[] = {4,12,342,12,45,6,0,22};
        int[] ints = merSort(arr, 0, arr.length-1);
        for(int i : ints){
            System.out.print(i+ " ");
        }
    }
    private static int[] merSort(int arr[], int start, int end){
        if(start == end){
            int[] br = new int[1];
            br[0] = arr[start];
            return br;
        }

        int mid = (start + end )/ 2;

        int left[] = merSort(arr, start ,mid);
        int right[] = merSort(arr, mid +1, end);

        int[] ints = merTwoSortedArray(left, right);

        return ints;

    }

     private static int[] merTwoSortedArray(int l[], int[] r){

        int sortedArray[] = new int[r.length + l.length];
        int i= 0, j=0,k=0;
        while(i< l.length && j < r.length ){
            if(l[i] < r[j]){
                sortedArray[k++] = l[i++];
            }
            else{
                sortedArray[k++] = r[j++];
            }
        }
        // bach huaa dal do ya frr last index wala

         if(i == l.length){
             while(j < r.length){ //
                 sortedArray[k++] = r[j++];
             }
         }
         if(j == r.length){
             while(i < l.length){
                 sortedArray[k++] = l[i++];
             }
         }
         return sortedArray;
    }
}
