-module(openapi_campaign_create_common).

-export([encode/1]).

-export_type([openapi_campaign_create_common/0]).

-type openapi_campaign_create_common() ::
    #{ 'ad_account_id' => binary(),
       'daily_spend_cap' => integer(),
       'end_time' => integer(),
       'is_automated_campaign' => boolean(),
       'is_flexible_daily_budgets' => boolean(),
       'lifetime_spend_cap' => integer(),
       'name' => binary(),
       'order_line_id' => binary(),
       'start_time' => integer(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'default_ad_group_budget_in_micro_currency' => integer(),
       'is_campaign_budget_optimization' => boolean()
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
          'is_campaign_budget_optimization' := IsCampaignBudgetOptimization
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
       'is_campaign_budget_optimization' => IsCampaignBudgetOptimization
     }.
