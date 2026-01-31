#import "OAIAdAccountGetSubscriptionResponse.h"

@implementation OAIAdAccountGetSubscriptionResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"leadFormId": @"lead_form_id", @"webhookUrl": @"webhook_url", @"adAccountId": @"ad_account_id", @"apiVersion": @"api_version", @"createdTime": @"created_time", @"cryptographicAlgorithm": @"cryptographic_algorithm", @"cryptographicKey": @"cryptographic_key", @"_id": @"id", @"userAccountId": @"user_account_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"leadFormId", @"webhookUrl", @"adAccountId", @"apiVersion", @"createdTime", @"cryptographicAlgorithm", @"cryptographicKey", @"_id", @"userAccountId"];
  return [optionalProperties containsObject:propertyName];
}

@end
