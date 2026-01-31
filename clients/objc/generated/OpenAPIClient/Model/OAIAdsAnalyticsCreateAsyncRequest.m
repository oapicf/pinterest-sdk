#import "OAIAdsAnalyticsCreateAsyncRequest.h"

@implementation OAIAdsAnalyticsCreateAsyncRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.clickWindowDays = @30;
    self.conversionReportTime = @"TIME_OF_AD_ACTION";
    self.engagementWindowDays = @30;
    self.viewWindowDays = @1;
    self.combineTargetingTypes = @(NO);
    self.reportFormat = @"JSON";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"attributionTypes": @"attribution_types", @"clickWindowDays": @"click_window_days", @"conversionReportTime": @"conversion_report_time", @"endDate": @"end_date", @"engagementWindowDays": @"engagement_window_days", @"granularity": @"granularity", @"startDate": @"start_date", @"viewWindowDays": @"view_window_days", @"campaignIds": @"campaign_ids", @"campaignStatuses": @"campaign_statuses", @"campaignObjectiveTypes": @"campaign_objective_types", @"campaignBrandLabel": @"campaign_brand_label", @"adGroupIds": @"ad_group_ids", @"adGroupStatuses": @"ad_group_statuses", @"adIds": @"ad_ids", @"adStatuses": @"ad_statuses", @"productGroupIds": @"product_group_ids", @"productGroupStatuses": @"product_group_statuses", @"productItemIds": @"product_item_ids", @"targetingTypes": @"targeting_types", @"metricsFilters": @"metrics_filters", @"columns": @"columns", @"combineTargetingTypes": @"combine_targeting_types", @"customConversionEventMetrics": @"custom_conversion_event_metrics", @"endHour": @"end_hour", @"level": @"level", @"primarySort": @"primary_sort", @"reportFormat": @"report_format", @"reportingTimezone": @"reporting_timezone", @"startHour": @"start_hour" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"attributionTypes", @"clickWindowDays", @"conversionReportTime", @"engagementWindowDays", @"viewWindowDays", @"campaignIds", @"campaignStatuses", @"campaignObjectiveTypes", @"campaignBrandLabel", @"adGroupIds", @"adGroupStatuses", @"adIds", @"adStatuses", @"productGroupIds", @"productGroupStatuses", @"productItemIds", @"targetingTypes", @"metricsFilters", @"combineTargetingTypes", @"customConversionEventMetrics", @"endHour", @"primarySort", @"reportFormat", @"reportingTimezone", @"startHour"];
  return [optionalProperties containsObject:propertyName];
}

@end
