#import "OAICampaign.h"

@implementation OAICampaign

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"bidOptions": @"bid_options", @"createdTime": @"created_time", @"dailySpendCap": @"daily_spend_cap", @"defaultAdGroupBudgetInMicroCurrency": @"default_ad_group_budget_in_micro_currency", @"endTime": @"end_time", @"_id": @"id", @"intendedPromotionType": @"intended_promotion_type", @"isAutomatedCampaign": @"is_automated_campaign", @"isCampaignBudgetOptimization": @"is_campaign_budget_optimization", @"isCarting": @"is_carting", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"isLtvOptimized": @"is_ltv_optimized", @"isPerformancePlus": @"is_performance_plus", @"isTopOfSearch": @"is_top_of_search", @"lifetimeSpendCap": @"lifetime_spend_cap", @"name": @"name", @"objectiveType": @"objective_type", @"orderLineId": @"order_line_id", @"performancePlusCampaignSettings": @"performance_plus_campaign_settings", @"startTime": @"start_time", @"status": @"status", @"summaryStatus": @"summary_status", @"trackingUrls": @"tracking_urls", @"type": @"type", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"bidOptions", @"createdTime", @"dailySpendCap", @"defaultAdGroupBudgetInMicroCurrency", @"endTime", @"intendedPromotionType", @"isAutomatedCampaign", @"isCampaignBudgetOptimization", @"isCarting", @"isFlexibleDailyBudgets", @"isLtvOptimized", @"isPerformancePlus", @"isTopOfSearch", @"lifetimeSpendCap", @"name", @"orderLineId", @"performancePlusCampaignSettings", @"startTime", @"status", @"summaryStatus", @"trackingUrls", @"type", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
