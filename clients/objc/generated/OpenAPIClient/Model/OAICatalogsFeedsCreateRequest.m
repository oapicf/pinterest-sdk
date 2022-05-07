#import "OAICatalogsFeedsCreateRequest.h"

@implementation OAICatalogsFeedsCreateRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"defaultCountry": @"default_country", @"defaultAvailability": @"default_availability", @"defaultCurrency": @"default_currency", @"name": @"name", @"format": @"format", @"defaultLocale": @"default_locale", @"credentials": @"credentials", @"location": @"location", @"preferredProcessingSchedule": @"preferred_processing_schedule" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"defaultCountry", @"defaultAvailability", @"defaultCurrency", @"defaultLocale", @"credentials", @"preferredProcessingSchedule"];
  return [optionalProperties containsObject:propertyName];
}

@end
