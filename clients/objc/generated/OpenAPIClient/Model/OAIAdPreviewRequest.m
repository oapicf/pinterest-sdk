#import "OAIAdPreviewRequest.h"

@implementation OAIAdPreviewRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"imageUrl": @"image_url", @"promotionId": @"promotion_id", @"title": @"title", @"creativeType": @"creative_type", @"pinId": @"pin_id", @"catalogProductGroupId": @"catalog_product_group_id", @"customizableCtaType": @"customizable_cta_type", @"heroImageTitle": @"hero_image_title", @"heroImageUrl": @"hero_image_url", @"heroPinId": @"hero_pin_id", @"imageTag": @"image_tag", @"itemId": @"item_id", @"preferredMediaType": @"preferred_media_type", @"showPromotion": @"show_promotion", @"videoTag": @"video_tag" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"promotionId", @"customizableCtaType", @"heroImageTitle", @"heroImageUrl", @"heroPinId", @"imageTag", @"itemId", @"preferredMediaType", @"showPromotion", @"videoTag"];
  return [optionalProperties containsObject:propertyName];
}

@end
