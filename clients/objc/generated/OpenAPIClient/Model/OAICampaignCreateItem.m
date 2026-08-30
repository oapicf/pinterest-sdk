#import "OAICampaignCreateItem.h"

@implementation OAICampaignCreateItem

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isAutomatedCampaign = @(NO);
    self.isCampaignBudgetOptimization = @(YES);
    self.isFlexibleDailyBudgets = @(NO);
    self.isPerformancePlus = @(NO);
    self.isTopOfSearch = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"appId": @"app_id", @"appPlatform": @"app_platform", @"bidOptions": @"bid_options", @"dailySpendCap": @"daily_spend_cap", @"defaultAdGroupBudgetInMicroCurrency": @"default_ad_group_budget_in_micro_currency", @"endTime": @"end_time", @"intendedPromotionType": @"intended_promotion_type", @"isAutomatedCampaign": @"is_automated_campaign", @"isCampaignBudgetOptimization": @"is_campaign_budget_optimization", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"isLtvOptimized": @"is_ltv_optimized", @"isPerformancePlus": @"is_performance_plus", @"isTopOfSearch": @"is_top_of_search", @"lifetimeSpendCap": @"lifetime_spend_cap", @"name": @"name", @"objectiveType": @"objective_type", @"orderLineId": @"order_line_id", @"startTime": @"start_time", @"status": @"status", @"trackingUrls": @"tracking_urls" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"appId", @"appPlatform", @"bidOptions", @"dailySpendCap", @"defaultAdGroupBudgetInMicroCurrency", @"endTime", @"intendedPromotionType", @"isAutomatedCampaign", @"isCampaignBudgetOptimization", @"isFlexibleDailyBudgets", @"isLtvOptimized", @"isPerformancePlus", @"isTopOfSearch", @"lifetimeSpendCap", @"orderLineId", @"startTime", @"status", @"trackingUrls"];
  return [optionalProperties containsObject:propertyName];
}

@end
