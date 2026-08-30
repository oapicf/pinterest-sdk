#import "OAIScheduleCreateRequest.h"

@implementation OAIScheduleCreateRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"entityId": @"entity_id", @"entityType": @"entity_type", @"deltaValue": @"delta_value", @"endTimestamp": @"end_timestamp", @"name": @"name", @"scheduleAction": @"schedule_action", @"scheduleStatus": @"schedule_status", @"scheduleType": @"schedule_type", @"startTimestamp": @"start_timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
