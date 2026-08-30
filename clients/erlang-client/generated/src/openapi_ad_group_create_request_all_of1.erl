-module(openapi_ad_group_create_request_all_of1).

-export([encode/1]).

-export_type([openapi_ad_group_create_request_all_of1/0]).

-type openapi_ad_group_create_request_all_of1() ::
    #{ 'auto_targeting_enabled' => boolean(),
       'bid_multiplier' => integer(),
       'budget_type' => openapi_budget_type:openapi_budget_type(),
       'pacing_delivery_type' => openapi_pacing_delivery_type:openapi_pacing_delivery_type()
     }.

encode(#{ 'auto_targeting_enabled' := AutoTargetingEnabled,
          'bid_multiplier' := BidMultiplier,
          'budget_type' := BudgetType,
          'pacing_delivery_type' := PacingDeliveryType
        }) ->
    #{ 'auto_targeting_enabled' => AutoTargetingEnabled,
       'bid_multiplier' => BidMultiplier,
       'budget_type' => BudgetType,
       'pacing_delivery_type' => PacingDeliveryType
     }.
