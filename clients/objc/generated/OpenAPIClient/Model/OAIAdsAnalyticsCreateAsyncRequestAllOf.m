#import "OAIAdsAnalyticsCreateAsyncRequestAllOf.h"

@implementation OAIAdsAnalyticsCreateAsyncRequestAllOf

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.clickWindowDays = @30;
    self.engagementWindowDays = @30;
    self.viewWindowDays = @1;
    self.conversionReportTime = @"TIME_OF_AD_ACTION";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"startDate": @"start_date", @"endDate": @"end_date", @"granularity": @"granularity", @"clickWindowDays": @"click_window_days", @"engagementWindowDays": @"engagement_window_days", @"viewWindowDays": @"view_window_days", @"conversionReportTime": @"conversion_report_time", @"attributionTypes": @"attribution_types" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"clickWindowDays", @"engagementWindowDays", @"viewWindowDays", @"conversionReportTime", @"attributionTypes"];
  return [optionalProperties containsObject:propertyName];
}

@end
