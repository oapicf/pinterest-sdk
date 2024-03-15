-module(openapi_ad_group_update_request).

-export([encode/1]).

-export_type([openapi_ad_group_update_request/0]).

-type openapi_ad_group_update_request() ::
    #{ 'name' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'budget_in_micro_currency' => integer(),
       'bid_in_micro_currency' => integer(),
       'optimization_goal_metadata' => openapi_ad_group_common_optimization_goal_metadata:openapi_ad_group_common_optimization_goal_metadata(),
       'budget_type' => openapi_budget_type:openapi_budget_type(),
       'start_time' => integer(),
       'end_time' => integer(),
       'targeting_spec' => openapi_targeting_spec:openapi_targeting_spec(),
       'lifetime_frequency_cap' => integer(),
       'tracking_urls' => openapi_ad_group_common_tracking_urls:openapi_ad_group_common_tracking_urls(),
       'auto_targeting_enabled' => boolean(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'pacing_delivery_type' => openapi_pacing_delivery_type:openapi_pacing_delivery_type(),
       'campaign_id' => binary(),
       'billable_event' => openapi_action_type:openapi_action_type(),
       'bid_strategy_type' => binary(),
       'id' := binary()
     }.

encode(#{ 'name' := Name,
          'status' := Status,
          'budget_in_micro_currency' := BudgetInMicroCurrency,
          'bid_in_micro_currency' := BidInMicroCurrency,
          'optimization_goal_metadata' := OptimizationGoalMetadata,
          'budget_type' := BudgetType,
          'start_time' := StartTime,
          'end_time' := EndTime,
          'targeting_spec' := TargetingSpec,
          'lifetime_frequency_cap' := LifetimeFrequencyCap,
          'tracking_urls' := TrackingUrls,
          'auto_targeting_enabled' := AutoTargetingEnabled,
          'placement_group' := PlacementGroup,
          'pacing_delivery_type' := PacingDeliveryType,
          'campaign_id' := CampaignId,
          'billable_event' := BillableEvent,
          'bid_strategy_type' := BidStrategyType,
          'id' := Id
        }) ->
    #{ 'name' => Name,
       'status' => Status,
       'budget_in_micro_currency' => BudgetInMicroCurrency,
       'bid_in_micro_currency' => BidInMicroCurrency,
       'optimization_goal_metadata' => OptimizationGoalMetadata,
       'budget_type' => BudgetType,
       'start_time' => StartTime,
       'end_time' => EndTime,
       'targeting_spec' => TargetingSpec,
       'lifetime_frequency_cap' => LifetimeFrequencyCap,
       'tracking_urls' => TrackingUrls,
       'auto_targeting_enabled' => AutoTargetingEnabled,
       'placement_group' => PlacementGroup,
       'pacing_delivery_type' => PacingDeliveryType,
       'campaign_id' => CampaignId,
       'billable_event' => BillableEvent,
       'bid_strategy_type' => BidStrategyType,
       'id' => Id
     }.
