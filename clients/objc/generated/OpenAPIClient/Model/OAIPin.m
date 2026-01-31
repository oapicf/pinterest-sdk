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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"altText": @"alt_text", @"boardId": @"board_id", @"boardOwner": @"board_owner", @"boardSectionId": @"board_section_id", @"createdAt": @"created_at", @"creativeType": @"creative_type", @"_description": @"description", @"dominantColor": @"dominant_color", @"hasBeenPromoted": @"has_been_promoted", @"_id": @"id", @"isOwner": @"is_owner", @"isStandard": @"is_standard", @"link": @"link", @"media": @"media", @"parentPinId": @"parent_pin_id", @"pinMetrics": @"pin_metrics", @"title": @"title" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"altText", @"boardId", @"boardOwner", @"boardSectionId", @"createdAt", @"creativeType", @"_description", @"dominantColor", @"hasBeenPromoted", @"isOwner", @"isStandard", @"link", @"media", @"parentPinId", @"pinMetrics", @"title"];
  return [optionalProperties containsObject:propertyName];
}

@end
