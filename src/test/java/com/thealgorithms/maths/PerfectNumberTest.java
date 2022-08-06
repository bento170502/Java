// package com.thealgorithms.maths;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// class PerfectNumberTest{
//     @Test
//     //valid partition
//     public void TestPerfectNumber() {
//         assertEquals(true, PerfectNumber.isPerfectNumber(28));
//     }

//     @Test
//     //invalid partition
//     public void TestNotPerfectNumber() {
//         assertEquals(false, PerfectNumber.isPerfectNumber(29));
//     }
// }

package com.thealgorithms.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectNumberTest {
    @Test
    void test1() {
        Assertions.assertTrue(PerfectNumber.isPerfectNumber(28));
    }
    @Test
    void test2() {
        Assertions.assertTrue(PerfectNumber.isPerfectNumber(6));
    }
    @Test
    void test3() {
        Assertions.assertFalse(PerfectNumber.isPerfectNumber(27));
    }

    @Test
    void test4() {
        Assertions.assertFalse(PerfectNumber.isPerfectNumber(29));
    }
}
