#import "OAIConversionMSOTEvents.h"

@implementation OAIConversionMSOTEvents

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"actionTimestamps": @"action_timestamps", @"adGroupId": @"ad_group_id", @"attributionModel": @"attribution_model", @"attributionScope": @"attribution_scope", @"attributionScore": @"attribution_score", @"campaignId": @"campaign_id", @"currency": @"currency", @"eventId": @"event_id", @"eventName": @"event_name", @"eventTimestamp": @"event_timestamp", @"totalEventTouchpoints": @"total_event_touchpoints", @"totalEvents": @"total_events", @"value": @"value" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"actionTimestamps", @"attributionModel", @"attributionScore", @"campaignId", @"currency", @"totalEventTouchpoints", @"totalEvents", @"value"];
  return [optionalProperties containsObject:propertyName];
}

@end
