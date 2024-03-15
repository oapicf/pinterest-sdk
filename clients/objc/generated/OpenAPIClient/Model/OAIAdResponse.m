#import "OAIAdResponse.h"

@implementation OAIAdResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adGroupId": @"ad_group_id", @"androidDeepLink": @"android_deep_link", @"carouselAndroidDeepLinks": @"carousel_android_deep_links", @"carouselDestinationUrls": @"carousel_destination_urls", @"carouselIosDeepLinks": @"carousel_ios_deep_links", @"clickTrackingUrl": @"click_tracking_url", @"creativeType": @"creative_type", @"destinationUrl": @"destination_url", @"iosDeepLink": @"ios_deep_link", @"isPinDeleted": @"is_pin_deleted", @"isRemovable": @"is_removable", @"name": @"name", @"status": @"status", @"trackingUrls": @"tracking_urls", @"viewTrackingUrl": @"view_tracking_url", @"leadFormId": @"lead_form_id", @"gridClickType": @"grid_click_type", @"customizableCtaType": @"customizable_cta_type", @"quizPinData": @"quiz_pin_data", @"pinId": @"pin_id", @"adAccountId": @"ad_account_id", @"campaignId": @"campaign_id", @"collectionItemsDestinationUrlTemplate": @"collection_items_destination_url_template", @"createdTime": @"created_time", @"_id": @"id", @"rejectedReasons": @"rejected_reasons", @"rejectionLabels": @"rejection_labels", @"reviewStatus": @"review_status", @"type": @"type", @"updatedTime": @"updated_time", @"summaryStatus": @"summary_status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adGroupId", @"androidDeepLink", @"carouselAndroidDeepLinks", @"carouselDestinationUrls", @"carouselIosDeepLinks", @"clickTrackingUrl", @"creativeType", @"destinationUrl", @"iosDeepLink", @"isPinDeleted", @"isRemovable", @"name", @"status", @"trackingUrls", @"viewTrackingUrl", @"leadFormId", @"gridClickType", @"customizableCtaType", @"quizPinData", @"pinId", @"adAccountId", @"campaignId", @"collectionItemsDestinationUrlTemplate", @"createdTime", @"_id", @"rejectedReasons", @"rejectionLabels", @"reviewStatus", @"type", @"updatedTime", @"summaryStatus"];
  return [optionalProperties containsObject:propertyName];
}

@end
