#import "OAICampaignCreateResponseData.h"

@implementation OAICampaignCreateResponseData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"name": @"name", @"status": @"status", @"lifetimeSpendCap": @"lifetime_spend_cap", @"dailySpendCap": @"daily_spend_cap", @"orderLineId": @"order_line_id", @"trackingUrls": @"tracking_urls", @"startTime": @"start_time", @"endTime": @"end_time", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"defaultAdGroupBudgetInMicroCurrency": @"default_ad_group_budget_in_micro_currency", @"isAutomatedCampaign": @"is_automated_campaign", @"_id": @"id", @"objectiveType": @"objective_type", @"createdTime": @"created_time", @"updatedTime": @"updated_time", @"type": @"type", @"isCampaignBudgetOptimization": @"is_campaign_budget_optimization", @"summaryStatus": @"summary_status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"name", @"status", @"lifetimeSpendCap", @"dailySpendCap", @"orderLineId", @"trackingUrls", @"startTime", @"endTime", @"isFlexibleDailyBudgets", @"defaultAdGroupBudgetInMicroCurrency", @"isAutomatedCampaign", @"_id", @"objectiveType", @"createdTime", @"updatedTime", @"type", @"isCampaignBudgetOptimization", @"summaryStatus"];
  return [optionalProperties containsObject:propertyName];
}

@end
