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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"actionSource": @"action_source", @"appId": @"app_id", @"appInfo": @"app_info", @"appName": @"app_name", @"appVersion": @"app_version", @"customData": @"custom_data", @"deviceBrand": @"device_brand", @"deviceCarrier": @"device_carrier", @"deviceInfo": @"device_info", @"deviceModel": @"device_model", @"deviceType": @"device_type", @"eventId": @"event_id", @"eventName": @"event_name", @"eventSourceUrl": @"event_source_url", @"eventTime": @"event_time", @"language": @"language", @"optOut": @"opt_out", @"osVersion": @"os_version", @"partnerName": @"partner_name", @"userData": @"user_data", @"wifi": @"wifi" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"appId", @"appInfo", @"appName", @"appVersion", @"customData", @"deviceBrand", @"deviceCarrier", @"deviceInfo", @"deviceModel", @"deviceType", @"eventSourceUrl", @"language", @"optOut", @"osVersion", @"partnerName", @"wifi"];
  return [optionalProperties containsObject:propertyName];
}

@end
