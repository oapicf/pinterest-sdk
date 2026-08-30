-module(openapi_campaign_planning_confidence_level_alert_reason).

-include("openapi.hrl").

-export([openapi_campaign_planning_confidence_level_alert_reason/0]).

-export_type([openapi_campaign_planning_confidence_level_alert_reason/0]).

-type openapi_campaign_planning_confidence_level_alert_reason() ::
  binary().

openapi_campaign_planning_confidence_level_alert_reason() ->
  elements([<<"UNKNOWN">>, <<"OTHER">>, <<"ADVERTISER_HAS_NO_RECENT_CAMPAIGNS">>, <<"ADVERTISER_HAS_NO_RECENT_CONVERSIONS">>]).

