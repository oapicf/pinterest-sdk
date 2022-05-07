-module(openapi_catalogs_feed_processing_result_fields).

-export([encode/1]).

-export_type([openapi_catalogs_feed_processing_result_fields/0]).

-type openapi_catalogs_feed_processing_result_fields() ::
    #{ 'ingestion_details' := openapi_catalogs_feed_ingestion_details:openapi_catalogs_feed_ingestion_details(),
       'status' := openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status(),
       'product_counts' := openapi_catalogs_feed_product_counts:openapi_catalogs_feed_product_counts(),
       'validation_details' := openapi_catalogs_feed_validation_details:openapi_catalogs_feed_validation_details()
     }.

encode(#{ 'ingestion_details' := IngestionDetails,
          'status' := Status,
          'product_counts' := ProductCounts,
          'validation_details' := ValidationDetails
        }) ->
    #{ 'ingestion_details' => IngestionDetails,
       'status' => Status,
       'product_counts' => ProductCounts,
       'validation_details' => ValidationDetails
     }.
