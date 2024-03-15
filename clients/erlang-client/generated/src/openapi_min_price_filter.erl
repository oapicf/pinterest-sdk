-module(openapi_min_price_filter).

-export([encode/1]).

-export_type([openapi_min_price_filter/0]).

-type openapi_min_price_filter() ::
    #{ 'MIN_PRICE' := openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria()
     }.

encode(#{ 'MIN_PRICE' := MINPRICE
        }) ->
    #{ 'MIN_PRICE' => MINPRICE
     }.
