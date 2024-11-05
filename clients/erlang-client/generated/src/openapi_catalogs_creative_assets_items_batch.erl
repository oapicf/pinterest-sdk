-module(openapi_catalogs_creative_assets_items_batch).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_items_batch/0]).

-type openapi_catalogs_creative_assets_items_batch() ::
    #{ 'batch_id' => binary(),
       'created_time' => openapi_date_time:openapi_date_time(),
       'completed_time' => openapi_date_time:openapi_date_time(),
       'status' => openapi_batch_operation_status:openapi_batch_operation_status(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'items' => list()
     }.

encode(#{ 'batch_id' := BatchId,
          'created_time' := CreatedTime,
          'completed_time' := CompletedTime,
          'status' := Status,
          'catalog_type' := CatalogType,
          'items' := Items
        }) ->
    #{ 'batch_id' => BatchId,
       'created_time' => CreatedTime,
       'completed_time' => CompletedTime,
       'status' => Status,
       'catalog_type' => CatalogType,
       'items' => Items
     }.
