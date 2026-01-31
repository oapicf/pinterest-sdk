#import "OAICatalogsHotelFeedsCreateRequest.h"

@implementation OAICatalogsHotelFeedsCreateRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.status = @"ACTIVE";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogId": @"catalog_id", @"catalogType": @"catalog_type", @"credentials": @"credentials", @"defaultCurrency": @"default_currency", @"defaultLocale": @"default_locale", @"format": @"format", @"location": @"location", @"name": @"name", @"preferredProcessingSchedule": @"preferred_processing_schedule", @"status": @"status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"catalogId", @"credentials", @"defaultCurrency", @"preferredProcessingSchedule", @"status"];
  return [optionalProperties containsObject:propertyName];
}

@end
