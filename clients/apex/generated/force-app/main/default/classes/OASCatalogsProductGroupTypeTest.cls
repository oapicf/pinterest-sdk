@isTest
private class OASCatalogsProductGroupTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsProductGroupType> expected = new Set<OASCatalogsProductGroupType>{
            OASCatalogsProductGroupType.MERCHANT_CREATED,
            OASCatalogsProductGroupType.ALL_PRODUCTS,
            OASCatalogsProductGroupType.BEST_DEALS,
            OASCatalogsProductGroupType.PINNER_FAVORITES,
            OASCatalogsProductGroupType.TOP_SELLERS,
            OASCatalogsProductGroupType.BACK_IN_STOCK,
            OASCatalogsProductGroupType.NEW_ARRIVALS,
            OASCatalogsProductGroupType.SHOPIFY_COLLECTIONS,
            OASCatalogsProductGroupType.I2PC
        };
        Set<OASCatalogsProductGroupType> actual  = new Set<OASCatalogsProductGroupType>(OASCatalogsProductGroupType.values());
        System.assertEquals(expected, actual);
    }
}
