#import "OAILocalInventoryItemResponse.h"

@implementation OAILocalInventoryItemResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adLink": @"ad_link", @"availability": @"availability", @"createdAt": @"created_at", @"itemId": @"item_id", @"lastUpdatedTime": @"last_updated_time", @"price": @"price", @"salePrice": @"sale_price", @"storeMetadata": @"store_metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adLink", @"availability", @"price", @"salePrice", ];
  return [optionalProperties containsObject:propertyName];
}

@end
