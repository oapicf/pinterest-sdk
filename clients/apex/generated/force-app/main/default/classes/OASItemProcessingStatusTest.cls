@isTest
private class OASItemProcessingStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASItemProcessingStatus> expected = new Set<OASItemProcessingStatus>{
            OASItemProcessingStatus.SUCCESS,
            OASItemProcessingStatus.FAILURE,
            OASItemProcessingStatus.PROCESSING
        };
        Set<OASItemProcessingStatus> actual  = new Set<OASItemProcessingStatus>(OASItemProcessingStatus.values());
        System.assertEquals(expected, actual);
    }
}
