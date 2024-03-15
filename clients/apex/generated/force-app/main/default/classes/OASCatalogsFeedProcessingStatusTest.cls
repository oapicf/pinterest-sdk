@isTest
private class OASCatalogsFeedProcessingStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsFeedProcessingStatus> expected = new Set<OASCatalogsFeedProcessingStatus>{
            OASCatalogsFeedProcessingStatus.COMPLETED,
            OASCatalogsFeedProcessingStatus.COMPLETED_EARLY,
            OASCatalogsFeedProcessingStatus.DISAPPROVED,
            OASCatalogsFeedProcessingStatus.FAILED,
            OASCatalogsFeedProcessingStatus.PROCESSING,
            OASCatalogsFeedProcessingStatus.QUEUED_FOR_PROCESSING,
            OASCatalogsFeedProcessingStatus.UNDER_APPEAL,
            OASCatalogsFeedProcessingStatus.UNDER_REVIEW
        };
        Set<OASCatalogsFeedProcessingStatus> actual  = new Set<OASCatalogsFeedProcessingStatus>(OASCatalogsFeedProcessingStatus.values());
        System.assertEquals(expected, actual);
    }
}
