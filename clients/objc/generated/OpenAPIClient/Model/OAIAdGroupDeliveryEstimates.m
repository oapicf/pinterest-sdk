#import "OAIAdGroupDeliveryEstimates.h"

@implementation OAIAdGroupDeliveryEstimates

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"creativeTypes": @"creative_types", @"keywords": @"keywords", @"monthlyFrequencyCap": @"monthly_frequency_cap", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"optimizationType": @"optimization_type", @"placementGroup": @"placement_group", @"productGroupIds": @"product_group_ids", @"targetingSpec": @"targeting_spec" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"creativeTypes", @"keywords", @"monthlyFrequencyCap", @"optimizationGoalMetadata", @"optimizationType", @"placementGroup", @"productGroupIds", @"targetingSpec"];
  return [optionalProperties containsObject:propertyName];
}

@end
