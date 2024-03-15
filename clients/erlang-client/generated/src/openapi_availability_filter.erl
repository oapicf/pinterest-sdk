-module(openapi_availability_filter).

-export([encode/1]).

-export_type([openapi_availability_filter/0]).

-type openapi_availability_filter() ::
    #{ 'AVAILABILITY' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'AVAILABILITY' := AVAILABILITY
        }) ->
    #{ 'AVAILABILITY' => AVAILABILITY
     }.
