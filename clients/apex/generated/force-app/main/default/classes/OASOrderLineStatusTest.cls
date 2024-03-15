@isTest
private class OASOrderLineStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderLineStatus> expected = new Set<OASOrderLineStatus>{
            OASOrderLineStatus.ACTIVE,
            OASOrderLineStatus.PAUSED,
            OASOrderLineStatus.DELETED
        };
        Set<OASOrderLineStatus> actual  = new Set<OASOrderLineStatus>(OASOrderLineStatus.values());
        System.assertEquals(expected, actual);
    }
}
