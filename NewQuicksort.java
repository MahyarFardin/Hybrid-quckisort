public class NewQuicksort {
    private static void insertionSort(int a[], int low,
            int high) {
        for (int i = low + 1; i <= high; i++) {
            for (int j = i - 1; j >= low; j--) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                } else
                    break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int arr[], int low,
            int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void newQuicksort(int arr[], int low,
            int high, int number) {
        while (low < high) {
            if (high - low < number) {
                insertionSort(arr, low, high);
                break;
            } else {
                int pivot = partition(arr, low, high);
                if (pivot - low < pivot - high) {
                    newQuicksort(arr, low, pivot - 1, number);
                    low = pivot + 1;
                } else {
                    newQuicksort(arr, pivot + 1, high,number);
                    high = pivot - 1;
                }
            }
        }
    }
}
