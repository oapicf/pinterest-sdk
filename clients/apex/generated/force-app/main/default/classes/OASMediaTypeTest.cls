@isTest
private class OASMediaTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASMediaType> expected = new Set<OASMediaType>{
            OASMediaType.IMAGE,
            OASMediaType.VIDEO
        };
        Set<OASMediaType> actual  = new Set<OASMediaType>(OASMediaType.values());
        System.assertEquals(expected, actual);
    }
}
