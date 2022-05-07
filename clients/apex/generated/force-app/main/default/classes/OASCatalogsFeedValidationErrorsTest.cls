@isTest
private class OASCatalogsFeedValidationErrorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = catalogsFeedValidationErrors1;
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors4 = catalogsFeedValidationErrors3;

        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors2));
        System.assert(catalogsFeedValidationErrors2.equals(catalogsFeedValidationErrors1));
        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors1));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors4));
        System.assert(catalogsFeedValidationErrors4.equals(catalogsFeedValidationErrors3));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors4 = new OASCatalogsFeedValidationErrors();

        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors2));
        System.assert(catalogsFeedValidationErrors2.equals(catalogsFeedValidationErrors1));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors4));
        System.assert(catalogsFeedValidationErrors4.equals(catalogsFeedValidationErrors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = new OASCatalogsFeedValidationErrors();

        System.assertEquals(false, catalogsFeedValidationErrors1.equals('foo'));
        System.assertEquals(false, catalogsFeedValidationErrors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3;

        System.assertEquals(false, catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors3));
        System.assertEquals(false, catalogsFeedValidationErrors2.equals(catalogsFeedValidationErrors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = new OASCatalogsFeedValidationErrors();

        System.assertEquals(catalogsFeedValidationErrors1.hashCode(), catalogsFeedValidationErrors1.hashCode());
        System.assertEquals(catalogsFeedValidationErrors2.hashCode(), catalogsFeedValidationErrors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors4 = new OASCatalogsFeedValidationErrors();

        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors2));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors4));
        System.assertEquals(catalogsFeedValidationErrors1.hashCode(), catalogsFeedValidationErrors2.hashCode());
        System.assertEquals(catalogsFeedValidationErrors3.hashCode(), catalogsFeedValidationErrors4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors = new OASCatalogsFeedValidationErrors();
        Map<String, String> x-property-mappings = catalogsFeedValidationErrors.getx-property-mappings();
        System.assertEquals('fetchError', x-property-mappings.get('fetch_error'));
        System.assertEquals('fetchInactiveFeedError', x-property-mappings.get('fetch_inactive_feed_error'));
        System.assertEquals('encodingError', x-property-mappings.get('encoding_error'));
        System.assertEquals('delimiterError', x-property-mappings.get('delimiter_error'));
        System.assertEquals('requiredColumnsMissing', x-property-mappings.get('required_columns_missing'));
        System.assertEquals('imageLinkInvalid', x-property-mappings.get('image_link_invalid'));
        System.assertEquals('itemidMissing', x-property-mappings.get('itemid_missing'));
        System.assertEquals('titleMissing', x-property-mappings.get('title_missing'));
        System.assertEquals('descriptionMissing', x-property-mappings.get('description_missing'));
        System.assertEquals('productCategoryInvalid', x-property-mappings.get('product_category_invalid'));
        System.assertEquals('productLinkMissing', x-property-mappings.get('product_link_missing'));
        System.assertEquals('imageLinkMissing', x-property-mappings.get('image_link_missing'));
        System.assertEquals('availabilityInvalid', x-property-mappings.get('availability_invalid'));
        System.assertEquals('productPriceInvalid', x-property-mappings.get('product_price_invalid'));
        System.assertEquals('linkFormatInvalid', x-property-mappings.get('link_format_invalid'));
        System.assertEquals('parseLineError', x-property-mappings.get('parse_line_error'));
        System.assertEquals('adwordsFormatInvalid', x-property-mappings.get('adwords_format_invalid'));
        System.assertEquals('productCategoryMissing', x-property-mappings.get('product_category_missing'));
        System.assertEquals('internalServiceError', x-property-mappings.get('internal_service_error'));
        System.assertEquals('noVerifiedDomain', x-property-mappings.get('no_verified_domain'));
        System.assertEquals('adultInvalid', x-property-mappings.get('adult_invalid'));
        System.assertEquals('invalidDomain', x-property-mappings.get('invalid_domain'));
        System.assertEquals('feedLengthTooLong', x-property-mappings.get('feed_length_too_long'));
        System.assertEquals('linkLengthTooLong', x-property-mappings.get('link_length_too_long'));
        System.assertEquals('malformedXml', x-property-mappings.get('malformed_xml'));
        System.assertEquals('redirectInvalid', x-property-mappings.get('redirect_invalid'));
        System.assertEquals('priceMissing', x-property-mappings.get('price_missing'));
        System.assertEquals('feedTooSmall', x-property-mappings.get('feed_too_small'));
        System.assertEquals('conditionInvalid', x-property-mappings.get('condition_invalid'));
        System.assertEquals('shopifyNoProducts', x-property-mappings.get('shopify_no_products'));
        System.assertEquals('maxItemsPerItemGroupExceeded', x-property-mappings.get('max_items_per_item_group_exceeded'));
        System.assertEquals('itemMainImageDownloadFailure', x-property-mappings.get('item_main_image_download_failure'));
        System.assertEquals('pinjoinContentUnsafe', x-property-mappings.get('pinjoin_content_unsafe'));
        System.assertEquals('blocklistedImageSignature', x-property-mappings.get('blocklisted_image_signature'));
    }
}
