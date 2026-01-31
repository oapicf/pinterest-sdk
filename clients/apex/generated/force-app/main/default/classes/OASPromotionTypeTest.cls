@isTest
private class OASPromotionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPromotionType> expected = new Set<OASPromotionType>{
            OASPromotionType.VARIABLE,
            OASPromotionType.SITEWIDE,
            OASPromotionType.CHECKOUT,
            OASPromotionType.SAVE_X_ON_Y,
            OASPromotionType.BUY_X_GET_Y,
            OASPromotionType.SPEND_X_SAVE_Y,
            OASPromotionType.FREE_SHIPPING,
            OASPromotionType.FREE_SHIPPING_MINIMUM,
            OASPromotionType.FREE_SHIPPING_WITH_DISCOUNT,
            OASPromotionType.SITEWIDE_IN_STORES,
            OASPromotionType.EXTRA_PERCENT_OFF,
            OASPromotionType.GIFT_WITH_PURCHASE,
            OASPromotionType.GIFT_WITH_PURCHASE_MINIMUM,
            OASPromotionType.FIXED,
            OASPromotionType.PERCENT_OFF_CLEARANCE,
            OASPromotionType.X_OFF_Y,
            OASPromotionType.GIFT_WITH_FIRST_PURCHASE,
            OASPromotionType.BUY_X_GET_ONE_FREE,
            OASPromotionType.CASH_BACK,
            OASPromotionType.POINTS_ON_ALL_PURCHASES,
            OASPromotionType.BONUS,
            OASPromotionType.POINTS_WITH_PURCHASE,
            OASPromotionType.CUSTOM
        };
        Set<OASPromotionType> actual  = new Set<OASPromotionType>(OASPromotionType.values());
        System.assertEquals(expected, actual);
    }
}
