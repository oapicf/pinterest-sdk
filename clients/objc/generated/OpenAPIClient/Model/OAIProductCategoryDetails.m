#import "OAIProductCategoryDetails.h"

@implementation OAIProductCategoryDetails

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"demographics": @"demographics", @"hasPrediction": @"has_prediction", @"metricsHighlights": @"metrics_highlights", @"predictedTimeSeries": @"predicted_time_series", @"productCategory": @"product_category", @"relatedSearches": @"related_searches", @"timeSeries": @"time_series" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"demographics", @"metricsHighlights", @"predictedTimeSeries", @"relatedSearches", @"timeSeries"];
  return [optionalProperties containsObject:propertyName];
}

@end
