@isTest
private class OASMatchTypeResponseTest {
    @isTest
    private static void allowableValues() {
        Set<OASMatchTypeResponse> expected = new Set<OASMatchTypeResponse>{
            OASMatchTypeResponse.BROAD,
            OASMatchTypeResponse.PHRASE,
            OASMatchTypeResponse.EXACT,
            OASMatchTypeResponse.EXACT_NEGATIVE,
            OASMatchTypeResponse.PHRASE_NEGATIVE
        };
        Set<OASMatchTypeResponse> actual  = new Set<OASMatchTypeResponse>(OASMatchTypeResponse.values());
        System.assertEquals(expected, actual);
    }
}
