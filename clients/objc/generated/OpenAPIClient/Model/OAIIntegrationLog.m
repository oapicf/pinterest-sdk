#import "OAIIntegrationLog.h"

@implementation OAIIntegrationLog

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"clientTimestamp": @"client_timestamp", @"eventType": @"event_type", @"logLevel": @"log_level", @"externalBusinessId": @"external_business_id", @"advertiserId": @"advertiser_id", @"merchantId": @"merchant_id", @"tagId": @"tag_id", @"feedProfileId": @"feed_profile_id", @"message": @"message", @"appVersionNumber": @"app_version_number", @"platformVersionNumber": @"platform_version_number", @"error": @"error", @"request": @"request" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"externalBusinessId", @"advertiserId", @"merchantId", @"tagId", @"feedProfileId", @"message", @"appVersionNumber", @"platformVersionNumber", @"error", @"request"];
  return [optionalProperties containsObject:propertyName];
}

@end
