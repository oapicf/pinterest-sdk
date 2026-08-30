#import "OAICampaignDeliveryEstimatesDerivedMetrics.h"

@implementation OAICampaignDeliveryEstimatesDerivedMetrics

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cpc": @"cpc", @"cpcLower": @"cpc_lower", @"cpcUpper": @"cpc_upper", @"cpm": @"cpm", @"cpmLower": @"cpm_lower", @"cpmUpper": @"cpm_upper", @"lifetimeFrequency": @"lifetime_frequency", @"lifetimeFrequencyLower": @"lifetime_frequency_lower", @"lifetimeFrequencyUpper": @"lifetime_frequency_upper", @"lifetimeImpression": @"lifetime_impression", @"lifetimeImpressionLower": @"lifetime_impression_lower", @"lifetimeImpressionUpper": @"lifetime_impression_upper", @"lifetimeReach": @"lifetime_reach", @"lifetimeReachLower": @"lifetime_reach_lower", @"lifetimeReachUpper": @"lifetime_reach_upper", @"weeklyClick": @"weekly_click", @"weeklyClickLower": @"weekly_click_lower", @"weeklyClickUpper": @"weekly_click_upper", @"weeklyFrequency": @"weekly_frequency", @"weeklyFrequencyLower": @"weekly_frequency_lower", @"weeklyFrequencyUpper": @"weekly_frequency_upper", @"weeklyImpression": @"weekly_impression", @"weeklyImpressionLower": @"weekly_impression_lower", @"weeklyImpressionUpper": @"weekly_impression_upper", @"weeklyReach": @"weekly_reach", @"weeklyReachLower": @"weekly_reach_lower", @"weeklyReachUpper": @"weekly_reach_upper" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cpc", @"cpcLower", @"cpcUpper", @"cpm", @"cpmLower", @"cpmUpper", @"lifetimeFrequency", @"lifetimeFrequencyLower", @"lifetimeFrequencyUpper", @"lifetimeImpression", @"lifetimeImpressionLower", @"lifetimeImpressionUpper", @"lifetimeReach", @"lifetimeReachLower", @"lifetimeReachUpper", @"weeklyClick", @"weeklyClickLower", @"weeklyClickUpper", @"weeklyFrequency", @"weeklyFrequencyLower", @"weeklyFrequencyUpper", @"weeklyImpression", @"weeklyImpressionLower", @"weeklyImpressionUpper", @"weeklyReach", @"weeklyReachLower", @"weeklyReachUpper"];
  return [optionalProperties containsObject:propertyName];
}

@end
