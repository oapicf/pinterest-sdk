-module(openapi_local_inventory_items_batch).

-export([encode/1]).

-export_type([openapi_local_inventory_items_batch/0]).

-type openapi_local_inventory_items_batch() ::
    #{ 'batch_id' := binary(),
       'completed_time' => openapi_date_time:openapi_date_time(),
       'created_time' := openapi_date_time:openapi_date_time(),
       'operation_results' := list(),
       'status' := openapi_supplemental_item_batch_operation_status:openapi_supplemental_item_batch_operation_status()
     }.

encode(#{ 'batch_id' := BatchId,
          'completed_time' := CompletedTime,
          'created_time' := CreatedTime,
          'operation_results' := OperationResults,
          'status' := Status
        }) ->
    #{ 'batch_id' => BatchId,
       'completed_time' => CompletedTime,
       'created_time' => CreatedTime,
       'operation_results' => OperationResults,
       'status' => Status
     }.
