package PlacementPrep;

public class june18 {
  public static String substring(String str, int si, int ei) {
    String subStr = "";
    for (int i = si; i < ei; i++) {
      subStr += str.charAt(i);
    }
    return subStr;
  }

  public static void larString(String fruit[]) {
    String largest = fruit[0];
    for (int i = 1; i < fruit.length; i++) {
      if (largest.compareTo(fruit[i]) < 0) {
        largest = fruit[i];
      }
    }
    System.out.println(largest);
  }

  public static String compress(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      newStr += str.charAt(i);
      if (count > 1) {
        newStr += count.toString();
      }
    }
    return newStr;
  }

  public static void main(String[] args) {
    // String str = "HelloWorld";
    // System.out.println(substring(str, 0, 5));
    // String fruit[] = { "Apple", "Banana", "Mango", "Guava" };
    // larString(fruit);
    // StringBuilder sb = new StringBuilder("");
    // for (char ch = 'a'; ch <= 'z'; ch++) {
    // sb.append(ch);
    // }
    // System.out.println(sb);
    String str = "aaabccd";
    System.out.println(compress(str));
  }
}
