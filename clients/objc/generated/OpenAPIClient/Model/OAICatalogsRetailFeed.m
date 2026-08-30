#import "OAICatalogsRetailFeed.h"

@implementation OAICatalogsRetailFeed

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogType": @"catalog_type", @"createdAt": @"created_at", @"credentials": @"credentials", @"defaultAvailability": @"default_availability", @"defaultCountry": @"default_country", @"defaultCurrency": @"default_currency", @"defaultLocale": @"default_locale", @"format": @"format", @"_id": @"id", @"location": @"location", @"name": @"name", @"preferredProcessingSchedule": @"preferred_processing_schedule", @"status": @"status", @"updatedAt": @"updated_at" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"credentials", @"defaultAvailability", @"defaultCurrency", @"preferredProcessingSchedule", ];
  return [optionalProperties containsObject:propertyName];
}

@end
