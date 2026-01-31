#import "OAIQualityComponents.h"

@implementation OAIQualityComponents

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"advertiserExternalId": @"advertiser_external_id", @"clickIdEpik": @"click_id_epik", @"externalEventId": @"external_event_id", @"hashedEmail": @"hashed_email", @"hashedMaid": @"hashed_maid", @"ipAddress": @"ip_address", @"orderId": @"order_id", @"orderValue": @"order_value", @"productId": @"product_id", @"sourceUrl": @"source_url", @"userAgent": @"user_agent" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"advertiserExternalId", @"clickIdEpik", @"externalEventId", @"hashedEmail", @"hashedMaid", @"ipAddress", @"orderId", @"orderValue", @"productId", @"sourceUrl", @"userAgent"];
  return [optionalProperties containsObject:propertyName];
}

@end
