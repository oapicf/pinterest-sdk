-module(openapi_ad_group_delivery_estimates).

-export([encode/1]).

-export_type([openapi_ad_group_delivery_estimates/0]).

-type openapi_ad_group_delivery_estimates() ::
    #{ 'auto_targeting_enabled' => boolean(),
       'creative_types' => list(),
       'keywords' => list(),
       'monthly_frequency_cap' => integer(),
       'optimization_goal_metadata' => openapi_optimization_goal_metadata:openapi_optimization_goal_metadata(),
       'optimization_type' => openapi_optimization_type:openapi_optimization_type(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'product_group_ids' => list(),
       'targeting_spec' => openapi_targeting_spec_optimal:openapi_targeting_spec_optimal()
     }.

encode(#{ 'auto_targeting_enabled' := AutoTargetingEnabled,
          'creative_types' := CreativeTypes,
          'keywords' := Keywords,
          'monthly_frequency_cap' := MonthlyFrequencyCap,
          'optimization_goal_metadata' := OptimizationGoalMetadata,
          'optimization_type' := OptimizationType,
          'placement_group' := PlacementGroup,
          'product_group_ids' := ProductGroupIds,
          'targeting_spec' := TargetingSpec
        }) ->
    #{ 'auto_targeting_enabled' => AutoTargetingEnabled,
       'creative_types' => CreativeTypes,
       'keywords' => Keywords,
       'monthly_frequency_cap' => MonthlyFrequencyCap,
       'optimization_goal_metadata' => OptimizationGoalMetadata,
       'optimization_type' => OptimizationType,
       'placement_group' => PlacementGroup,
       'product_group_ids' => ProductGroupIds,
       'targeting_spec' => TargetingSpec
     }.
