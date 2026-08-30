#import "OAICampaignDeliveryEstimatesCampaign.h"

@implementation OAICampaignDeliveryEstimatesCampaign

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adGroups": @"ad_groups", @"budgetDurationType": @"budget_duration_type", @"dailySpendCap": @"daily_spend_cap", @"endDate": @"end_date", @"lifetimeSpendCap": @"lifetime_spend_cap", @"objectiveType": @"objective_type", @"startDate": @"start_date" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"dailySpendCap", @"endDate", @"lifetimeSpendCap", ];
  return [optionalProperties containsObject:propertyName];
}

@end
