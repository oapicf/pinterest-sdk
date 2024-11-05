#import "OAIDeletePartnerAssetAccessBodyAccessesInner.h"

@implementation OAIDeletePartnerAssetAccessBodyAccessesInner

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.partnerType = @"INTERNAL";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"partnerId": @"partner_id", @"assetId": @"asset_id", @"partnerType": @"partner_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"partnerType"];
  return [optionalProperties containsObject:propertyName];
}

@end
