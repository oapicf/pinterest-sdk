-module(openapi_catalogs_hotel_items_batch).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_items_batch/0]).

-type openapi_catalogs_hotel_items_batch() ::
    #{ 'batch_id' => binary(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'completed_time' => openapi_date_time:openapi_date_time(),
       'created_time' => openapi_date_time:openapi_date_time(),
       'items' => list(),
       'status' => openapi_batch_operation_status:openapi_batch_operation_status()
     }.

encode(#{ 'batch_id' := BatchId,
          'catalog_type' := CatalogType,
          'completed_time' := CompletedTime,
          'created_time' := CreatedTime,
          'items' := Items,
          'status' := Status
        }) ->
    #{ 'batch_id' => BatchId,
       'catalog_type' => CatalogType,
       'completed_time' => CompletedTime,
       'created_time' => CreatedTime,
       'items' => Items,
       'status' => Status
     }.
