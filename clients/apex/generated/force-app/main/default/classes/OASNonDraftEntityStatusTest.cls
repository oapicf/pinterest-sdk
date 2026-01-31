@isTest
private class OASNonDraftEntityStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASNonDraftEntityStatus> expected = new Set<OASNonDraftEntityStatus>{
            OASNonDraftEntityStatus.ACTIVE,
            OASNonDraftEntityStatus.PAUSED,
            OASNonDraftEntityStatus.ARCHIVED
        };
        Set<OASNonDraftEntityStatus> actual  = new Set<OASNonDraftEntityStatus>(OASNonDraftEntityStatus.values());
        System.assertEquals(expected, actual);
    }
}
