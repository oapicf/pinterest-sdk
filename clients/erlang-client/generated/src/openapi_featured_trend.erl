-module(openapi_featured_trend).

-export([encode/1]).

-export_type([openapi_featured_trend/0]).

-type openapi_featured_trend() ::
    #{ 'interest' := openapi_interests_enum:openapi_interests_enum(),
       'market' => openapi_product_category_region:openapi_product_category_region(),
       'trends' => list()
     }.

encode(#{ 'interest' := Interest,
          'market' := Market,
          'trends' := Trends
        }) ->
    #{ 'interest' => Interest,
       'market' => Market,
       'trends' => Trends
     }.
