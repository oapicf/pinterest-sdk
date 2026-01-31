#import "OAICampaignResponse.h"

@implementation OAICampaignResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"adAccountId": @"ad_account_id", @"dailySpendCap": @"daily_spend_cap", @"endTime": @"end_time", @"isAutomatedCampaign": @"is_automated_campaign", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"lifetimeSpendCap": @"lifetime_spend_cap", @"name": @"name", @"orderLineId": @"order_line_id", @"startTime": @"start_time", @"status": @"status", @"trackingUrls": @"tracking_urls", @"bidOptions": @"bid_options", @"createdTime": @"created_time", @"isCampaignBudgetOptimization": @"is_campaign_budget_optimization", @"isPerformancePlus": @"is_performance_plus", @"objectiveType": @"objective_type", @"summaryStatus": @"summary_status", @"type": @"type", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"adAccountId", @"dailySpendCap", @"endTime", @"isAutomatedCampaign", @"isFlexibleDailyBudgets", @"lifetimeSpendCap", @"name", @"orderLineId", @"startTime", @"status", @"trackingUrls", @"bidOptions", @"createdTime", @"isCampaignBudgetOptimization", @"isPerformancePlus", @"objectiveType", @"summaryStatus", @"type", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
