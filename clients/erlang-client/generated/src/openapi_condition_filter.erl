-module(openapi_condition_filter).

-export([encode/1]).

-export_type([openapi_condition_filter/0]).

-type openapi_condition_filter() ::
    #{ 'CONDITION' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'CONDITION' := CONDITION
        }) ->
    #{ 'CONDITION' => CONDITION
     }.
