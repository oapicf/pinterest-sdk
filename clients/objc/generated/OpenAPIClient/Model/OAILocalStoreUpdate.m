#import "OAILocalStoreUpdate.h"

@implementation OAILocalStoreUpdate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"addressPrimary": @"address_primary", @"addressSecondary": @"address_secondary", @"city": @"city", @"country": @"country", @"_id": @"id", @"latitude": @"latitude", @"longitude": @"longitude", @"name": @"name", @"postalCode": @"postal_code", @"region": @"region", @"storeCode": @"store_code" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"addressPrimary", @"addressSecondary", @"city", @"country", @"latitude", @"longitude", @"name", @"postalCode", @"region", @"storeCode"];
  return [optionalProperties containsObject:propertyName];
}

@end
