#import "OAIBulkCampaignDeliveryEstimatesItem.h"

@implementation OAIBulkCampaignDeliveryEstimatesItem

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adgroupAudienceSizes": @"adgroup_audience_sizes", @"conversionRate": @"conversion_rate", @"conversionRates": @"conversion_rates", @"curves": @"curves", @"derivedMetrics": @"derived_metrics", @"errors": @"errors", @"estimateId": @"estimate_id", @"maxPotentialSpend": @"max_potential_spend" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adgroupAudienceSizes", @"conversionRate", @"conversionRates", @"curves", @"derivedMetrics", @"errors", @"estimateId", @"maxPotentialSpend"];
  return [optionalProperties containsObject:propertyName];
}

@end
