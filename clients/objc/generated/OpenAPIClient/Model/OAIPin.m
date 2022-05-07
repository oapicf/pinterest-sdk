#import "OAIPin.h"

@implementation OAIPin

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"createdAt": @"created_at", @"link": @"link", @"title": @"title", @"_description": @"description", @"altText": @"alt_text", @"boardId": @"board_id", @"boardSectionId": @"board_section_id", @"boardOwner": @"board_owner", @"media": @"media", @"mediaSource": @"media_source" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"createdAt", @"link", @"title", @"_description", @"altText", @"boardId", @"boardSectionId", @"boardOwner", @"media", @"mediaSource"];
  return [optionalProperties containsObject:propertyName];
}

@end
