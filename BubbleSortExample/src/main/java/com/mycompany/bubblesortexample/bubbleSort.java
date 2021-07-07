/*
 * Derik Peterson
 * CSC 330
 * 07/06/21
 */
package com.mycompany.bubblesortexample;

public class bubbleSort {
    
    public static void main(String [] args){
        
        int i, j, swap;//variables to hold values as they are sorted
        
        int [] arr = {5,11,1,23,56,7,48,7,9,15,9,12 ,0 ,0, 34,6,1,100};//data to be sorted
        
        for (i=0; i < arr.length; i++){//nested for loops that check 2 numbers and move them depending on their size
            for (j=0; j < arr.length - 1; j++){
                if(arr[j]> arr[j+1]){
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        
        for(int x =0; x<arr.length; x++){//displays the final sorted array.
            System.out.print(arr[x]+ ", ");
        }
    }
}
