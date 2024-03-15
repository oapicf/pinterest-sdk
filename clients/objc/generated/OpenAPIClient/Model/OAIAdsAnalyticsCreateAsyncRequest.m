#import "OAIAdsAnalyticsCreateAsyncRequest.h"

@implementation OAIAdsAnalyticsCreateAsyncRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.clickWindowDays = @30;
    self.engagementWindowDays = @30;
    self.viewWindowDays = @1;
    self.conversionReportTime = @"TIME_OF_AD_ACTION";
    self.reportFormat = @"JSON";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"startDate": @"start_date", @"endDate": @"end_date", @"granularity": @"granularity", @"clickWindowDays": @"click_window_days", @"engagementWindowDays": @"engagement_window_days", @"viewWindowDays": @"view_window_days", @"conversionReportTime": @"conversion_report_time", @"attributionTypes": @"attribution_types", @"campaignIds": @"campaign_ids", @"campaignStatuses": @"campaign_statuses", @"campaignObjectiveTypes": @"campaign_objective_types", @"adGroupIds": @"ad_group_ids", @"adGroupStatuses": @"ad_group_statuses", @"adIds": @"ad_ids", @"adStatuses": @"ad_statuses", @"productGroupIds": @"product_group_ids", @"productGroupStatuses": @"product_group_statuses", @"productItemIds": @"product_item_ids", @"targetingTypes": @"targeting_types", @"metricsFilters": @"metrics_filters", @"columns": @"columns", @"level": @"level", @"reportFormat": @"report_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"clickWindowDays", @"engagementWindowDays", @"viewWindowDays", @"conversionReportTime", @"attributionTypes", @"campaignIds", @"campaignStatuses", @"campaignObjectiveTypes", @"adGroupIds", @"adGroupStatuses", @"adIds", @"adStatuses", @"productGroupIds", @"productGroupStatuses", @"productItemIds", @"targetingTypes", @"metricsFilters", @"reportFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end
