@isTest
private class OASCatalogsHotelProductGroupTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsHotelProductGroupType> expected = new Set<OASCatalogsHotelProductGroupType>{
            OASCatalogsHotelProductGroupType.MERCHANT_CREATED,
            OASCatalogsHotelProductGroupType.ALL_LISTINGS
        };
        Set<OASCatalogsHotelProductGroupType> actual  = new Set<OASCatalogsHotelProductGroupType>(OASCatalogsHotelProductGroupType.values());
        System.assertEquals(expected, actual);
    }
}
