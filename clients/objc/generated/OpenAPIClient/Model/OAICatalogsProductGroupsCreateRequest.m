#import "OAICatalogsProductGroupsCreateRequest.h"

@implementation OAICatalogsProductGroupsCreateRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isFeatured = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"_description": @"description", @"isFeatured": @"is_featured", @"filters": @"filters", @"feedId": @"feed_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_description", @"isFeatured", ];
  return [optionalProperties containsObject:propertyName];
}

@end
