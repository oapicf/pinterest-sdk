-module(openapi_campaign_create_request).

-include("openapi.hrl").

-export([openapi_campaign_create_request/0]).

-export([openapi_campaign_create_request/1]).

-export_type([openapi_campaign_create_request/0]).

-type openapi_campaign_create_request() ::
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
  | {'ad_account_id', binary() }
  | {'daily_spend_cap', integer() }
  | {'default_ad_group_budget_in_micro_currency', integer() }
  | {'end_time', integer() }
  | {'lifetime_spend_cap', integer() }
  | {'name', binary() }
  | {'order_line_id', binary() }
  | {'start_time', integer() }
  | {'tracking_urls', map() }
  ].


openapi_campaign_create_request() ->
    openapi_campaign_create_request([]).

openapi_campaign_create_request(Fields) ->
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
            , {'ad_account_id', binary() }
            , {'daily_spend_cap', integer() }
            , {'default_ad_group_budget_in_micro_currency', integer() }
            , {'end_time', integer() }
            , {'lifetime_spend_cap', integer() }
            , {'name', binary() }
            , {'order_line_id', binary() }
            , {'start_time', integer() }
            , {'tracking_urls', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

