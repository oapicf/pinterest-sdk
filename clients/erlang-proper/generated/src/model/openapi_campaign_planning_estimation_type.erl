-module(openapi_campaign_planning_estimation_type).

-include("openapi.hrl").

-export([openapi_campaign_planning_estimation_type/0]).

-export_type([openapi_campaign_planning_estimation_type/0]).

-type openapi_campaign_planning_estimation_type() ::
  binary().

openapi_campaign_planning_estimation_type() ->
  elements([<<"IMPRESSION">>, <<"CLICK">>, <<"CONVERSION">>, <<"WEEKLY_FREQUENCY">>, <<"WEEKLY_REACH">>, <<"LIFETIME_FREQUENCY">>, <<"LIFETIME_REACH">>, <<"CPM">>, <<"CPC">>, <<"CPA">>]).

