-module(openapi_local_inventory_items_get).

-export([encode/1]).

-export_type([openapi_local_inventory_items_get/0]).

-type openapi_local_inventory_items_get() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
