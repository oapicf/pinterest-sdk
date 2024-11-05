#import "OAIOauthAccessTokenResponse.h"

@implementation OAIOauthAccessTokenResponse

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.tokenType = @"bearer";
    
  }
  return self;
}

/**
 * Maps "discriminator" value to the sub-class name, so that inheritance is supported.
 */
- (id)initWithDictionary:(NSDictionary *)dict error:(NSError *__autoreleasing *)err {
    NSString * discriminatedClassName = [dict valueForKey:@"responseType"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"authorization_code"]) {
        class = NSClassFromString(@"OAIOauthAccessTokenResponseCode");
    }
    else
    if ([discriminatedClassName isEqualToString:@"client_credentials"]) {
        class = NSClassFromString(@"OAIOauthAccessTokenResponseClientCredentials");
    }
    else
    if ([discriminatedClassName isEqualToString:@"everlasting_refresh"]) {
        class = NSClassFromString(@"OAIOauthAccessTokenResponseEverlastingRefresh");
    }
    else
    if ([discriminatedClassName isEqualToString:@"integration_refresh"]) {
        class = NSClassFromString(@"OAIOauthAccessTokenResponseIntegrationRefresh");
    }
    else
    if ([discriminatedClassName isEqualToString:@"refresh_token"]) {
        class = NSClassFromString(@"OAIOauthAccessTokenResponseRefresh");
    }
    else
    {
        class = NSClassFromString([@"OAI" stringByAppendingString:discriminatedClassName]);
        if(!class) {
            class = NSClassFromString([@"OAI" stringByAppendingString:[discriminatedClassName capitalizedString]]);
        }
    }
    if([self class ] == class) {
        return [super initWithDictionary:dict error:err];
    }
    return [[class alloc] initWithDictionary:dict error: err];
}

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"responseType": @"response_type", @"accessToken": @"access_token", @"tokenType": @"token_type", @"expiresIn": @"expires_in", @"scope": @"scope" }];
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
