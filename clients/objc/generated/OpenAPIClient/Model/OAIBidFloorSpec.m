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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"billableEvent": @"billable_event", @"countries": @"countries", @"creativeType": @"creative_type", @"currency": @"currency", @"objectiveType": @"objective_type", @"optimizationGoalMetadata": @"optimization_goal_metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"countries", @"creativeType", @"objectiveType", @"optimizationGoalMetadata"];
  return [optionalProperties containsObject:propertyName];
}

@end
