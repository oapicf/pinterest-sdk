#import "OAIOauthAccessToken.h"

@implementation OAIOauthAccessToken

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.tokenType = @"bearer";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"accessToken": @"access_token", @"expiresIn": @"expires_in", @"refreshToken": @"refresh_token", @"refreshTokenExpiresAt": @"refresh_token_expires_at", @"refreshTokenExpiresIn": @"refresh_token_expires_in", @"responseType": @"response_type", @"scope": @"scope", @"tokenType": @"token_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"refreshToken", @"refreshTokenExpiresAt", @"refreshTokenExpiresIn", @"responseType", @"scope", ];
  return [optionalProperties containsObject:propertyName];
}

@end
