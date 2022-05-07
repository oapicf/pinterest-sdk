#import "OAICatalogsFeedValidationWarnings.h"

@implementation OAICatalogsFeedValidationWarnings

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"titleLengthTooLong": @"title_length_too_long", @"descriptionLengthTooLong": @"description_length_too_long", @"genderInvalid": @"gender_invalid", @"ageGroupInvalid": @"age_group_invalid", @"sizeTypeInvalid": @"size_type_invalid", @"linkFormatWarning": @"link_format_warning", @"duplicateProducts": @"duplicate_products", @"duplicateLinks": @"duplicate_links", @"salesPriceInvalid": @"sales_price_invalid", @"productCategoryDepthWarning": @"product_category_depth_warning", @"adwordsSameAsLink": @"adwords_same_as_link", @"duplicateHeaders": @"duplicate_headers", @"fetchSameSignature": @"fetch_same_signature", @"adwordsFormatWarning": @"adwords_format_warning", @"additionalImageLinkWarning": @"additional_image_link_warning", @"imageLinkWarning": @"image_link_warning", @"shippingInvalid": @"shipping_invalid", @"taxInvalid": @"tax_invalid", @"shippingWeightInvalid": @"shipping_weight_invalid", @"expirationDateInvalid": @"expiration_date_invalid", @"availabilityDateInvalid": @"availability_date_invalid", @"saleDateInvalid": @"sale_date_invalid", @"weightUnitInvalid": @"weight_unit_invalid", @"isBundleInvalid": @"is_bundle_invalid", @"updatedTimeInvalid": @"updated_time_invalid", @"customLabelLengthTooLong": @"custom_label_length_too_long", @"productTypeLengthTooLong": @"product_type_length_too_long", @"tooManyAdditionalImageLinks": @"too_many_additional_image_links", @"multipackInvalid": @"multipack_invalid", @"indexedProductCountLargeDelta": @"indexed_product_count_large_delta", @"itemAdditionalImageDownloadFailure": @"item_additional_image_download_failure", @"optionalProductCategoryMissing": @"optional_product_category_missing", @"optionalProductCategoryInvalid": @"optional_product_category_invalid", @"optionalConditionMissing": @"optional_condition_missing", @"optionalConditionInvalid": @"optional_condition_invalid", @"iosDeepLinkInvalid": @"ios_deep_link_invalid", @"androidDeepLinkInvalid": @"android_deep_link_invalid", @"availabilityNormalized": @"availability_normalized", @"conditionNormalized": @"condition_normalized", @"genderNormalized": @"gender_normalized", @"sizeTypeNormalized": @"size_type_normalized", @"ageGroupNormalized": @"age_group_normalized", @"utmSourceAutoCorrected": @"utm_source_auto_corrected", @"countryDoesNotMapToCurrency": @"country_does_not_map_to_currency", @"minAdPriceInvalid": @"min_ad_price_invalid" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"titleLengthTooLong", @"descriptionLengthTooLong", @"genderInvalid", @"ageGroupInvalid", @"sizeTypeInvalid", @"linkFormatWarning", @"duplicateProducts", @"duplicateLinks", @"salesPriceInvalid", @"productCategoryDepthWarning", @"adwordsSameAsLink", @"duplicateHeaders", @"fetchSameSignature", @"adwordsFormatWarning", @"additionalImageLinkWarning", @"imageLinkWarning", @"shippingInvalid", @"taxInvalid", @"shippingWeightInvalid", @"expirationDateInvalid", @"availabilityDateInvalid", @"saleDateInvalid", @"weightUnitInvalid", @"isBundleInvalid", @"updatedTimeInvalid", @"customLabelLengthTooLong", @"productTypeLengthTooLong", @"tooManyAdditionalImageLinks", @"multipackInvalid", @"indexedProductCountLargeDelta", @"itemAdditionalImageDownloadFailure", @"optionalProductCategoryMissing", @"optionalProductCategoryInvalid", @"optionalConditionMissing", @"optionalConditionInvalid", @"iosDeepLinkInvalid", @"androidDeepLinkInvalid", @"availabilityNormalized", @"conditionNormalized", @"genderNormalized", @"sizeTypeNormalized", @"ageGroupNormalized", @"utmSourceAutoCorrected", @"countryDoesNotMapToCurrency", @"minAdPriceInvalid"];
  return [optionalProperties containsObject:propertyName];
}

@end
