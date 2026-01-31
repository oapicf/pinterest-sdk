@isTest
private class OASLabelTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLabelType> expected = new Set<OASLabelType>{
            OASLabelType.BRAND,
            OASLabelType.CUSTOM
        };
        Set<OASLabelType> actual  = new Set<OASLabelType>(OASLabelType.values());
        System.assertEquals(expected, actual);
    }
}
