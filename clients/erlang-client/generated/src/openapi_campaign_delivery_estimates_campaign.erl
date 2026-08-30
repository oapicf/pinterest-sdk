-module(openapi_campaign_delivery_estimates_campaign).

-export([encode/1]).

-export_type([openapi_campaign_delivery_estimates_campaign/0]).

-type openapi_campaign_delivery_estimates_campaign() ::
    #{ 'ad_groups' := list(),
       'budget_duration_type' := openapi_budget_duration_type:openapi_budget_duration_type(),
       'daily_spend_cap' => integer(),
       'end_date' => binary(),
       'lifetime_spend_cap' => integer(),
       'objective_type' := openapi_delivery_estimate_objective_type:openapi_delivery_estimate_objective_type(),
       'start_date' := binary()
     }.

encode(#{ 'ad_groups' := AdGroups,
          'budget_duration_type' := BudgetDurationType,
          'daily_spend_cap' := DailySpendCap,
          'end_date' := EndDate,
          'lifetime_spend_cap' := LifetimeSpendCap,
          'objective_type' := ObjectiveType,
          'start_date' := StartDate
        }) ->
    #{ 'ad_groups' => AdGroups,
       'budget_duration_type' => BudgetDurationType,
       'daily_spend_cap' => DailySpendCap,
       'end_date' => EndDate,
       'lifetime_spend_cap' => LifetimeSpendCap,
       'objective_type' => ObjectiveType,
       'start_date' => StartDate
     }.
