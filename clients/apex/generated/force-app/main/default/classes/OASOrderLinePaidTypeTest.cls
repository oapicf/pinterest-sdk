@isTest
private class OASOrderLinePaidTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderLinePaidType> expected = new Set<OASOrderLinePaidType>{
            OASOrderLinePaidType.PAID,
            OASOrderLinePaidType.BONUS,
            OASOrderLinePaidType.MAKE_GOOD,
            OASOrderLinePaidType.TEST,
            OASOrderLinePaidType.NULL
        };
        Set<OASOrderLinePaidType> actual  = new Set<OASOrderLinePaidType>(OASOrderLinePaidType.values());
        System.assertEquals(expected, actual);
    }
}
