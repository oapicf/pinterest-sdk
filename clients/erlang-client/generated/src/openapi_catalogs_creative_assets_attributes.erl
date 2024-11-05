-module(openapi_catalogs_creative_assets_attributes).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_attributes/0]).

-type openapi_catalogs_creative_assets_attributes() ::
    #{ 'title' => binary(),
       'description' => binary(),
       'link' => binary(),
       'ios_deep_link' => binary(),
       'android_deep_link' => binary(),
       'google_product_category' => binary(),
       'custom_label_0' => binary(),
       'custom_label_1' => binary(),
       'custom_label_2' => binary(),
       'custom_label_3' => binary(),
       'custom_label_4' => binary(),
       'visibility' => binary(),
       'image_link' => binary(),
       'video_link' => binary()
     }.

encode(#{ 'title' := Title,
          'description' := Description,
          'link' := Link,
          'ios_deep_link' := IosDeepLink,
          'android_deep_link' := AndroidDeepLink,
          'google_product_category' := GoogleProductCategory,
          'custom_label_0' := CustomLabel0,
          'custom_label_1' := CustomLabel1,
          'custom_label_2' := CustomLabel2,
          'custom_label_3' := CustomLabel3,
          'custom_label_4' := CustomLabel4,
          'visibility' := Visibility,
          'image_link' := ImageLink,
          'video_link' := VideoLink
        }) ->
    #{ 'title' => Title,
       'description' => Description,
       'link' => Link,
       'ios_deep_link' => IosDeepLink,
       'android_deep_link' => AndroidDeepLink,
       'google_product_category' => GoogleProductCategory,
       'custom_label_0' => CustomLabel0,
       'custom_label_1' => CustomLabel1,
       'custom_label_2' => CustomLabel2,
       'custom_label_3' => CustomLabel3,
       'custom_label_4' => CustomLabel4,
       'visibility' => Visibility,
       'image_link' => ImageLink,
       'video_link' => VideoLink
     }.
