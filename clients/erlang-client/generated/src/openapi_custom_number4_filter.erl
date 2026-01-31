-module(openapi_custom_number4_filter).

-export([encode/1]).

-export_type([openapi_custom_number4_filter/0]).

-type openapi_custom_number4_filter() ::
    #{ 'CUSTOM_NUMBER_4' := openapi_catalogs_product_group_uint32_criteria:openapi_catalogs_product_group_uint32_criteria()
     }.

encode(#{ 'CUSTOM_NUMBER_4' := CUSTOMNUMBER4
        }) ->
    #{ 'CUSTOM_NUMBER_4' => CUSTOMNUMBER4
     }.
