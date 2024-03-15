-module(openapi_catalogs_product_group_filters_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_filters_request/0]).

-type openapi_catalogs_product_group_filters_request() ::
    #{ 'any_of' := list(),
       'all_of' := list()
     }.

encode(#{ 'any_of' := AnyOf,
          'all_of' := AllOf
        }) ->
    #{ 'any_of' => AnyOf,
       'all_of' => AllOf
     }.
