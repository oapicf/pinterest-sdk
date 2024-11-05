#import "OAIKeyword.h"

@implementation OAIKeyword

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"bid": @"bid", @"matchType": @"match_type", @"value": @"value", @"archived": @"archived", @"_id": @"id", @"parentId": @"parent_id", @"parentType": @"parent_type", @"type": @"type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"bid", @"archived", @"_id", @"parentId", @"parentType", @"type"];
  return [optionalProperties containsObject:propertyName];
}

@end
