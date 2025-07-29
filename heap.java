
public class heap {

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
        }
    }

    static void heapify1(int arr[], int len){
        int n = len;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    static void heapSort(int arr[]) {
        
        int n = arr.length;
        for (int i = n-1 ; i >= 0; i--) {
            heapify1(arr, i);  
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
        }


    }

    public static void main(String[] args) {
        int arr[] = {9, 4, 3, 8, 10, 2, 5, 99, 43, 13, 87};
        heapSort(arr);
        System.out.println("Sorted array is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
