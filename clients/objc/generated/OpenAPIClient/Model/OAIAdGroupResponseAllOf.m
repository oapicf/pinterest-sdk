#import "OAIAdGroupResponseAllOf.h"

@implementation OAIAdGroupResponseAllOf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"status": @"status", @"budgetInMicroCurrency": @"budget_in_micro_currency", @"bidInMicroCurrency": @"bid_in_micro_currency", @"budgetType": @"budget_type", @"startTime": @"start_time", @"endTime": @"end_time", @"targetingSpec": @"targeting_spec", @"lifetimeFrequencyCap": @"lifetime_frequency_cap", @"trackingUrls": @"tracking_urls", @"autoTargetingEnabled": @"auto_targeting_enabled", @"placementGroup": @"placement_group", @"pacingDeliveryType": @"pacing_delivery_type", @"conversionLearningModeType": @"conversion_learning_mode_type", @"summaryStatus": @"summary_status", @"feedProfileId": @"feed_profile_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"status", @"budgetInMicroCurrency", @"bidInMicroCurrency", @"budgetType", @"startTime", @"endTime", @"targetingSpec", @"lifetimeFrequencyCap", @"trackingUrls", @"autoTargetingEnabled", @"placementGroup", @"pacingDeliveryType", @"conversionLearningModeType", @"summaryStatus", @"feedProfileId"];
  return [optionalProperties containsObject:propertyName];
}

@end
