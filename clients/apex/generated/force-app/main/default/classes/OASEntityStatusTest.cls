@isTest
private class OASEntityStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASEntityStatus> expected = new Set<OASEntityStatus>{
            OASEntityStatus.ACTIVE,
            OASEntityStatus.PAUSED,
            OASEntityStatus.ARCHIVED
        };
        Set<OASEntityStatus> actual  = new Set<OASEntityStatus>(OASEntityStatus.values());
        System.assertEquals(expected, actual);
    }
}
