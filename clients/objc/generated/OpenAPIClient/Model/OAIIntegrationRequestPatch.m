#import "OAIIntegrationRequestPatch.h"

@implementation OAIIntegrationRequestPatch

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"connectedMerchantId": @"connected_merchant_id", @"connectedAdvertiserId": @"connected_advertiser_id", @"connectedLbaId": @"connected_lba_id", @"connectedTagId": @"connected_tag_id", @"partnerAccessToken": @"partner_access_token", @"partnerRefreshToken": @"partner_refresh_token", @"partnerPrimaryEmail": @"partner_primary_email", @"partnerAccessTokenExpiry": @"partner_access_token_expiry", @"partnerRefreshTokenExpiry": @"partner_refresh_token_expiry", @"scopes": @"scopes", @"additionalId1": @"additional_id_1", @"partnerMetadata": @"partner_metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"connectedMerchantId", @"connectedAdvertiserId", @"connectedLbaId", @"connectedTagId", @"partnerAccessToken", @"partnerRefreshToken", @"partnerPrimaryEmail", @"partnerAccessTokenExpiry", @"partnerRefreshTokenExpiry", @"scopes", @"additionalId1", @"partnerMetadata"];
  return [optionalProperties containsObject:propertyName];
}

@end
