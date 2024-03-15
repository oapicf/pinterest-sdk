#import "OAIPinUpdate.h"

@implementation OAIPinUpdate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"altText": @"alt_text", @"boardId": @"board_id", @"boardSectionId": @"board_section_id", @"_description": @"description", @"link": @"link", @"title": @"title", @"carouselSlots": @"carousel_slots", @"note": @"note" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"altText", @"boardId", @"boardSectionId", @"_description", @"link", @"title", @"carouselSlots", @"note"];
  return [optionalProperties containsObject:propertyName];
}

@end
