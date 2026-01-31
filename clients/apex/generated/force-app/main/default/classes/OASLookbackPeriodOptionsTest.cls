@isTest
private class OASLookbackPeriodOptionsTest {
    @isTest
    private static void allowableValues() {
        Set<OASLookbackPeriodOptions> expected = new Set<OASLookbackPeriodOptions>{
            OASLookbackPeriodOptions._1D,
            OASLookbackPeriodOptions._14D
        };
        Set<OASLookbackPeriodOptions> actual  = new Set<OASLookbackPeriodOptions>(OASLookbackPeriodOptions.values());
        System.assertEquals(expected, actual);
    }
}
