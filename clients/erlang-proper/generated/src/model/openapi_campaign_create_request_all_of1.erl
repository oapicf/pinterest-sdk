-module(openapi_campaign_create_request_all_of1).

-include("openapi.hrl").

-export([openapi_campaign_create_request_all_of1/0]).

-export([openapi_campaign_create_request_all_of1/1]).

-export_type([openapi_campaign_create_request_all_of1/0]).

-type openapi_campaign_create_request_all_of1() ::
  [ {'bid_options', openapi_campaign_bid_options_create:openapi_campaign_bid_options_create() }
  | {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
  | {'is_automated_campaign', boolean() }
  | {'is_campaign_budget_optimization', boolean() }
  | {'is_flexible_daily_budgets', boolean() }
  | {'is_ltv_optimized', boolean() }
  | {'is_performance_plus', boolean() }
  | {'is_top_of_search', boolean() }
  | {'objective_type', openapi_objective_type:openapi_objective_type() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  ].


openapi_campaign_create_request_all_of1() ->
    openapi_campaign_create_request_all_of1([]).

openapi_campaign_create_request_all_of1(Fields) ->
  Default = [ {'bid_options', openapi_campaign_bid_options_create:openapi_campaign_bid_options_create() }
            , {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
            , {'is_automated_campaign', boolean() }
            , {'is_campaign_budget_optimization', boolean() }
            , {'is_flexible_daily_budgets', boolean() }
            , {'is_ltv_optimized', boolean() }
            , {'is_performance_plus', boolean() }
            , {'is_top_of_search', boolean() }
            , {'objective_type', openapi_objective_type:openapi_objective_type() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

