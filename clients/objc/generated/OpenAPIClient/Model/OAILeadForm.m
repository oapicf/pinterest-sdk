#import "OAILeadForm.h"

@implementation OAILeadForm

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"completionMessage": @"completion_message", @"createdTime": @"created_time", @"disclosureLanguage": @"disclosure_language", @"hasAcceptedTerms": @"has_accepted_terms", @"_id": @"id", @"name": @"name", @"policyLinks": @"policy_links", @"privacyPolicyLink": @"privacy_policy_link", @"questions": @"questions", @"status": @"status", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"createdTime", @"disclosureLanguage", @"policyLinks", @"status", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
