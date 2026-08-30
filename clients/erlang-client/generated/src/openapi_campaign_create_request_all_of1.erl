-module(openapi_campaign_create_request_all_of1).

-export([encode/1]).

-export_type([openapi_campaign_create_request_all_of1/0]).

-type openapi_campaign_create_request_all_of1() ::
    #{ 'bid_options' => openapi_campaign_bid_options_create:openapi_campaign_bid_options_create(),
       'intended_promotion_type' => openapi_intended_promotion_type:openapi_intended_promotion_type(),
       'is_automated_campaign' => boolean(),
       'is_campaign_budget_optimization' => boolean(),
       'is_flexible_daily_budgets' => boolean(),
       'is_ltv_optimized' => boolean(),
       'is_performance_plus' => boolean(),
       'is_top_of_search' => boolean(),
       'objective_type' := openapi_objective_type:openapi_objective_type(),
       'status' => openapi_entity_status:openapi_entity_status()
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
          'status' := Status
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
       'status' => Status
     }.
