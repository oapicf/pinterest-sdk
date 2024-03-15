#import "OAIAccount.h"

@implementation OAIAccount

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"accountType": @"account_type", @"_id": @"id", @"profileImage": @"profile_image", @"websiteUrl": @"website_url", @"username": @"username", @"about": @"about", @"businessName": @"business_name", @"boardCount": @"board_count", @"pinCount": @"pin_count", @"followerCount": @"follower_count", @"followingCount": @"following_count", @"monthlyViews": @"monthly_views" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"accountType", @"_id", @"profileImage", @"websiteUrl", @"username", @"about", @"businessName", @"boardCount", @"pinCount", @"followerCount", @"followingCount", @"monthlyViews"];
  return [optionalProperties containsObject:propertyName];
}

@end
