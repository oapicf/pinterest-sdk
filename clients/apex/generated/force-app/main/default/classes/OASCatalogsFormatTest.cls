@isTest
private class OASCatalogsFormatTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsFormat> expected = new Set<OASCatalogsFormat>{
            OASCatalogsFormat.TSV,
            OASCatalogsFormat.CSV,
            OASCatalogsFormat.XML
        };
        Set<OASCatalogsFormat> actual  = new Set<OASCatalogsFormat>(OASCatalogsFormat.values());
        System.assertEquals(expected, actual);
    }
}
