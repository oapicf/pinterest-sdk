-module(openapi_schedule_action).

-include("openapi.hrl").

-export([openapi_schedule_action/0]).

-export_type([openapi_schedule_action/0]).

-type openapi_schedule_action() ::
  binary().

openapi_schedule_action() ->
  elements([<<"INCREASE_BY_VALUE">>, <<"INCREASE_BY_PERCENT">>]).

