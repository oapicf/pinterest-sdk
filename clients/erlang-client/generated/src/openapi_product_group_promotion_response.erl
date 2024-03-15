-module(openapi_product_group_promotion_response).

-export([encode/1]).

-export_type([openapi_product_group_promotion_response/0]).

-type openapi_product_group_promotion_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
