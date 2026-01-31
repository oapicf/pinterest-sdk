-module(openapi_custom_number1_filter).

-export([encode/1]).

-export_type([openapi_custom_number1_filter/0]).

-type openapi_custom_number1_filter() ::
    #{ 'CUSTOM_NUMBER_1' := openapi_catalogs_product_group_uint32_criteria:openapi_catalogs_product_group_uint32_criteria()
     }.

encode(#{ 'CUSTOM_NUMBER_1' := CUSTOMNUMBER1
        }) ->
    #{ 'CUSTOM_NUMBER_1' => CUSTOMNUMBER1
     }.
