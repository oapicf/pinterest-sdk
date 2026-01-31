#import "OAIAdGroupCreateRequest.h"

@implementation OAIAdGroupCreateRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.budgetType = @"DAILY";
    self.pacingDeliveryType = @"STANDARD";
    self.promotionId = @"0";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"bidInMicroCurrency": @"bid_in_micro_currency", @"bidStrategyType": @"bid_strategy_type", @"billableEvent": @"billable_event", @"budgetInMicroCurrency": @"budget_in_micro_currency", @"budgetType": @"budget_type", @"campaignId": @"campaign_id", @"endTime": @"end_time", @"isCreativeOptimization": @"is_creative_optimization", @"lifetimeFrequencyCap": @"lifetime_frequency_cap", @"name": @"name", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"pacingDeliveryType": @"pacing_delivery_type", @"placementGroup": @"placement_group", @"promotionApplicationLevel": @"promotion_application_level", @"promotionId": @"promotion_id", @"startTime": @"start_time", @"status": @"status", @"targetingSpec": @"targeting_spec", @"targetingTemplateIds": @"targeting_template_ids", @"trackingUrls": @"tracking_urls", @"bidMultiplier": @"bid_multiplier" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"bidInMicroCurrency", @"bidStrategyType", @"budgetInMicroCurrency", @"budgetType", @"endTime", @"isCreativeOptimization", @"lifetimeFrequencyCap", @"optimizationGoalMetadata", @"pacingDeliveryType", @"placementGroup", @"promotionApplicationLevel", @"promotionId", @"startTime", @"status", @"targetingSpec", @"targetingTemplateIds", @"trackingUrls", @"bidMultiplier"];
  return [optionalProperties containsObject:propertyName];
}

@end
