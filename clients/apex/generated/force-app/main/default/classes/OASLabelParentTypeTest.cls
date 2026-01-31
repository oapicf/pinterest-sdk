@isTest
private class OASLabelParentTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLabelParentType> expected = new Set<OASLabelParentType>{
            OASLabelParentType.CAMPAIGN
        };
        Set<OASLabelParentType> actual  = new Set<OASLabelParentType>(OASLabelParentType.values());
        System.assertEquals(expected, actual);
    }
}
