-module(openapi_product_group_promotions).

-export([encode/1]).

-export_type([openapi_product_group_promotions/0]).

-type openapi_product_group_promotions() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
