@isTest
private class OASContentTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASContentType> expected = new Set<OASContentType>{
            OASContentType.IMAGE_JPEG,
            OASContentType.IMAGE_PNG
        };
        Set<OASContentType> actual  = new Set<OASContentType>(OASContentType.values());
        System.assertEquals(expected, actual);
    }
}
