-module(openapi_integration_log_event_type).

-include("openapi.hrl").

-export([openapi_integration_log_event_type/0]).

-export_type([openapi_integration_log_event_type/0]).

-type openapi_integration_log_event_type() ::
  binary().

openapi_integration_log_event_type() ->
  elements([<<"APP">>, <<"API">>]).

