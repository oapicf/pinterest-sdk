-module(openapi_ad_group_response_all_of).

-export([encode/1]).

-export_type([openapi_ad_group_response_all_of/0]).

-type openapi_ad_group_response_all_of() ::
    #{ 'name' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'budget_in_micro_currency' => integer(),
       'bid_in_micro_currency' => integer(),
       'budget_type' => binary(),
       'start_time' => integer(),
       'end_time' => integer(),
       'targeting_spec' => maps:map(),
       'lifetime_frequency_cap' => integer(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'auto_targeting_enabled' => boolean(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'pacing_delivery_type' => openapi_pacing_delivery_type:openapi_pacing_delivery_type(),
       'conversion_learning_mode_type' => binary(),
       'summary_status' => openapi_ad_group_summary_status:openapi_ad_group_summary_status(),
       'feed_profile_id' => binary()
     }.

encode(#{ 'name' := Name,
          'status' := Status,
          'budget_in_micro_currency' := BudgetInMicroCurrency,
          'bid_in_micro_currency' := BidInMicroCurrency,
          'budget_type' := BudgetType,
          'start_time' := StartTime,
          'end_time' := EndTime,
          'targeting_spec' := TargetingSpec,
          'lifetime_frequency_cap' := LifetimeFrequencyCap,
          'tracking_urls' := TrackingUrls,
          'auto_targeting_enabled' := AutoTargetingEnabled,
          'placement_group' := PlacementGroup,
          'pacing_delivery_type' := PacingDeliveryType,
          'conversion_learning_mode_type' := ConversionLearningModeType,
          'summary_status' := SummaryStatus,
          'feed_profile_id' := FeedProfileId
        }) ->
    #{ 'name' => Name,
       'status' => Status,
       'budget_in_micro_currency' => BudgetInMicroCurrency,
       'bid_in_micro_currency' => BidInMicroCurrency,
       'budget_type' => BudgetType,
       'start_time' => StartTime,
       'end_time' => EndTime,
       'targeting_spec' => TargetingSpec,
       'lifetime_frequency_cap' => LifetimeFrequencyCap,
       'tracking_urls' => TrackingUrls,
       'auto_targeting_enabled' => AutoTargetingEnabled,
       'placement_group' => PlacementGroup,
       'pacing_delivery_type' => PacingDeliveryType,
       'conversion_learning_mode_type' => ConversionLearningModeType,
       'summary_status' => SummaryStatus,
       'feed_profile_id' => FeedProfileId
     }.
