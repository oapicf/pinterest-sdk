@isTest
private class OASCatalogsFeedProcessingStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsFeedProcessingStatus> expected = new Set<OASCatalogsFeedProcessingStatus>{
            OASCatalogsFeedProcessingStatus.COMPLETED,
            OASCatalogsFeedProcessingStatus.FAILED,
            OASCatalogsFeedProcessingStatus.PROCESSING
        };
        Set<OASCatalogsFeedProcessingStatus> actual  = new Set<OASCatalogsFeedProcessingStatus>(OASCatalogsFeedProcessingStatus.values());
        System.assertEquals(expected, actual);
    }
}
