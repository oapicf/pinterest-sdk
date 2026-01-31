#import "OAIInviteExceptionResponse.h"

@implementation OAIInviteExceptionResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"code": @"code", @"inviteOrRequestId": @"invite_or_request_id", @"message": @"message", @"usersOrPartnerIds": @"users_or_partner_ids" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"code", @"inviteOrRequestId", @"message", @"usersOrPartnerIds"];
  return [optionalProperties containsObject:propertyName];
}

@end
