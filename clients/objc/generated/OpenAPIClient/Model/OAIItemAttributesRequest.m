#import "OAIItemAttributesRequest.h"

@implementation OAIItemAttributesRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adLink": @"ad_link", @"adult": @"adult", @"ageGroup": @"age_group", @"availability": @"availability", @"averageReviewRating": @"average_review_rating", @"brand": @"brand", @"checkoutEnabled": @"checkout_enabled", @"color": @"color", @"condition": @"condition", @"customLabel0": @"custom_label_0", @"customLabel1": @"custom_label_1", @"customLabel2": @"custom_label_2", @"customLabel3": @"custom_label_3", @"customLabel4": @"custom_label_4", @"_description": @"description", @"freeShippingLabel": @"free_shipping_label", @"freeShippingLimit": @"free_shipping_limit", @"gender": @"gender", @"googleProductCategory": @"google_product_category", @"gtin": @"gtin", @"_id": @"id", @"itemGroupId": @"item_group_id", @"lastUpdatedTime": @"last_updated_time", @"link": @"link", @"material": @"material", @"minAdPrice": @"min_ad_price", @"mobileLink": @"mobile_link", @"mpn": @"mpn", @"numberOfRatings": @"number_of_ratings", @"numberOfReviews": @"number_of_reviews", @"pattern": @"pattern", @"price": @"price", @"productType": @"product_type", @"salePrice": @"sale_price", @"shipping": @"shipping", @"shippingHeight": @"shipping_height", @"shippingWeight": @"shipping_weight", @"shippingWidth": @"shipping_width", @"size": @"size", @"sizeSystem": @"size_system", @"sizeType": @"size_type", @"tax": @"tax", @"title": @"title", @"variantNames": @"variant_names", @"variantValues": @"variant_values", @"additionalImageLink": @"additional_image_link", @"imageLink": @"image_link", @"videoLink": @"video_link" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adLink", @"adult", @"ageGroup", @"availability", @"averageReviewRating", @"brand", @"checkoutEnabled", @"color", @"condition", @"customLabel0", @"customLabel1", @"customLabel2", @"customLabel3", @"customLabel4", @"_description", @"freeShippingLabel", @"freeShippingLimit", @"gender", @"googleProductCategory", @"gtin", @"_id", @"itemGroupId", @"lastUpdatedTime", @"link", @"material", @"minAdPrice", @"mobileLink", @"mpn", @"numberOfRatings", @"numberOfReviews", @"pattern", @"price", @"productType", @"salePrice", @"shipping", @"shippingHeight", @"shippingWeight", @"shippingWidth", @"size", @"sizeSystem", @"sizeType", @"tax", @"title", @"variantNames", @"variantValues", @"additionalImageLink", @"imageLink", @"videoLink"];
  return [optionalProperties containsObject:propertyName];
}

@end
