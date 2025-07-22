
public class heap {

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        
    }

    static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 4, 3, 8, 10, 2, 5};
        heapSort(arr);
        System.out.println("Sorted array is ");

    }
}
