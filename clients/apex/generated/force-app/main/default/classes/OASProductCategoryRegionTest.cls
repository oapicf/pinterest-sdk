@isTest
private class OASProductCategoryRegionTest {
    @isTest
    private static void allowableValues() {
        Set<OASProductCategoryRegion> expected = new Set<OASProductCategoryRegion>{
            OASProductCategoryRegion.US,
            OASProductCategoryRegion.GB_IE,
            OASProductCategoryRegion.CA
        };
        Set<OASProductCategoryRegion> actual  = new Set<OASProductCategoryRegion>(OASProductCategoryRegion.values());
        System.assertEquals(expected, actual);
    }
}
