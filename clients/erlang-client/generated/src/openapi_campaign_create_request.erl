-module(openapi_campaign_create_request).

-export([encode/1]).

-export_type([openapi_campaign_create_request/0]).

-type openapi_campaign_create_request() ::
    #{ 'ad_account_id' := binary(),
       'daily_spend_cap' => integer(),
       'end_time' => integer(),
       'is_automated_campaign' => boolean(),
       'is_flexible_daily_budgets' => boolean(),
       'lifetime_spend_cap' => integer(),
       'name' := binary(),
       'order_line_id' => binary(),
       'start_time' => integer(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'default_ad_group_budget_in_micro_currency' => integer(),
       'is_campaign_budget_optimization' => boolean(),
       'bid_options' => openapi_campaign_bid_options_create:openapi_campaign_bid_options_create(),
       'is_performance_plus' => boolean(),
       'objective_type' := openapi_objective_type:openapi_objective_type()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'daily_spend_cap' := DailySpendCap,
          'end_time' := EndTime,
          'is_automated_campaign' := IsAutomatedCampaign,
          'is_flexible_daily_budgets' := IsFlexibleDailyBudgets,
          'lifetime_spend_cap' := LifetimeSpendCap,
          'name' := Name,
          'order_line_id' := OrderLineId,
          'start_time' := StartTime,
          'status' := Status,
          'tracking_urls' := TrackingUrls,
          'default_ad_group_budget_in_micro_currency' := DefaultAdGroupBudgetInMicroCurrency,
          'is_campaign_budget_optimization' := IsCampaignBudgetOptimization,
          'bid_options' := BidOptions,
          'is_performance_plus' := IsPerformancePlus,
          'objective_type' := ObjectiveType
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'daily_spend_cap' => DailySpendCap,
       'end_time' => EndTime,
       'is_automated_campaign' => IsAutomatedCampaign,
       'is_flexible_daily_budgets' => IsFlexibleDailyBudgets,
       'lifetime_spend_cap' => LifetimeSpendCap,
       'name' => Name,
       'order_line_id' => OrderLineId,
       'start_time' => StartTime,
       'status' => Status,
       'tracking_urls' => TrackingUrls,
       'default_ad_group_budget_in_micro_currency' => DefaultAdGroupBudgetInMicroCurrency,
       'is_campaign_budget_optimization' => IsCampaignBudgetOptimization,
       'bid_options' => BidOptions,
       'is_performance_plus' => IsPerformancePlus,
       'objective_type' => ObjectiveType
     }.
