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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"additionalId1": @"additional_id_1", @"connectedAdvertiserId": @"connected_advertiser_id", @"connectedLbaId": @"connected_lba_id", @"connectedMerchantId": @"connected_merchant_id", @"connectedTagId": @"connected_tag_id", @"connectedUserId": @"connected_user_id", @"createdTimestamp": @"created_timestamp", @"externalBusinessId": @"external_business_id", @"_id": @"id", @"partnerAccessTokenExpiry": @"partner_access_token_expiry", @"partnerMetadata": @"partner_metadata", @"partnerRefreshTokenExpiry": @"partner_refresh_token_expiry", @"scopes": @"scopes", @"updatedTimestamp": @"updated_timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"additionalId1", @"connectedAdvertiserId", @"connectedLbaId", @"connectedMerchantId", @"connectedTagId", @"connectedUserId", @"createdTimestamp", @"externalBusinessId", @"_id", @"partnerAccessTokenExpiry", @"partnerMetadata", @"partnerRefreshTokenExpiry", @"scopes", @"updatedTimestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
