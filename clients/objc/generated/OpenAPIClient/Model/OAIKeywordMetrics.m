#import "OAIKeywordMetrics.h"

@implementation OAIKeywordMetrics

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"avgCpcInMicroCurrency": @"avg_cpc_in_micro_currency", @"keywordQueryVolume": @"keyword_query_volume" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"avgCpcInMicroCurrency", @"keywordQueryVolume"];
  return [optionalProperties containsObject:propertyName];
}

@end
