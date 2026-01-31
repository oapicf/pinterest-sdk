@isTest
private class OASBoardPrivacyFilterTest {
    @isTest
    private static void allowableValues() {
        Set<OASBoardPrivacyFilter> expected = new Set<OASBoardPrivacyFilter>{
            OASBoardPrivacyFilter.ALL,
            OASBoardPrivacyFilter.PUBLIC,
            OASBoardPrivacyFilter.PROTECTED,
            OASBoardPrivacyFilter.SECRET,
            OASBoardPrivacyFilter.PUBLIC_AND_SECRET
        };
        Set<OASBoardPrivacyFilter> actual  = new Set<OASBoardPrivacyFilter>(OASBoardPrivacyFilter.values());
        System.assertEquals(expected, actual);
    }
}
