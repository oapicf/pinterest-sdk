-module(openapi_catalogs_items_batch).

-export([encode/1]).

-export_type([openapi_catalogs_items_batch/0]).

-type openapi_catalogs_items_batch() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'batch_id' => binary(),
       'completed_time' => openapi_date_time:openapi_date_time(),
       'created_time' := openapi_date_time:openapi_date_time(),
       'items' => list(),
       'status' => openapi_batch_operation_status:openapi_batch_operation_status()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'batch_id' := BatchId,
          'completed_time' := CompletedTime,
          'created_time' := CreatedTime,
          'items' := Items,
          'status' := Status
        }) ->
    #{ 'catalog_type' => CatalogType,
       'batch_id' => BatchId,
       'completed_time' => CompletedTime,
       'created_time' => CreatedTime,
       'items' => Items,
       'status' => Status
     }.
