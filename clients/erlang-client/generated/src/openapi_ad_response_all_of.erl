-module(openapi_ad_response_all_of).

-export([encode/1]).

-export_type([openapi_ad_response_all_of/0]).

-type openapi_ad_response_all_of() ::
    #{ 'ad_group_id' => binary(),
       'android_deep_link' => binary(),
       'carousel_android_deep_links' => list(),
       'carousel_destination_urls' => list(),
       'carousel_ios_deep_links' => list(),
       'click_tracking_url' => binary(),
       'creative_type' => binary(),
       'destination_url' => binary(),
       'ios_deep_link' => binary(),
       'is_pin_deleted' => boolean(),
       'is_removable' => boolean(),
       'name' => binary(),
       'pin_id' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'view_tracking_url' => binary()
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
          'pin_id' := PinId,
          'status' := Status,
          'tracking_urls' := TrackingUrls,
          'view_tracking_url' := ViewTrackingUrl
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
       'pin_id' => PinId,
       'status' => Status,
       'tracking_urls' => TrackingUrls,
       'view_tracking_url' => ViewTrackingUrl
     }.
