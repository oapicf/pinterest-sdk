#import "OAICatalogsLocalStoresCreate200ResponseInnerData.h"

@implementation OAICatalogsLocalStoresCreate200ResponseInnerData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"addressPrimary": @"address_primary", @"addressSecondary": @"address_secondary", @"city": @"city", @"country": @"country", @"createdAt": @"created_at", @"_id": @"id", @"latitude": @"latitude", @"longitude": @"longitude", @"name": @"name", @"postalCode": @"postal_code", @"region": @"region", @"storeCode": @"store_code", @"updatedAt": @"updated_at", @"exceptions": @"exceptions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"addressPrimary", @"addressSecondary", @"city", @"latitude", @"longitude", @"postalCode", @"region", ];
  return [optionalProperties containsObject:propertyName];
}

@end
