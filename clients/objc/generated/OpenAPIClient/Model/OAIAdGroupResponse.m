#import "OAIAdGroupResponse.h"

@implementation OAIAdGroupResponse

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.type = @"adgroup";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"status": @"status", @"budgetInMicroCurrency": @"budget_in_micro_currency", @"bidInMicroCurrency": @"bid_in_micro_currency", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"budgetType": @"budget_type", @"startTime": @"start_time", @"endTime": @"end_time", @"targetingSpec": @"targeting_spec", @"lifetimeFrequencyCap": @"lifetime_frequency_cap", @"trackingUrls": @"tracking_urls", @"autoTargetingEnabled": @"auto_targeting_enabled", @"placementGroup": @"placement_group", @"pacingDeliveryType": @"pacing_delivery_type", @"campaignId": @"campaign_id", @"billableEvent": @"billable_event", @"bidStrategyType": @"bid_strategy_type", @"targetingTemplateIds": @"targeting_template_ids", @"_id": @"id", @"adAccountId": @"ad_account_id", @"createdTime": @"created_time", @"updatedTime": @"updated_time", @"type": @"type", @"conversionLearningModeType": @"conversion_learning_mode_type", @"summaryStatus": @"summary_status", @"feedProfileId": @"feed_profile_id", @"dcaAssets": @"dca_assets" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"status", @"budgetInMicroCurrency", @"bidInMicroCurrency", @"optimizationGoalMetadata", @"budgetType", @"startTime", @"endTime", @"targetingSpec", @"lifetimeFrequencyCap", @"trackingUrls", @"autoTargetingEnabled", @"placementGroup", @"pacingDeliveryType", @"campaignId", @"billableEvent", @"bidStrategyType", @"targetingTemplateIds", @"_id", @"adAccountId", @"createdTime", @"updatedTime", @"type", @"conversionLearningModeType", @"summaryStatus", @"feedProfileId", @"dcaAssets"];
  return [optionalProperties containsObject:propertyName];
}

@end
