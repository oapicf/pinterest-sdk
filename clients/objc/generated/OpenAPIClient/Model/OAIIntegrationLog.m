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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"advertiserId": @"advertiser_id", @"appVersionNumber": @"app_version_number", @"clientTimestamp": @"client_timestamp", @"error": @"error", @"eventType": @"event_type", @"externalBusinessId": @"external_business_id", @"feedProfileId": @"feed_profile_id", @"logLevel": @"log_level", @"merchantId": @"merchant_id", @"message": @"message", @"platformVersionNumber": @"platform_version_number", @"request": @"request", @"tagId": @"tag_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"advertiserId", @"appVersionNumber", @"error", @"externalBusinessId", @"feedProfileId", @"merchantId", @"message", @"platformVersionNumber", @"request", @"tagId"];
  return [optionalProperties containsObject:propertyName];
}

@end
