-module(openapi_campaign_create_request).

-export([encode/1]).

-export_type([openapi_campaign_create_request/0]).

-type openapi_campaign_create_request() ::
    #{ 'bid_options' => openapi_campaign_bid_options_create:openapi_campaign_bid_options_create(),
       'intended_promotion_type' => openapi_intended_promotion_type:openapi_intended_promotion_type(),
       'is_automated_campaign' => boolean(),
       'is_campaign_budget_optimization' => boolean(),
       'is_flexible_daily_budgets' => boolean(),
       'is_ltv_optimized' => boolean(),
       'is_performance_plus' => boolean(),
       'is_top_of_search' => boolean(),
       'objective_type' := openapi_objective_type:openapi_objective_type(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'ad_account_id' := binary(),
       'daily_spend_cap' => integer(),
       'default_ad_group_budget_in_micro_currency' => integer(),
       'end_time' => integer(),
       'lifetime_spend_cap' => integer(),
       'name' := binary(),
       'order_line_id' => binary(),
       'start_time' => integer(),
       'tracking_urls' => maps:map()
     }.

encode(#{ 'bid_options' := BidOptions,
          'intended_promotion_type' := IntendedPromotionType,
          'is_automated_campaign' := IsAutomatedCampaign,
          'is_campaign_budget_optimization' := IsCampaignBudgetOptimization,
          'is_flexible_daily_budgets' := IsFlexibleDailyBudgets,
          'is_ltv_optimized' := IsLtvOptimized,
          'is_performance_plus' := IsPerformancePlus,
          'is_top_of_search' := IsTopOfSearch,
          'objective_type' := ObjectiveType,
          'status' := Status,
          'ad_account_id' := AdAccountId,
          'daily_spend_cap' := DailySpendCap,
          'default_ad_group_budget_in_micro_currency' := DefaultAdGroupBudgetInMicroCurrency,
          'end_time' := EndTime,
          'lifetime_spend_cap' := LifetimeSpendCap,
          'name' := Name,
          'order_line_id' := OrderLineId,
          'start_time' := StartTime,
          'tracking_urls' := TrackingUrls
        }) ->
    #{ 'bid_options' => BidOptions,
       'intended_promotion_type' => IntendedPromotionType,
       'is_automated_campaign' => IsAutomatedCampaign,
       'is_campaign_budget_optimization' => IsCampaignBudgetOptimization,
       'is_flexible_daily_budgets' => IsFlexibleDailyBudgets,
       'is_ltv_optimized' => IsLtvOptimized,
       'is_performance_plus' => IsPerformancePlus,
       'is_top_of_search' => IsTopOfSearch,
       'objective_type' => ObjectiveType,
       'status' => Status,
       'ad_account_id' => AdAccountId,
       'daily_spend_cap' => DailySpendCap,
       'default_ad_group_budget_in_micro_currency' => DefaultAdGroupBudgetInMicroCurrency,
       'end_time' => EndTime,
       'lifetime_spend_cap' => LifetimeSpendCap,
       'name' => Name,
       'order_line_id' => OrderLineId,
       'start_time' => StartTime,
       'tracking_urls' => TrackingUrls
     }.
