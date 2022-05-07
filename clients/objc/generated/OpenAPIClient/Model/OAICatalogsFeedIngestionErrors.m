#import "OAICatalogsFeedIngestionErrors.h"

@implementation OAICatalogsFeedIngestionErrors

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"imageDownloadError": @"image_download_error", @"imageDownloadConnectionTimeout": @"image_download_connection_timeout", @"imageFormatUnrecognize": @"image_format_unrecognize", @"lineLevelInternalError": @"line_level_internal_error", @"largeProductCountDecrease": @"large_product_count_decrease" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"imageDownloadError", @"imageDownloadConnectionTimeout", @"imageFormatUnrecognize", @"lineLevelInternalError", @"largeProductCountDecrease"];
  return [optionalProperties containsObject:propertyName];
}

@end
