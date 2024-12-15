public class BubbleSort {
    public void urutkan(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen jika elemen sekarang lebih besar dari elemen berikutnya
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    	BubbleSort bs = new BubbleSort();
        int[] data = {5, 2, 9, 1, 5, 6};
        System.out.println("Array sebelum sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        bs.urutkan(data);

        System.out.println("\nArray setelah sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}