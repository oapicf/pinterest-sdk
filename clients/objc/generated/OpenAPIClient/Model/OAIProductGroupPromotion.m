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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"adGroupId": @"ad_group_id", @"bidInMicroCurrency": @"bid_in_micro_currency", @"included": @"included", @"definition": @"definition", @"relativeDefinition": @"relative_definition", @"parentId": @"parent_id", @"slideshowCollectionsTitle": @"slideshow_collections_title", @"slideshowCollectionsDescription": @"slideshow_collections_description", @"isMdl": @"is_mdl", @"status": @"status", @"trackingUrl": @"tracking_url", @"catalogProductGroupId": @"catalog_product_group_id", @"catalogProductGroupName": @"catalog_product_group_name", @"creativeType": @"creative_type", @"collectionsHeroPinId": @"collections_hero_pin_id", @"collectionsHeroDestinationUrl": @"collections_hero_destination_url", @"gridClickType": @"grid_click_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"adGroupId", @"bidInMicroCurrency", @"included", @"definition", @"relativeDefinition", @"parentId", @"slideshowCollectionsTitle", @"slideshowCollectionsDescription", @"isMdl", @"status", @"trackingUrl", @"catalogProductGroupId", @"catalogProductGroupName", @"creativeType", @"collectionsHeroPinId", @"collectionsHeroDestinationUrl", @"gridClickType"];
  return [optionalProperties containsObject:propertyName];
}

@end
