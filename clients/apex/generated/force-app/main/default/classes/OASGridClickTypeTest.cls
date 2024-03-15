@isTest
private class OASGridClickTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASGridClickType> expected = new Set<OASGridClickType>{
            OASGridClickType.CLOSEUP,
            OASGridClickType.DIRECT_TO_DESTINATION
        };
        Set<OASGridClickType> actual  = new Set<OASGridClickType>(OASGridClickType.values());
        System.assertEquals(expected, actual);
    }
}
