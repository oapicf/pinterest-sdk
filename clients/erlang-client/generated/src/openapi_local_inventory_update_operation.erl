-module(openapi_local_inventory_update_operation).

-export([encode/1]).

-export_type([openapi_local_inventory_update_operation/0]).

-type openapi_local_inventory_update_operation() ::
    #{ 'attributes' := openapi_retail_local_inventory_item_attributes_optional:openapi_retail_local_inventory_item_attributes_optional(),
       'item_id' := binary(),
       'operation' := binary(),
       'store_code' := binary()
     }.

encode(#{ 'attributes' := Attributes,
          'item_id' := ItemId,
          'operation' := Operation,
          'store_code' := StoreCode
        }) ->
    #{ 'attributes' => Attributes,
       'item_id' => ItemId,
       'operation' => Operation,
       'store_code' => StoreCode
     }.
