-module(openapi_catalogs_hotel_filter_values_map).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_filter_values_map/0]).

-type openapi_catalogs_hotel_filter_values_map() ::
    #{ 'brand' => list(),
       'custom_label_0' => list(),
       'custom_label_1' => list(),
       'custom_label_2' => list(),
       'custom_label_3' => list(),
       'custom_label_4' => list()
     }.

encode(#{ 'brand' := Brand,
          'custom_label_0' := CustomLabel0,
          'custom_label_1' := CustomLabel1,
          'custom_label_2' := CustomLabel2,
          'custom_label_3' := CustomLabel3,
          'custom_label_4' := CustomLabel4
        }) ->
    #{ 'brand' => Brand,
       'custom_label_0' => CustomLabel0,
       'custom_label_1' => CustomLabel1,
       'custom_label_2' => CustomLabel2,
       'custom_label_3' => CustomLabel3,
       'custom_label_4' => CustomLabel4
     }.
