#import "OAICatalogsHotelItemResponse.h"

@implementation OAICatalogsHotelItemResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"attributes": @"attributes", @"catalogType": @"catalog_type", @"hotelId": @"hotel_id", @"pins": @"pins" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"attributes", @"hotelId", @"pins"];
  return [optionalProperties containsObject:propertyName];
}

@end
