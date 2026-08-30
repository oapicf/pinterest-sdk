-module(openapi_catalogs_feed_processing_result).

-export([encode/1]).

-export_type([openapi_catalogs_feed_processing_result/0]).

-type openapi_catalogs_feed_processing_result() ::
    #{ 'created_at' := openapi_date_time:openapi_date_time(),
       'id' := binary(),
       'ingestion_details' := openapi_catalogs_feed_ingestion_details:openapi_catalogs_feed_ingestion_details(),
       'product_counts' := openapi_catalogs_feed_product_counts:openapi_catalogs_feed_product_counts(),
       'status' := openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status(),
       'updated_at' := openapi_date_time:openapi_date_time(),
       'validation_details' := openapi_catalogs_feed_validation_details:openapi_catalogs_feed_validation_details(),
       'video_counts' => openapi_catalogs_feed_video_counts:openapi_catalogs_feed_video_counts()
     }.

encode(#{ 'created_at' := CreatedAt,
          'id' := Id,
          'ingestion_details' := IngestionDetails,
          'product_counts' := ProductCounts,
          'status' := Status,
          'updated_at' := UpdatedAt,
          'validation_details' := ValidationDetails,
          'video_counts' := VideoCounts
        }) ->
    #{ 'created_at' => CreatedAt,
       'id' => Id,
       'ingestion_details' => IngestionDetails,
       'product_counts' => ProductCounts,
       'status' => Status,
       'updated_at' => UpdatedAt,
       'validation_details' => ValidationDetails,
       'video_counts' => VideoCounts
     }.
