-module(openapi_budget_type).

-include("openapi.hrl").

-export([openapi_budget_type/0]).

-export_type([openapi_budget_type/0]).

-type openapi_budget_type() ::
  binary().

openapi_budget_type() ->
  elements([<<"DAILY">>, <<"LIFETIME">>, <<"CBO_ADGROUP">>]).

