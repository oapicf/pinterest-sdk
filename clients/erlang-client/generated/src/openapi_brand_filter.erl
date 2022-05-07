-module(openapi_brand_filter).

-export([encode/1]).

-export_type([openapi_brand_filter/0]).

-type openapi_brand_filter() ::
    #{ 'BRAND' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'BRAND' := BRAND
        }) ->
    #{ 'BRAND' => BRAND
     }.
