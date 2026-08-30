#import "OAICampaignAdPreview.h"

@implementation OAICampaignAdPreview

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"adGroupId": @"ad_group_id", @"clientId": @"client_id", @"expiresAt": @"expires_at", @"isActive": @"is_active", @"pinId": @"pin_id", @"pinPromotionId": @"pin_promotion_id", @"promotedProductGroupId": @"promoted_product_group_id", @"url": @"url", @"userId": @"user_id", @"uuid": @"uuid" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"clientId", @"pinId", @"pinPromotionId", @"promotedProductGroupId", ];
  return [optionalProperties containsObject:propertyName];
}

@end
