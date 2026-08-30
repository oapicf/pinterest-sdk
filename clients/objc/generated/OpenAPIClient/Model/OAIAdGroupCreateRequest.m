#import "OAIAdGroupCreateRequest.h"

@implementation OAIAdGroupCreateRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"bidMultiplier": @"bid_multiplier", @"budgetType": @"budget_type", @"pacingDeliveryType": @"pacing_delivery_type", @"bidInMicroCurrency": @"bid_in_micro_currency", @"bidStrategyType": @"bid_strategy_type", @"billableEvent": @"billable_event", @"budgetInMicroCurrency": @"budget_in_micro_currency", @"campaignId": @"campaign_id", @"endTime": @"end_time", @"isCreativeOptimization": @"is_creative_optimization", @"lifetimeFrequencyCap": @"lifetime_frequency_cap", @"name": @"name", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"placementGroup": @"placement_group", @"promotionApplicationLevel": @"promotion_application_level", @"promotionId": @"promotion_id", @"promotionIds": @"promotion_ids", @"startTime": @"start_time", @"status": @"status", @"targetingSpec": @"targeting_spec", @"targetingTemplateIds": @"targeting_template_ids", @"trackingUrls": @"tracking_urls" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"bidMultiplier", @"budgetType", @"pacingDeliveryType", @"bidInMicroCurrency", @"bidStrategyType", @"budgetInMicroCurrency", @"endTime", @"isCreativeOptimization", @"lifetimeFrequencyCap", @"optimizationGoalMetadata", @"placementGroup", @"promotionApplicationLevel", @"promotionId", @"promotionIds", @"startTime", @"status", @"targetingSpec", @"targetingTemplateIds", @"trackingUrls"];
  return [optionalProperties containsObject:propertyName];
}

@end
