#import "OAIAdGroupCreate.h"

@implementation OAIAdGroupCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"bidInMicroCurrency": @"bid_in_micro_currency", @"bidStrategyType": @"bid_strategy_type", @"billableEvent": @"billable_event", @"budgetInMicroCurrency": @"budget_in_micro_currency", @"campaignId": @"campaign_id", @"conversionLearningModeType": @"conversion_learning_mode_type", @"createdTime": @"created_time", @"customerSegmentId": @"customer_segment_id", @"dcaAssets": @"dca_assets", @"endTime": @"end_time", @"extFeatures": @"ext_features", @"feedProfileId": @"feed_profile_id", @"_id": @"id", @"isCreativeOptimization": @"is_creative_optimization", @"isLocalInventory": @"is_local_inventory", @"lifetimeFrequencyCap": @"lifetime_frequency_cap", @"localInventoryRadiusInMiles": @"local_inventory_radius_in_miles", @"name": @"name", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"performancePlusCampaignSettings": @"performance_plus_campaign_settings", @"placementGroup": @"placement_group", @"placementTrafficType": @"placement_traffic_type", @"promotionApplicationLevel": @"promotion_application_level", @"promotionId": @"promotion_id", @"promotionIds": @"promotion_ids", @"startTime": @"start_time", @"status": @"status", @"summaryStatus": @"summary_status", @"targetingSpec": @"targeting_spec", @"targetingTemplateIds": @"targeting_template_ids", @"trackingUrls": @"tracking_urls", @"type": @"type", @"updatedTime": @"updated_time", @"autoTargetingEnabled": @"auto_targeting_enabled", @"bidMultiplier": @"bid_multiplier", @"budgetType": @"budget_type", @"pacingDeliveryType": @"pacing_delivery_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"bidInMicroCurrency", @"bidStrategyType", @"budgetInMicroCurrency", @"customerSegmentId", @"dcaAssets", @"endTime", @"extFeatures", @"feedProfileId", @"isCreativeOptimization", @"isLocalInventory", @"lifetimeFrequencyCap", @"localInventoryRadiusInMiles", @"optimizationGoalMetadata", @"performancePlusCampaignSettings", @"placementGroup", @"placementTrafficType", @"promotionApplicationLevel", @"promotionId", @"promotionIds", @"startTime", @"status", @"targetingSpec", @"targetingTemplateIds", @"trackingUrls", @"autoTargetingEnabled", @"bidMultiplier", @"budgetType", @"pacingDeliveryType"];
  return [optionalProperties containsObject:propertyName];
}

@end
