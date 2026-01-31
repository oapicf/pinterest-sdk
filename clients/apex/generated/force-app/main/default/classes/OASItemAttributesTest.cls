@isTest
private class OASItemAttributesTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemAttributes itemAttributes1 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes2 = itemAttributes1;
        OASItemAttributes itemAttributes3 = new OASItemAttributes();
        OASItemAttributes itemAttributes4 = itemAttributes3;

        System.assert(itemAttributes1.equals(itemAttributes2));
        System.assert(itemAttributes2.equals(itemAttributes1));
        System.assert(itemAttributes1.equals(itemAttributes1));
        System.assert(itemAttributes3.equals(itemAttributes4));
        System.assert(itemAttributes4.equals(itemAttributes3));
        System.assert(itemAttributes3.equals(itemAttributes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemAttributes itemAttributes1 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes2 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes3 = new OASItemAttributes();
        OASItemAttributes itemAttributes4 = new OASItemAttributes();

        System.assert(itemAttributes1.equals(itemAttributes2));
        System.assert(itemAttributes2.equals(itemAttributes1));
        System.assert(itemAttributes3.equals(itemAttributes4));
        System.assert(itemAttributes4.equals(itemAttributes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemAttributes itemAttributes1 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes2 = new OASItemAttributes();

        System.assertEquals(false, itemAttributes1.equals('foo'));
        System.assertEquals(false, itemAttributes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemAttributes itemAttributes1 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes2 = new OASItemAttributes();
        OASItemAttributes itemAttributes3;

        System.assertEquals(false, itemAttributes1.equals(itemAttributes3));
        System.assertEquals(false, itemAttributes2.equals(itemAttributes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemAttributes itemAttributes1 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes2 = new OASItemAttributes();

        System.assertEquals(itemAttributes1.hashCode(), itemAttributes1.hashCode());
        System.assertEquals(itemAttributes2.hashCode(), itemAttributes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemAttributes itemAttributes1 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes2 = OASItemAttributes.getExample();
        OASItemAttributes itemAttributes3 = new OASItemAttributes();
        OASItemAttributes itemAttributes4 = new OASItemAttributes();

        System.assert(itemAttributes1.equals(itemAttributes2));
        System.assert(itemAttributes3.equals(itemAttributes4));
        System.assertEquals(itemAttributes1.hashCode(), itemAttributes2.hashCode());
        System.assertEquals(itemAttributes3.hashCode(), itemAttributes4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemAttributes itemAttributes = new OASItemAttributes();
        Map<String, String> x-property-mappings = itemAttributes.getx-property-mappings();
        System.assertEquals('adImage0Link', x-property-mappings.get('ad_image_0_link'));
        System.assertEquals('adImage0Tag', x-property-mappings.get('ad_image_0_tag'));
        System.assertEquals('adImage10Link', x-property-mappings.get('ad_image_10_link'));
        System.assertEquals('adImage10Tag', x-property-mappings.get('ad_image_10_tag'));
        System.assertEquals('adImage11Link', x-property-mappings.get('ad_image_11_link'));
        System.assertEquals('adImage11Tag', x-property-mappings.get('ad_image_11_tag'));
        System.assertEquals('adImage12Link', x-property-mappings.get('ad_image_12_link'));
        System.assertEquals('adImage12Tag', x-property-mappings.get('ad_image_12_tag'));
        System.assertEquals('adImage13Link', x-property-mappings.get('ad_image_13_link'));
        System.assertEquals('adImage13Tag', x-property-mappings.get('ad_image_13_tag'));
        System.assertEquals('adImage14Link', x-property-mappings.get('ad_image_14_link'));
        System.assertEquals('adImage14Tag', x-property-mappings.get('ad_image_14_tag'));
        System.assertEquals('adImage15Link', x-property-mappings.get('ad_image_15_link'));
        System.assertEquals('adImage15Tag', x-property-mappings.get('ad_image_15_tag'));
        System.assertEquals('adImage16Link', x-property-mappings.get('ad_image_16_link'));
        System.assertEquals('adImage16Tag', x-property-mappings.get('ad_image_16_tag'));
        System.assertEquals('adImage17Link', x-property-mappings.get('ad_image_17_link'));
        System.assertEquals('adImage17Tag', x-property-mappings.get('ad_image_17_tag'));
        System.assertEquals('adImage18Link', x-property-mappings.get('ad_image_18_link'));
        System.assertEquals('adImage18Tag', x-property-mappings.get('ad_image_18_tag'));
        System.assertEquals('adImage19Link', x-property-mappings.get('ad_image_19_link'));
        System.assertEquals('adImage19Tag', x-property-mappings.get('ad_image_19_tag'));
        System.assertEquals('adImage1Link', x-property-mappings.get('ad_image_1_link'));
        System.assertEquals('adImage1Tag', x-property-mappings.get('ad_image_1_tag'));
        System.assertEquals('adImage2Link', x-property-mappings.get('ad_image_2_link'));
        System.assertEquals('adImage2Tag', x-property-mappings.get('ad_image_2_tag'));
        System.assertEquals('adImage3Link', x-property-mappings.get('ad_image_3_link'));
        System.assertEquals('adImage3Tag', x-property-mappings.get('ad_image_3_tag'));
        System.assertEquals('adImage4Link', x-property-mappings.get('ad_image_4_link'));
        System.assertEquals('adImage4Tag', x-property-mappings.get('ad_image_4_tag'));
        System.assertEquals('adImage5Link', x-property-mappings.get('ad_image_5_link'));
        System.assertEquals('adImage5Tag', x-property-mappings.get('ad_image_5_tag'));
        System.assertEquals('adImage6Link', x-property-mappings.get('ad_image_6_link'));
        System.assertEquals('adImage6Tag', x-property-mappings.get('ad_image_6_tag'));
        System.assertEquals('adImage7Link', x-property-mappings.get('ad_image_7_link'));
        System.assertEquals('adImage7Tag', x-property-mappings.get('ad_image_7_tag'));
        System.assertEquals('adImage8Link', x-property-mappings.get('ad_image_8_link'));
        System.assertEquals('adImage8Tag', x-property-mappings.get('ad_image_8_tag'));
        System.assertEquals('adImage9Link', x-property-mappings.get('ad_image_9_link'));
        System.assertEquals('adImage9Tag', x-property-mappings.get('ad_image_9_tag'));
        System.assertEquals('adLink', x-property-mappings.get('ad_link'));
        System.assertEquals('adVideo0Link', x-property-mappings.get('ad_video_0_link'));
        System.assertEquals('adVideo0Tag', x-property-mappings.get('ad_video_0_tag'));
        System.assertEquals('adVideo1Link', x-property-mappings.get('ad_video_1_link'));
        System.assertEquals('adVideo1Tag', x-property-mappings.get('ad_video_1_tag'));
        System.assertEquals('adVideo2Link', x-property-mappings.get('ad_video_2_link'));
        System.assertEquals('adVideo2Tag', x-property-mappings.get('ad_video_2_tag'));
        System.assertEquals('ageGroup', x-property-mappings.get('age_group'));
        System.assertEquals('androidDeepLink', x-property-mappings.get('android_deep_link'));
        System.assertEquals('averageReviewRating', x-property-mappings.get('average_review_rating'));
        System.assertEquals('checkoutEnabled', x-property-mappings.get('checkout_enabled'));
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
        System.assertEquals('customNumber0', x-property-mappings.get('custom_number_0'));
        System.assertEquals('customNumber1', x-property-mappings.get('custom_number_1'));
        System.assertEquals('customNumber2', x-property-mappings.get('custom_number_2'));
        System.assertEquals('customNumber3', x-property-mappings.get('custom_number_3'));
        System.assertEquals('customNumber4', x-property-mappings.get('custom_number_4'));
        System.assertEquals('freeShippingLabel', x-property-mappings.get('free_shipping_label'));
        System.assertEquals('freeShippingLimit', x-property-mappings.get('free_shipping_limit'));
        System.assertEquals('googleProductCategory', x-property-mappings.get('google_product_category'));
        System.assertEquals('installmentPrice', x-property-mappings.get('installment_price'));
        System.assertEquals('iosDeepLink', x-property-mappings.get('ios_deep_link'));
        System.assertEquals('itemGroupId', x-property-mappings.get('item_group_id'));
        System.assertEquals('lastUpdatedTime', x-property-mappings.get('last_updated_time'));
        System.assertEquals('minAdPrice', x-property-mappings.get('min_ad_price'));
        System.assertEquals('mobileLink', x-property-mappings.get('mobile_link'));
        System.assertEquals('numberOfRatings', x-property-mappings.get('number_of_ratings'));
        System.assertEquals('numberOfReviews', x-property-mappings.get('number_of_reviews'));
        System.assertEquals('productType', x-property-mappings.get('product_type'));
        System.assertEquals('promotionId', x-property-mappings.get('promotion_id'));
        System.assertEquals('salePrice', x-property-mappings.get('sale_price'));
        System.assertEquals('salePriceEffectiveDate', x-property-mappings.get('sale_price_effective_date'));
        System.assertEquals('shippingHeight', x-property-mappings.get('shipping_height'));
        System.assertEquals('shippingWeight', x-property-mappings.get('shipping_weight'));
        System.assertEquals('shippingWidth', x-property-mappings.get('shipping_width'));
        System.assertEquals('sizeSystem', x-property-mappings.get('size_system'));
        System.assertEquals('sizeType', x-property-mappings.get('size_type'));
        System.assertEquals('unitPricingBaseMeasure', x-property-mappings.get('unit_pricing_base_measure'));
        System.assertEquals('unitPricingMeasure', x-property-mappings.get('unit_pricing_measure'));
        System.assertEquals('variantNames', x-property-mappings.get('variant_names'));
        System.assertEquals('variantValues', x-property-mappings.get('variant_values'));
        System.assertEquals('additionalImageLink', x-property-mappings.get('additional_image_link'));
        System.assertEquals('imageLink', x-property-mappings.get('image_link'));
        System.assertEquals('videoLink', x-property-mappings.get('video_link'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemAttributes itemAttributes = new OASItemAttributes();
        System.assertEquals(new List<String>(), itemAttributes.variantNames);
        System.assertEquals(new List<String>(), itemAttributes.variantValues);
        System.assertEquals(new List<String>(), itemAttributes.additionalImageLink);
        System.assertEquals(new List<String>(), itemAttributes.imageLink);
        System.assertEquals(null, itemAttributes.adImage0Link);
        System.assertEquals(null, itemAttributes.adImage0Tag);
        System.assertEquals(null, itemAttributes.adImage10Link);
        System.assertEquals(null, itemAttributes.adImage10Tag);
        System.assertEquals(null, itemAttributes.adImage11Link);
        System.assertEquals(null, itemAttributes.adImage11Tag);
        System.assertEquals(null, itemAttributes.adImage12Link);
        System.assertEquals(null, itemAttributes.adImage12Tag);
        System.assertEquals(null, itemAttributes.adImage13Link);
        System.assertEquals(null, itemAttributes.adImage13Tag);
        System.assertEquals(null, itemAttributes.adImage14Link);
        System.assertEquals(null, itemAttributes.adImage14Tag);
        System.assertEquals(null, itemAttributes.adImage15Link);
        System.assertEquals(null, itemAttributes.adImage15Tag);
        System.assertEquals(null, itemAttributes.adImage16Link);
        System.assertEquals(null, itemAttributes.adImage16Tag);
        System.assertEquals(null, itemAttributes.adImage17Link);
        System.assertEquals(null, itemAttributes.adImage17Tag);
        System.assertEquals(null, itemAttributes.adImage18Link);
        System.assertEquals(null, itemAttributes.adImage18Tag);
        System.assertEquals(null, itemAttributes.adImage19Link);
        System.assertEquals(null, itemAttributes.adImage19Tag);
        System.assertEquals(null, itemAttributes.adImage1Link);
        System.assertEquals(null, itemAttributes.adImage1Tag);
        System.assertEquals(null, itemAttributes.adImage2Link);
        System.assertEquals(null, itemAttributes.adImage2Tag);
        System.assertEquals(null, itemAttributes.adImage3Link);
        System.assertEquals(null, itemAttributes.adImage3Tag);
        System.assertEquals(null, itemAttributes.adImage4Link);
        System.assertEquals(null, itemAttributes.adImage4Tag);
        System.assertEquals(null, itemAttributes.adImage5Link);
        System.assertEquals(null, itemAttributes.adImage5Tag);
        System.assertEquals(null, itemAttributes.adImage6Link);
        System.assertEquals(null, itemAttributes.adImage6Tag);
        System.assertEquals(null, itemAttributes.adImage7Link);
        System.assertEquals(null, itemAttributes.adImage7Tag);
        System.assertEquals(null, itemAttributes.adImage8Link);
        System.assertEquals(null, itemAttributes.adImage8Tag);
        System.assertEquals(null, itemAttributes.adImage9Link);
        System.assertEquals(null, itemAttributes.adImage9Tag);
        System.assertEquals(null, itemAttributes.adLink);
        System.assertEquals(null, itemAttributes.adVideo0Link);
        System.assertEquals(null, itemAttributes.adVideo0Tag);
        System.assertEquals(null, itemAttributes.adVideo1Link);
        System.assertEquals(null, itemAttributes.adVideo1Tag);
        System.assertEquals(null, itemAttributes.adVideo2Link);
        System.assertEquals(null, itemAttributes.adVideo2Tag);
        System.assertEquals(null, itemAttributes.adult);
        System.assertEquals(null, itemAttributes.ageGroup);
        System.assertEquals(null, itemAttributes.androidDeepLink);
        System.assertEquals(null, itemAttributes.availability);
        System.assertEquals(null, itemAttributes.averageReviewRating);
        System.assertEquals(null, itemAttributes.brand);
        System.assertEquals(null, itemAttributes.checkoutEnabled);
        System.assertEquals(null, itemAttributes.color);
        System.assertEquals(null, itemAttributes.condition);
        System.assertEquals(null, itemAttributes.customLabel0);
        System.assertEquals(null, itemAttributes.customLabel1);
        System.assertEquals(null, itemAttributes.customLabel2);
        System.assertEquals(null, itemAttributes.customLabel3);
        System.assertEquals(null, itemAttributes.customLabel4);
        System.assertEquals(null, itemAttributes.customNumber0);
        System.assertEquals(null, itemAttributes.customNumber1);
        System.assertEquals(null, itemAttributes.customNumber2);
        System.assertEquals(null, itemAttributes.customNumber3);
        System.assertEquals(null, itemAttributes.customNumber4);
        System.assertEquals(null, itemAttributes.description);
        System.assertEquals(null, itemAttributes.freeShippingLabel);
        System.assertEquals(null, itemAttributes.freeShippingLimit);
        System.assertEquals(null, itemAttributes.gender);
        System.assertEquals(null, itemAttributes.googleProductCategory);
        System.assertEquals(null, itemAttributes.gtin);
        System.assertEquals(null, itemAttributes.id);
        System.assertEquals(null, itemAttributes.installmentPrice);
        System.assertEquals(null, itemAttributes.iosDeepLink);
        System.assertEquals(null, itemAttributes.itemGroupId);
        System.assertEquals(null, itemAttributes.lastUpdatedTime);
        System.assertEquals(null, itemAttributes.link);
        System.assertEquals(null, itemAttributes.material);
        System.assertEquals(null, itemAttributes.minAdPrice);
        System.assertEquals(null, itemAttributes.mobileLink);
        System.assertEquals(null, itemAttributes.mpn);
        System.assertEquals(null, itemAttributes.numberOfRatings);
        System.assertEquals(null, itemAttributes.numberOfReviews);
        System.assertEquals(null, itemAttributes.pattern);
        System.assertEquals(null, itemAttributes.price);
        System.assertEquals(null, itemAttributes.productType);
        System.assertEquals(null, itemAttributes.promotionId);
        System.assertEquals(null, itemAttributes.salePrice);
        System.assertEquals(null, itemAttributes.salePriceEffectiveDate);
        System.assertEquals(null, itemAttributes.shipping);
        System.assertEquals(null, itemAttributes.shippingHeight);
        System.assertEquals(null, itemAttributes.shippingWeight);
        System.assertEquals(null, itemAttributes.shippingWidth);
        System.assertEquals(null, itemAttributes.size);
        System.assertEquals(null, itemAttributes.sizeSystem);
        System.assertEquals(null, itemAttributes.sizeType);
        System.assertEquals(null, itemAttributes.tax);
        System.assertEquals(null, itemAttributes.title);
        System.assertEquals(null, itemAttributes.unitPricingBaseMeasure);
        System.assertEquals(null, itemAttributes.unitPricingMeasure);
        System.assertEquals(null, itemAttributes.videoLink);
    }
}
