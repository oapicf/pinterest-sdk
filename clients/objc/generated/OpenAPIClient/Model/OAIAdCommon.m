#import "OAIAdCommon.h"

@implementation OAIAdCommon

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adGroupId": @"ad_group_id", @"androidDeepLink": @"android_deep_link", @"carouselAndroidDeepLinks": @"carousel_android_deep_links", @"carouselDestinationUrls": @"carousel_destination_urls", @"carouselIosDeepLinks": @"carousel_ios_deep_links", @"clickTrackingUrl": @"click_tracking_url", @"creativeType": @"creative_type", @"customizableCtaType": @"customizable_cta_type", @"destinationUrl": @"destination_url", @"disclosureType": @"disclosure_type", @"disclosureUrl": @"disclosure_url", @"gridClickType": @"grid_click_type", @"iosDeepLink": @"ios_deep_link", @"isPinDeleted": @"is_pin_deleted", @"isRemovable": @"is_removable", @"leadFormId": @"lead_form_id", @"name": @"name", @"quizPinData": @"quiz_pin_data", @"status": @"status", @"trackingUrls": @"tracking_urls", @"viewTrackingUrl": @"view_tracking_url" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adGroupId", @"androidDeepLink", @"carouselAndroidDeepLinks", @"carouselDestinationUrls", @"carouselIosDeepLinks", @"clickTrackingUrl", @"creativeType", @"customizableCtaType", @"destinationUrl", @"disclosureType", @"disclosureUrl", @"gridClickType", @"iosDeepLink", @"isPinDeleted", @"isRemovable", @"leadFormId", @"name", @"quizPinData", @"status", @"trackingUrls", @"viewTrackingUrl"];
  return [optionalProperties containsObject:propertyName];
}

@end
