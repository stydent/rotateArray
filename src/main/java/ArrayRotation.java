
public class ArrayRotation {
  public static void rotateArray(int[] arr, int m) {
    int n = arr.length;
    m = m % n; // обработка случаев, когда m > n

    for (int i = 0; i < m; i++) {
      int temp = arr[0];

      for (int j = 0; j < n - 1; j++) {
        arr[j] = arr[j + 1];
      }

      arr[n - 1] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int m = 2;

    rotateArray(arr, m);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

