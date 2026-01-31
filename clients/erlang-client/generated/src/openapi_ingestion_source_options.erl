-module(openapi_ingestion_source_options).

-export([encode/1]).

-export_type([openapi_ingestion_source_options/0]).

-type openapi_ingestion_source_options() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
