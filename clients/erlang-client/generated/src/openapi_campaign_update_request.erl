-module(openapi_campaign_update_request).

-export([encode/1]).

-export_type([openapi_campaign_update_request/0]).

-type openapi_campaign_update_request() ::
    #{ 'id' := binary(),
       'ad_account_id' := binary(),
       'name' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'lifetime_spend_cap' => integer(),
       'daily_spend_cap' => integer(),
       'order_line_id' => binary(),
       'tracking_urls' => openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls(),
       'start_time' => integer(),
       'end_time' => integer(),
       'summary_status' => openapi_campaign_summary_status:openapi_campaign_summary_status(),
       'is_flexible_daily_budgets' => boolean(),
       'default_ad_group_budget_in_micro_currency' => integer(),
       'is_automated_campaign' => boolean(),
       'is_campaign_budget_optimization' => boolean(),
       'objective_type' => openapi_objective_type:openapi_objective_type()
     }.

encode(#{ 'id' := Id,
          'ad_account_id' := AdAccountId,
          'name' := Name,
          'status' := Status,
          'lifetime_spend_cap' := LifetimeSpendCap,
          'daily_spend_cap' := DailySpendCap,
          'order_line_id' := OrderLineId,
          'tracking_urls' := TrackingUrls,
          'start_time' := StartTime,
          'end_time' := EndTime,
          'summary_status' := SummaryStatus,
          'is_flexible_daily_budgets' := IsFlexibleDailyBudgets,
          'default_ad_group_budget_in_micro_currency' := DefaultAdGroupBudgetInMicroCurrency,
          'is_automated_campaign' := IsAutomatedCampaign,
          'is_campaign_budget_optimization' := IsCampaignBudgetOptimization,
          'objective_type' := ObjectiveType
        }) ->
    #{ 'id' => Id,
       'ad_account_id' => AdAccountId,
       'name' => Name,
       'status' => Status,
       'lifetime_spend_cap' => LifetimeSpendCap,
       'daily_spend_cap' => DailySpendCap,
       'order_line_id' => OrderLineId,
       'tracking_urls' => TrackingUrls,
       'start_time' => StartTime,
       'end_time' => EndTime,
       'summary_status' => SummaryStatus,
       'is_flexible_daily_budgets' => IsFlexibleDailyBudgets,
       'default_ad_group_budget_in_micro_currency' => DefaultAdGroupBudgetInMicroCurrency,
       'is_automated_campaign' => IsAutomatedCampaign,
       'is_campaign_budget_optimization' => IsCampaignBudgetOptimization,
       'objective_type' => ObjectiveType
     }.
