import java.util.Arrays;
import java.util.HashSet;

public class Solution {
  public int numDecodings(String s) {
    HashSet<Character> digitSet = new HashSet<>(
        Arrays.asList('0','1', '2','3', '4', '5','6')
    );
    int sLen = s.length();
    int prevTwo = 1;
    int prevOne = s.charAt(sLen-1) == '0'? 0: prevTwo;
    int ways = prevOne;
    for (int start = sLen -2; start >=0; start--) {
      ways = 0;
      if (s.charAt(start) != '0') {
        ways += prevOne;
      }
      if (start + 1 < sLen && (
           s.charAt(start) == '1' || (s.charAt(start) == '2' && digitSet.contains(s.charAt(start+1)))
      )) {
        ways += prevTwo;
      }
      prevTwo = prevOne;
      prevOne = ways;
    }
    return ways;
  }
}
