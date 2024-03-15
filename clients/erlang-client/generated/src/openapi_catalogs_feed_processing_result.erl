-module(openapi_catalogs_feed_processing_result).

-export([encode/1]).

-export_type([openapi_catalogs_feed_processing_result/0]).

-type openapi_catalogs_feed_processing_result() ::
    #{ 'created_at' => openapi_date_time:openapi_date_time(),
       'id' => binary(),
       'updated_at' => openapi_date_time:openapi_date_time(),
       'ingestion_details' := openapi_catalogs_feed_ingestion_details:openapi_catalogs_feed_ingestion_details(),
       'status' := openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status(),
       'product_counts' := openapi_catalogs_feed_product_counts:openapi_catalogs_feed_product_counts(),
       'validation_details' := openapi_catalogs_feed_validation_details:openapi_catalogs_feed_validation_details()
     }.

encode(#{ 'created_at' := CreatedAt,
          'id' := Id,
          'updated_at' := UpdatedAt,
          'ingestion_details' := IngestionDetails,
          'status' := Status,
          'product_counts' := ProductCounts,
          'validation_details' := ValidationDetails
        }) ->
    #{ 'created_at' => CreatedAt,
       'id' => Id,
       'updated_at' => UpdatedAt,
       'ingestion_details' => IngestionDetails,
       'status' => Status,
       'product_counts' => ProductCounts,
       'validation_details' => ValidationDetails
     }.
