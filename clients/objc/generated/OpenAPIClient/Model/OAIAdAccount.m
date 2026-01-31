#import "OAIAdAccount.h"

@implementation OAIAdAccount

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"country": @"country", @"createdTime": @"created_time", @"currency": @"currency", @"_id": @"id", @"name": @"name", @"owner": @"owner", @"permissions": @"permissions", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"country", @"createdTime", @"currency", @"name", @"owner", @"permissions", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
