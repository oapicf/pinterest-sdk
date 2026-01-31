#import "OAITrendingKeyword.h"

@implementation OAITrendingKeyword

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"demographics": @"demographics", @"hasPrediction": @"has_prediction", @"keyword": @"keyword", @"pctGrowthMom": @"pct_growth_mom", @"pctGrowthWow": @"pct_growth_wow", @"pctGrowthYoy": @"pct_growth_yoy", @"predictedTimeSeries": @"predicted_time_series", @"timeSeries": @"time_series" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"demographics", @"hasPrediction", @"keyword", @"pctGrowthMom", @"pctGrowthWow", @"pctGrowthYoy", @"predictedTimeSeries", @"timeSeries"];
  return [optionalProperties containsObject:propertyName];
}

@end
