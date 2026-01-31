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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"inviteData": @"invite_data", @"isReceivedInvite": @"is_received_invite", @"user": @"user", @"createdByBusinessId": @"created_by_business_id", @"createdByUserId": @"created_by_user_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"inviteData", @"isReceivedInvite", @"user", @"createdByBusinessId", @"createdByUserId"];
  return [optionalProperties containsObject:propertyName];
}

@end
