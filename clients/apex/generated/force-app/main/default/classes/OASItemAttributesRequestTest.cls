@isTest
private class OASItemAttributesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemAttributesRequest itemAttributesRequest1 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest2 = itemAttributesRequest1;
        OASItemAttributesRequest itemAttributesRequest3 = new OASItemAttributesRequest();
        OASItemAttributesRequest itemAttributesRequest4 = itemAttributesRequest3;

        System.assert(itemAttributesRequest1.equals(itemAttributesRequest2));
        System.assert(itemAttributesRequest2.equals(itemAttributesRequest1));
        System.assert(itemAttributesRequest1.equals(itemAttributesRequest1));
        System.assert(itemAttributesRequest3.equals(itemAttributesRequest4));
        System.assert(itemAttributesRequest4.equals(itemAttributesRequest3));
        System.assert(itemAttributesRequest3.equals(itemAttributesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemAttributesRequest itemAttributesRequest1 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest2 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest3 = new OASItemAttributesRequest();
        OASItemAttributesRequest itemAttributesRequest4 = new OASItemAttributesRequest();

        System.assert(itemAttributesRequest1.equals(itemAttributesRequest2));
        System.assert(itemAttributesRequest2.equals(itemAttributesRequest1));
        System.assert(itemAttributesRequest3.equals(itemAttributesRequest4));
        System.assert(itemAttributesRequest4.equals(itemAttributesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemAttributesRequest itemAttributesRequest1 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest2 = new OASItemAttributesRequest();

        System.assertEquals(false, itemAttributesRequest1.equals('foo'));
        System.assertEquals(false, itemAttributesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemAttributesRequest itemAttributesRequest1 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest2 = new OASItemAttributesRequest();
        OASItemAttributesRequest itemAttributesRequest3;

        System.assertEquals(false, itemAttributesRequest1.equals(itemAttributesRequest3));
        System.assertEquals(false, itemAttributesRequest2.equals(itemAttributesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemAttributesRequest itemAttributesRequest1 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest2 = new OASItemAttributesRequest();

        System.assertEquals(itemAttributesRequest1.hashCode(), itemAttributesRequest1.hashCode());
        System.assertEquals(itemAttributesRequest2.hashCode(), itemAttributesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemAttributesRequest itemAttributesRequest1 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest2 = OASItemAttributesRequest.getExample();
        OASItemAttributesRequest itemAttributesRequest3 = new OASItemAttributesRequest();
        OASItemAttributesRequest itemAttributesRequest4 = new OASItemAttributesRequest();

        System.assert(itemAttributesRequest1.equals(itemAttributesRequest2));
        System.assert(itemAttributesRequest3.equals(itemAttributesRequest4));
        System.assertEquals(itemAttributesRequest1.hashCode(), itemAttributesRequest2.hashCode());
        System.assertEquals(itemAttributesRequest3.hashCode(), itemAttributesRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemAttributesRequest itemAttributesRequest = new OASItemAttributesRequest();
        Map<String, String> x-property-mappings = itemAttributesRequest.getx-property-mappings();
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
        System.assertEquals('savePinDisabled', x-property-mappings.get('save_pin_disabled'));
        System.assertEquals('videoLink', x-property-mappings.get('video_link'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemAttributesRequest itemAttributesRequest = new OASItemAttributesRequest();
        System.assertEquals(new List<String>(), itemAttributesRequest.variantNames);
        System.assertEquals(new List<String>(), itemAttributesRequest.variantValues);
        System.assertEquals(new List<String>(), itemAttributesRequest.additionalImageLink);
        System.assertEquals(false, itemAttributesRequest.savePinDisabled);
        System.assertEquals(null, itemAttributesRequest.adImage0Link);
        System.assertEquals(null, itemAttributesRequest.adImage0Tag);
        System.assertEquals(null, itemAttributesRequest.adImage10Link);
        System.assertEquals(null, itemAttributesRequest.adImage10Tag);
        System.assertEquals(null, itemAttributesRequest.adImage11Link);
        System.assertEquals(null, itemAttributesRequest.adImage11Tag);
        System.assertEquals(null, itemAttributesRequest.adImage12Link);
        System.assertEquals(null, itemAttributesRequest.adImage12Tag);
        System.assertEquals(null, itemAttributesRequest.adImage13Link);
        System.assertEquals(null, itemAttributesRequest.adImage13Tag);
        System.assertEquals(null, itemAttributesRequest.adImage14Link);
        System.assertEquals(null, itemAttributesRequest.adImage14Tag);
        System.assertEquals(null, itemAttributesRequest.adImage15Link);
        System.assertEquals(null, itemAttributesRequest.adImage15Tag);
        System.assertEquals(null, itemAttributesRequest.adImage16Link);
        System.assertEquals(null, itemAttributesRequest.adImage16Tag);
        System.assertEquals(null, itemAttributesRequest.adImage17Link);
        System.assertEquals(null, itemAttributesRequest.adImage17Tag);
        System.assertEquals(null, itemAttributesRequest.adImage18Link);
        System.assertEquals(null, itemAttributesRequest.adImage18Tag);
        System.assertEquals(null, itemAttributesRequest.adImage19Link);
        System.assertEquals(null, itemAttributesRequest.adImage19Tag);
        System.assertEquals(null, itemAttributesRequest.adImage1Link);
        System.assertEquals(null, itemAttributesRequest.adImage1Tag);
        System.assertEquals(null, itemAttributesRequest.adImage2Link);
        System.assertEquals(null, itemAttributesRequest.adImage2Tag);
        System.assertEquals(null, itemAttributesRequest.adImage3Link);
        System.assertEquals(null, itemAttributesRequest.adImage3Tag);
        System.assertEquals(null, itemAttributesRequest.adImage4Link);
        System.assertEquals(null, itemAttributesRequest.adImage4Tag);
        System.assertEquals(null, itemAttributesRequest.adImage5Link);
        System.assertEquals(null, itemAttributesRequest.adImage5Tag);
        System.assertEquals(null, itemAttributesRequest.adImage6Link);
        System.assertEquals(null, itemAttributesRequest.adImage6Tag);
        System.assertEquals(null, itemAttributesRequest.adImage7Link);
        System.assertEquals(null, itemAttributesRequest.adImage7Tag);
        System.assertEquals(null, itemAttributesRequest.adImage8Link);
        System.assertEquals(null, itemAttributesRequest.adImage8Tag);
        System.assertEquals(null, itemAttributesRequest.adImage9Link);
        System.assertEquals(null, itemAttributesRequest.adImage9Tag);
        System.assertEquals(null, itemAttributesRequest.adLink);
        System.assertEquals(null, itemAttributesRequest.adVideo0Link);
        System.assertEquals(null, itemAttributesRequest.adVideo0Tag);
        System.assertEquals(null, itemAttributesRequest.adVideo1Link);
        System.assertEquals(null, itemAttributesRequest.adVideo1Tag);
        System.assertEquals(null, itemAttributesRequest.adVideo2Link);
        System.assertEquals(null, itemAttributesRequest.adVideo2Tag);
        System.assertEquals(null, itemAttributesRequest.adult);
        System.assertEquals(null, itemAttributesRequest.ageGroup);
        System.assertEquals(null, itemAttributesRequest.androidDeepLink);
        System.assertEquals(null, itemAttributesRequest.availability);
        System.assertEquals(null, itemAttributesRequest.averageReviewRating);
        System.assertEquals(null, itemAttributesRequest.brand);
        System.assertEquals(null, itemAttributesRequest.checkoutEnabled);
        System.assertEquals(null, itemAttributesRequest.color);
        System.assertEquals(null, itemAttributesRequest.condition);
        System.assertEquals(null, itemAttributesRequest.customLabel0);
        System.assertEquals(null, itemAttributesRequest.customLabel1);
        System.assertEquals(null, itemAttributesRequest.customLabel2);
        System.assertEquals(null, itemAttributesRequest.customLabel3);
        System.assertEquals(null, itemAttributesRequest.customLabel4);
        System.assertEquals(null, itemAttributesRequest.customNumber0);
        System.assertEquals(null, itemAttributesRequest.customNumber1);
        System.assertEquals(null, itemAttributesRequest.customNumber2);
        System.assertEquals(null, itemAttributesRequest.customNumber3);
        System.assertEquals(null, itemAttributesRequest.customNumber4);
        System.assertEquals(null, itemAttributesRequest.description);
        System.assertEquals(null, itemAttributesRequest.freeShippingLabel);
        System.assertEquals(null, itemAttributesRequest.freeShippingLimit);
        System.assertEquals(null, itemAttributesRequest.gender);
        System.assertEquals(null, itemAttributesRequest.googleProductCategory);
        System.assertEquals(null, itemAttributesRequest.gtin);
        System.assertEquals(null, itemAttributesRequest.id);
        System.assertEquals(null, itemAttributesRequest.installmentPrice);
        System.assertEquals(null, itemAttributesRequest.iosDeepLink);
        System.assertEquals(null, itemAttributesRequest.itemGroupId);
        System.assertEquals(null, itemAttributesRequest.lastUpdatedTime);
        System.assertEquals(null, itemAttributesRequest.link);
        System.assertEquals(null, itemAttributesRequest.material);
        System.assertEquals(null, itemAttributesRequest.minAdPrice);
        System.assertEquals(null, itemAttributesRequest.mobileLink);
        System.assertEquals(null, itemAttributesRequest.mpn);
        System.assertEquals(null, itemAttributesRequest.numberOfRatings);
        System.assertEquals(null, itemAttributesRequest.numberOfReviews);
        System.assertEquals(null, itemAttributesRequest.pattern);
        System.assertEquals(null, itemAttributesRequest.price);
        System.assertEquals(null, itemAttributesRequest.productType);
        System.assertEquals(null, itemAttributesRequest.promotionId);
        System.assertEquals(null, itemAttributesRequest.salePrice);
        System.assertEquals(null, itemAttributesRequest.salePriceEffectiveDate);
        System.assertEquals(null, itemAttributesRequest.shipping);
        System.assertEquals(null, itemAttributesRequest.shippingHeight);
        System.assertEquals(null, itemAttributesRequest.shippingWeight);
        System.assertEquals(null, itemAttributesRequest.shippingWidth);
        System.assertEquals(null, itemAttributesRequest.size);
        System.assertEquals(null, itemAttributesRequest.sizeSystem);
        System.assertEquals(null, itemAttributesRequest.sizeType);
        System.assertEquals(null, itemAttributesRequest.tax);
        System.assertEquals(null, itemAttributesRequest.title);
        System.assertEquals(null, itemAttributesRequest.unitPricingBaseMeasure);
        System.assertEquals(null, itemAttributesRequest.unitPricingMeasure);
        System.assertEquals(null, itemAttributesRequest.imageLink);
        System.assertEquals(null, itemAttributesRequest.videoLink);
    }
}
