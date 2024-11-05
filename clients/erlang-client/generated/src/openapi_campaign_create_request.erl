-module(openapi_campaign_create_request).

-export([encode/1]).

-export_type([openapi_campaign_create_request/0]).

-type openapi_campaign_create_request() ::
    #{ 'ad_account_id' := binary(),
       'name' := binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'lifetime_spend_cap' => integer(),
       'daily_spend_cap' => integer(),
       'order_line_id' => binary(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'start_time' => integer(),
       'end_time' => integer(),
       'is_flexible_daily_budgets' => boolean(),
       'default_ad_group_budget_in_micro_currency' => integer(),
       'is_automated_campaign' => boolean(),
       'objective_type' := openapi_objective_type:openapi_objective_type()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'name' := Name,
          'status' := Status,
          'lifetime_spend_cap' := LifetimeSpendCap,
          'daily_spend_cap' := DailySpendCap,
          'order_line_id' := OrderLineId,
          'tracking_urls' := TrackingUrls,
          'start_time' := StartTime,
          'end_time' := EndTime,
          'is_flexible_daily_budgets' := IsFlexibleDailyBudgets,
          'default_ad_group_budget_in_micro_currency' := DefaultAdGroupBudgetInMicroCurrency,
          'is_automated_campaign' := IsAutomatedCampaign,
          'objective_type' := ObjectiveType
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'name' => Name,
       'status' => Status,
       'lifetime_spend_cap' => LifetimeSpendCap,
       'daily_spend_cap' => DailySpendCap,
       'order_line_id' => OrderLineId,
       'tracking_urls' => TrackingUrls,
       'start_time' => StartTime,
       'end_time' => EndTime,
       'is_flexible_daily_budgets' => IsFlexibleDailyBudgets,
       'default_ad_group_budget_in_micro_currency' => DefaultAdGroupBudgetInMicroCurrency,
       'is_automated_campaign' => IsAutomatedCampaign,
       'objective_type' => ObjectiveType
     }.
