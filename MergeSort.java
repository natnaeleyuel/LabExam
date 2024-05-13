package Question5;

import java.util.Scanner;

public class MergeSort {
    void merge(int[] array, int l, int m, int r){
        int h1 = m - l +1;
        int h2 = r - m;

        int[] temparr1 = new int[h1];
        int[] temparr2 = new int[h2];

        for (int i = 0; i < h1; ++i) {
            temparr1[i] = array[l+i];
        }
        for (int j = 0; j < h2; ++j) {
            temparr2[j] = array[m+1+j];
        }
        int i = 0,j = 0;
        int k = l;
        while(i < h1 && j < h2){
            if (temparr1[i] <= temparr2[j]){
                array[k] = temparr1[i];
                i++;
            }
            else{
                array[k] = temparr2[j];
                j++;
            }
            k++;
        }
        while(i < h1){
            array[k] = temparr1[i];
            i++;
            k++;
        }
        while(j < h2){
            array[k] = temparr2[j];
            j++;
            k++;
        }
    }
    void sort(int[] array, int l, int r){
        if(l < r){
            int m = (r + l) / 2;
            sort(array, l, m);
            sort(array, m+1, r);
            merge(array, l, m, r);
        }
    }
    static void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String[] numbersStr = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        System.out.println("Unsorted Array:");
        printArray(numbers);
        MergeSort mg = new MergeSort();
        mg.sort(numbers,0,numbers.length-1);
        System.out.println("Sorted Array:");
        printArray(numbers);
    }
}
