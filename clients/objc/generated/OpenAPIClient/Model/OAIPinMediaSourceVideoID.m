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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"sourceType": @"source_type", @"coverImageUrl": @"cover_image_url", @"coverImageContentType": @"cover_image_content_type", @"coverImageData": @"cover_image_data", @"mediaId": @"media_id", @"isStandard": @"is_standard" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"coverImageUrl", @"coverImageContentType", @"coverImageData", @"isStandard"];
  return [optionalProperties containsObject:propertyName];
}

@end
