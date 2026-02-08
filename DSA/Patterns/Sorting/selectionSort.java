package DSA.Patterns.Sorting;
// Selection sorting is a sorting method which u need to select the minimum index and swap it with initial index;
//tc - O(n sqr)
public class selectionSort {

    public static void main(String[] args) {

        int arr[] = {13, -46, 24, 52, 20, 9};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
