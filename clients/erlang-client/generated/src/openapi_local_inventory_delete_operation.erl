-module(openapi_local_inventory_delete_operation).

-export([encode/1]).

-export_type([openapi_local_inventory_delete_operation/0]).

-type openapi_local_inventory_delete_operation() ::
    #{ 'item_id' := binary(),
       'operation' := binary(),
       'store_code' := binary()
     }.

encode(#{ 'item_id' := ItemId,
          'operation' := Operation,
          'store_code' := StoreCode
        }) ->
    #{ 'item_id' => ItemId,
       'operation' => Operation,
       'store_code' => StoreCode
     }.
