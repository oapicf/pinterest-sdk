#import "OAIAdsAnalyticsCreateAsyncRequest.h"

@implementation OAIAdsAnalyticsCreateAsyncRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.combineTargetingTypes = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adGroupIds": @"ad_group_ids", @"adGroupStatuses": @"ad_group_statuses", @"adIds": @"ad_ids", @"adStatuses": @"ad_statuses", @"attributionTypes": @"attribution_types", @"campaignBrandLabel": @"campaign_brand_label", @"campaignCustomLabel": @"campaign_custom_label", @"campaignIds": @"campaign_ids", @"campaignObjectiveTypes": @"campaign_objective_types", @"campaignStatuses": @"campaign_statuses", @"clickWindowDays": @"click_window_days", @"columns": @"columns", @"combineTargetingTypes": @"combine_targeting_types", @"conversionReportTime": @"conversion_report_time", @"customConversionEventMetrics": @"custom_conversion_event_metrics", @"endDate": @"end_date", @"endHour": @"end_hour", @"engagementWindowDays": @"engagement_window_days", @"granularity": @"granularity", @"level": @"level", @"metricsFilters": @"metrics_filters", @"primarySort": @"primary_sort", @"productGroupIds": @"product_group_ids", @"productGroupStatuses": @"product_group_statuses", @"productItemIds": @"product_item_ids", @"reportFormat": @"report_format", @"reportingTimezone": @"reporting_timezone", @"startDate": @"start_date", @"startHour": @"start_hour", @"targetingTypes": @"targeting_types", @"viewWindowDays": @"view_window_days" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adGroupIds", @"adGroupStatuses", @"adIds", @"adStatuses", @"attributionTypes", @"campaignBrandLabel", @"campaignCustomLabel", @"campaignIds", @"campaignObjectiveTypes", @"campaignStatuses", @"clickWindowDays", @"columns", @"combineTargetingTypes", @"conversionReportTime", @"customConversionEventMetrics", @"endHour", @"engagementWindowDays", @"level", @"metricsFilters", @"primarySort", @"productGroupIds", @"productGroupStatuses", @"productItemIds", @"reportFormat", @"reportingTimezone", @"startHour", @"targetingTypes", @"viewWindowDays"];
  return [optionalProperties containsObject:propertyName];
}

@end
