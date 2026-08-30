-module(openapi_catalogs_product_group_filters_request_any_of_items0).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_filters_request_any_of_items0/0]).

-type openapi_catalogs_product_group_filters_request_any_of_items0() ::
    #{ 'any_of' := list()
     }.

encode(#{ 'any_of' := AnyOf
        }) ->
    #{ 'any_of' => AnyOf
     }.
