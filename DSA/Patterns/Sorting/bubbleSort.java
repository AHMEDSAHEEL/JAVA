package DSA.Patterns.Sorting;
//Bubble sort is a sorting technique which push the max value to last.
//TC -wc & ac =O(N sqr), BC - O(N)
public class bubbleSort {

    public static void main(String[] args) {

        int arr[] = {13, -46, 24, 52, 20, 9};

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
