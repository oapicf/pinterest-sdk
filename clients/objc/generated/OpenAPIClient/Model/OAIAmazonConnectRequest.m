#import "OAIAmazonConnectRequest.h"

@implementation OAIAmazonConnectRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"amazonStorefrontId": @"amazon_storefront_id", @"amazonStorefrontName": @"amazon_storefront_name", @"amazonStorefrontUrl": @"amazon_storefront_url", @"amazonUserId": @"amazon_user_id", @"isAmazonAccountLinked": @"is_amazon_account_linked", @"oneTimePasscode": @"one_time_passcode", @"pinterestUserId": @"pinterest_user_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"amazonStorefrontId", @"amazonUserId", @"oneTimePasscode", @"pinterestUserId"];
  return [optionalProperties containsObject:propertyName];
}

@end
