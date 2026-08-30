-module(openapi_campaign_planning_confidence_level_alert).

-include("openapi.hrl").

-export([openapi_campaign_planning_confidence_level_alert/0]).

-export([openapi_campaign_planning_confidence_level_alert/1]).

-export_type([openapi_campaign_planning_confidence_level_alert/0]).

-type openapi_campaign_planning_confidence_level_alert() ::
  [ {'description', binary() }
  | {'reason', openapi_campaign_planning_confidence_level_alert_reason:openapi_campaign_planning_confidence_level_alert_reason() }
  | {'severity', openapi_campaign_planning_confidence_level_alert_severity:openapi_campaign_planning_confidence_level_alert_severity() }
  ].


openapi_campaign_planning_confidence_level_alert() ->
    openapi_campaign_planning_confidence_level_alert([]).

openapi_campaign_planning_confidence_level_alert(Fields) ->
  Default = [ {'description', binary() }
            , {'reason', openapi_campaign_planning_confidence_level_alert_reason:openapi_campaign_planning_confidence_level_alert_reason() }
            , {'severity', openapi_campaign_planning_confidence_level_alert_severity:openapi_campaign_planning_confidence_level_alert_severity() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

