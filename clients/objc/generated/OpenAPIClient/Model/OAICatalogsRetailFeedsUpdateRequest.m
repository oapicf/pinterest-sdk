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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"defaultCurrency": @"default_currency", @"name": @"name", @"format": @"format", @"credentials": @"credentials", @"location": @"location", @"preferredProcessingSchedule": @"preferred_processing_schedule", @"status": @"status", @"catalogType": @"catalog_type", @"defaultAvailability": @"default_availability" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"defaultCurrency", @"name", @"format", @"credentials", @"location", @"preferredProcessingSchedule", @"status", @"defaultAvailability"];
  return [optionalProperties containsObject:propertyName];
}

@end
