-module(openapi_campaigns_analytics_metrics).

-export([encode/1]).

-export_type([openapi_campaigns_analytics_metrics/0]).

-type openapi_campaigns_analytics_metrics() ::
    #{ 'CAMPAIGN_ID' => binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'CAMPAIGN_ID' := CAMPAIGNID,
          'DATE' := DATE
        }) ->
    #{ 'CAMPAIGN_ID' => CAMPAIGNID,
       'DATE' => DATE
     }.
