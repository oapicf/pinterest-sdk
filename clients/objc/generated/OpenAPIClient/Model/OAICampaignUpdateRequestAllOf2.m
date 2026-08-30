#import "OAICampaignUpdateRequestAllOf2.h"

@implementation OAICampaignUpdateRequestAllOf2

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"bidOptions": @"bid_options", @"intendedPromotionType": @"intended_promotion_type", @"isLtvOptimized": @"is_ltv_optimized", @"isPerformancePlus": @"is_performance_plus", @"isTopOfSearch": @"is_top_of_search", @"objectiveType": @"objective_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"bidOptions", @"intendedPromotionType", @"isLtvOptimized", @"isPerformancePlus", @"isTopOfSearch", @"objectiveType"];
  return [optionalProperties containsObject:propertyName];
}

@end
