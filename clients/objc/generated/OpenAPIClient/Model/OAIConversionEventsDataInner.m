#import "OAIConversionEventsDataInner.h"

@implementation OAIConversionEventsDataInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"eventName": @"event_name", @"actionSource": @"action_source", @"eventTime": @"event_time", @"eventId": @"event_id", @"eventSourceUrl": @"event_source_url", @"optOut": @"opt_out", @"partnerName": @"partner_name", @"userData": @"user_data", @"customData": @"custom_data", @"appId": @"app_id", @"appName": @"app_name", @"appVersion": @"app_version", @"deviceBrand": @"device_brand", @"deviceCarrier": @"device_carrier", @"deviceModel": @"device_model", @"deviceType": @"device_type", @"osVersion": @"os_version", @"wifi": @"wifi", @"language": @"language" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"eventSourceUrl", @"optOut", @"partnerName", @"customData", @"appId", @"appName", @"appVersion", @"deviceBrand", @"deviceCarrier", @"deviceModel", @"deviceType", @"osVersion", @"wifi", @"language"];
  return [optionalProperties containsObject:propertyName];
}

@end
