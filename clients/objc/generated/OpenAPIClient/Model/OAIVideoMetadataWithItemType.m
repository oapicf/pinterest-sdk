#import "OAIVideoMetadataWithItemType.h"

@implementation OAIVideoMetadataWithItemType

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"coverImageUrl": @"cover_image_url", @"duration": @"duration", @"height": @"height", @"itemType": @"item_type", @"videoUrl": @"video_url", @"videoUrlHls": @"video_url_hls", @"width": @"width" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"coverImageUrl", @"duration", @"height", @"videoUrl", @"videoUrlHls", @"width"];
  return [optionalProperties containsObject:propertyName];
}

@end
