@isTest
private class OASDataOutputFormatTest {
    @isTest
    private static void allowableValues() {
        Set<OASDataOutputFormat> expected = new Set<OASDataOutputFormat>{
            OASDataOutputFormat.JSON,
            OASDataOutputFormat.CSV
        };
        Set<OASDataOutputFormat> actual  = new Set<OASDataOutputFormat>(OASDataOutputFormat.values());
        System.assertEquals(expected, actual);
    }
}
