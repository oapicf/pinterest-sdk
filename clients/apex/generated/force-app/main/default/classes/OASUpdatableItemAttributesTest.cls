@isTest
private class OASUpdatableItemAttributesTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatableItemAttributes updatableItemAttributes1 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes2 = updatableItemAttributes1;
        OASUpdatableItemAttributes updatableItemAttributes3 = new OASUpdatableItemAttributes();
        OASUpdatableItemAttributes updatableItemAttributes4 = updatableItemAttributes3;

        System.assert(updatableItemAttributes1.equals(updatableItemAttributes2));
        System.assert(updatableItemAttributes2.equals(updatableItemAttributes1));
        System.assert(updatableItemAttributes1.equals(updatableItemAttributes1));
        System.assert(updatableItemAttributes3.equals(updatableItemAttributes4));
        System.assert(updatableItemAttributes4.equals(updatableItemAttributes3));
        System.assert(updatableItemAttributes3.equals(updatableItemAttributes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatableItemAttributes updatableItemAttributes1 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes2 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes3 = new OASUpdatableItemAttributes();
        OASUpdatableItemAttributes updatableItemAttributes4 = new OASUpdatableItemAttributes();

        System.assert(updatableItemAttributes1.equals(updatableItemAttributes2));
        System.assert(updatableItemAttributes2.equals(updatableItemAttributes1));
        System.assert(updatableItemAttributes3.equals(updatableItemAttributes4));
        System.assert(updatableItemAttributes4.equals(updatableItemAttributes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatableItemAttributes updatableItemAttributes1 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes2 = new OASUpdatableItemAttributes();

        System.assertEquals(false, updatableItemAttributes1.equals('foo'));
        System.assertEquals(false, updatableItemAttributes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatableItemAttributes updatableItemAttributes1 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes2 = new OASUpdatableItemAttributes();
        OASUpdatableItemAttributes updatableItemAttributes3;

        System.assertEquals(false, updatableItemAttributes1.equals(updatableItemAttributes3));
        System.assertEquals(false, updatableItemAttributes2.equals(updatableItemAttributes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatableItemAttributes updatableItemAttributes1 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes2 = new OASUpdatableItemAttributes();

        System.assertEquals(updatableItemAttributes1.hashCode(), updatableItemAttributes1.hashCode());
        System.assertEquals(updatableItemAttributes2.hashCode(), updatableItemAttributes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatableItemAttributes updatableItemAttributes1 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes2 = OASUpdatableItemAttributes.getExample();
        OASUpdatableItemAttributes updatableItemAttributes3 = new OASUpdatableItemAttributes();
        OASUpdatableItemAttributes updatableItemAttributes4 = new OASUpdatableItemAttributes();

        System.assert(updatableItemAttributes1.equals(updatableItemAttributes2));
        System.assert(updatableItemAttributes3.equals(updatableItemAttributes4));
        System.assertEquals(updatableItemAttributes1.hashCode(), updatableItemAttributes2.hashCode());
        System.assertEquals(updatableItemAttributes3.hashCode(), updatableItemAttributes4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdatableItemAttributes updatableItemAttributes = new OASUpdatableItemAttributes();
        Map<String, String> x-property-mappings = updatableItemAttributes.getx-property-mappings();
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
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatableItemAttributes updatableItemAttributes = new OASUpdatableItemAttributes();
        System.assertEquals(new List<String>(), updatableItemAttributes.variantNames);
        System.assertEquals(new List<String>(), updatableItemAttributes.variantValues);
        System.assertEquals(null, updatableItemAttributes.adLink);
        System.assertEquals(null, updatableItemAttributes.adult);
        System.assertEquals(null, updatableItemAttributes.ageGroup);
        System.assertEquals(null, updatableItemAttributes.availability);
        System.assertEquals(null, updatableItemAttributes.averageReviewRating);
        System.assertEquals(null, updatableItemAttributes.brand);
        System.assertEquals(null, updatableItemAttributes.checkoutEnabled);
        System.assertEquals(null, updatableItemAttributes.color);
        System.assertEquals(null, updatableItemAttributes.condition);
        System.assertEquals(null, updatableItemAttributes.customLabel0);
        System.assertEquals(null, updatableItemAttributes.customLabel1);
        System.assertEquals(null, updatableItemAttributes.customLabel2);
        System.assertEquals(null, updatableItemAttributes.customLabel3);
        System.assertEquals(null, updatableItemAttributes.customLabel4);
        System.assertEquals(null, updatableItemAttributes.description);
        System.assertEquals(null, updatableItemAttributes.freeShippingLabel);
        System.assertEquals(null, updatableItemAttributes.freeShippingLimit);
        System.assertEquals(null, updatableItemAttributes.gender);
        System.assertEquals(null, updatableItemAttributes.googleProductCategory);
        System.assertEquals(null, updatableItemAttributes.gtin);
        System.assertEquals(null, updatableItemAttributes.id);
        System.assertEquals(null, updatableItemAttributes.itemGroupId);
        System.assertEquals(null, updatableItemAttributes.lastUpdatedTime);
        System.assertEquals(null, updatableItemAttributes.link);
        System.assertEquals(null, updatableItemAttributes.material);
        System.assertEquals(null, updatableItemAttributes.minAdPrice);
        System.assertEquals(null, updatableItemAttributes.mobileLink);
        System.assertEquals(null, updatableItemAttributes.mpn);
        System.assertEquals(null, updatableItemAttributes.numberOfRatings);
        System.assertEquals(null, updatableItemAttributes.numberOfReviews);
        System.assertEquals(null, updatableItemAttributes.pattern);
        System.assertEquals(null, updatableItemAttributes.price);
        System.assertEquals(null, updatableItemAttributes.productType);
        System.assertEquals(null, updatableItemAttributes.salePrice);
        System.assertEquals(null, updatableItemAttributes.shipping);
        System.assertEquals(null, updatableItemAttributes.shippingHeight);
        System.assertEquals(null, updatableItemAttributes.shippingWeight);
        System.assertEquals(null, updatableItemAttributes.shippingWidth);
        System.assertEquals(null, updatableItemAttributes.size);
        System.assertEquals(null, updatableItemAttributes.sizeSystem);
        System.assertEquals(null, updatableItemAttributes.sizeType);
        System.assertEquals(null, updatableItemAttributes.tax);
        System.assertEquals(null, updatableItemAttributes.title);
    }
}
