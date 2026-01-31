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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogId": @"catalog_id", @"catalogType": @"catalog_type", @"createdAt": @"created_at", @"_description": @"description", @"filters": @"filters", @"_id": @"id", @"name": @"name", @"type": @"type", @"updatedAt": @"updated_at" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"createdAt", @"_description", @"name", @"updatedAt"];
  return [optionalProperties containsObject:propertyName];
}

@end
