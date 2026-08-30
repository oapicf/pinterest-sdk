#import "OAIAdAccountsAudienceUpdate.h"

@implementation OAIAdAccountsAudienceUpdate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"audienceType": @"audience_type", @"_description": @"description", @"name": @"name", @"operationType": @"operation_type", @"rule": @"rule" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"audienceType", @"_description", @"name", @"operationType", @"rule"];
  return [optionalProperties containsObject:propertyName];
}

@end
