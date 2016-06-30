package test;

import java.util.regex.Pattern;

public class Test {

  public static void main(String[] args) {
    System.out.println(
        Pattern.compile("(refs/heads/|refs/remotes/|remotes/)?[^/]*\\Q/master\\E").matcher("refs/heads/master").matches());
  }

}
