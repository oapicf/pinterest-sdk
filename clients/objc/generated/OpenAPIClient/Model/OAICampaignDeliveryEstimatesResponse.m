#import "OAICampaignDeliveryEstimatesResponse.h"

@implementation OAICampaignDeliveryEstimatesResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"curves": @"curves", @"derivedMetrics": @"derived_metrics", @"maxPotentialSpend": @"max_potential_spend" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"curves", @"derivedMetrics", @"maxPotentialSpend"];
  return [optionalProperties containsObject:propertyName];
}

@end
