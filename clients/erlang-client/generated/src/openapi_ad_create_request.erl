-module(openapi_ad_create_request).

-export([encode/1]).

-export_type([openapi_ad_create_request/0]).

-type openapi_ad_create_request() ::
    #{ 'ad_group_id' := binary(),
       'android_deep_link' => binary(),
       'carousel_android_deep_links' => list(),
       'carousel_destination_urls' => list(),
       'carousel_ios_deep_links' => list(),
       'click_tracking_url' => binary(),
       'creative_type' := openapi_creative_type:openapi_creative_type(),
       'destination_url' => binary(),
       'ios_deep_link' => binary(),
       'is_pin_deleted' => boolean(),
       'is_removable' => boolean(),
       'name' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'tracking_urls' => openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls(),
       'view_tracking_url' => binary(),
       'lead_form_id' => binary(),
       'grid_click_type' => openapi_grid_click_type:openapi_grid_click_type(),
       'customizable_cta_type' => binary(),
       'quiz_pin_data' => openapi_ad_common_quiz_pin_data:openapi_ad_common_quiz_pin_data(),
       'pin_id' := binary()
     }.

encode(#{ 'ad_group_id' := AdGroupId,
          'android_deep_link' := AndroidDeepLink,
          'carousel_android_deep_links' := CarouselAndroidDeepLinks,
          'carousel_destination_urls' := CarouselDestinationUrls,
          'carousel_ios_deep_links' := CarouselIosDeepLinks,
          'click_tracking_url' := ClickTrackingUrl,
          'creative_type' := CreativeType,
          'destination_url' := DestinationUrl,
          'ios_deep_link' := IosDeepLink,
          'is_pin_deleted' := IsPinDeleted,
          'is_removable' := IsRemovable,
          'name' := Name,
          'status' := Status,
          'tracking_urls' := TrackingUrls,
          'view_tracking_url' := ViewTrackingUrl,
          'lead_form_id' := LeadFormId,
          'grid_click_type' := GridClickType,
          'customizable_cta_type' := CustomizableCtaType,
          'quiz_pin_data' := QuizPinData,
          'pin_id' := PinId
        }) ->
    #{ 'ad_group_id' => AdGroupId,
       'android_deep_link' => AndroidDeepLink,
       'carousel_android_deep_links' => CarouselAndroidDeepLinks,
       'carousel_destination_urls' => CarouselDestinationUrls,
       'carousel_ios_deep_links' => CarouselIosDeepLinks,
       'click_tracking_url' => ClickTrackingUrl,
       'creative_type' => CreativeType,
       'destination_url' => DestinationUrl,
       'ios_deep_link' => IosDeepLink,
       'is_pin_deleted' => IsPinDeleted,
       'is_removable' => IsRemovable,
       'name' => Name,
       'status' => Status,
       'tracking_urls' => TrackingUrls,
       'view_tracking_url' => ViewTrackingUrl,
       'lead_form_id' => LeadFormId,
       'grid_click_type' => GridClickType,
       'customizable_cta_type' => CustomizableCtaType,
       'quiz_pin_data' => QuizPinData,
       'pin_id' => PinId
     }.
