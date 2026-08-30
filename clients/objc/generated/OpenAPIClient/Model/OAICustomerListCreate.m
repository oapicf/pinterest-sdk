#import "OAICustomerListCreate.h"

@implementation OAICustomerListCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"isNca": @"is_nca", @"listType": @"list_type", @"name": @"name", @"records": @"records", @"recordsV2": @"records_v2" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isNca", @"listType", @"records", @"recordsV2"];
  return [optionalProperties containsObject:propertyName];
}

@end
