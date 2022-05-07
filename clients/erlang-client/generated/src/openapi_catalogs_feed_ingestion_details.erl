-module(openapi_catalogs_feed_ingestion_details).

-export([encode/1]).

-export_type([openapi_catalogs_feed_ingestion_details/0]).

-type openapi_catalogs_feed_ingestion_details() ::
    #{ 'errors' := openapi_catalogs_feed_ingestion_errors:openapi_catalogs_feed_ingestion_errors(),
       'info' := openapi_catalogs_feed_ingestion_info:openapi_catalogs_feed_ingestion_info()
     }.

encode(#{ 'errors' := Errors,
          'info' := Info
        }) ->
    #{ 'errors' => Errors,
       'info' => Info
     }.
