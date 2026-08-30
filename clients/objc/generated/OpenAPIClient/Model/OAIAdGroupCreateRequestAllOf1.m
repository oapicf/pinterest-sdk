#import "OAIAdGroupCreateRequestAllOf1.h"

@implementation OAIAdGroupCreateRequestAllOf1

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"bidMultiplier": @"bid_multiplier", @"budgetType": @"budget_type", @"pacingDeliveryType": @"pacing_delivery_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"bidMultiplier", @"budgetType", @"pacingDeliveryType"];
  return [optionalProperties containsObject:propertyName];
}

@end
