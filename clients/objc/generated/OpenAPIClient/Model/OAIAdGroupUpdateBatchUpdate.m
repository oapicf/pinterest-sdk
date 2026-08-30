#import "OAIAdGroupUpdateBatchUpdate.h"

@implementation OAIAdGroupUpdateBatchUpdate

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.promotionId = @"0";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"bidInMicroCurrency": @"bid_in_micro_currency", @"bidMultiplier": @"bid_multiplier", @"bidStrategyType": @"bid_strategy_type", @"billableEvent": @"billable_event", @"budgetInMicroCurrency": @"budget_in_micro_currency", @"budgetType": @"budget_type", @"campaignId": @"campaign_id", @"customerSegmentId": @"customer_segment_id", @"endTime": @"end_time", @"extFeatures": @"ext_features", @"feedProfileId": @"feed_profile_id", @"_id": @"id", @"isCreativeOptimization": @"is_creative_optimization", @"isLocalInventory": @"is_local_inventory", @"lifetimeFrequencyCap": @"lifetime_frequency_cap", @"localInventoryRadiusInMiles": @"local_inventory_radius_in_miles", @"name": @"name", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"pacingDeliveryType": @"pacing_delivery_type", @"performancePlusCampaignSettings": @"performance_plus_campaign_settings", @"placementGroup": @"placement_group", @"placementTrafficType": @"placement_traffic_type", @"promotionApplicationLevel": @"promotion_application_level", @"promotionId": @"promotion_id", @"promotionIds": @"promotion_ids", @"startTime": @"start_time", @"status": @"status", @"targetingSpec": @"targeting_spec", @"targetingSpecOperations": @"targeting_spec_operations", @"targetingTemplateIds": @"targeting_template_ids", @"trackingUrls": @"tracking_urls" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"bidInMicroCurrency", @"bidMultiplier", @"bidStrategyType", @"billableEvent", @"budgetInMicroCurrency", @"budgetType", @"campaignId", @"customerSegmentId", @"endTime", @"extFeatures", @"feedProfileId", @"isCreativeOptimization", @"isLocalInventory", @"lifetimeFrequencyCap", @"localInventoryRadiusInMiles", @"name", @"optimizationGoalMetadata", @"pacingDeliveryType", @"performancePlusCampaignSettings", @"placementGroup", @"placementTrafficType", @"promotionApplicationLevel", @"promotionId", @"promotionIds", @"startTime", @"status", @"targetingSpec", @"targetingSpecOperations", @"targetingTemplateIds", @"trackingUrls"];
  return [optionalProperties containsObject:propertyName];
}

@end
