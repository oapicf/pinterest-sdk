-module(openapi_campaign_planning_conversion_attribution_window_days).

-include("openapi.hrl").

-export([openapi_campaign_planning_conversion_attribution_window_days/0]).

-export_type([openapi_campaign_planning_conversion_attribution_window_days/0]).

-type openapi_campaign_planning_conversion_attribution_window_days() ::
  binary().

openapi_campaign_planning_conversion_attribution_window_days() ->
  elements([<<"DAYS_0">>, <<"DAYS_1">>, <<"DAYS_7">>, <<"DAYS_30">>, <<"DAYS_60">>]).

