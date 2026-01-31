@isTest
private class OASAgeTrendsBucketTest {
    @isTest
    private static void allowableValues() {
        Set<OASAgeTrendsBucket> expected = new Set<OASAgeTrendsBucket>{
            OASAgeTrendsBucket._18_24,
            OASAgeTrendsBucket._25_34,
            OASAgeTrendsBucket._35_44,
            OASAgeTrendsBucket._45_49,
            OASAgeTrendsBucket._50_54,
            OASAgeTrendsBucket._55_64,
            OASAgeTrendsBucket._65_
        };
        Set<OASAgeTrendsBucket> actual  = new Set<OASAgeTrendsBucket>(OASAgeTrendsBucket.values());
        System.assertEquals(expected, actual);
    }
}
