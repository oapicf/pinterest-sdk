#import "OAICampaignBidOptionsUpdate.h"

@implementation OAICampaignBidOptionsUpdate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"ageBucketMultipliers": @"age_bucket_multipliers", @"appTypeMultipliers": @"app_type_multipliers", @"audienceMultipliers": @"audience_multipliers", @"freqBidMultiplierTimeWindow": @"freq_bid_multiplier_time_window", @"frequencyMultipliers": @"frequency_multipliers", @"genderMultipliers": @"gender_multipliers", @"placementMultipliers": @"placement_multipliers", @"updateMask": @"update_mask" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"ageBucketMultipliers", @"appTypeMultipliers", @"audienceMultipliers", @"freqBidMultiplierTimeWindow", @"frequencyMultipliers", @"genderMultipliers", @"placementMultipliers", ];
  return [optionalProperties containsObject:propertyName];
}

@end
