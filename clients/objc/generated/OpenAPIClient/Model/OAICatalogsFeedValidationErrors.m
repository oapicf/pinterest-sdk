#import "OAICatalogsFeedValidationErrors.h"

@implementation OAICatalogsFeedValidationErrors

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"fetchError": @"fetch_error", @"fetchInactiveFeedError": @"fetch_inactive_feed_error", @"encodingError": @"encoding_error", @"delimiterError": @"delimiter_error", @"requiredColumnsMissing": @"required_columns_missing", @"imageLinkInvalid": @"image_link_invalid", @"itemidMissing": @"itemid_missing", @"titleMissing": @"title_missing", @"descriptionMissing": @"description_missing", @"productCategoryInvalid": @"product_category_invalid", @"productLinkMissing": @"product_link_missing", @"imageLinkMissing": @"image_link_missing", @"availabilityInvalid": @"availability_invalid", @"productPriceInvalid": @"product_price_invalid", @"linkFormatInvalid": @"link_format_invalid", @"parseLineError": @"parse_line_error", @"adwordsFormatInvalid": @"adwords_format_invalid", @"productCategoryMissing": @"product_category_missing", @"internalServiceError": @"internal_service_error", @"noVerifiedDomain": @"no_verified_domain", @"adultInvalid": @"adult_invalid", @"invalidDomain": @"invalid_domain", @"feedLengthTooLong": @"feed_length_too_long", @"linkLengthTooLong": @"link_length_too_long", @"malformedXml": @"malformed_xml", @"redirectInvalid": @"redirect_invalid", @"priceMissing": @"price_missing", @"feedTooSmall": @"feed_too_small", @"conditionInvalid": @"condition_invalid", @"shopifyNoProducts": @"shopify_no_products", @"maxItemsPerItemGroupExceeded": @"max_items_per_item_group_exceeded", @"itemMainImageDownloadFailure": @"item_main_image_download_failure", @"pinjoinContentUnsafe": @"pinjoin_content_unsafe", @"blocklistedImageSignature": @"blocklisted_image_signature" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"fetchError", @"fetchInactiveFeedError", @"encodingError", @"delimiterError", @"requiredColumnsMissing", @"imageLinkInvalid", @"itemidMissing", @"titleMissing", @"descriptionMissing", @"productCategoryInvalid", @"productLinkMissing", @"imageLinkMissing", @"availabilityInvalid", @"productPriceInvalid", @"linkFormatInvalid", @"parseLineError", @"adwordsFormatInvalid", @"productCategoryMissing", @"internalServiceError", @"noVerifiedDomain", @"adultInvalid", @"invalidDomain", @"feedLengthTooLong", @"linkLengthTooLong", @"malformedXml", @"redirectInvalid", @"priceMissing", @"feedTooSmall", @"conditionInvalid", @"shopifyNoProducts", @"maxItemsPerItemGroupExceeded", @"itemMainImageDownloadFailure", @"pinjoinContentUnsafe", @"blocklistedImageSignature"];
  return [optionalProperties containsObject:propertyName];
}

@end
