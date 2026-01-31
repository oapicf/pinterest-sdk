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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"additionalId1": @"additional_id_1", @"connectedAdvertiserId": @"connected_advertiser_id", @"connectedLbaId": @"connected_lba_id", @"connectedMerchantId": @"connected_merchant_id", @"connectedTagId": @"connected_tag_id", @"connectedUserId": @"connected_user_id", @"createdTime": @"created_time", @"externalBusinessId": @"external_business_id", @"_id": @"id", @"partnerAccessToken": @"partner_access_token", @"partnerAccessTokenExpiry": @"partner_access_token_expiry", @"partnerMetadata": @"partner_metadata", @"partnerPrimaryEmail": @"partner_primary_email", @"partnerRefreshToken": @"partner_refresh_token", @"partnerRefreshTokenExpiry": @"partner_refresh_token_expiry", @"scopes": @"scopes", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"additionalId1", @"connectedAdvertiserId", @"connectedLbaId", @"connectedMerchantId", @"connectedTagId", @"connectedUserId", @"createdTime", @"externalBusinessId", @"_id", @"partnerAccessToken", @"partnerAccessTokenExpiry", @"partnerMetadata", @"partnerPrimaryEmail", @"partnerRefreshToken", @"partnerRefreshTokenExpiry", @"scopes", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
