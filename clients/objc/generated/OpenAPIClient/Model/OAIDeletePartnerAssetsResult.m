#import "OAIDeletePartnerAssetsResult.h"

@implementation OAIDeletePartnerAssetsResult

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"assetId": @"asset_id", @"assetType": @"asset_type", @"permissions": @"permissions", @"isSharedPartner": @"is_shared_partner", @"partnerId": @"partner_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"assetId", @"assetType", @"permissions", @"isSharedPartner", @"partnerId"];
  return [optionalProperties containsObject:propertyName];
}

@end
