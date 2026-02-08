package DSA.Patterns.Sorting;

public class insertionSort {
//takes an element place it in correct order
//TC -wc & ac =O(N sqr), BC - O(N)
    public static void main(String[] args) {

        int arr[] = {13, -46, 24, 52, 20, 9};

        for (int i = 0; i < arr.length; i++) {
     
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
         
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
