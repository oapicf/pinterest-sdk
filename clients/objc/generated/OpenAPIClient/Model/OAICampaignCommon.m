#import "OAICampaignCommon.h"

@implementation OAICampaignCommon

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"dailySpendCap": @"daily_spend_cap", @"endTime": @"end_time", @"isAutomatedCampaign": @"is_automated_campaign", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"lifetimeSpendCap": @"lifetime_spend_cap", @"name": @"name", @"orderLineId": @"order_line_id", @"startTime": @"start_time", @"status": @"status", @"trackingUrls": @"tracking_urls" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"dailySpendCap", @"endTime", @"isAutomatedCampaign", @"isFlexibleDailyBudgets", @"lifetimeSpendCap", @"name", @"orderLineId", @"startTime", @"status", @"trackingUrls"];
  return [optionalProperties containsObject:propertyName];
}

@end
