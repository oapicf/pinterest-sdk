#import "OAIConversionProductReportCreate.h"

@implementation OAIConversionProductReportCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adGroupIds": @"ad_group_ids", @"campaignIds": @"campaign_ids", @"campaignObjectiveTypes": @"campaign_objective_types", @"clickWindowDays": @"click_window_days", @"columns": @"columns", @"conversionProductAttributionType": @"conversion_product_attribution_type", @"conversionProductBreakdown": @"conversion_product_breakdown", @"conversionReportTime": @"conversion_report_time", @"endDate": @"end_date", @"granularity": @"granularity", @"level": @"level", @"productSkuIds": @"product_sku_ids", @"reportName": @"report_name", @"startDate": @"start_date", @"viewWindowDays": @"view_window_days" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adGroupIds", @"campaignIds", @"campaignObjectiveTypes", @"clickWindowDays", @"conversionProductAttributionType", @"conversionProductBreakdown", @"conversionReportTime", @"productSkuIds", @"viewWindowDays"];
  return [optionalProperties containsObject:propertyName];
}

@end
