-module(openapi_catalogs_feed_ingestion_details).

-include("openapi.hrl").

-export([openapi_catalogs_feed_ingestion_details/0]).

-export([openapi_catalogs_feed_ingestion_details/1]).

-export_type([openapi_catalogs_feed_ingestion_details/0]).

-type openapi_catalogs_feed_ingestion_details() ::
  [ {'errors', openapi_catalogs_feed_ingestion_errors:openapi_catalogs_feed_ingestion_errors() }
  | {'info', openapi_catalogs_feed_ingestion_info:openapi_catalogs_feed_ingestion_info() }
  | {'warnings', openapi_catalogs_feed_ingestion_warnings:openapi_catalogs_feed_ingestion_warnings() }
  ].


openapi_catalogs_feed_ingestion_details() ->
    openapi_catalogs_feed_ingestion_details([]).

openapi_catalogs_feed_ingestion_details(Fields) ->
  Default = [ {'errors', openapi_catalogs_feed_ingestion_errors:openapi_catalogs_feed_ingestion_errors() }
            , {'info', openapi_catalogs_feed_ingestion_info:openapi_catalogs_feed_ingestion_info() }
            , {'warnings', openapi_catalogs_feed_ingestion_warnings:openapi_catalogs_feed_ingestion_warnings() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

