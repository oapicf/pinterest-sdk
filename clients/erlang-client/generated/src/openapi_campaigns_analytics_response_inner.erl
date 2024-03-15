-module(openapi_campaigns_analytics_response_inner).

-export([encode/1]).

-export_type([openapi_campaigns_analytics_response_inner/0]).

-type openapi_campaigns_analytics_response_inner() ::
    #{ 'CAMPAIGN_ID' := binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'CAMPAIGN_ID' := CAMPAIGNID,
          'DATE' := DATE
        }) ->
    #{ 'CAMPAIGN_ID' => CAMPAIGNID,
       'DATE' => DATE
     }.
