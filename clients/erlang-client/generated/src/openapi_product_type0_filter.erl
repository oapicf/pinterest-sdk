-module(openapi_product_type0_filter).

-export([encode/1]).

-export_type([openapi_product_type0_filter/0]).

-type openapi_product_type0_filter() ::
    #{ 'PRODUCT_TYPE_0' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria()
     }.

encode(#{ 'PRODUCT_TYPE_0' := PRODUCTTYPE0
        }) ->
    #{ 'PRODUCT_TYPE_0' => PRODUCTTYPE0
     }.
