@isTest
private class OASCreativeTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCreativeType> expected = new Set<OASCreativeType>{
            OASCreativeType.REGULAR,
            OASCreativeType.VIDEO,
            OASCreativeType.SHOPPING,
            OASCreativeType.CAROUSEL,
            OASCreativeType.MAX_VIDEO,
            OASCreativeType.SHOP_THE_PIN,
            OASCreativeType.COLLECTION,
            OASCreativeType.IDEA,
            OASCreativeType.SHOWCASE,
            OASCreativeType.QUIZ
        };
        Set<OASCreativeType> actual  = new Set<OASCreativeType>(OASCreativeType.values());
        System.assertEquals(expected, actual);
    }
}
