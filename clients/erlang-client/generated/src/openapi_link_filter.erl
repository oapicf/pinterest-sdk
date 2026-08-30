-module(openapi_link_filter).

-export([encode/1]).

-export_type([openapi_link_filter/0]).

-type openapi_link_filter() ::
    #{ 'LINK' := openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria()
     }.

encode(#{ 'LINK' := LINK
        }) ->
    #{ 'LINK' => LINK
     }.
