package DSA.Patterns.Recursion;

public class recursion_array {
    static int arr[] = { 6, 3, 2, 1, 7 };

    public static void main(String[] args) {

        // reverseArrDP(0, arr.length - 1); // double pointer
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        // reverseArrSP(0);  // single pointer
        // System.out.println();
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        System.out.println(fibi(5));

    }

    public static void reverseArrDP(int left, int right) {

        if (left >= right) {
            return;
        }
        arr[left] = arr[left] + arr[right]; // 10+7=17
        arr[right] = arr[left] - arr[right]; // 17-7=10;
        arr[left] = arr[left] - arr[right]; // a-b;

        reverseArrDP(left + 1, right - 1);
    }

    public static void reverseArrSP(int i) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseArrSP(i + 1);
    }

    public static int fibi(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibi(n-1)+fibi(n-2);
    }

}
