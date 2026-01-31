@isTest
private class OASBoardPrivacyTest {
    @isTest
    private static void allowableValues() {
        Set<OASBoardPrivacy> expected = new Set<OASBoardPrivacy>{
            OASBoardPrivacy.PUBLIC,
            OASBoardPrivacy.PROTECTED,
            OASBoardPrivacy.SECRET
        };
        Set<OASBoardPrivacy> actual  = new Set<OASBoardPrivacy>(OASBoardPrivacy.values());
        System.assertEquals(expected, actual);
    }
}
