#import "OAICatalogsHotelProductGroup.h"

@implementation OAICatalogsHotelProductGroup

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogType": @"catalog_type", @"_id": @"id", @"name": @"name", @"_description": @"description", @"filters": @"filters", @"createdAt": @"created_at", @"updatedAt": @"updated_at", @"catalogId": @"catalog_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"_description", @"createdAt", @"updatedAt", ];
  return [optionalProperties containsObject:propertyName];
}

@end
