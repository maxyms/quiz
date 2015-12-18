package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {
    @Test
    public void testName() throws Exception {
        Assert.assertEquals("12312312", new LargestNumber().largestNumber(new int[] { 123, 12312 }));
        //        Assert.assertEquals("12312312", new LargestNumber().largestNumber(new int[] { 12312, 123 }));
        Assert.assertEquals("8308830", new LargestNumber().largestNumber(new int[] { 830, 8308 }));
        //        Assert.assertEquals("8308830", new LargestNumber().largestNumber(new int[] { 8308, 830 }));
        //        Assert.assertEquals("89077766553421", new LargestNumber().largestNumber(new int[] { 1, 2, 34, 55, 66, 777, 890 }));
        //        Assert.assertEquals("9534330", new LargestNumber().largestNumber(new int[] { 3, 30, 34, 5, 9 }));
        //        Assert.assertEquals("35353535835", new LargestNumber().largestNumber(new int[] { 35, 353535358 }));
        //        Assert.assertEquals("111", new LargestNumber().largestNumber(new int[] { 1, 1, 1 }));
        //        Assert.assertEquals("1", new LargestNumber().largestNumber(new int[] { 1 }));
        //        Assert.assertEquals("", new LargestNumber().largestNumber(new int[] {}));
        //        Assert.assertEquals("999999999999", new LargestNumber().largestNumber(new int[] { 999, 999, 999, 999 }));
        //        Assert.assertEquals("999666666220", new LargestNumber().largestNumber(new int[] { 0, 666666, 22, 999 }));
        //        Assert.assertEquals("0", new LargestNumber().largestNumber(new int[] { 0, 0, 0 }));
        //        Assert.assertEquals("10", new LargestNumber().largestNumber(new int[] { 0, 1 }));
        //        Assert.assertEquals(
        //                "995998549642963295795569525905189958985890288238775871870185978591838283748308830827481618052787813771758475277519744072727265721971071006861683682268046787640663256310614560285906582858175752573156385565552654905441522852245213513750414822478747104662455545424532434289408839763963946391038663723370035134023393328828692788270926232581243924362362304226421162109163016131603127210891014",
        //                new LargestNumber().largestNumber(new int[] { 9051, 5526, 2264, 5041, 1630, 5906, 6787, 8382, 4662, 4532, 6804, 4710, 4542, 2116, 7219, 8701, 8308, 957, 8775, 4822,
        //                        396, 8995, 8597, 2304, 8902, 830, 8591, 5828, 9642, 7100, 3976, 5565, 5490, 1613, 5731, 8052, 8985, 2623, 6325, 3723, 5224, 8274, 4787, 6310, 3393, 78,
        //                        3288, 7584, 7440, 5752, 351, 4555, 7265, 9959, 3866, 9854, 2709, 5817, 7272, 43, 1014, 7527, 3946, 4289, 1272, 5213, 710, 1603, 2436, 8823, 5228, 2581, 771,
        //                        3700, 2109, 5638, 3402, 3910, 871, 5441, 6861, 9556, 1089, 4088, 2788, 9632, 6822, 6145, 5137, 236, 683, 2869, 9525, 8161, 8374, 2439, 6028, 7813, 6406,
        //                        7519 }));
    }
}
