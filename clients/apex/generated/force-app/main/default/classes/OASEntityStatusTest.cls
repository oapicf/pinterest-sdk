@isTest
private class OASEntityStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASEntityStatus> expected = new Set<OASEntityStatus>{
            OASEntityStatus.ACTIVE,
            OASEntityStatus.PAUSED,
            OASEntityStatus.ARCHIVED,
            OASEntityStatus.DRAFT,
            OASEntityStatus.DELETED_DRAFT
        };
        Set<OASEntityStatus> actual  = new Set<OASEntityStatus>(OASEntityStatus.values());
        System.assertEquals(expected, actual);
    }
}
