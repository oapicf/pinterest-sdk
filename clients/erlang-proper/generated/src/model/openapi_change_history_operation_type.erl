-module(openapi_change_history_operation_type).

-include("openapi.hrl").

-export([openapi_change_history_operation_type/0]).

-export_type([openapi_change_history_operation_type/0]).

-type openapi_change_history_operation_type() ::
  binary().

openapi_change_history_operation_type() ->
  elements([<<"CREATE">>, <<"UPDATE">>, <<"DELETE">>]).

