-module(openapi_schedule_type).

-include("openapi.hrl").

-export([openapi_schedule_type/0]).

-export_type([openapi_schedule_type/0]).

-type openapi_schedule_type() ::
  binary().

openapi_schedule_type() ->
  elements([<<"CAMPAIGN_BUDGET_CHANGE">>, <<"CAMPAIGN_BID_MULTIPLIERS">>]).

