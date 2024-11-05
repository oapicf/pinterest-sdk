#import "OAIOauthAccessTokenResponseCode.h"

@implementation OAIOauthAccessTokenResponseCode

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"responseType": @"response_type", @"accessToken": @"access_token", @"tokenType": @"token_type", @"expiresIn": @"expires_in", @"scope": @"scope", @"refreshToken": @"refresh_token", @"refreshTokenExpiresIn": @"refresh_token_expires_in" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"responseType", ];
  return [optionalProperties containsObject:propertyName];
}

@end
