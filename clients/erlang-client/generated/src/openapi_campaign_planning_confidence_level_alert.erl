-module(openapi_campaign_planning_confidence_level_alert).

-export([encode/1]).

-export_type([openapi_campaign_planning_confidence_level_alert/0]).

-type openapi_campaign_planning_confidence_level_alert() ::
    #{ 'description' => binary(),
       'reason' => openapi_campaign_planning_confidence_level_alert_reason:openapi_campaign_planning_confidence_level_alert_reason(),
       'severity' => openapi_campaign_planning_confidence_level_alert_severity:openapi_campaign_planning_confidence_level_alert_severity()
     }.

encode(#{ 'description' := Description,
          'reason' := Reason,
          'severity' := Severity
        }) ->
    #{ 'description' => Description,
       'reason' => Reason,
       'severity' => Severity
     }.
