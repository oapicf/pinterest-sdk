-module(openapi_catalogs_feed_processing_status).

-include("openapi.hrl").

-export([openapi_catalogs_feed_processing_status/0]).

-export_type([openapi_catalogs_feed_processing_status/0]).

-type openapi_catalogs_feed_processing_status() ::
  binary().

openapi_catalogs_feed_processing_status() ->
  elements([<<"COMPLETED">>, <<"COMPLETED_EARLY">>, <<"DISAPPROVED">>, <<"FAILED">>, <<"PROCESSING">>, <<"QUEUED_FOR_PROCESSING">>, <<"UNDER_APPEAL">>, <<"UNDER_REVIEW">>]).

