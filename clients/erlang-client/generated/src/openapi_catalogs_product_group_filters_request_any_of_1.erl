-module(openapi_catalogs_product_group_filters_request_any_of_1).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_filters_request_any_of_1/0]).

-type openapi_catalogs_product_group_filters_request_any_of_1() ::
    #{ 'all_of' := list()
     }.

encode(#{ 'all_of' := AllOf
        }) ->
    #{ 'all_of' => AllOf
     }.
