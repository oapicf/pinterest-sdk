#import "OAIIntegrationRecord.h"

@implementation OAIIntegrationRecord

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"externalBusinessId": @"external_business_id", @"connectedMerchantId": @"connected_merchant_id", @"connectedUserId": @"connected_user_id", @"connectedAdvertiserId": @"connected_advertiser_id", @"connectedLbaId": @"connected_lba_id", @"connectedTagId": @"connected_tag_id", @"partnerAccessToken": @"partner_access_token", @"partnerRefreshToken": @"partner_refresh_token", @"partnerPrimaryEmail": @"partner_primary_email", @"partnerAccessTokenExpiry": @"partner_access_token_expiry", @"partnerRefreshTokenExpiry": @"partner_refresh_token_expiry", @"scopes": @"scopes", @"partnerMetadata": @"partner_metadata", @"additionalId1": @"additional_id_1", @"createdTime": @"created_time", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"externalBusinessId", @"connectedMerchantId", @"connectedUserId", @"connectedAdvertiserId", @"connectedLbaId", @"connectedTagId", @"partnerAccessToken", @"partnerRefreshToken", @"partnerPrimaryEmail", @"partnerAccessTokenExpiry", @"partnerRefreshTokenExpiry", @"scopes", @"partnerMetadata", @"additionalId1", @"createdTime", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
