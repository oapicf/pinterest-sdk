#import "OAIConversionTagResponse.h"

@implementation OAIConversionTagResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"codeSnippet": @"code_snippet", @"enhancedMatchStatus": @"enhanced_match_status", @"_id": @"id", @"lastFiredTimeMs": @"last_fired_time_ms", @"name": @"name", @"status": @"status", @"version": @"version", @"configs": @"configs" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"codeSnippet", @"enhancedMatchStatus", @"_id", @"lastFiredTimeMs", @"name", @"status", @"version", @"configs"];
  return [optionalProperties containsObject:propertyName];
}

@end
