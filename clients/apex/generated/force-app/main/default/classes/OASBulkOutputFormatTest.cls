@isTest
private class OASBulkOutputFormatTest {
    @isTest
    private static void allowableValues() {
        Set<OASBulkOutputFormat> expected = new Set<OASBulkOutputFormat>{
            OASBulkOutputFormat.CSV,
            OASBulkOutputFormat.JSON
        };
        Set<OASBulkOutputFormat> actual  = new Set<OASBulkOutputFormat>(OASBulkOutputFormat.values());
        System.assertEquals(expected, actual);
    }
}
