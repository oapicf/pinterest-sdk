@isTest
private class OASGranularityTest {
    @isTest
    private static void allowableValues() {
        Set<OASGranularity> expected = new Set<OASGranularity>{
            OASGranularity.TOTAL,
            OASGranularity.DAY,
            OASGranularity.HOUR,
            OASGranularity.WEEK,
            OASGranularity.MONTH
        };
        Set<OASGranularity> actual  = new Set<OASGranularity>(OASGranularity.values());
        System.assertEquals(expected, actual);
    }
}
