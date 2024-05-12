public class Main {
  public static void main(String[] args) {
    printSums(5, 5, "", 5);
    printBinaryStrings(3, "");
  }

  public static void printSums(int n, int max, String prefix, int original) {
    if (n == 0) {
      System.out.println(original + " = " + prefix.substring(3));
      return;
    }

    for (int i = max; i >= 1; i--) {
      if (i <= n) {
        printSums(n - i, i, prefix + " + " + i, original);
      }
    }
  }

  public static void printBinaryStrings(int n, String prefix) {
    if (n == 0) {
      System.out.println(prefix);
      return;
    }

    if (prefix.endsWith("1")) {
      printBinaryStrings(n - 1, prefix + "0");
    } else {
      printBinaryStrings(n - 1, prefix + "0");
      printBinaryStrings(n - 1, prefix + "1");
    }
  }
}