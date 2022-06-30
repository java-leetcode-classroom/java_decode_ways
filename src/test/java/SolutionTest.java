import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private  Solution sol = new Solution();
  @Test
  void numDecodingsExamples1() {
    assertEquals(2, sol.numDecodings("12"));
  }
  @Test
  void numDecodingsExamples2() {
    assertEquals(3, sol.numDecodings("226"));
  }
  @Test
  void numDecodingsExamples3() {
    assertEquals(0, sol.numDecodings("06"));
  }
}