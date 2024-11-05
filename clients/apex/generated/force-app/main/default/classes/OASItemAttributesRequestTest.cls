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
        System.assertEquals('adLink', x-property-mappings.get('ad_link'));
        System.assertEquals('ageGroup', x-property-mappings.get('age_group'));
        System.assertEquals('averageReviewRating', x-property-mappings.get('average_review_rating'));
        System.assertEquals('checkoutEnabled', x-property-mappings.get('checkout_enabled'));
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
        System.assertEquals('freeShippingLabel', x-property-mappings.get('free_shipping_label'));
        System.assertEquals('freeShippingLimit', x-property-mappings.get('free_shipping_limit'));
        System.assertEquals('googleProductCategory', x-property-mappings.get('google_product_category'));
        System.assertEquals('itemGroupId', x-property-mappings.get('item_group_id'));
        System.assertEquals('lastUpdatedTime', x-property-mappings.get('last_updated_time'));
        System.assertEquals('minAdPrice', x-property-mappings.get('min_ad_price'));
        System.assertEquals('mobileLink', x-property-mappings.get('mobile_link'));
        System.assertEquals('numberOfRatings', x-property-mappings.get('number_of_ratings'));
        System.assertEquals('numberOfReviews', x-property-mappings.get('number_of_reviews'));
        System.assertEquals('productType', x-property-mappings.get('product_type'));
        System.assertEquals('salePrice', x-property-mappings.get('sale_price'));
        System.assertEquals('shippingHeight', x-property-mappings.get('shipping_height'));
        System.assertEquals('shippingWeight', x-property-mappings.get('shipping_weight'));
        System.assertEquals('shippingWidth', x-property-mappings.get('shipping_width'));
        System.assertEquals('sizeSystem', x-property-mappings.get('size_system'));
        System.assertEquals('sizeType', x-property-mappings.get('size_type'));
        System.assertEquals('variantNames', x-property-mappings.get('variant_names'));
        System.assertEquals('variantValues', x-property-mappings.get('variant_values'));
        System.assertEquals('additionalImageLink', x-property-mappings.get('additional_image_link'));
        System.assertEquals('imageLink', x-property-mappings.get('image_link'));
        System.assertEquals('videoLink', x-property-mappings.get('video_link'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemAttributesRequest itemAttributesRequest = new OASItemAttributesRequest();
        System.assertEquals(new List<String>(), itemAttributesRequest.variantNames);
        System.assertEquals(new List<String>(), itemAttributesRequest.variantValues);
        System.assertEquals(new List<String>(), itemAttributesRequest.additionalImageLink);
        System.assertEquals(null, itemAttributesRequest.adLink);
        System.assertEquals(null, itemAttributesRequest.adult);
        System.assertEquals(null, itemAttributesRequest.ageGroup);
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
        System.assertEquals(null, itemAttributesRequest.description);
        System.assertEquals(null, itemAttributesRequest.freeShippingLabel);
        System.assertEquals(null, itemAttributesRequest.freeShippingLimit);
        System.assertEquals(null, itemAttributesRequest.gender);
        System.assertEquals(null, itemAttributesRequest.googleProductCategory);
        System.assertEquals(null, itemAttributesRequest.gtin);
        System.assertEquals(null, itemAttributesRequest.id);
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
        System.assertEquals(null, itemAttributesRequest.salePrice);
        System.assertEquals(null, itemAttributesRequest.shipping);
        System.assertEquals(null, itemAttributesRequest.shippingHeight);
        System.assertEquals(null, itemAttributesRequest.shippingWeight);
        System.assertEquals(null, itemAttributesRequest.shippingWidth);
        System.assertEquals(null, itemAttributesRequest.size);
        System.assertEquals(null, itemAttributesRequest.sizeSystem);
        System.assertEquals(null, itemAttributesRequest.sizeType);
        System.assertEquals(null, itemAttributesRequest.tax);
        System.assertEquals(null, itemAttributesRequest.title);
        System.assertEquals(null, itemAttributesRequest.imageLink);
        System.assertEquals(null, itemAttributesRequest.videoLink);
    }
}
