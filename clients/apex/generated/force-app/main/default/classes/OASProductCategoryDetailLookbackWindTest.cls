@isTest
private class OASProductCategoryDetailLookbackWindTest {
    @isTest
    private static void allowableValues() {
        Set<OASProductCategoryDetailLookbackWind> expected = new Set<OASProductCategoryDetailLookbackWind>{
            OASProductCategoryDetailLookbackWind.NUMBER_90,
            OASProductCategoryDetailLookbackWind.NUMBER_180,
            OASProductCategoryDetailLookbackWind.NUMBER_365,
            OASProductCategoryDetailLookbackWind.NUMBER_730
        };
        Set<OASProductCategoryDetailLookbackWind> actual  = new Set<OASProductCategoryDetailLookbackWind>(OASProductCategoryDetailLookbackWind.values());
        System.assertEquals(expected, actual);
    }
}
