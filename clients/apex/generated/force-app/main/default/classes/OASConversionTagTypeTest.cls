@isTest
private class OASConversionTagTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASConversionTagType> expected = new Set<OASConversionTagType>{
            OASConversionTagType.PAGE_LOAD,
            OASConversionTagType.UNKNOWN,
            OASConversionTagType.INITIALIZED,
            OASConversionTagType.PAGE_VISIT,
            OASConversionTagType.SIGNUP,
            OASConversionTagType.CHECKOUT,
            OASConversionTagType.CUSTOM,
            OASConversionTagType.VIEW_CATEGORY,
            OASConversionTagType.SEARCH,
            OASConversionTagType.ADD_TO_CART,
            OASConversionTagType.WATCH_VIDEO,
            OASConversionTagType.LEAD,
            OASConversionTagType.APP_INSTALL,
            OASConversionTagType.WEB_SESSION,
            OASConversionTagType.EXTERNAL_MEASUREMENT
        };
        Set<OASConversionTagType> actual  = new Set<OASConversionTagType>(OASConversionTagType.values());
        System.assertEquals(expected, actual);
    }
}
