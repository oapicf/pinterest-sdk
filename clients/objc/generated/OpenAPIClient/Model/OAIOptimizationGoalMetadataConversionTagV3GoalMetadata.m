#import "OAIOptimizationGoalMetadataConversionTagV3GoalMetadata.h"

@implementation OAIOptimizationGoalMetadataConversionTagV3GoalMetadata

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"attributionWindows": @"attribution_windows", @"conversionEvent": @"conversion_event", @"conversionTagId": @"conversion_tag_id", @"cpaGoalValueInMicroCurrency": @"cpa_goal_value_in_micro_currency", @"isRoasOptimized": @"is_roas_optimized", @"learningModeType": @"learning_mode_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"attributionWindows", @"conversionEvent", @"conversionTagId", @"cpaGoalValueInMicroCurrency", @"isRoasOptimized", @"learningModeType"];
  return [optionalProperties containsObject:propertyName];
}

@end
