public class quuickSort {

    public static void quickSort(int[] arr, int low, int high, String pivotType) {
        if (low < high) {
            int pivotIndex = choosePivot(arr, low, high, pivotType);
            int partitionIndex = partition(arr, low, high, pivotIndex);

            quickSort(arr, low, partitionIndex - 1, pivotType);
            quickSort(arr, partitionIndex + 1, high, pivotType);
        }
    }

    private static int choosePivot(int[] arr, int low, int high, String pivotType) {
        if (pivotType.equals("low")) {
            return low;
        } else if (pivotType.equals("mid")) {
            return low + (high - low) / 2;
        } else if (pivotType.equals("high")) {
            return high;
        } else {
            throw new IllegalArgumentException("Invalid pivot type");
        }
    }

    private static int partition(int[] arr, int low, int high, int pivotIndex) {

        // Move selected pivot to beginning
        swap(arr, low, pivotIndex);

        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (true) {

            while (i <= high && arr[i] < pivot) {
                i++;
            }

            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            if (i >= j) break;

            swap(arr, i, j);
            i++;
            j--;
        }

        // Place pivot in correct position
        swap(arr, low, j);

        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Test
    public static void main(String[] args) {
        int[] arr = {7,10,2,5,1,6,3,9,4};

        quickSort(arr, 0, arr.length - 1, "mid");  // change to "low" or "high"

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*

public class quickSort {

    public static void main(String[] args) {
        int arr[] = {7, 10, 2, 5, 1, 6, 3, 9, 4};

        //int newArr[]=  newQuick(arr);
        quick(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // static int[] newQuick(int arr[]){
    //     quick(arr,0,arr.length-1);
    //     return arr;
    // }
    static void quick(int arr[], int low, int high) {
        if (low > high) {
            return;
        }

            int pivot = q(arr, low, high);
            quick(arr, low, pivot - 1);
            quick(arr, pivot + 1, high);
        
    }

    static int q(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {

            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}

*/