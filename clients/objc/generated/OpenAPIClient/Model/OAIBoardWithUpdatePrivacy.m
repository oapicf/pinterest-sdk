#import "OAIBoardWithUpdatePrivacy.h"

@implementation OAIBoardWithUpdatePrivacy

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isAdsOnly = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"boardPinsModifiedAt": @"board_pins_modified_at", @"collaboratorCount": @"collaborator_count", @"createdAt": @"created_at", @"_description": @"description", @"followerCount": @"follower_count", @"_id": @"id", @"isAdsOnly": @"is_ads_only", @"media": @"media", @"name": @"name", @"owner": @"owner", @"pinCount": @"pin_count", @"privacy": @"privacy" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"boardPinsModifiedAt", @"collaboratorCount", @"createdAt", @"_description", @"followerCount", @"isAdsOnly", @"media", @"owner", @"pinCount", @"privacy"];
  return [optionalProperties containsObject:propertyName];
}

@end
