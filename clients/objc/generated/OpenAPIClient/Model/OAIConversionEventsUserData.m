#import "OAIConversionEventsUserData.h"

@implementation OAIConversionEventsUserData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"clickId": @"click_id", @"clientIpAddress": @"client_ip_address", @"clientUserAgent": @"client_user_agent", @"country": @"country", @"ct": @"ct", @"db": @"db", @"em": @"em", @"externalId": @"external_id", @"fn": @"fn", @"ge": @"ge", @"hashedMaids": @"hashed_maids", @"ln": @"ln", @"partnerId": @"partner_id", @"ph": @"ph", @"st": @"st", @"zp": @"zp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"clickId", @"clientIpAddress", @"clientUserAgent", @"country", @"ct", @"db", @"em", @"externalId", @"fn", @"ge", @"hashedMaids", @"ln", @"partnerId", @"ph", @"st", @"zp"];
  return [optionalProperties containsObject:propertyName];
}

@end
