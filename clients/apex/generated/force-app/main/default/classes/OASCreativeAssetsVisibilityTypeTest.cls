@isTest
private class OASCreativeAssetsVisibilityTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCreativeAssetsVisibilityType> expected = new Set<OASCreativeAssetsVisibilityType>{
            OASCreativeAssetsVisibilityType.VISIBLE,
            OASCreativeAssetsVisibilityType.HIDDEN
        };
        Set<OASCreativeAssetsVisibilityType> actual  = new Set<OASCreativeAssetsVisibilityType>(OASCreativeAssetsVisibilityType.values());
        System.assertEquals(expected, actual);
    }
}
