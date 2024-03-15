-module(openapi_ad_group_common_optimization_goal_metadata).

-export([encode/1]).

-export_type([openapi_ad_group_common_optimization_goal_metadata/0]).

-type openapi_ad_group_common_optimization_goal_metadata() ::
    #{ 'conversion_tag_v3_goal_metadata' => openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata:openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata(),
       'frequency_goal_metadata' => openapi_optimization_goal_metadata_frequency_goal_metadata:openapi_optimization_goal_metadata_frequency_goal_metadata(),
       'scrollup_goal_metadata' => openapi_optimization_goal_metadata_scrollup_goal_metadata:openapi_optimization_goal_metadata_scrollup_goal_metadata()
     }.

encode(#{ 'conversion_tag_v3_goal_metadata' := ConversionTagV3GoalMetadata,
          'frequency_goal_metadata' := FrequencyGoalMetadata,
          'scrollup_goal_metadata' := ScrollupGoalMetadata
        }) ->
    #{ 'conversion_tag_v3_goal_metadata' => ConversionTagV3GoalMetadata,
       'frequency_goal_metadata' => FrequencyGoalMetadata,
       'scrollup_goal_metadata' => ScrollupGoalMetadata
     }.
