#import "OAIAdPreviewShopping.h"

@implementation OAIAdPreviewShopping

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogProductGroupId": @"catalog_product_group_id", @"creativeType": @"creative_type", @"customizableCtaType": @"customizable_cta_type", @"heroImageTitle": @"hero_image_title", @"heroImageUrl": @"hero_image_url", @"heroPinId": @"hero_pin_id", @"imageTag": @"image_tag", @"itemId": @"item_id", @"preferredMediaType": @"preferred_media_type", @"videoTag": @"video_tag" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"customizableCtaType", @"heroImageTitle", @"heroImageUrl", @"heroPinId", @"imageTag", @"itemId", @"preferredMediaType", @"videoTag"];
  return [optionalProperties containsObject:propertyName];
}

@end
