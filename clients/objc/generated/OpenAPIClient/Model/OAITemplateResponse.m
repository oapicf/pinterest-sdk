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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"adAccountId": @"ad_account_id", @"adAccountIds": @"ad_account_ids", @"userId": @"user_id", @"name": @"name", @"reportStartRelativeDaysInPast": @"report_start_relative_days_in_past", @"reportEndRelativeDaysInPast": @"report_end_relative_days_in_past", @"dateRange": @"date_range", @"reportLevel": @"report_level", @"reportFormat": @"report_format", @"columns": @"columns", @"granularity": @"granularity", @"viewWindowDays": @"view_window_days", @"clickWindowDays": @"click_window_days", @"engagementWindowDays": @"engagement_window_days", @"conversionReportTimeType": @"conversion_report_time_type", @"filtersJson": @"filters_json", @"isOwnedByUser": @"is_owned_by_user", @"isScheduled": @"is_scheduled", @"creationSource": @"creation_source", @"isDeleted": @"is_deleted", @"updatedTime": @"updated_time", @"customColumnIds": @"custom_column_ids", @"type": @"type", @"ingestionSources": @"ingestion_sources" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"adAccountId", @"adAccountIds", @"userId", @"name", @"reportStartRelativeDaysInPast", @"reportEndRelativeDaysInPast", @"dateRange", @"reportLevel", @"reportFormat", @"columns", @"granularity", @"viewWindowDays", @"clickWindowDays", @"engagementWindowDays", @"conversionReportTimeType", @"filtersJson", @"isOwnedByUser", @"isScheduled", @"creationSource", @"isDeleted", @"updatedTime", @"customColumnIds", @"type", @"ingestionSources"];
  return [optionalProperties containsObject:propertyName];
}

@end
