#import "OAIAdGroupResponse.h"

@implementation OAIAdGroupResponse

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.promotionId = @"0";
    self.type = @"adgroup";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"bidInMicroCurrency": @"bid_in_micro_currency", @"bidStrategyType": @"bid_strategy_type", @"billableEvent": @"billable_event", @"budgetInMicroCurrency": @"budget_in_micro_currency", @"budgetType": @"budget_type", @"campaignId": @"campaign_id", @"endTime": @"end_time", @"isCreativeOptimization": @"is_creative_optimization", @"lifetimeFrequencyCap": @"lifetime_frequency_cap", @"name": @"name", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"pacingDeliveryType": @"pacing_delivery_type", @"placementGroup": @"placement_group", @"promotionApplicationLevel": @"promotion_application_level", @"promotionId": @"promotion_id", @"startTime": @"start_time", @"status": @"status", @"targetingSpec": @"targeting_spec", @"targetingTemplateIds": @"targeting_template_ids", @"trackingUrls": @"tracking_urls", @"adAccountId": @"ad_account_id", @"bidMultiplier": @"bid_multiplier", @"conversionLearningModeType": @"conversion_learning_mode_type", @"createdTime": @"created_time", @"dcaAssets": @"dca_assets", @"feedProfileId": @"feed_profile_id", @"_id": @"id", @"summaryStatus": @"summary_status", @"type": @"type", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"bidInMicroCurrency", @"bidStrategyType", @"billableEvent", @"budgetInMicroCurrency", @"budgetType", @"campaignId", @"endTime", @"isCreativeOptimization", @"lifetimeFrequencyCap", @"name", @"optimizationGoalMetadata", @"pacingDeliveryType", @"placementGroup", @"promotionApplicationLevel", @"promotionId", @"startTime", @"status", @"targetingSpec", @"targetingTemplateIds", @"trackingUrls", @"adAccountId", @"bidMultiplier", @"conversionLearningModeType", @"createdTime", @"dcaAssets", @"feedProfileId", @"_id", @"summaryStatus", @"type", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
