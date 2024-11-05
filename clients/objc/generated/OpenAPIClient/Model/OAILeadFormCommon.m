#import "OAILeadFormCommon.h"

@implementation OAILeadFormCommon

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"privacyPolicyLink": @"privacy_policy_link", @"hasAcceptedTerms": @"has_accepted_terms", @"completionMessage": @"completion_message", @"status": @"status", @"disclosureLanguage": @"disclosure_language", @"questions": @"questions", @"policyLinks": @"policy_links" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"privacyPolicyLink", @"hasAcceptedTerms", @"completionMessage", @"status", @"disclosureLanguage", @"questions", @"policyLinks"];
  return [optionalProperties containsObject:propertyName];
}

@end
