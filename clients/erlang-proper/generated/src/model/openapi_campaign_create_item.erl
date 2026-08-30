-module(openapi_campaign_create_item).

-include("openapi.hrl").

-export([openapi_campaign_create_item/0]).

-export([openapi_campaign_create_item/1]).

-export_type([openapi_campaign_create_item/0]).

-type openapi_campaign_create_item() ::
  [ {'ad_account_id', binary() }
  | {'app_id', binary() }
  | {'app_platform', openapi_mobile_app_platform:openapi_mobile_app_platform() }
  | {'bid_options', openapi_campaign_bid_options:openapi_campaign_bid_options() }
  | {'daily_spend_cap', integer() }
  | {'default_ad_group_budget_in_micro_currency', integer() }
  | {'end_time', integer() }
  | {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
  | {'is_automated_campaign', boolean() }
  | {'is_campaign_budget_optimization', boolean() }
  | {'is_flexible_daily_budgets', boolean() }
  | {'is_ltv_optimized', boolean() }
  | {'is_performance_plus', boolean() }
  | {'is_top_of_search', boolean() }
  | {'lifetime_spend_cap', integer() }
  | {'name', binary() }
  | {'objective_type', openapi_conversion_objective_type:openapi_conversion_objective_type() }
  | {'order_line_id', binary() }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  ].


openapi_campaign_create_item() ->
    openapi_campaign_create_item([]).

openapi_campaign_create_item(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'app_id', binary() }
            , {'app_platform', openapi_mobile_app_platform:openapi_mobile_app_platform() }
            , {'bid_options', openapi_campaign_bid_options:openapi_campaign_bid_options() }
            , {'daily_spend_cap', integer() }
            , {'default_ad_group_budget_in_micro_currency', integer() }
            , {'end_time', integer() }
            , {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
            , {'is_automated_campaign', boolean() }
            , {'is_campaign_budget_optimization', boolean() }
            , {'is_flexible_daily_budgets', boolean() }
            , {'is_ltv_optimized', boolean() }
            , {'is_performance_plus', boolean() }
            , {'is_top_of_search', boolean() }
            , {'lifetime_spend_cap', integer() }
            , {'name', binary() }
            , {'objective_type', openapi_conversion_objective_type:openapi_conversion_objective_type() }
            , {'order_line_id', binary() }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

