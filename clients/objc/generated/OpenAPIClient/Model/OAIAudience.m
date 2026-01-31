#import "OAIAudience.h"

@implementation OAIAudience

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"audienceType": @"audience_type", @"createdByCompanyName": @"created_by_company_name", @"createdTimestamp": @"created_timestamp", @"_description": @"description", @"_id": @"id", @"name": @"name", @"rule": @"rule", @"size": @"size", @"status": @"status", @"type": @"type", @"updatedTimestamp": @"updated_timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"audienceType", @"createdByCompanyName", @"createdTimestamp", @"_description", @"_id", @"name", @"rule", @"size", @"status", @"type", @"updatedTimestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
