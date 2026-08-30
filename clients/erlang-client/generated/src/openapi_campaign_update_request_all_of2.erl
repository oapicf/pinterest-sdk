-module(openapi_campaign_update_request_all_of2).

-export([encode/1]).

-export_type([openapi_campaign_update_request_all_of2/0]).

-type openapi_campaign_update_request_all_of2() ::
    #{ 'bid_options' => openapi_campaign_bid_options_update:openapi_campaign_bid_options_update(),
       'intended_promotion_type' => openapi_intended_promotion_type:openapi_intended_promotion_type(),
       'is_ltv_optimized' => boolean(),
       'is_performance_plus' => boolean(),
       'is_top_of_search' => boolean(),
       'objective_type' => openapi_objective_type:openapi_objective_type()
     }.

encode(#{ 'bid_options' := BidOptions,
          'intended_promotion_type' := IntendedPromotionType,
          'is_ltv_optimized' := IsLtvOptimized,
          'is_performance_plus' := IsPerformancePlus,
          'is_top_of_search' := IsTopOfSearch,
          'objective_type' := ObjectiveType
        }) ->
    #{ 'bid_options' => BidOptions,
       'intended_promotion_type' => IntendedPromotionType,
       'is_ltv_optimized' => IsLtvOptimized,
       'is_performance_plus' => IsPerformancePlus,
       'is_top_of_search' => IsTopOfSearch,
       'objective_type' => ObjectiveType
     }.
