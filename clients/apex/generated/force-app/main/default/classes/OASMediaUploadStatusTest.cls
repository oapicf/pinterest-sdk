@isTest
private class OASMediaUploadStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASMediaUploadStatus> expected = new Set<OASMediaUploadStatus>{
            OASMediaUploadStatus.REGISTERED,
            OASMediaUploadStatus.PROCESSING,
            OASMediaUploadStatus.SUCCEEDED,
            OASMediaUploadStatus.FAILED
        };
        Set<OASMediaUploadStatus> actual  = new Set<OASMediaUploadStatus>(OASMediaUploadStatus.values());
        System.assertEquals(expected, actual);
    }
}
