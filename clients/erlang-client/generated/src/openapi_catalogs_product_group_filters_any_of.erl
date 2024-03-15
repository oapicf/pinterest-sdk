-module(openapi_catalogs_product_group_filters_any_of).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_filters_any_of/0]).

-type openapi_catalogs_product_group_filters_any_of() ::
    #{ 'any_of' := list()
     }.

encode(#{ 'any_of' := AnyOf
        }) ->
    #{ 'any_of' => AnyOf
     }.
