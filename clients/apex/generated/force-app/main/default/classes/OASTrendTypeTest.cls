@isTest
private class OASTrendTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASTrendType> expected = new Set<OASTrendType>{
            OASTrendType.GROWING,
            OASTrendType.MONTHLY,
            OASTrendType.YEARLY,
            OASTrendType.SEASONAL
        };
        Set<OASTrendType> actual  = new Set<OASTrendType>(OASTrendType.values());
        System.assertEquals(expected, actual);
    }
}
