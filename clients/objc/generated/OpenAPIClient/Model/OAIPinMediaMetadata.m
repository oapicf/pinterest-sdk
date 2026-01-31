#import "OAIPinMediaMetadata.h"

@implementation OAIPinMediaMetadata

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_description": @"description", @"images": @"images", @"itemType": @"item_type", @"link": @"link", @"title": @"title", @"coverImageUrl": @"cover_image_url", @"duration": @"duration", @"height": @"height", @"videoUrl": @"video_url", @"width": @"width" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_description", @"images", @"itemType", @"link", @"title", @"coverImageUrl", @"duration", @"height", @"videoUrl", @"width"];
  return [optionalProperties containsObject:propertyName];
}

@end
