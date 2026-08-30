#import "OAICampaignCreateRequestAllOf1.h"

@implementation OAICampaignCreateRequestAllOf1

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"bidOptions": @"bid_options", @"intendedPromotionType": @"intended_promotion_type", @"isAutomatedCampaign": @"is_automated_campaign", @"isCampaignBudgetOptimization": @"is_campaign_budget_optimization", @"isFlexibleDailyBudgets": @"is_flexible_daily_budgets", @"isLtvOptimized": @"is_ltv_optimized", @"isPerformancePlus": @"is_performance_plus", @"isTopOfSearch": @"is_top_of_search", @"objectiveType": @"objective_type", @"status": @"status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"bidOptions", @"intendedPromotionType", @"isAutomatedCampaign", @"isCampaignBudgetOptimization", @"isFlexibleDailyBudgets", @"isLtvOptimized", @"isPerformancePlus", @"isTopOfSearch", @"status"];
  return [optionalProperties containsObject:propertyName];
}

@end
