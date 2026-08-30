-module(openapi_integration_log_level).

-include("openapi.hrl").

-export([openapi_integration_log_level/0]).

-export_type([openapi_integration_log_level/0]).

-type openapi_integration_log_level() ::
  binary().

openapi_integration_log_level() ->
  elements([<<"INFO">>, <<"WARN">>, <<"ERROR">>]).

