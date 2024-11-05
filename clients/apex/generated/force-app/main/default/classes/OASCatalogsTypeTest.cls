@isTest
private class OASCatalogsTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsType> expected = new Set<OASCatalogsType>{
            OASCatalogsType.RETAIL,
            OASCatalogsType.HOTEL,
            OASCatalogsType.CREATIVE_ASSETS
        };
        Set<OASCatalogsType> actual  = new Set<OASCatalogsType>(OASCatalogsType.values());
        System.assertEquals(expected, actual);
    }
}
