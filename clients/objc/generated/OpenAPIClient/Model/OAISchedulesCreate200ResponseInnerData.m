#import "OAISchedulesCreate200ResponseInnerData.h"

@implementation OAISchedulesCreate200ResponseInnerData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"deltaValue": @"delta_value", @"endTimestamp": @"end_timestamp", @"entityId": @"entity_id", @"entityType": @"entity_type", @"name": @"name", @"scheduleAction": @"schedule_action", @"scheduleId": @"schedule_id", @"scheduleStatus": @"schedule_status", @"scheduleType": @"schedule_type", @"startTimestamp": @"start_timestamp", @"_id": @"id", @"exceptions": @"exceptions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"deltaValue", @"endTimestamp", @"entityType", @"name", @"scheduleAction", @"scheduleStatus", @"scheduleType", @"startTimestamp", ];
  return [optionalProperties containsObject:propertyName];
}

@end
