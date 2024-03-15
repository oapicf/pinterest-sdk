-module(openapi_catalogs_hotel_product_group_filters).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product_group_filters/0]).

-type openapi_catalogs_hotel_product_group_filters() ::
    #{ 'any_of' := list(),
       'all_of' := list()
     }.

encode(#{ 'any_of' := AnyOf,
          'all_of' := AllOf
        }) ->
    #{ 'any_of' => AnyOf,
       'all_of' => AllOf
     }.
