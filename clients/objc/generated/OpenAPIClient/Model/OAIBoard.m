#import "OAIBoard.h"

@implementation OAIBoard

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.privacy = @"PUBLIC";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"createdAt": @"created_at", @"boardPinsModifiedAt": @"board_pins_modified_at", @"name": @"name", @"_description": @"description", @"collaboratorCount": @"collaborator_count", @"pinCount": @"pin_count", @"followerCount": @"follower_count", @"media": @"media", @"owner": @"owner", @"privacy": @"privacy" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"createdAt", @"boardPinsModifiedAt", @"_description", @"collaboratorCount", @"pinCount", @"followerCount", @"media", @"owner", @"privacy"];
  return [optionalProperties containsObject:propertyName];
}

@end
