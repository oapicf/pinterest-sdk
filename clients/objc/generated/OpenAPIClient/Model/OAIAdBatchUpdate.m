#import "OAIAdBatchUpdate.h"

@implementation OAIAdBatchUpdate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adGroupId": @"ad_group_id", @"androidDeepLink": @"android_deep_link", @"carouselAndroidDeepLinks": @"carousel_android_deep_links", @"carouselDestinationUrls": @"carousel_destination_urls", @"carouselIosDeepLinks": @"carousel_ios_deep_links", @"clickTrackingUrl": @"click_tracking_url", @"collectionItemsDestinationUrlTemplate": @"collection_items_destination_url_template", @"collectionsHeaderType": @"collections_header_type", @"creativeType": @"creative_type", @"customizableCtaType": @"customizable_cta_type", @"destinationUrl": @"destination_url", @"disclosureType": @"disclosure_type", @"disclosureUrl": @"disclosure_url", @"gridClickType": @"grid_click_type", @"_id": @"id", @"iosDeepLink": @"ios_deep_link", @"isCarting": @"is_carting", @"isCollageAcceptedTerms": @"is_collage_accepted_terms", @"isCollageSingleDestination": @"is_collage_single_destination", @"isPinDeleted": @"is_pin_deleted", @"isRemovable": @"is_removable", @"leadFormId": @"lead_form_id", @"name": @"name", @"pinId": @"pin_id", @"quizPinData": @"quiz_pin_data", @"status": @"status", @"trackingUrls": @"tracking_urls", @"viewTrackingUrl": @"view_tracking_url" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adGroupId", @"androidDeepLink", @"carouselAndroidDeepLinks", @"carouselDestinationUrls", @"carouselIosDeepLinks", @"clickTrackingUrl", @"collectionItemsDestinationUrlTemplate", @"collectionsHeaderType", @"creativeType", @"customizableCtaType", @"destinationUrl", @"disclosureType", @"disclosureUrl", @"gridClickType", @"iosDeepLink", @"isCarting", @"isCollageAcceptedTerms", @"isCollageSingleDestination", @"isPinDeleted", @"isRemovable", @"leadFormId", @"name", @"pinId", @"quizPinData", @"status", @"trackingUrls", @"viewTrackingUrl"];
  return [optionalProperties containsObject:propertyName];
}

@end
