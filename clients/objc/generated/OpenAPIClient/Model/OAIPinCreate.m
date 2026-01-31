#import "OAIPinCreate.h"

@implementation OAIPinCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"altText": @"alt_text", @"boardId": @"board_id", @"boardSectionId": @"board_section_id", @"_description": @"description", @"dominantColor": @"dominant_color", @"link": @"link", @"mediaSource": @"media_source", @"parentPinId": @"parent_pin_id", @"sponsorId": @"sponsor_id", @"title": @"title" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"altText", @"boardId", @"boardSectionId", @"_description", @"dominantColor", @"link", @"mediaSource", @"parentPinId", @"sponsorId", @"title"];
  return [optionalProperties containsObject:propertyName];
}

@end
