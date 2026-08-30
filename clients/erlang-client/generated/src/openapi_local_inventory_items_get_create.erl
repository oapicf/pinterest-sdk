-module(openapi_local_inventory_items_get_create).

-export([encode/1]).

-export_type([openapi_local_inventory_items_get_create/0]).

-type openapi_local_inventory_items_get_create() ::
    #{ 'item_filters' := list()
     }.

encode(#{ 'item_filters' := ItemFilters
        }) ->
    #{ 'item_filters' => ItemFilters
     }.
