@isTest
private class OASActionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASActionType> expected = new Set<OASActionType>{
            OASActionType.CLICKTHROUGH,
            OASActionType.IMPRESSION,
            OASActionType.VIDEO_V_50_MRC
        };
        Set<OASActionType> actual  = new Set<OASActionType>(OASActionType.values());
        System.assertEquals(expected, actual);
    }
}
