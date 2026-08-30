-module(openapi_local_inventory_operation_result).

-export([encode/1]).

-export_type([openapi_local_inventory_operation_result/0]).

-type openapi_local_inventory_operation_result() ::
    #{ 'errors' => list(),
       'item_id' := binary(),
       'status' := openapi_supplemental_item_processing_status:openapi_supplemental_item_processing_status(),
       'store_code' := binary(),
       'supplemental_type' := binary(),
       'warnings' => list()
     }.

encode(#{ 'errors' := Errors,
          'item_id' := ItemId,
          'status' := Status,
          'store_code' := StoreCode,
          'supplemental_type' := SupplementalType,
          'warnings' := Warnings
        }) ->
    #{ 'errors' => Errors,
       'item_id' => ItemId,
       'status' => Status,
       'store_code' => StoreCode,
       'supplemental_type' => SupplementalType,
       'warnings' => Warnings
     }.
