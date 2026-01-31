@isTest
private class OASVerticalProductCategoryTest {
    @isTest
    private static void allowableValues() {
        Set<OASVerticalProductCategory> expected = new Set<OASVerticalProductCategory>{
            OASVerticalProductCategory.FASHION,
            OASVerticalProductCategory.HOME_DECOR,
            OASVerticalProductCategory.BEAUTY
        };
        Set<OASVerticalProductCategory> actual  = new Set<OASVerticalProductCategory>(OASVerticalProductCategory.values());
        System.assertEquals(expected, actual);
    }
}
