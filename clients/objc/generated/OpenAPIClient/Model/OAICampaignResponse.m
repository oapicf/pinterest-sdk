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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"adAccountId": @"ad_account_id", @"name": @"name", @"status": @"status", @"lifetimeSpendCap": @"lifetime_spend_cap", @"dailySpendCap": @"daily_spend_cap", @"orderLineId": @"order_line_id", @"trackingUrls": @"tracking_urls", @"startTime": @"start_time", @"endTime": @"end_time", @"summaryStatus": @"summary_status", @"objectiveType": @"objective_type", @"createdTime": @"created_time", @"updatedTime": @"updated_time", @"type": @"type", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"isCampaignBudgetOptimization": @"is_campaign_budget_optimization" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"adAccountId", @"name", @"status", @"lifetimeSpendCap", @"dailySpendCap", @"orderLineId", @"trackingUrls", @"startTime", @"endTime", @"summaryStatus", @"objectiveType", @"createdTime", @"updatedTime", @"type", @"isFlexibleDailyBudgets", @"isCampaignBudgetOptimization"];
  return [optionalProperties containsObject:propertyName];
}

@end
