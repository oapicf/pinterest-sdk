-module(openapi_campaign_planning_confidence_level_alert_severity).

-include("openapi.hrl").

-export([openapi_campaign_planning_confidence_level_alert_severity/0]).

-export_type([openapi_campaign_planning_confidence_level_alert_severity/0]).

-type openapi_campaign_planning_confidence_level_alert_severity() ::
  binary().

openapi_campaign_planning_confidence_level_alert_severity() ->
  elements([<<"UNKNOWN">>, <<"LOW_MILD">>, <<"LOW_MODERATE">>, <<"LOW_SEVERE">>]).

