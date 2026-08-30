-module(openapi_local_inventory_items_batch_create).

-export([encode/1]).

-export_type([openapi_local_inventory_items_batch_create/0]).

-type openapi_local_inventory_items_batch_create() ::
    #{ 'operations' := list()
     }.

encode(#{ 'operations' := Operations
        }) ->
    #{ 'operations' => Operations
     }.
