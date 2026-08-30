-module(openapi_budget_duration_type).

-include("openapi.hrl").

-export([openapi_budget_duration_type/0]).

-export_type([openapi_budget_duration_type/0]).

-type openapi_budget_duration_type() ::
  binary().

openapi_budget_duration_type() ->
  elements([<<"FIXED_DAILY">>, <<"FLEXIBLE_DAILY">>, <<"LIFETIME">>]).

