#import "OAIProductGroupPromotion.h"

@implementation OAIProductGroupPromotion

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adGroupId": @"ad_group_id", @"bidInMicroCurrency": @"bid_in_micro_currency", @"catalogProductGroupId": @"catalog_product_group_id", @"catalogProductGroupName": @"catalog_product_group_name", @"collectionsHeaderType": @"collections_header_type", @"collectionsHeroDestinationUrl": @"collections_hero_destination_url", @"collectionsHeroPinId": @"collections_hero_pin_id", @"creativeType": @"creative_type", @"customizableCtaType": @"customizable_cta_type", @"definition": @"definition", @"gridClickType": @"grid_click_type", @"_id": @"id", @"included": @"included", @"isGenerateBackground": @"is_generate_background", @"isImageAutoResizing": @"is_image_auto_resizing", @"isMdl": @"is_mdl", @"parentId": @"parent_id", @"preferredMediaType": @"preferred_media_type", @"relativeDefinition": @"relative_definition", @"selectedImageTag": @"selected_image_tag", @"selectedVideoTag": @"selected_video_tag", @"slideshowCollectionsDescription": @"slideshow_collections_description", @"slideshowCollectionsTitle": @"slideshow_collections_title", @"status": @"status", @"trackingUrl": @"tracking_url" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adGroupId", @"bidInMicroCurrency", @"catalogProductGroupId", @"catalogProductGroupName", @"collectionsHeaderType", @"collectionsHeroDestinationUrl", @"collectionsHeroPinId", @"creativeType", @"customizableCtaType", @"definition", @"gridClickType", @"_id", @"included", @"isGenerateBackground", @"isImageAutoResizing", @"isMdl", @"parentId", @"preferredMediaType", @"relativeDefinition", @"selectedImageTag", @"selectedVideoTag", @"slideshowCollectionsDescription", @"slideshowCollectionsTitle", @"status", @"trackingUrl"];
  return [optionalProperties containsObject:propertyName];
}

@end
