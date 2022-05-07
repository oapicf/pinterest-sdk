@isTest
private class OASMediaUploadTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASMediaUploadType> expected = new Set<OASMediaUploadType>{
            OASMediaUploadType.VIDEO
        };
        Set<OASMediaUploadType> actual  = new Set<OASMediaUploadType>(OASMediaUploadType.values());
        System.assertEquals(expected, actual);
    }
}
