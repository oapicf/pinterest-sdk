@isTest
private class OASProductCategoriesEngagementTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASProductCategoriesEngagementType> expected = new Set<OASProductCategoriesEngagementType>{
            OASProductCategoriesEngagementType.ENGAGEMENT,
            OASProductCategoriesEngagementType.OUTBOUND_CLICK,
            OASProductCategoriesEngagementType.SAVE
        };
        Set<OASProductCategoriesEngagementType> actual  = new Set<OASProductCategoriesEngagementType>(OASProductCategoriesEngagementType.values());
        System.assertEquals(expected, actual);
    }
}
