-module(openapi_catalogs_items_batch).

-export([encode/1]).

-export_type([openapi_catalogs_items_batch/0]).

-type openapi_catalogs_items_batch() ::
    #{ 'items' => list(),
       'batch_id' => binary(),
       'created_time' => openapi_date_time:openapi_date_time(),
       'completed_time' => openapi_date_time:openapi_date_time(),
       'status' => openapi_batch_operation_status:openapi_batch_operation_status()
     }.

encode(#{ 'items' := Items,
          'batch_id' := BatchId,
          'created_time' := CreatedTime,
          'completed_time' := CompletedTime,
          'status' := Status
        }) ->
    #{ 'items' => Items,
       'batch_id' => BatchId,
       'created_time' => CreatedTime,
       'completed_time' => CompletedTime,
       'status' => Status
     }.
