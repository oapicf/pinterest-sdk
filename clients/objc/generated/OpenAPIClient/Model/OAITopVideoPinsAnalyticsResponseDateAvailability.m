#import "OAITopVideoPinsAnalyticsResponseDateAvailability.h"

@implementation OAITopVideoPinsAnalyticsResponseDateAvailability

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"isRealtime": @"is_realtime", @"latestAvailableTimestamp": @"latest_available_timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isRealtime", @"latestAvailableTimestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
