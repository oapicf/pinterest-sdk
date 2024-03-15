#import "OAIOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.h"

@implementation OAIOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"clickWindowDays": @"click_window_days", @"engagementWindowDays": @"engagement_window_days", @"viewWindowDays": @"view_window_days" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"clickWindowDays", @"engagementWindowDays", @"viewWindowDays"];
  return [optionalProperties containsObject:propertyName];
}

@end
