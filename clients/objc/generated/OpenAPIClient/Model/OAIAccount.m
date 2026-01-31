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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"about": @"about", @"accountType": @"account_type", @"boardCount": @"board_count", @"businessName": @"business_name", @"followerCount": @"follower_count", @"followingCount": @"following_count", @"_id": @"id", @"monthlyViews": @"monthly_views", @"pinCount": @"pin_count", @"profileImage": @"profile_image", @"username": @"username", @"websiteUrl": @"website_url" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"about", @"accountType", @"boardCount", @"businessName", @"followerCount", @"followingCount", @"_id", @"monthlyViews", @"pinCount", @"profileImage", @"username", @"websiteUrl"];
  return [optionalProperties containsObject:propertyName];
}

@end
