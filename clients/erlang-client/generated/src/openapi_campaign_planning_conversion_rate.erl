-module(openapi_campaign_planning_conversion_rate).

-export([encode/1]).

-export_type([openapi_campaign_planning_conversion_rate/0]).

-type openapi_campaign_planning_conversion_rate() ::
    #{ 'attribution_windows' := openapi_campaign_planning_conversion_attribution:openapi_campaign_planning_conversion_attribution(),
       'conversion_event' := openapi_campaign_planning_conversion_event:openapi_campaign_planning_conversion_event(),
       'conversion_rate' := integer()
     }.

encode(#{ 'attribution_windows' := AttributionWindows,
          'conversion_event' := ConversionEvent,
          'conversion_rate' := ConversionRate
        }) ->
    #{ 'attribution_windows' => AttributionWindows,
       'conversion_event' => ConversionEvent,
       'conversion_rate' => ConversionRate
     }.
