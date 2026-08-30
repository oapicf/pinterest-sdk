-module(openapi_campaign).

-include("openapi.hrl").

-export([openapi_campaign/0]).

-export([openapi_campaign/1]).

-export_type([openapi_campaign/0]).

-type openapi_campaign() ::
  [ {'ad_account_id', binary() }
  | {'bid_options', openapi_campaign_bid_options:openapi_campaign_bid_options() }
  | {'created_time', integer() }
  | {'daily_spend_cap', integer() }
  | {'default_ad_group_budget_in_micro_currency', integer() }
  | {'end_time', integer() }
  | {'id', binary() }
  | {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
  | {'is_automated_campaign', boolean() }
  | {'is_campaign_budget_optimization', boolean() }
  | {'is_carting', boolean() }
  | {'is_flexible_daily_budgets', boolean() }
  | {'is_ltv_optimized', boolean() }
  | {'is_performance_plus', boolean() }
  | {'is_top_of_search', boolean() }
  | {'lifetime_spend_cap', integer() }
  | {'name', binary() }
  | {'objective_type', openapi_campaign_objective_type:openapi_campaign_objective_type() }
  | {'order_line_id', binary() }
  | {'performance_plus_campaign_settings', openapi_performance_plus_campaign_settings:openapi_performance_plus_campaign_settings() }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'summary_status', openapi_summary_status:openapi_summary_status() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'type', binary() }
  | {'updated_time', integer() }
  ].


openapi_campaign() ->
    openapi_campaign([]).

openapi_campaign(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'bid_options', openapi_campaign_bid_options:openapi_campaign_bid_options() }
            , {'created_time', integer() }
            , {'daily_spend_cap', integer() }
            , {'default_ad_group_budget_in_micro_currency', integer() }
            , {'end_time', integer() }
            , {'id', binary() }
            , {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
            , {'is_automated_campaign', boolean() }
            , {'is_campaign_budget_optimization', boolean() }
            , {'is_carting', boolean() }
            , {'is_flexible_daily_budgets', boolean() }
            , {'is_ltv_optimized', boolean() }
            , {'is_performance_plus', boolean() }
            , {'is_top_of_search', boolean() }
            , {'lifetime_spend_cap', integer() }
            , {'name', binary() }
            , {'objective_type', openapi_campaign_objective_type:openapi_campaign_objective_type() }
            , {'order_line_id', binary() }
            , {'performance_plus_campaign_settings', openapi_performance_plus_campaign_settings:openapi_performance_plus_campaign_settings() }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'summary_status', openapi_summary_status:openapi_summary_status() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'type', binary() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

