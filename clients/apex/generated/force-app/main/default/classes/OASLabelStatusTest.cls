@isTest
private class OASLabelStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASLabelStatus> expected = new Set<OASLabelStatus>{
            OASLabelStatus.ACTIVE,
            OASLabelStatus.ARCHIVED
        };
        Set<OASLabelStatus> actual  = new Set<OASLabelStatus>(OASLabelStatus.values());
        System.assertEquals(expected, actual);
    }
}
