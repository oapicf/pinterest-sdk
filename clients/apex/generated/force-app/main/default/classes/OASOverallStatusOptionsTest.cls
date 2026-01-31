@isTest
private class OASOverallStatusOptionsTest {
    @isTest
    private static void allowableValues() {
        Set<OASOverallStatusOptions> expected = new Set<OASOverallStatusOptions>{
            OASOverallStatusOptions.NEEDS_IMPROVEMENT,
            OASOverallStatusOptions.FAIR,
            OASOverallStatusOptions.GOOD
        };
        Set<OASOverallStatusOptions> actual  = new Set<OASOverallStatusOptions>(OASOverallStatusOptions.values());
        System.assertEquals(expected, actual);
    }
}
