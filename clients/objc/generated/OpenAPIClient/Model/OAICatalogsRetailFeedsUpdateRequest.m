#import "OAICatalogsRetailFeedsUpdateRequest.h"

@implementation OAICatalogsRetailFeedsUpdateRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogType": @"catalog_type", @"credentials": @"credentials", @"defaultAvailability": @"default_availability", @"defaultCurrency": @"default_currency", @"format": @"format", @"location": @"location", @"name": @"name", @"preferredProcessingSchedule": @"preferred_processing_schedule", @"status": @"status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"credentials", @"defaultAvailability", @"defaultCurrency", @"format", @"location", @"name", @"preferredProcessingSchedule", @"status"];
  return [optionalProperties containsObject:propertyName];
}

@end
