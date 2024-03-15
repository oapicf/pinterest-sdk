-module(openapi_catalogs_feed_ingestion_details).

-export([encode/1]).

-export_type([openapi_catalogs_feed_ingestion_details/0]).

-type openapi_catalogs_feed_ingestion_details() ::
    #{ 'errors' := openapi_catalogs_feed_ingestion_errors:openapi_catalogs_feed_ingestion_errors(),
       'info' := openapi_catalogs_feed_ingestion_info:openapi_catalogs_feed_ingestion_info(),
       'warnings' := openapi_catalogs_feed_ingestion_warnings:openapi_catalogs_feed_ingestion_warnings()
     }.

encode(#{ 'errors' := Errors,
          'info' := Info,
          'warnings' := Warnings
        }) ->
    #{ 'errors' => Errors,
       'info' => Info,
       'warnings' => Warnings
     }.
