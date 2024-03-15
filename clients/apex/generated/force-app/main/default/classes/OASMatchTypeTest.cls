@isTest
private class OASMatchTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASMatchType> expected = new Set<OASMatchType>{
            OASMatchType.BROAD,
            OASMatchType.PHRASE,
            OASMatchType.EXACT,
            OASMatchType.EXACT_NEGATIVE,
            OASMatchType.PHRASE_NEGATIVE
        };
        Set<OASMatchType> actual  = new Set<OASMatchType>(OASMatchType.values());
        System.assertEquals(expected, actual);
    }
}
