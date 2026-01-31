#import "OAICampaignCreateRequest.h"

@implementation OAICampaignCreateRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isAutomatedCampaign = @(NO);
    self.isFlexibleDailyBudgets = @(NO);
    self.status = @"ACTIVE";
    self.isPerformancePlus = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"dailySpendCap": @"daily_spend_cap", @"endTime": @"end_time", @"isAutomatedCampaign": @"is_automated_campaign", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"lifetimeSpendCap": @"lifetime_spend_cap", @"name": @"name", @"orderLineId": @"order_line_id", @"startTime": @"start_time", @"status": @"status", @"trackingUrls": @"tracking_urls", @"defaultAdGroupBudgetInMicroCurrency": @"default_ad_group_budget_in_micro_currency", @"isCampaignBudgetOptimization": @"is_campaign_budget_optimization", @"bidOptions": @"bid_options", @"isPerformancePlus": @"is_performance_plus", @"objectiveType": @"objective_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"dailySpendCap", @"endTime", @"isAutomatedCampaign", @"isFlexibleDailyBudgets", @"lifetimeSpendCap", @"orderLineId", @"startTime", @"status", @"trackingUrls", @"defaultAdGroupBudgetInMicroCurrency", @"isCampaignBudgetOptimization", @"bidOptions", @"isPerformancePlus", ];
  return [optionalProperties containsObject:propertyName];
}

@end
