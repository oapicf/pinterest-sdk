#import "OAIPinMediaSourceVideoID.h"

@implementation OAIPinMediaSourceVideoID

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isStandard = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"coverImageContentType": @"cover_image_content_type", @"coverImageData": @"cover_image_data", @"coverImageKeyFrameTime": @"cover_image_key_frame_time", @"coverImageUrl": @"cover_image_url", @"isStandard": @"is_standard", @"mediaId": @"media_id", @"sourceType": @"source_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"coverImageContentType", @"coverImageData", @"coverImageKeyFrameTime", @"coverImageUrl", @"isStandard", ];
  return [optionalProperties containsObject:propertyName];
}

@end
