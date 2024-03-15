#import "OAICatalogsHotelAddress.h"

@implementation OAICatalogsHotelAddress

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"addr1": @"addr1", @"city": @"city", @"region": @"region", @"country": @"country", @"postalCode": @"postal_code" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"addr1", @"city", @"region", @"country", @"postalCode"];
  return [optionalProperties containsObject:propertyName];
}

@end
