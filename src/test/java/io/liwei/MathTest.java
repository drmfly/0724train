package io.liwei;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {
    @Test
    public void sumTest() {
        long sum = Math.sum(1,2);
        Assert.assertEquals(3, sum);
    }
}
