-module(openapi_campaign_create_response_data).

-include("openapi.hrl").

-export([openapi_campaign_create_response_data/0]).

-export([openapi_campaign_create_response_data/1]).

-export_type([openapi_campaign_create_response_data/0]).

-type openapi_campaign_create_response_data() ::
  [ {'ad_account_id', binary() }
  | {'daily_spend_cap', integer() }
  | {'end_time', integer() }
  | {'is_automated_campaign', boolean() }
  | {'is_flexible_daily_budgets', boolean() }
  | {'lifetime_spend_cap', integer() }
  | {'name', binary() }
  | {'order_line_id', binary() }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'default_ad_group_budget_in_micro_currency', integer() }
  | {'is_campaign_budget_optimization', boolean() }
  | {'id', binary() }
  | {'bid_options', openapi_campaign_bid_options:openapi_campaign_bid_options() }
  | {'created_time', integer() }
  | {'is_performance_plus', boolean() }
  | {'objective_type', openapi_objective_type:openapi_objective_type() }
  | {'summary_status', openapi_campaign_summary_status:openapi_campaign_summary_status() }
  | {'type', binary() }
  | {'updated_time', integer() }
  ].


openapi_campaign_create_response_data() ->
    openapi_campaign_create_response_data([]).

openapi_campaign_create_response_data(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'daily_spend_cap', integer() }
            , {'end_time', integer() }
            , {'is_automated_campaign', boolean() }
            , {'is_flexible_daily_budgets', boolean() }
            , {'lifetime_spend_cap', integer() }
            , {'name', binary() }
            , {'order_line_id', binary() }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'default_ad_group_budget_in_micro_currency', integer() }
            , {'is_campaign_budget_optimization', boolean() }
            , {'id', binary() }
            , {'bid_options', openapi_campaign_bid_options:openapi_campaign_bid_options() }
            , {'created_time', integer() }
            , {'is_performance_plus', boolean() }
            , {'objective_type', openapi_objective_type:openapi_objective_type() }
            , {'summary_status', openapi_campaign_summary_status:openapi_campaign_summary_status() }
            , {'type', binary() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

