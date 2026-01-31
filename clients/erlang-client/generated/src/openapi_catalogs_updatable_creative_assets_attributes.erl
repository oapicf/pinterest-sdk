-module(openapi_catalogs_updatable_creative_assets_attributes).

-export([encode/1]).

-export_type([openapi_catalogs_updatable_creative_assets_attributes/0]).

-type openapi_catalogs_updatable_creative_assets_attributes() ::
    #{ 'android_deep_link' => binary(),
       'custom_label_0' => binary(),
       'custom_label_1' => binary(),
       'custom_label_2' => binary(),
       'custom_label_3' => binary(),
       'custom_label_4' => binary(),
       'description' => binary(),
       'google_product_category' => binary(),
       'ios_deep_link' => binary(),
       'link' => binary(),
       'title' => binary(),
       'visibility' => binary()
     }.

encode(#{ 'android_deep_link' := AndroidDeepLink,
          'custom_label_0' := CustomLabel0,
          'custom_label_1' := CustomLabel1,
          'custom_label_2' := CustomLabel2,
          'custom_label_3' := CustomLabel3,
          'custom_label_4' := CustomLabel4,
          'description' := Description,
          'google_product_category' := GoogleProductCategory,
          'ios_deep_link' := IosDeepLink,
          'link' := Link,
          'title' := Title,
          'visibility' := Visibility
        }) ->
    #{ 'android_deep_link' => AndroidDeepLink,
       'custom_label_0' => CustomLabel0,
       'custom_label_1' => CustomLabel1,
       'custom_label_2' => CustomLabel2,
       'custom_label_3' => CustomLabel3,
       'custom_label_4' => CustomLabel4,
       'description' => Description,
       'google_product_category' => GoogleProductCategory,
       'ios_deep_link' => IosDeepLink,
       'link' => Link,
       'title' => Title,
       'visibility' => Visibility
     }.
