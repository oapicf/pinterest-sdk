#import "OAIConversionEventsDataInnerCustomDataContentsInner.h"

@implementation OAIConversionEventsDataInnerCustomDataContentsInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"itemPrice": @"item_price", @"quantity": @"quantity", @"itemName": @"item_name", @"itemCategory": @"item_category", @"itemBrand": @"item_brand" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"itemPrice", @"quantity", @"itemName", @"itemCategory", @"itemBrand"];
  return [optionalProperties containsObject:propertyName];
}

@end
