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
        OASItemAttributes itemAttributes = new OASItemAttributes();
        System.assertEquals(new List<String>(), itemAttributes.variantNames);
        System.assertEquals(new List<String>(), itemAttributes.variantValues);
        System.assertEquals(new List<String>(), itemAttributes.additionalImageLink);
        System.assertEquals(new List<String>(), itemAttributes.imageLink);
        System.assertEquals(null, itemAttributes.adLink);
        System.assertEquals(null, itemAttributes.adult);
        System.assertEquals(null, itemAttributes.ageGroup);
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
        System.assertEquals(null, itemAttributes.description);
        System.assertEquals(null, itemAttributes.freeShippingLabel);
        System.assertEquals(null, itemAttributes.freeShippingLimit);
        System.assertEquals(null, itemAttributes.gender);
        System.assertEquals(null, itemAttributes.googleProductCategory);
        System.assertEquals(null, itemAttributes.gtin);
        System.assertEquals(null, itemAttributes.id);
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
        System.assertEquals(null, itemAttributes.salePrice);
        System.assertEquals(null, itemAttributes.shipping);
        System.assertEquals(null, itemAttributes.shippingHeight);
        System.assertEquals(null, itemAttributes.shippingWeight);
        System.assertEquals(null, itemAttributes.shippingWidth);
        System.assertEquals(null, itemAttributes.size);
        System.assertEquals(null, itemAttributes.sizeSystem);
        System.assertEquals(null, itemAttributes.sizeType);
        System.assertEquals(null, itemAttributes.tax);
        System.assertEquals(null, itemAttributes.title);
        System.assertEquals(null, itemAttributes.videoLink);
    }
}
