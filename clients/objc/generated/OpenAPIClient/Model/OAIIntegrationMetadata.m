#import "OAIIntegrationMetadata.h"

@implementation OAIIntegrationMetadata

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"externalBusinessId": @"external_business_id", @"connectedMerchantId": @"connected_merchant_id", @"connectedUserId": @"connected_user_id", @"connectedAdvertiserId": @"connected_advertiser_id", @"connectedLbaId": @"connected_lba_id", @"connectedTagId": @"connected_tag_id", @"partnerAccessTokenExpiry": @"partner_access_token_expiry", @"partnerRefreshTokenExpiry": @"partner_refresh_token_expiry", @"scopes": @"scopes", @"createdTimestamp": @"created_timestamp", @"updatedTimestamp": @"updated_timestamp", @"additionalId1": @"additional_id_1", @"partnerMetadata": @"partner_metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"externalBusinessId", @"connectedMerchantId", @"connectedUserId", @"connectedAdvertiserId", @"connectedLbaId", @"connectedTagId", @"partnerAccessTokenExpiry", @"partnerRefreshTokenExpiry", @"scopes", @"createdTimestamp", @"updatedTimestamp", @"additionalId1", @"partnerMetadata"];
  return [optionalProperties containsObject:propertyName];
}

@end
