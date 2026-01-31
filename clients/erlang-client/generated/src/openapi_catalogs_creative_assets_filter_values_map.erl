-module(openapi_catalogs_creative_assets_filter_values_map).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_filter_values_map/0]).

-type openapi_catalogs_creative_assets_filter_values_map() ::
    #{ 'custom_label_0' => list(),
       'custom_label_1' => list(),
       'custom_label_2' => list(),
       'custom_label_3' => list(),
       'custom_label_4' => list(),
       'google_product_category_0' => list(),
       'google_product_category_1' => list(),
       'google_product_category_2' => list(),
       'google_product_category_3' => list(),
       'google_product_category_4' => list(),
       'google_product_category_5' => list(),
       'google_product_category_6' => list(),
       'media_type' => list()
     }.

encode(#{ 'custom_label_0' := CustomLabel0,
          'custom_label_1' := CustomLabel1,
          'custom_label_2' := CustomLabel2,
          'custom_label_3' := CustomLabel3,
          'custom_label_4' := CustomLabel4,
          'google_product_category_0' := GoogleProductCategory0,
          'google_product_category_1' := GoogleProductCategory1,
          'google_product_category_2' := GoogleProductCategory2,
          'google_product_category_3' := GoogleProductCategory3,
          'google_product_category_4' := GoogleProductCategory4,
          'google_product_category_5' := GoogleProductCategory5,
          'google_product_category_6' := GoogleProductCategory6,
          'media_type' := MediaType
        }) ->
    #{ 'custom_label_0' => CustomLabel0,
       'custom_label_1' => CustomLabel1,
       'custom_label_2' => CustomLabel2,
       'custom_label_3' => CustomLabel3,
       'custom_label_4' => CustomLabel4,
       'google_product_category_0' => GoogleProductCategory0,
       'google_product_category_1' => GoogleProductCategory1,
       'google_product_category_2' => GoogleProductCategory2,
       'google_product_category_3' => GoogleProductCategory3,
       'google_product_category_4' => GoogleProductCategory4,
       'google_product_category_5' => GoogleProductCategory5,
       'google_product_category_6' => GoogleProductCategory6,
       'media_type' => MediaType
     }.
