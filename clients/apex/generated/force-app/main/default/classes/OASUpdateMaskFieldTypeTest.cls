@isTest
private class OASUpdateMaskFieldTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASUpdateMaskFieldType> expected = new Set<OASUpdateMaskFieldType>{
            OASUpdateMaskFieldType.AD_LINK,
            OASUpdateMaskFieldType.ADULT,
            OASUpdateMaskFieldType.AGE_GROUP,
            OASUpdateMaskFieldType.AVAILABILITY,
            OASUpdateMaskFieldType.AVERAGE_REVIEW_RATING,
            OASUpdateMaskFieldType.BRAND,
            OASUpdateMaskFieldType.CHECKOUT_ENABLED,
            OASUpdateMaskFieldType.COLOR,
            OASUpdateMaskFieldType.CONDITION,
            OASUpdateMaskFieldType.CUSTOM_LABEL_0,
            OASUpdateMaskFieldType.CUSTOM_LABEL_1,
            OASUpdateMaskFieldType.CUSTOM_LABEL_2,
            OASUpdateMaskFieldType.CUSTOM_LABEL_3,
            OASUpdateMaskFieldType.CUSTOM_LABEL_4,
            OASUpdateMaskFieldType.DESCRIPTION,
            OASUpdateMaskFieldType.FREE_SHIPPING_LABEL,
            OASUpdateMaskFieldType.FREE_SHIPPING_LIMIT,
            OASUpdateMaskFieldType.GENDER,
            OASUpdateMaskFieldType.GOOGLE_PRODUCT_CATEGORY,
            OASUpdateMaskFieldType.GTIN,
            OASUpdateMaskFieldType.ITEM_GROUP_ID,
            OASUpdateMaskFieldType.LAST_UPDATED_TIME,
            OASUpdateMaskFieldType.LINK,
            OASUpdateMaskFieldType.MATERIAL,
            OASUpdateMaskFieldType.MIN_AD_PRICE,
            OASUpdateMaskFieldType.MPN,
            OASUpdateMaskFieldType.NUMBER_OF_RATINGS,
            OASUpdateMaskFieldType.NUMBER_OF_REVIEWS,
            OASUpdateMaskFieldType.PATTERN,
            OASUpdateMaskFieldType.PRICE,
            OASUpdateMaskFieldType.PRODUCT_TYPE,
            OASUpdateMaskFieldType.SALE_PRICE,
            OASUpdateMaskFieldType.SHIPPING,
            OASUpdateMaskFieldType.SHIPPING_HEIGHT,
            OASUpdateMaskFieldType.SHIPPING_WEIGHT,
            OASUpdateMaskFieldType.SHIPPING_WIDTH,
            OASUpdateMaskFieldType.SIZE,
            OASUpdateMaskFieldType.SIZE_SYSTEM,
            OASUpdateMaskFieldType.SIZE_TYPE,
            OASUpdateMaskFieldType.TAX,
            OASUpdateMaskFieldType.TITLE,
            OASUpdateMaskFieldType.VARIANT_NAMES,
            OASUpdateMaskFieldType.VARIANT_VALUES
        };
        Set<OASUpdateMaskFieldType> actual  = new Set<OASUpdateMaskFieldType>(OASUpdateMaskFieldType.values());
        System.assertEquals(expected, actual);
    }
}
