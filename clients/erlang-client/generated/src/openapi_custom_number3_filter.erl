-module(openapi_custom_number3_filter).

-export([encode/1]).

-export_type([openapi_custom_number3_filter/0]).

-type openapi_custom_number3_filter() ::
    #{ 'CUSTOM_NUMBER_3' := openapi_catalogs_product_group_uint32_criteria:openapi_catalogs_product_group_uint32_criteria()
     }.

encode(#{ 'CUSTOM_NUMBER_3' := CUSTOMNUMBER3
        }) ->
    #{ 'CUSTOM_NUMBER_3' => CUSTOMNUMBER3
     }.
