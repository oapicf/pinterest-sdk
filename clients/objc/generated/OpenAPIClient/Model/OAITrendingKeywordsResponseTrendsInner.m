#import "OAITrendingKeywordsResponseTrendsInner.h"

@implementation OAITrendingKeywordsResponseTrendsInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"keyword": @"keyword", @"pctGrowthWow": @"pct_growth_wow", @"pctGrowthMom": @"pct_growth_mom", @"pctGrowthYoy": @"pct_growth_yoy", @"timeSeries": @"time_series" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"keyword", @"pctGrowthWow", @"pctGrowthMom", @"pctGrowthYoy", @"timeSeries"];
  return [optionalProperties containsObject:propertyName];
}

@end
