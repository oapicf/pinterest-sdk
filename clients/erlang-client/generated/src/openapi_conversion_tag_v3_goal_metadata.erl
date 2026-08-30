-module(openapi_conversion_tag_v3_goal_metadata).

-export([encode/1]).

-export_type([openapi_conversion_tag_v3_goal_metadata/0]).

-type openapi_conversion_tag_v3_goal_metadata() ::
    #{ 'attribution_windows' => openapi_attribution_windows:openapi_attribution_windows(),
       'conversion_event' => openapi_conversion_event:openapi_conversion_event(),
       'conversion_tag_id' => binary(),
       'cpa_goal_value_in_micro_currency' => binary(),
       'is_roas_optimized' => boolean(),
       'reporting_event' => binary()
     }.

encode(#{ 'attribution_windows' := AttributionWindows,
          'conversion_event' := ConversionEvent,
          'conversion_tag_id' := ConversionTagId,
          'cpa_goal_value_in_micro_currency' := CpaGoalValueInMicroCurrency,
          'is_roas_optimized' := IsRoasOptimized,
          'reporting_event' := ReportingEvent
        }) ->
    #{ 'attribution_windows' => AttributionWindows,
       'conversion_event' => ConversionEvent,
       'conversion_tag_id' => ConversionTagId,
       'cpa_goal_value_in_micro_currency' => CpaGoalValueInMicroCurrency,
       'is_roas_optimized' => IsRoasOptimized,
       'reporting_event' => ReportingEvent
     }.
