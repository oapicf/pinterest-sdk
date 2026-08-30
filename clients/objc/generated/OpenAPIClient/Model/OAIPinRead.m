#import "OAIPinRead.h"

@implementation OAIPinRead

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aiDisclosures": @"ai_disclosures", @"boardId": @"board_id", @"boardOwner": @"board_owner", @"boardSectionId": @"board_section_id", @"createdAt": @"created_at", @"creativeType": @"creative_type", @"dominantColor": @"dominant_color", @"hasBeenPromoted": @"has_been_promoted", @"_id": @"id", @"isOwner": @"is_owner", @"isProduct": @"is_product", @"isStandard": @"is_standard", @"media": @"media", @"parentPinId": @"parent_pin_id", @"pinMetrics": @"pin_metrics", @"altText": @"alt_text", @"_description": @"description", @"link": @"link", @"title": @"title" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aiDisclosures", @"boardId", @"boardOwner", @"boardSectionId", @"createdAt", @"creativeType", @"dominantColor", @"hasBeenPromoted", @"isOwner", @"isProduct", @"isStandard", @"media", @"parentPinId", @"pinMetrics", @"altText", @"_description", @"link", @"title"];
  return [optionalProperties containsObject:propertyName];
}

@end
