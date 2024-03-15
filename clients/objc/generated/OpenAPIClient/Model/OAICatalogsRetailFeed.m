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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"createdAt": @"created_at", @"_id": @"id", @"updatedAt": @"updated_at", @"name": @"name", @"format": @"format", @"catalogType": @"catalog_type", @"credentials": @"credentials", @"location": @"location", @"preferredProcessingSchedule": @"preferred_processing_schedule", @"status": @"status", @"defaultCurrency": @"default_currency", @"defaultLocale": @"default_locale", @"defaultCountry": @"default_country", @"defaultAvailability": @"default_availability" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"createdAt", @"_id", @"updatedAt", ];
  return [optionalProperties containsObject:propertyName];
}

@end
