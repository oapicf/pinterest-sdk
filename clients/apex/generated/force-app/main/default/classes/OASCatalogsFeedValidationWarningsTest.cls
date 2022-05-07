@isTest
private class OASCatalogsFeedValidationWarningsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = catalogsFeedValidationWarnings1;
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = catalogsFeedValidationWarnings3;

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assert(catalogsFeedValidationWarnings4.equals(catalogsFeedValidationWarnings3));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = new OASCatalogsFeedValidationWarnings();

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assert(catalogsFeedValidationWarnings4.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();

        System.assertEquals(false, catalogsFeedValidationWarnings1.equals('foo'));
        System.assertEquals(false, catalogsFeedValidationWarnings2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3;

        System.assertEquals(false, catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings3));
        System.assertEquals(false, catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();

        System.assertEquals(catalogsFeedValidationWarnings1.hashCode(), catalogsFeedValidationWarnings1.hashCode());
        System.assertEquals(catalogsFeedValidationWarnings2.hashCode(), catalogsFeedValidationWarnings2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = new OASCatalogsFeedValidationWarnings();

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assertEquals(catalogsFeedValidationWarnings1.hashCode(), catalogsFeedValidationWarnings2.hashCode());
        System.assertEquals(catalogsFeedValidationWarnings3.hashCode(), catalogsFeedValidationWarnings4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings = new OASCatalogsFeedValidationWarnings();
        Map<String, String> x-property-mappings = catalogsFeedValidationWarnings.getx-property-mappings();
        System.assertEquals('titleLengthTooLong', x-property-mappings.get('title_length_too_long'));
        System.assertEquals('descriptionLengthTooLong', x-property-mappings.get('description_length_too_long'));
        System.assertEquals('genderInvalid', x-property-mappings.get('gender_invalid'));
        System.assertEquals('ageGroupInvalid', x-property-mappings.get('age_group_invalid'));
        System.assertEquals('sizeTypeInvalid', x-property-mappings.get('size_type_invalid'));
        System.assertEquals('linkFormatWarning', x-property-mappings.get('link_format_warning'));
        System.assertEquals('duplicateProducts', x-property-mappings.get('duplicate_products'));
        System.assertEquals('duplicateLinks', x-property-mappings.get('duplicate_links'));
        System.assertEquals('salesPriceInvalid', x-property-mappings.get('sales_price_invalid'));
        System.assertEquals('productCategoryDepthWarning', x-property-mappings.get('product_category_depth_warning'));
        System.assertEquals('adwordsSameAsLink', x-property-mappings.get('adwords_same_as_link'));
        System.assertEquals('duplicateHeaders', x-property-mappings.get('duplicate_headers'));
        System.assertEquals('fetchSameSignature', x-property-mappings.get('fetch_same_signature'));
        System.assertEquals('adwordsFormatWarning', x-property-mappings.get('adwords_format_warning'));
        System.assertEquals('additionalImageLinkWarning', x-property-mappings.get('additional_image_link_warning'));
        System.assertEquals('imageLinkWarning', x-property-mappings.get('image_link_warning'));
        System.assertEquals('shippingInvalid', x-property-mappings.get('shipping_invalid'));
        System.assertEquals('taxInvalid', x-property-mappings.get('tax_invalid'));
        System.assertEquals('shippingWeightInvalid', x-property-mappings.get('shipping_weight_invalid'));
        System.assertEquals('expirationDateInvalid', x-property-mappings.get('expiration_date_invalid'));
        System.assertEquals('availabilityDateInvalid', x-property-mappings.get('availability_date_invalid'));
        System.assertEquals('saleDateInvalid', x-property-mappings.get('sale_date_invalid'));
        System.assertEquals('weightUnitInvalid', x-property-mappings.get('weight_unit_invalid'));
        System.assertEquals('isBundleInvalid', x-property-mappings.get('is_bundle_invalid'));
        System.assertEquals('updatedTimeInvalid', x-property-mappings.get('updated_time_invalid'));
        System.assertEquals('customLabelLengthTooLong', x-property-mappings.get('custom_label_length_too_long'));
        System.assertEquals('productTypeLengthTooLong', x-property-mappings.get('product_type_length_too_long'));
        System.assertEquals('tooManyAdditionalImageLinks', x-property-mappings.get('too_many_additional_image_links'));
        System.assertEquals('multipackInvalid', x-property-mappings.get('multipack_invalid'));
        System.assertEquals('indexedProductCountLargeDelta', x-property-mappings.get('indexed_product_count_large_delta'));
        System.assertEquals('itemAdditionalImageDownloadFailure', x-property-mappings.get('item_additional_image_download_failure'));
        System.assertEquals('optionalProductCategoryMissing', x-property-mappings.get('optional_product_category_missing'));
        System.assertEquals('optionalProductCategoryInvalid', x-property-mappings.get('optional_product_category_invalid'));
        System.assertEquals('optionalConditionMissing', x-property-mappings.get('optional_condition_missing'));
        System.assertEquals('optionalConditionInvalid', x-property-mappings.get('optional_condition_invalid'));
        System.assertEquals('iosDeepLinkInvalid', x-property-mappings.get('ios_deep_link_invalid'));
        System.assertEquals('androidDeepLinkInvalid', x-property-mappings.get('android_deep_link_invalid'));
        System.assertEquals('availabilityNormalized', x-property-mappings.get('availability_normalized'));
        System.assertEquals('conditionNormalized', x-property-mappings.get('condition_normalized'));
        System.assertEquals('genderNormalized', x-property-mappings.get('gender_normalized'));
        System.assertEquals('sizeTypeNormalized', x-property-mappings.get('size_type_normalized'));
        System.assertEquals('ageGroupNormalized', x-property-mappings.get('age_group_normalized'));
        System.assertEquals('utmSourceAutoCorrected', x-property-mappings.get('utm_source_auto_corrected'));
        System.assertEquals('countryDoesNotMapToCurrency', x-property-mappings.get('country_does_not_map_to_currency'));
        System.assertEquals('minAdPriceInvalid', x-property-mappings.get('min_ad_price_invalid'));
    }
}
