#import "OAIInviteResponse.h"

@implementation OAIInviteResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"assetsSummary": @"assets_summary", @"businessRoles": @"business_roles", @"createdByBusiness": @"created_by_business", @"createdByUser": @"created_by_user", @"createdTime": @"created_time", @"_id": @"id", @"inviteData": @"invite_data", @"isReceivedInvite": @"is_received_invite", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"assetsSummary", @"businessRoles", @"createdByBusiness", @"createdByUser", @"createdTime", @"_id", @"inviteData", @"isReceivedInvite", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end
