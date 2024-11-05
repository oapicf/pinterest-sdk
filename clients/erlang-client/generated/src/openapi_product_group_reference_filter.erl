-module(openapi_product_group_reference_filter).

-export([encode/1]).

-export_type([openapi_product_group_reference_filter/0]).

-type openapi_product_group_reference_filter() ::
    #{ 'PRODUCT_GROUP' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'PRODUCT_GROUP' := PRODUCTGROUP
        }) ->
    #{ 'PRODUCT_GROUP' => PRODUCTGROUP
     }.
