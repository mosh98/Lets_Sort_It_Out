package com.company;


/**@Solution
 * Code for QuickSort*/
public class Solution {


    public static void main(String[] args) {
        int[] arr = {4,54,2,9,6,3,12,0,1};
        quickSort(arr);

    }


    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int left, int right){

        if(left >= right){
            return;
        }

        //get the middle value from the arraylist
        //thats your pivot.
        int pivot = array[(left + right) / 2];
        int index = partition(array,left,right,pivot);

        quickSort(array,left,index - 1);
        quickSort(array,index,right);
    }

    public static int partition(int[] array, int left, int right,int pivot){

        while(left <= right ){


            while(array[left] < pivot ){
                left++;
            }

            while(array[right] > pivot ){
                right--;
            }


            if(left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int[] array, int left, int right){
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

}