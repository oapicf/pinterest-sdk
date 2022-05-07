-module(openapi_gender_filter).

-export([encode/1]).

-export_type([openapi_gender_filter/0]).

-type openapi_gender_filter() ::
    #{ 'GENDER' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'GENDER' := GENDER
        }) ->
    #{ 'GENDER' => GENDER
     }.
