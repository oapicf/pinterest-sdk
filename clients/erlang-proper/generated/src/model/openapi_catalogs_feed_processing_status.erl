-module(openapi_catalogs_feed_processing_status).

-include("openapi.hrl").

-export([openapi_catalogs_feed_processing_status/0]).

-export_type([openapi_catalogs_feed_processing_status/0]).

-type openapi_catalogs_feed_processing_status() ::
  binary().

openapi_catalogs_feed_processing_status() ->
  elements([<<"COMPLETED">>, <<"FAILED">>, <<"PROCESSING">>]).

