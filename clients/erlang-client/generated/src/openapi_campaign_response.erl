-module(openapi_campaign_response).

-export([encode/1]).

-export_type([openapi_campaign_response/0]).

-type openapi_campaign_response() ::
    #{ 'id' => binary(),
       'ad_account_id' => binary(),
       'name' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'lifetime_spend_cap' => integer(),
       'daily_spend_cap' => integer(),
       'order_line_id' => binary(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'start_time' => integer(),
       'end_time' => integer(),
       'is_flexible_daily_budgets' => boolean(),
       'objective_type' => openapi_objective_type:openapi_objective_type(),
       'created_time' => integer(),
       'updated_time' => integer(),
       'type' => binary(),
       'is_campaign_budget_optimization' => boolean(),
       'summary_status' => openapi_campaign_summary_status:openapi_campaign_summary_status()
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
          'is_flexible_daily_budgets' := IsFlexibleDailyBudgets,
          'objective_type' := ObjectiveType,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime,
          'type' := Type,
          'is_campaign_budget_optimization' := IsCampaignBudgetOptimization,
          'summary_status' := SummaryStatus
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
       'is_flexible_daily_budgets' => IsFlexibleDailyBudgets,
       'objective_type' => ObjectiveType,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime,
       'type' => Type,
       'is_campaign_budget_optimization' => IsCampaignBudgetOptimization,
       'summary_status' => SummaryStatus
     }.
