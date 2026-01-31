#import "OAIConversionTagCommon.h"

@implementation OAIConversionTagCommon

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"codeSnippet": @"code_snippet", @"configs": @"configs", @"enhancedMatchStatus": @"enhanced_match_status", @"_id": @"id", @"lastFiredTimeMs": @"last_fired_time_ms", @"name": @"name", @"version": @"version" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"codeSnippet", @"configs", @"enhancedMatchStatus", @"_id", @"lastFiredTimeMs", @"version"];
  return [optionalProperties containsObject:propertyName];
}

@end
