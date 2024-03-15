-module(openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata).

-export([encode/1]).

-export_type([openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata/0]).

-type openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata() ::
    #{ 'attribution_windows' => openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows:openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows(),
       'conversion_event' => binary(),
       'conversion_tag_id' => binary(),
       'cpa_goal_value_in_micro_currency' => binary(),
       'is_roas_optimized' => boolean(),
       'learning_mode_type' => binary()
     }.

encode(#{ 'attribution_windows' := AttributionWindows,
          'conversion_event' := ConversionEvent,
          'conversion_tag_id' := ConversionTagId,
          'cpa_goal_value_in_micro_currency' := CpaGoalValueInMicroCurrency,
          'is_roas_optimized' := IsRoasOptimized,
          'learning_mode_type' := LearningModeType
        }) ->
    #{ 'attribution_windows' => AttributionWindows,
       'conversion_event' => ConversionEvent,
       'conversion_tag_id' => ConversionTagId,
       'cpa_goal_value_in_micro_currency' => CpaGoalValueInMicroCurrency,
       'is_roas_optimized' => IsRoasOptimized,
       'learning_mode_type' => LearningModeType
     }.
