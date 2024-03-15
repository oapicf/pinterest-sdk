#import "OAIBidFloorSpec.h"

@implementation OAIBidFloorSpec

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"countries": @"countries", @"currency": @"currency", @"objectiveType": @"objective_type", @"billableEvent": @"billable_event", @"optimizationGoalMetadata": @"optimization_goal_metadata", @"creativeType": @"creative_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"countries", @"objectiveType", @"optimizationGoalMetadata", @"creativeType"];
  return [optionalProperties containsObject:propertyName];
}

@end
