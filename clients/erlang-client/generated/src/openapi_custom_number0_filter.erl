-module(openapi_custom_number0_filter).

-export([encode/1]).

-export_type([openapi_custom_number0_filter/0]).

-type openapi_custom_number0_filter() ::
    #{ 'CUSTOM_NUMBER_0' := openapi_catalogs_product_group_uint32_criteria:openapi_catalogs_product_group_uint32_criteria()
     }.

encode(#{ 'CUSTOM_NUMBER_0' := CUSTOMNUMBER0
        }) ->
    #{ 'CUSTOM_NUMBER_0' => CUSTOMNUMBER0
     }.
