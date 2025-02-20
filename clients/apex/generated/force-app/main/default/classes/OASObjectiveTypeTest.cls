@isTest
private class OASObjectiveTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASObjectiveType> expected = new Set<OASObjectiveType>{
            OASObjectiveType.AWARENESS,
            OASObjectiveType.CONSIDERATION,
            OASObjectiveType.VIDEO_VIEW,
            OASObjectiveType.WEB_CONVERSION,
            OASObjectiveType.CATALOG_SALES,
            OASObjectiveType.WEB_SESSIONS,
            OASObjectiveType.VIDEO_COMPLETION
        };
        Set<OASObjectiveType> actual  = new Set<OASObjectiveType>(OASObjectiveType.values());
        System.assertEquals(expected, actual);
    }
}
