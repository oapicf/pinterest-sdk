-module(openapi_product_type1_filter).

-export([encode/1]).

-export_type([openapi_product_type1_filter/0]).

-type openapi_product_type1_filter() ::
    #{ 'PRODUCT_TYPE_1' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria()
     }.

encode(#{ 'PRODUCT_TYPE_1' := PRODUCTTYPE1
        }) ->
    #{ 'PRODUCT_TYPE_1' => PRODUCTTYPE1
     }.
