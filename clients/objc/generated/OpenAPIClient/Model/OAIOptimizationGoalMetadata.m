#import "OAIOptimizationGoalMetadata.h"

@implementation OAIOptimizationGoalMetadata

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"conversionTagV3GoalMetadata": @"conversion_tag_v3_goal_metadata", @"frequencyGoalMetadata": @"frequency_goal_metadata", @"scrollupGoalMetadata": @"scrollup_goal_metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"conversionTagV3GoalMetadata", @"frequencyGoalMetadata", @"scrollupGoalMetadata"];
  return [optionalProperties containsObject:propertyName];
}

@end
