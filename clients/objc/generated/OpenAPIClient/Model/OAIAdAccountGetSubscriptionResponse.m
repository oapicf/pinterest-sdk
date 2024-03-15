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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"leadFormId": @"lead_form_id", @"webhookUrl": @"webhook_url", @"_id": @"id", @"userAccountId": @"user_account_id", @"adAccountId": @"ad_account_id", @"apiVersion": @"api_version", @"cryptographicKey": @"cryptographic_key", @"cryptographicAlgorithm": @"cryptographic_algorithm", @"createdTime": @"created_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"leadFormId", @"webhookUrl", @"_id", @"userAccountId", @"adAccountId", @"apiVersion", @"cryptographicKey", @"cryptographicAlgorithm", @"createdTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
