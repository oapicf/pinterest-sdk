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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"_id": @"id", @"name": @"name", @"audienceType": @"audience_type", @"_description": @"description", @"rule": @"rule", @"size": @"size", @"status": @"status", @"type": @"type", @"createdTimestamp": @"created_timestamp", @"updatedTimestamp": @"updated_timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"_id", @"name", @"audienceType", @"_description", @"rule", @"size", @"status", @"type", @"createdTimestamp", @"updatedTimestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
