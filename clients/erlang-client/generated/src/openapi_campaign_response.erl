-module(openapi_campaign_response).

-export([encode/1]).

-export_type([openapi_campaign_response/0]).

-type openapi_campaign_response() ::
    #{ 'id' => binary(),
       'ad_account_id' => binary(),
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
       'bid_options' => openapi_campaign_bid_options:openapi_campaign_bid_options(),
       'created_time' => integer(),
       'is_campaign_budget_optimization' => boolean(),
       'is_performance_plus' => boolean(),
       'objective_type' => openapi_objective_type:openapi_objective_type(),
       'summary_status' => openapi_campaign_summary_status:openapi_campaign_summary_status(),
       'type' => binary(),
       'updated_time' => integer()
     }.

encode(#{ 'id' := Id,
          'ad_account_id' := AdAccountId,
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
          'bid_options' := BidOptions,
          'created_time' := CreatedTime,
          'is_campaign_budget_optimization' := IsCampaignBudgetOptimization,
          'is_performance_plus' := IsPerformancePlus,
          'objective_type' := ObjectiveType,
          'summary_status' := SummaryStatus,
          'type' := Type,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'id' => Id,
       'ad_account_id' => AdAccountId,
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
       'bid_options' => BidOptions,
       'created_time' => CreatedTime,
       'is_campaign_budget_optimization' => IsCampaignBudgetOptimization,
       'is_performance_plus' => IsPerformancePlus,
       'objective_type' => ObjectiveType,
       'summary_status' => SummaryStatus,
       'type' => Type,
       'updated_time' => UpdatedTime
     }.
