#import "OAIInviteBusinessRoleBinding.h"

@implementation OAIInviteBusinessRoleBinding

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"createdByBusinessId": @"created_by_business_id", @"createdByUserId": @"created_by_user_id", @"user": @"user", @"_id": @"id", @"inviteData": @"invite_data", @"isReceivedInvite": @"is_received_invite" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"createdByBusinessId", @"createdByUserId", @"user", @"_id", @"inviteData", @"isReceivedInvite"];
  return [optionalProperties containsObject:propertyName];
}

@end
