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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"archived": @"archived", @"bid": @"bid", @"_id": @"id", @"matchType": @"match_type", @"parentId": @"parent_id", @"parentType": @"parent_type", @"type": @"type", @"value": @"value" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"archived", @"bid", @"parentType", @"type", ];
  return [optionalProperties containsObject:propertyName];
}

@end
