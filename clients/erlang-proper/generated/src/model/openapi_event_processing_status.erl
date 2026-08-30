-module(openapi_event_processing_status).

-include("openapi.hrl").

-export([openapi_event_processing_status/0]).

-export_type([openapi_event_processing_status/0]).

-type openapi_event_processing_status() ::
  binary().

openapi_event_processing_status() ->
  elements([<<"failed">>, <<"processed">>]).

