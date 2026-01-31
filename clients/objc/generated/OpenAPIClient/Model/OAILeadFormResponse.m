#import "OAILeadFormResponse.h"

@implementation OAILeadFormResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"completionMessage": @"completion_message", @"disclosureLanguage": @"disclosure_language", @"hasAcceptedTerms": @"has_accepted_terms", @"name": @"name", @"policyLinks": @"policy_links", @"privacyPolicyLink": @"privacy_policy_link", @"questions": @"questions", @"status": @"status", @"adAccountId": @"ad_account_id", @"createdTime": @"created_time", @"_id": @"id", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"completionMessage", @"disclosureLanguage", @"hasAcceptedTerms", @"name", @"policyLinks", @"privacyPolicyLink", @"questions", @"status", @"adAccountId", @"createdTime", @"_id", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
