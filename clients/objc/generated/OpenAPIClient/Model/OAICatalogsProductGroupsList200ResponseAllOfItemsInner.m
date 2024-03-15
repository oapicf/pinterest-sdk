#import "OAICatalogsProductGroupsList200ResponseAllOfItemsInner.h"

@implementation OAICatalogsProductGroupsList200ResponseAllOfItemsInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"_description": @"description", @"filters": @"filters", @"isFeatured": @"is_featured", @"type": @"type", @"status": @"status", @"createdAt": @"created_at", @"updatedAt": @"updated_at", @"feedId": @"feed_id", @"catalogType": @"catalog_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"_description", @"isFeatured", @"type", @"status", @"createdAt", @"updatedAt", @"catalogType"];
  return [optionalProperties containsObject:propertyName];
}

@end
