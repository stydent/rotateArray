import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayRotationTest {

  @Test
  void rotateArray_check_size_and_order() {
    int[] arr = {1, 2, 3, 4, 5};
    int m = 2;
    ArrayRotation.rotateArray(arr, m);

    assertEquals(5, arr.length);
    assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
  }

  @Test
  void rotateArray_check_size_and_order_when_m_is_large() {
    int[] arr = {1, 2, 3, 4, 5};
    int m = 9;
    ArrayRotation.rotateArray(arr, m);

    assertEquals(5, arr.length);
    assertArrayEquals(new int[]{5, 1, 2, 3, 4}, arr);
  }

  @Test
  void rotateArray_check_size_and_order_when_m_is_negative() {
    int[] arr = {1, 2, 3, 4, 5};
    int m = -2;
    ArrayRotation.rotateArray(arr, m);

    assertEquals(5, arr.length);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }

  @Test
  void rotateArray_check_exception() {
    int[] arr = {};
    int m = 2;
    Exception exception = assertThrows(Exception.class, () -> ArrayRotation.rotateArray(arr, m));

    assertEquals("/ by zero", exception.getMessage());
    assertEquals(ArithmeticException.class, exception.getClass());
  }
}