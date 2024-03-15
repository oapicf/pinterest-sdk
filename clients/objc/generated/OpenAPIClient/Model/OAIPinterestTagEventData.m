#import "OAIPinterestTagEventData.h"

@implementation OAIPinterestTagEventData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"currency": @"currency", @"leadType": @"lead_type", @"lineItems": @"line_items", @"orderId": @"order_id", @"orderQuantity": @"order_quantity", @"pageName": @"page_name", @"promoCode": @"promo_code", @"_property": @"property", @"searchQuery": @"search_query", @"value": @"value", @"videoTitle": @"video_title" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"currency", @"leadType", @"lineItems", @"orderId", @"orderQuantity", @"pageName", @"promoCode", @"_property", @"searchQuery", @"value", @"videoTitle"];
  return [optionalProperties containsObject:propertyName];
}

@end
