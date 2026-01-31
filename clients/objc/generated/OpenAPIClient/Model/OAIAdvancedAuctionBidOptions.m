#import "OAIAdvancedAuctionBidOptions.h"

@implementation OAIAdvancedAuctionBidOptions

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"appTypeMultipliers": @"app_type_multipliers", @"bidInMicroCurrency": @"bid_in_micro_currency", @"placementMultipliers": @"placement_multipliers" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"appTypeMultipliers", @"bidInMicroCurrency", @"placementMultipliers"];
  return [optionalProperties containsObject:propertyName];
}

@end
