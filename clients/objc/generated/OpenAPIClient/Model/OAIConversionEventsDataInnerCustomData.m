#import "OAIConversionEventsDataInnerCustomData.h"

@implementation OAIConversionEventsDataInnerCustomData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"currency": @"currency", @"value": @"value", @"contentIds": @"content_ids", @"contentName": @"content_name", @"contentCategory": @"content_category", @"contentBrand": @"content_brand", @"contents": @"contents", @"numItems": @"num_items", @"orderId": @"order_id", @"searchString": @"search_string", @"optOutType": @"opt_out_type", @"np": @"np" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"currency", @"value", @"contentIds", @"contentName", @"contentCategory", @"contentBrand", @"contents", @"numItems", @"orderId", @"searchString", @"optOutType", @"np"];
  return [optionalProperties containsObject:propertyName];
}

@end
