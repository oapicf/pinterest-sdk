#import "OAIConversionEventsDataItemsCustomDataContentsItems.h"

@implementation OAIConversionEventsDataItemsCustomDataContentsItems

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"itemBrand": @"item_brand", @"itemBrandId": @"item_brand_id", @"itemCategory": @"item_category", @"itemName": @"item_name", @"itemPrice": @"item_price", @"quantity": @"quantity" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"itemBrand", @"itemBrandId", @"itemCategory", @"itemName", @"itemPrice", @"quantity"];
  return [optionalProperties containsObject:propertyName];
}

@end
