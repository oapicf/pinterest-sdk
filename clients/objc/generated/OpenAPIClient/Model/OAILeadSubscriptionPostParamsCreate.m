#import "OAILeadSubscriptionPostParamsCreate.h"

@implementation OAILeadSubscriptionPostParamsCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"leadFormId": @"lead_form_id", @"webhookUrl": @"webhook_url", @"partnerAccessToken": @"partner_access_token", @"partnerMetadata": @"partner_metadata", @"partnerRefreshToken": @"partner_refresh_token" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"leadFormId", @"partnerAccessToken", @"partnerMetadata", @"partnerRefreshToken"];
  return [optionalProperties containsObject:propertyName];
}

@end
