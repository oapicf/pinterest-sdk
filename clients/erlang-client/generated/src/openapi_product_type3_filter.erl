-module(openapi_product_type3_filter).

-export([encode/1]).

-export_type([openapi_product_type3_filter/0]).

-type openapi_product_type3_filter() ::
    #{ 'PRODUCT_TYPE_3' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria()
     }.

encode(#{ 'PRODUCT_TYPE_3' := PRODUCTTYPE3
        }) ->
    #{ 'PRODUCT_TYPE_3' => PRODUCTTYPE3
     }.
