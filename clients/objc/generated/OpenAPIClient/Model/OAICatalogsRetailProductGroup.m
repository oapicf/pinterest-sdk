#import "OAICatalogsRetailProductGroup.h"

@implementation OAICatalogsRetailProductGroup

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogId": @"catalog_id", @"catalogType": @"catalog_type", @"country": @"country", @"createdAt": @"created_at", @"_description": @"description", @"feedId": @"feed_id", @"filters": @"filters", @"_id": @"id", @"isFeatured": @"is_featured", @"locale": @"locale", @"name": @"name", @"status": @"status", @"type": @"type", @"updatedAt": @"updated_at" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"country", @"createdAt", @"_description", @"isFeatured", @"locale", @"name", @"status", @"updatedAt"];
  return [optionalProperties containsObject:propertyName];
}

@end
