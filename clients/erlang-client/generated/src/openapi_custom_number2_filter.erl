-module(openapi_custom_number2_filter).

-export([encode/1]).

-export_type([openapi_custom_number2_filter/0]).

-type openapi_custom_number2_filter() ::
    #{ 'CUSTOM_NUMBER_2' := openapi_catalogs_product_group_uint32_criteria:openapi_catalogs_product_group_uint32_criteria()
     }.

encode(#{ 'CUSTOM_NUMBER_2' := CUSTOMNUMBER2
        }) ->
    #{ 'CUSTOM_NUMBER_2' => CUSTOMNUMBER2
     }.
