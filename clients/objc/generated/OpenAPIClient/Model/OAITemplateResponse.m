#import "OAITemplateResponse.h"

@implementation OAITemplateResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"adAccountIds": @"ad_account_ids", @"clickWindowDays": @"click_window_days", @"columns": @"columns", @"conversionReportTimeType": @"conversion_report_time_type", @"creationSource": @"creation_source", @"customColumnIds": @"custom_column_ids", @"dateRange": @"date_range", @"engagementWindowDays": @"engagement_window_days", @"filtersJson": @"filters_json", @"granularity": @"granularity", @"_id": @"id", @"ingestionSources": @"ingestion_sources", @"isDeleted": @"is_deleted", @"isOwnedByUser": @"is_owned_by_user", @"isScheduled": @"is_scheduled", @"name": @"name", @"reportEndRelativeDaysInPast": @"report_end_relative_days_in_past", @"reportFormat": @"report_format", @"reportLevel": @"report_level", @"reportStartRelativeDaysInPast": @"report_start_relative_days_in_past", @"type": @"type", @"updatedTime": @"updated_time", @"userId": @"user_id", @"viewWindowDays": @"view_window_days" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"adAccountIds", @"clickWindowDays", @"columns", @"conversionReportTimeType", @"creationSource", @"customColumnIds", @"dateRange", @"engagementWindowDays", @"filtersJson", @"granularity", @"_id", @"ingestionSources", @"isDeleted", @"isOwnedByUser", @"isScheduled", @"name", @"reportEndRelativeDaysInPast", @"reportFormat", @"reportLevel", @"reportStartRelativeDaysInPast", @"type", @"updatedTime", @"userId", @"viewWindowDays"];
  return [optionalProperties containsObject:propertyName];
}

@end
