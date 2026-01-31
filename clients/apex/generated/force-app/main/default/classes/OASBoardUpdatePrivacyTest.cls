@isTest
private class OASBoardUpdatePrivacyTest {
    @isTest
    private static void allowableValues() {
        Set<OASBoardUpdatePrivacy> expected = new Set<OASBoardUpdatePrivacy>{
            OASBoardUpdatePrivacy.PUBLIC,
            OASBoardUpdatePrivacy.SECRET
        };
        Set<OASBoardUpdatePrivacy> actual  = new Set<OASBoardUpdatePrivacy>(OASBoardUpdatePrivacy.values());
        System.assertEquals(expected, actual);
    }
}
