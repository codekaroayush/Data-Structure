package PlacementPrep;

public class june17 {

  public static int DiagonalSum(int matrix[][]) {
    int sum = 0;
    // T.C. O(n2) Brute force
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {
    // if (i == j) {
    // sum += matrix[i][j];
    // } else if (i + j == matrix.length - 1) {
    // sum += matrix[i][j];
    // }
    // }
    // }
    // optimal sol o(n)
    for (int i = 0; i < matrix.length; i++) {
      // pd
      sum += matrix[i][i];
      // sd
      if (i != matrix.length - 1 - i) {
        sum += matrix[i][matrix.length - i - 1];
      }
    }
    return sum;
  }

  public static boolean searchInSorted2DArr(int matrix[][], int key) {
    int row = 0, col = matrix[0].length - 1;
    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        System.out.println("found key at (" + row + "," + col + ")");
        return true;
      } else if (matrix[row][col] > key) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("Key Not found");
    return false;
  }

  public static boolean isPalindrome(String str) {
    int n = str.length();
    for (int i = 0; i <= str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static float getPath(String path) {
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);
      // south
      if (dir == 'S') {
        y--;
      } else if (dir == 'N') {
        y++;
      } else if (dir == 'W') {
        x--;
      } else {
        x++;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static void main(String[] args) {
    int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 25, 45 }, { 17, 29, 37, 48 }, { 32, 33, 39, 50 } };
    // System.out.println(DiagonalSum(matrix));
    int key = 33;
    // searchInSorted2DArr(matrix, key);
    String str = "racecar";
    // System.out.println(isPalindrome(str));
    String path = "WNEENESENNM";
    System.out.println(getPath(path));

  }
}
