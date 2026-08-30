-module(openapi_workload_state).

-include("openapi.hrl").

-export([openapi_workload_state/0]).

-export_type([openapi_workload_state/0]).

-type openapi_workload_state() ::
  binary().

openapi_workload_state() ->
  elements([<<"NOT_STARTED">>, <<"RUNNING">>, <<"PAUSED">>, <<"SUCCEEDED">>, <<"FAILED">>]).

